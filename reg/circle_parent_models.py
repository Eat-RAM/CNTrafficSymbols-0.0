from argparse import ArgumentParser, Namespace
from os import path
from typing import Any, Dict, List, Optional, Tuple, Union
from PIL import Image

from .reg_utils import (
    CompactDict, CompactList, create_parser, ensure_output_dir,
    write_json_idempotent
)


IntOrFloat = Union[int, float]
AABB = Tuple[int, int, int, int]

DIAMETER_CM: float = 80.0
BLOCK_CM: float = 100.0
BLOCK_UNITS: float = 16.0
THICKNESS_CM: float = 2.5

# 80cm = 12.8 units; thickness 2.5cm = 0.4 units
DIAMETER_UNITS: float = DIAMETER_CM / BLOCK_CM * BLOCK_UNITS
THICKNESS_UNITS: float = THICKNESS_CM / BLOCK_CM * BLOCK_UNITS

BASE_COORD: float = (BLOCK_UNITS - DIAMETER_UNITS) / 2.0  # 1.6

SINGLE_ROTATIONS: Tuple[str, ...] = ("0", "1", "2", "15")
DOUBLE_ROTATIONS: Tuple[str, ...] = ("16", "17", "18", "23")
WALL_ROTATIONS: Tuple[str, ...] = ("26",)

ROTATION_ANGLES: Dict[str, IntOrFloat] = {
    "0": 0, "1": -22.5, "2": -45, "15": 22.5,
    "16": 0, "17": -22.5, "18": -45, "23": 22.5,
    "26": 0
}

ATTACHMENT_SHIFTS: Dict[str, float] = \
{"": 0.0, "_down": -BASE_COORD, "_up": BASE_COORD}


def clean_num(n: float) -> IntOrFloat:
    """Return int if number has no decimal part, otherwise round float."""

    r: float = round(n, 4)
    return int(r) if r.is_integer() else r


def extract_pixel_spans(tex_path: str) -> Tuple[List[AABB], List[AABB], int]:
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
                grouped_cols.append(
                    (start_x, x - 1, curr_col[0], curr_col[1])
                )
            curr_col = span_col
            start_x = x
    if curr_col is not None:
        grouped_cols.append((start_x, w - 1, curr_col[0], curr_col[1]))

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
                grouped_rows.append(
                    (start_y, y - 1, curr_row[0], curr_row[1])
                )
            curr_row = span_row
            start_y = y
    if curr_row is not None:
        grouped_rows.append((start_y, h - 1, curr_row[0], curr_row[1]))

    return grouped_cols, grouped_rows, w


