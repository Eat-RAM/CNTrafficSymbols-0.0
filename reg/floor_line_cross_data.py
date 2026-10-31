from dataclasses import dataclass
from typing import Dict, List, Tuple
from PIL import Image


@dataclass(frozen=True)
class FloorLineCrossBlockInfo:
    name: str
    r: int
    wr: int  # 2 or 4 (px width)
    cr: str  # 'white' or 'yellow'
    fr: bool
    c: int
    wc: int  # 2 or 4 (px width)
    cc: str  # 'white' or 'yellow'
    fc: bool
    kind: str  # 'center_symmetric', 'diagonal', 'axial', 'chiral'

    @property
    def r_px_start(self) -> int:
        return 2 * self.r

    @property
    def c_px_start(self) -> int:
        return 2 * self.c


def w_code(w: int) -> str:
    return str((w * 25) // 4)


def classify_cross(
    r: int, wr: int, cr: str, fr: bool,
    c: int, wc: int, cc: str, fc: bool
) -> str:
    if r == 3 and wr == 4 and c == 3 and wc == 4 and cr == cc:
        return "center_symmetric"
    if r == c and wr == wc and cr == cc:
        return "diagonal"
    if c == 3 and wc == 4 and (cr == cc or (r == 0 and fr)):
        return "axial"
    return "chiral"


def get_all_floor_line_crosses() -> List[FloorLineCrossBlockInfo]:
    blocks: List[FloorLineCrossBlockInfo] = []

    # 1. 21 configs with r > 0 and c > 0 (all monochromatic, 42 blocks)
    for color in ("white", "yellow"):
        # rc (12 x 12, 2px x 2px)
        for i in range(1, 4):
            for j in range(i, 4):
                blocks.append(FloorLineCrossBlockInfo(
                    name=f"{color}_r{i}_12_c{j}_12_floor_line",
                    r=i, wr=2, cr=color, fr=False,
                    c=j, wc=2, cc=color, fc=False,
                    kind=classify_cross(i, 2, color, False, j, 2, color, False)
                ))
        # RC (25 x 25, 4px x 4px)
        for i in range(1, 4):
            for j in range(i, 4):
                blocks.append(FloorLineCrossBlockInfo(
                    name=f"{color}_r{i}_25_c{j}_25_floor_line",
                    r=i, wr=4, cr=color, fr=False,
                    c=j, wc=4, cc=color, fc=False,
                    kind=classify_cross(i, 4, color, False, j, 4, color, False)
                ))
        # rC (12 x 25, 2px x 4px)
        for i in range(1, 4):
            for j in range(1, 4):
                blocks.append(FloorLineCrossBlockInfo(
                    name=f"{color}_r{i}_12_c{j}_25_floor_line",
                    r=i, wr=2, cr=color, fr=False,
                    c=j, wc=4, cc=color, fc=False,
                    kind=classify_cross(i, 2, color, False, j, 4, color, False)
                ))

    # 2. 14 configs touching grid edge (excluding r0C0)
    # (r, wr, c, wc, f_line)
    configs_14: List[Tuple[int, int, int, int, str]] = [
        # rc touching 0
        (0, 2, 0, 2, "r"),
        (0, 2, 1, 2, "r"),
        (0, 2, 2, 2, "r"),
        (0, 2, 3, 2, "r"),
        # RC touching 0
        (0, 4, 0, 4, "r"),
        (0, 4, 1, 4, "r"),
        (0, 4, 2, 4, "r"),
        (0, 4, 3, 4, "r"),
        # rC touching 0 (row touches 0)
        (0, 2, 1, 4, "r"),
        (0, 2, 2, 4, "r"),
        (0, 2, 3, 4, "r"),
        # rC touching 0 (col touches 0)
        (1, 2, 0, 4, "c"),
        (2, 2, 0, 4, "c"),
        (3, 2, 0, 4, "c"),
    ]

    for r, wr, c, wc, f_line in configs_14:
        # Monochromatic (2 blocks)
        for color in ("white", "yellow"):
            blocks.append(FloorLineCrossBlockInfo(
                name=f"{color}_r{r}_{w_code(wr)}_c{c}_{w_code(wc)}_floor_line",
                r=r, wr=wr, cr=color, fr=False,
                c=c, wc=wc, cc=color, fc=False,
                kind=classify_cross(r, wr, color, False, c, wc, color, False)
            ))
        # Dual-color (2 blocks)
        for c1, c2 in (("white", "yellow"), ("yellow", "white")):
            blocks.append(FloorLineCrossBlockInfo(
                name=
                f"{c1}_r{r}_f{w_code(wr)}_{c2}_c{c}_{w_code(wc)}_floor_line",
                r=r, wr=wr, cr=c1, fr=True,
                c=c, wc=wc, cc=c2, fc=False,
                kind=classify_cross(r, wr, c1, True, c, wc, c2, False)
            ) if f_line == "r" else FloorLineCrossBlockInfo(
                name=
                f"{c1}_r{r}_{w_code(wr)}_{c2}_c{c}_f{w_code(wc)}_floor_line",
                r=r, wr=wr, cr=c1, fr=False,
                c=c, wc=wc, cc=c2, fc=True,
                kind=classify_cross(r, wr, c1, False, c, wc, c2, True)
            ))

    # 3. r0C0 (6 blocks)
    for color in ("white", "yellow"):
        blocks.append(FloorLineCrossBlockInfo(
            name=f"{color}_r0_12_c0_25_floor_line",
            r=0, wr=2, cr=color, fr=False,
            c=0, wc=4, cc=color, fc=False,
            kind=classify_cross(0, 2, color, False, 0, 4, color, False)
        ))
    for c1, c2 in (("white", "yellow"), ("yellow", "white")):
        blocks.append(FloorLineCrossBlockInfo(
            name=f"{c1}_r0_f12_{c2}_c0_25_floor_line",
            r=0, wr=2, cr=c1, fr=True,
            c=0, wc=4, cc=c2, fc=False,
            kind=classify_cross(0, 2, c1, True, 0, 4, c2, False)
        ))
    for c1, c2 in (("white", "yellow"), ("yellow", "white")):
        blocks.append(FloorLineCrossBlockInfo(
            name=f"{c1}_r0_12_{c2}_c0_f25_floor_line",
            r=0, wr=2, cr=c1, fr=False,
            c=0, wc=4, cc=c2, fc=True,
            kind=classify_cross(0, 2, c1, False, 0, 4, c2, True)
        ))

    return blocks


ALL_FLOOR_LINE_CROSSES: List[FloorLineCrossBlockInfo] = \
get_all_floor_line_crosses()


def generate_cross_texture(info: FloorLineCrossBlockInfo) -> Image.Image:
    im: Image.Image = Image.new("RGBA", (16, 16), (0, 0, 0, 0))
    white: Tuple[int, int, int, int] = (224, 224, 224, 255)
    yellow: Tuple[int, int, int, int] = (224, 160, 0, 255)

    col_c: Tuple[int, int, int, int] = white if info.cc == "white" else yellow
    row_c: Tuple[int, int, int, int] = white if info.cr == "white" else yellow

    # Draw the non-f line first, then the f one so f line dominates the crossing
    draw_order: Tuple[str, ...] = ("col", "row") if info.fr else ("row", "col")

    for part in draw_order:
        if part == "col":
            c_start = info.c_px_start
            c_w = info.wc
            for y in range(16):
                for x in range(c_start, c_start + c_w):
                    im.putpixel((x, y), col_c)
        else:
            r_start = info.r_px_start
            r_w = info.wr
            for y in range(r_start, r_start + r_w):
                for x in range(16):
                    im.putpixel((x, y), row_c)

    return im


def _format_width(w: int, full: bool, is_en: bool = False) -> str:
    val: str = f"{w*6.25:g}cm"
    return (f"Full {val}" if is_en else f"全{val}") if full else val


def get_zh_cn_name(b: FloorLineCrossBlockInfo) -> str:
    color_map: Dict[str, str] = {"white": "白", "yellow": "黄"}
    wr_str: str = _format_width(b.wr, b.fr, False)
    wc_str: str = _format_width(b.wc, b.fc, False)
    c_str: str = color_map[b.cr] + ("色" if b.cr == b.cc else color_map[b.cc])
    return f"{c_str}r{b.r}({wr_str})c{b.c}({wc_str})地面十字线"


def get_zh_tw_name(b: FloorLineCrossBlockInfo) -> str:
    color_map: Dict[str, str] = {"white": "白", "yellow": "黃"}
    wr_str: str = _format_width(b.wr, b.fr, False)
    wc_str: str = _format_width(b.wc, b.fc, False)
    c_str: str = color_map[b.cr] + ("色" if b.cr == b.cc else color_map[b.cc])
    return f"{c_str}r{b.r}({wr_str})c{b.c}({wc_str})地面十字線"


def get_en_us_name(b: FloorLineCrossBlockInfo) -> str:
    color_map: Dict[str, str] = {"white": "White", "yellow": "Yellow"}
    wr_str: str = _format_width(b.wr, b.fr, True)
    wc_str: str = _format_width(b.wc, b.fc, True)
    c_str: str = color_map[b.cr] if b.cr == b.cc \
                 else f"{color_map[b.cr]}/{color_map[b.cc]}"
    return f"{c_str} r{b.r}({wr_str}) c{b.c}({wc_str}) Floor Line Cross"
