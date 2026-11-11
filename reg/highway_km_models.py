from argparse import ArgumentParser, Namespace
from os import path
from typing import Any, Dict, List, Optional, Tuple, Union
from PIL import Image

from .reg_utils import (
    CompactDict, CompactList, create_parser, ensure_output_dir,
    write_json_idempotent
)


WIDTH_CM: float = 70.0
BLOCK_CM: float = 100.0
BLOCK_UNITS: float = 16.0
THICKNESS_CM: float = 2.5

WIDTH_UNITS: float = WIDTH_CM / BLOCK_CM * BLOCK_UNITS  # 11.2
THICKNESS_UNITS: float = THICKNESS_CM / BLOCK_CM * BLOCK_UNITS  # 0.4

BASE_X: float = (BLOCK_UNITS - WIDTH_UNITS) / 2.0  # 2.4

SINGLE_ROTATIONS: Tuple[str, ...] = ("0", "1", "2", "15")
DOUBLE_ROTATIONS: Tuple[str, ...] = ("16", "17", "18", "23")
WALL_ROTATIONS: Tuple[str, ...] = ("26",)

ROTATION_ANGLES: Dict[str, float] = {
    "0": 0.0, "1": -22.5, "2": -45.0, "15": 22.5,
    "16": 0.0, "17": -22.5, "18": -45.0, "23": 22.5,
    "26": 0.0
}

ATTACHMENT_SHIFTS: Dict[str, float] = {"": 0.0, "_down": -4.15, "_up": 4.15}

AABB = Tuple[int, int, int, int]


def clean_num(n: float) -> Union[int, float]:
    """Return int if number has no decimal part, otherwise round float."""
    r: float = round(n, 4)
    return int(r) if r.is_integer() else r


def extract_pixel_spans(tex_path: str) -> Tuple[
    List[AABB], List[AABB], int, int, int
]:
    """Detect non-transparent pixels from texture and return merged spans."""
    im: Image.Image = Image.open(tex_path).convert("RGBA")
    w: int
    h: int
    w, h = im.size

    col_spans: List[Optional[Tuple[int, int]]] = []
    for x in range(w):
        ys: List[int] = [y for y in range(h) if im.getpixel((x, y))[3] > 0]
        col_spans.append((min(ys), max(ys)) if ys else None)

    grouped_cols: List[AABB] = []
    curr_col: Optional[Tuple[int, int]] = None
    start_x: int = 0
    for x in range(w):
        span_col: Optional[Tuple[int, int]] = col_spans[x]
        if span_col != curr_col:
            if curr_col is not None:
                grouped_cols.append((start_x, x-1, curr_col[0], curr_col[1]))
            curr_col = span_col
            start_x = x
    if curr_col is not None:
        grouped_cols.append((start_x, w-1, curr_col[0], curr_col[1]))

    row_spans: List[Optional[Tuple[int, int]]] = []
    for y in range(h):
        xs: List[int] = [x for x in range(w) if im.getpixel((x, y))[3] > 0]
        row_spans.append((min(xs), max(xs)) if xs else None)

    grouped_rows: List[AABB] = []
    curr_row: Optional[Tuple[int, int]] = None
    start_y: int = 0
    for y in range(h):
        span_row: Optional[Tuple[int, int]] = row_spans[y]
        if span_row != curr_row:
            if curr_row is not None:
                grouped_rows.append((start_y, y-1, curr_row[0], curr_row[1]))
            curr_row = span_row
            start_y = y
    if curr_row is not None:
        grouped_rows.append((start_y, h-1, curr_row[0], curr_row[1]))

    all_ys: List[int] = \
    [y for y in range(h) if any(im.getpixel((x, y))[3] > 0 for x in range(w))]
    min_y: int = min(all_ys)
    max_y: int = max(all_ys)

    return grouped_cols, grouped_rows, w, min_y, max_y