def build_parent_model(
    rot: str,
    attachment: str,
    grouped_cols: List[AABB],
    grouped_rows: List[AABB],
    tex_size: int
) -> Any:
    """Build a circle parent model with front/back quads and rim slices."""
    step: float = DIAMETER_UNITS / tex_size
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

    angle: IntOrFloat = ROTATION_ANGLES[rot]
    elements: List[Dict[str, Any]] = []

    # Element 0: Main circular sign face quad
    e0_from: List[IntOrFloat] = \
    [clean_num(BASE_COORD), clean_num(BASE_COORD+y_shift), clean_num(z_min)]
    e0_to: List[IntOrFloat] = [
        clean_num(BASE_COORD+DIAMETER_UNITS),
        clean_num(BASE_COORD+DIAMETER_UNITS+y_shift), clean_num(z_max)
    ]

    e0: Dict[str, Any] = {
        "from": CompactList(e0_from),
        "to": CompactList(e0_to),
        "faces": {
            "north": CompactDict({
                "uv": [0, 0, 16, 16], "texture": "#back", "cullface": "north"
            } if kind == "wall" else {
                "uv": [0, 0, 16, 16],
                "texture": "#front" if kind == "double" else "#back"
            }),
            "south": CompactDict({"uv": [0, 0, 16, 16], "texture": "#front"})
        }
    }
    if angle != 0:
        e0["rotation"] = \
        CompactDict({"origin": [8, 8, 8], "axis": "y", "angle": angle})
    elements.append(e0)

    # UV for side rim textures (centered in texture)
    uv_z_min: IntOrFloat = \
    clean_num(8.0-THICKNESS_UNITS if kind == "double" else 8.0)
    uv_z_max: IntOrFloat = clean_num(8.0+THICKNESS_UNITS)

    # Elements 1..N: Vertical slices defining down and up rim faces
    for x1, x2, y1, y2 in grouped_cols:
        mx1: IntOrFloat = clean_num(BASE_COORD + x1*step)
        mx2: IntOrFloat = clean_num(BASE_COORD + (x2+1)*step)
        my_bottom: IntOrFloat = \
        clean_num(BASE_COORD + DIAMETER_UNITS - (y2+1)*step + y_shift)
        my_top: IntOrFloat = \
        clean_num(BASE_COORD + DIAMETER_UNITS - y1*step + y_shift)

        elem_col: Dict[str, Any] = {
            "from": CompactList([mx1, my_bottom, clean_num(z_min)]),
            "to": CompactList([mx2, my_top, clean_num(z_max)]),
            "faces": {
                "down": CompactDict({
                    "uv": [mx1, uv_z_min, mx2, uv_z_max],
                    "texture": "#side"
                }),
                "up": CompactDict({
                    "uv": [mx1, uv_z_min, mx2, uv_z_max],
                    "texture": "#side"
                })
            }
        }
        if angle != 0:
            elem_col["rotation"] = \
            CompactDict({"origin": [8, 8, 8], "axis": "y", "angle": angle})
        elements.append(elem_col)

    # Elements N+1..2N: Horizontal slices defining west and east rim faces
    for y1, y2, x1, x2 in grouped_rows:
        my_bottom = \
        clean_num(BASE_COORD + DIAMETER_UNITS - (y2+1) * step + y_shift)
        my_top = clean_num(BASE_COORD + DIAMETER_UNITS - y1 * step + y_shift)
        mx_left: IntOrFloat = clean_num(BASE_COORD + x1 * step)
        mx_right: IntOrFloat = clean_num(BASE_COORD + (x2 + 1) * step)

        uv_y1: IntOrFloat = \
        clean_num(BASE_COORD + DIAMETER_UNITS - (y2+1)*step)
        uv_y2: IntOrFloat = clean_num(BASE_COORD + DIAMETER_UNITS - y1*step)

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
        if angle != 0:
            elem_row["rotation"] = \
            CompactDict({"origin": [8, 8, 8], "axis": "y", "angle": angle})
        elements.append(elem_row)

    return {
        "ambientocclusion": False,
        "textures": CompactDict({"particle": "#front"}),
        "elements": elements
    }


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = create_parser(
        "Generate circle sign parent models from circle_backboard.png"
    )
    parser.add_argument(
        "--texture", default=None,
        help="Path to circle_backboard.png (default: derived from dir)"
    )
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    tex_path: str = args.texture
    if tex_path is None:
        tex_path = path.normpath(path.join(
            args.dir, "..", "..", "textures", "block", "circle_backboard.png"
        ))
    elif path.isdir(tex_path):
        tex_path = path.join(tex_path, "circle_backboard.png")

    grouped_cols, grouped_rows, tex_size = extract_pixel_spans(tex_path)

    all_rotations: Tuple[str, ...] = \
    SINGLE_ROTATIONS + DOUBLE_ROTATIONS + WALL_ROTATIONS

    for rot in all_rotations:
        for attachment in ATTACHMENT_SHIFTS:
            model_data: Dict[str, Any] = build_parent_model(
                rot, attachment, grouped_cols, grouped_rows, tex_size
            )
            filename: str = f"circle_rotation{rot}{attachment}.json"
            write_json_idempotent(
                args.dir, filename, model_data, args.dry_run, compact=True
            )


if __name__ == "__main__":
    main()