def build_highway_km_model(
    rot: str, attachment: str, grouped_cols: List[AABB],
    grouped_rows: List[AABB], tex_w: int, min_y: int, max_y: int
) -> Dict[str, Any]:
    """Build a highway_km model with front/back quads and rim slices."""

    step: float = WIDTH_UNITS / tex_w  # 0.35
    y_shift: float = ATTACHMENT_SHIFTS[attachment]

    z_min: float
    z_max: float
    kind: str
    if rot in SINGLE_ROTATIONS:
        z_min = 8.0
        z_max = 8.0 + THICKNESS_UNITS
        kind = "single"
    elif rot in DOUBLE_ROTATIONS:
        z_min = 8.0 - THICKNESS_UNITS
        z_max = 8.0 + THICKNESS_UNITS
        kind = "double"
    elif rot in WALL_ROTATIONS:
        z_min = 0.0
        z_max = THICKNESS_UNITS
        kind = "wall"
    else:
        raise ValueError(f"Unknown rotation: {rot}")

    angle: float = ROTATION_ANGLES[rot]
    elements: List[Dict[str, Any]] = []

    # Sign top/bottom in model space when centered (before y_shift)
    # Total sign rows = max_y - min_y + 1 (22 rows = 7.7 units)
    # Centered at 8.0: sign_top_y = 11.85, sign_bottom_y = 4.15
    sign_height_units: float = (max_y - min_y + 1) * step
    sign_top_y: float = 8.0 + sign_height_units / 2.0
    sign_bottom_y: float = 8.0 - sign_height_units / 2.0

    # Element 0: Main sign face quad
    e0_from: List[Union[int, float]] = \
    [clean_num(BASE_X), clean_num(sign_bottom_y+y_shift), clean_num(z_min)]
    e0_to: List[Union[int, float]] = \
    [clean_num(BASE_X+WIDTH_UNITS), clean_num(sign_top_y+y_shift),
     clean_num(z_max)]

    # UV corresponding to rows [min_y, max_y + 1] out of 32
    uv_v1: float = round(min_y / tex_w * 16.0, 4)
    uv_v2: float = round((max_y+1) / tex_w * 16.0, 4)

    e0_faces: Dict[str, Any] = {}
    if kind == "single":
        e0_faces["north"] = CompactDict({
            "uv": [0, clean_num(uv_v1), 16, clean_num(uv_v2)],
            "texture": "#back"
        })
        e0_faces["south"] = CompactDict({
            "uv": [0, clean_num(uv_v1), 16, clean_num(uv_v2)],
            "texture": "#front"
        })
    elif kind == "double":
        e0_faces["north"] = CompactDict({
            "uv": [0, clean_num(uv_v1), 16, clean_num(uv_v2)],
            "texture": "#front"
        })
        e0_faces["south"] = CompactDict({
            "uv": [0, clean_num(uv_v1), 16, clean_num(uv_v2)],
            "texture": "#front"
        })
    elif kind == "wall":
        e0_faces["north"] = CompactDict({
            "uv": [0, clean_num(uv_v1), 16, clean_num(uv_v2)],
            "texture": "#back", "cullface": "north"
        })
        e0_faces["south"] = CompactDict({
            "uv": [0, clean_num(uv_v1), 16, clean_num(uv_v2)],
            "texture": "#front"
        })

    e0: Dict[str, Any] = {
        "from": CompactList(e0_from),
        "to": CompactList(e0_to),
        "faces": e0_faces
    }
    if angle != 0.0:
        e0["rotation"] = \
        CompactDict({"origin": [8, 8, 8], "axis": "y", "angle": angle})
    elements.append(e0)

    # UV for side rim textures (centered in texture)
    uv_z_min: Union[int, float] = \
    clean_num(8.0 - THICKNESS_UNITS if kind == "double" else 8.0)
    uv_z_max: Union[int, float] = clean_num(8.0 + THICKNESS_UNITS)

    # Elements 1..N: Vertical slices defining down and up rim faces
    for x1, x2, y1, y2 in grouped_cols:
        mx1: Union[int, float] = clean_num(BASE_X + x1 * step)
        mx2: Union[int, float] = clean_num(BASE_X + (x2 + 1) * step)
        my_bottom: Union[int, float] = clean_num(
            sign_top_y - (y2 + 1 - min_y) * step + y_shift
        )
        my_top: Union[int, float] = clean_num(
            sign_top_y - (y1 - min_y) * step + y_shift
        )

        down_dict: Dict[str, Any] = {
            "uv": [mx1, uv_z_min, mx2, uv_z_max],
            "texture": "#side"
        }
        if my_bottom == 0:
            down_dict["cullface"] = "down"

        up_dict: Dict[str, Any] = {
            "uv": [mx1, uv_z_min, mx2, uv_z_max],
            "texture": "#side"
        }
        if my_top == 16:
            up_dict["cullface"] = "up"

        elem_col: Dict[str, Any] = {
            "from": CompactList([mx1, my_bottom, clean_num(z_min)]),
            "to": CompactList([mx2, my_top, clean_num(z_max)]),
            "faces": {
                "down": CompactDict(down_dict),
                "up": CompactDict(up_dict)
            }
        }
        if angle != 0.0:
            elem_col["rotation"] = \
            CompactDict({"origin": [8, 8, 8], "axis": "y", "angle": angle})
        elements.append(elem_col)

    # Elements N+1..2N: Horizontal slices defining west and east rim faces
    for y1, y2, x1, x2 in grouped_rows:
        my_bottom = clean_num(
            sign_top_y - (y2 + 1 - min_y) * step + y_shift
        )
        my_top = clean_num(
            sign_top_y - (y1 - min_y) * step + y_shift
        )
        mx_left: Union[int, float] = clean_num(BASE_X + x1 * step)
        mx_right: Union[int, float] = clean_num(BASE_X + (x2 + 1) * step)

        uv_y1: Union[int, float] = clean_num(
            sign_top_y - (y2 + 1 - min_y) * step
        )
        uv_y2: Union[int, float] = clean_num(
            sign_top_y - (y1 - min_y) * step
        )

        elem_row: Dict[str, Any] = {
            "from": CompactList([mx_left, my_bottom, clean_num(z_min)]),
            "to": CompactList([mx_right, my_top, clean_num(z_max)]),
            "faces": {
                "west": CompactDict({
                    "uv": [uv_y1, uv_z_min, uv_y2, uv_z_max],
                    "texture": "#side"
                }),
                "east": CompactDict({
                    "uv": [uv_y1, uv_z_min, uv_y2, uv_z_max],
                    "texture": "#side"
                })
            }
        }
        if angle != 0.0:
            elem_row["rotation"] = \
            CompactDict({"origin": [8, 8, 8], "axis": "y", "angle": angle})
        elements.append(elem_row)

    textures_dict: Dict[str, str] = {
        "front": "cntrafficsymbols_0d0:block/highway_km",
        "side": "cntrafficsymbols_0d0:block/highway_km_backboard",
        "particle": "#front"
    }
    if kind != "double":
        textures_dict["back"] = \
        "cntrafficsymbols_0d0:block/highway_km_backboard"

    return {
        "ambientocclusion": False,
        "textures": CompactDict(textures_dict),
        "elements": elements
    }


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = create_parser(
        "Generate all highway_km models from highway_km_backboard.png"
    )
    parser.add_argument(
        "--texture", default=None,
        help="Path to highway_km_backboard.png (default: derived from dir)"
    )
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    tex_path: str = args.texture
    if tex_path is None:
        tex_path = path.normpath(path.join(
            args.dir, "..", "..", "textures", "block",
            "highway_km_backboard.png"
        ))
    elif path.isdir(tex_path):
        tex_path = path.join(tex_path, "highway_km_backboard.png")

    cols, rows, tex_w, min_y, max_y = extract_pixel_spans(tex_path)

    all_rotations: Tuple[str, ...] = \
    SINGLE_ROTATIONS + DOUBLE_ROTATIONS + WALL_ROTATIONS

    for rot in all_rotations:
        for attachment in ATTACHMENT_SHIFTS:
            model_data: Dict[str, Any] = build_highway_km_model(
                rot, attachment, cols, rows, tex_w, min_y, max_y
            )
            filename: str = f"highway_km_rotation{rot}{attachment}.json"
            write_json_idempotent(
                args.dir, filename, model_data, args.dry_run, compact=True
            )


if __name__ == "__main__":
    main()
