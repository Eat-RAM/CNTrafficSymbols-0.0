import io
import math

from argparse import ArgumentParser, Namespace
from os import path
from sys import stderr
from typing import Dict, List, Optional, Tuple
from PIL import Image, ImageDraw

from .reg_utils import ensure_output_dir


CANVAS_SIZE: int = 1024
TARGET_SIZE: int = 256
SCALE: float = CANVAS_SIZE / 300.0
CX: float = CANVAS_SIZE / 2.0
CY: float = CANVAS_SIZE / 2.0


def pt(x_mm: float, y_mm: float) -> Tuple[float, float]:
    """Convert millimeter coordinates to high-resolution canvas pixels."""

    return (CX + x_mm * SCALE, CY - y_mm * SCALE)


def write_image_idempotent(
    target_dir: str, filename: str, img: Image.Image, dry_run: bool
) -> bool:
    """Write PNG image only if contents differ from existing file."""

    target_path: str = path.join(target_dir, filename)
    buf: io.BytesIO = io.BytesIO()
    img.save(buf, format="PNG")
    new_bytes: bytes = buf.getvalue()

    same: bool = False
    new_file: bool = False
    try:
        with open(target_path, "rb") as f:
            same = f.read() == new_bytes
    except FileNotFoundError:
        new_file = True

    log_string: str = f"Wrote {target_path}\n"
    if new_file:
        log_string = "[NEW] " + log_string

    if same:
        return False
    if dry_run:
        stderr.write(log_string)
    else:
        with open(target_path, "wb") as f:
            f.write(new_bytes)
        stderr.write(log_string)
    return True


def make_full_circle() -> Image.Image:
    im: Image.Image = \
    Image.new("RGBA", (CANVAS_SIZE, CANVAS_SIZE), (0, 0, 0, 0))
    d: ImageDraw.ImageDraw = ImageDraw.Draw(im)
    r: float = 145.0 * SCALE
    d.ellipse([CX-r, CY-r, CX+r, CY+r], fill=(255, 255, 255, 255))
    return im.resize((TARGET_SIZE, TARGET_SIZE), Image.Resampling.LANCZOS)


def make_arrow_left() -> Image.Image:
    im: Image.Image = \
    Image.new("RGBA", (CANVAS_SIZE, CANVAS_SIZE), (0, 0, 0, 0))
    d: ImageDraw.ImageDraw = ImageDraw.Draw(im)

    w_arm_x: float = 36.0 * math.sqrt(2.0)
    tip_x: float = -123.0
    chevron: List[Tuple[float, float]] = [
        pt(tip_x, 0.0),
        pt(-13.0, 110.0),
        pt(-13.0 + w_arm_x, 110.0),
        pt(tip_x + w_arm_x, 0.0),
        pt(-13.0 + w_arm_x, -110.0),
        pt(-13.0, -110.0)
    ]
    d.polygon(chevron, fill=(255, 255, 255, 255))

    shaft: List[Tuple[float, float]] = [
        pt(-20.0, 18.0),
        pt(118.0, 18.0),
        pt(118.0, -18.0),
        pt(-20.0, -18.0)
    ]
    d.polygon(shaft, fill=(255, 255, 255, 255))
    return im.resize((TARGET_SIZE, TARGET_SIZE), Image.Resampling.LANCZOS)


def make_cross() -> Image.Image:
    im: Image.Image = \
    Image.new("RGBA", (CANVAS_SIZE, CANVAS_SIZE), (0, 0, 0, 0))
    d: ImageDraw.ImageDraw = ImageDraw.Draw(im)

    for angle in (45.0, -45.0):
        ca: float = math.cos(math.radians(angle))
        sa: float = math.sin(math.radians(angle))
        corners: List[Tuple[float, float]] = [
            (-118.0, -18.0),
            (118.0, -18.0),
            (118.0, 18.0),
            (-118.0, 18.0)
        ]
        poly: List[Tuple[float, float]] = \
        [pt(u * ca - v * sa, u * sa + v * ca) for u, v in corners]
        d.polygon(poly, fill=(255, 255, 255, 255))
    return im.resize((TARGET_SIZE, TARGET_SIZE), Image.Resampling.LANCZOS)


def make_arrow_uturn() -> Image.Image:
    im: Image.Image = \
    Image.new("RGBA", (CANVAS_SIZE, CANVAS_SIZE), (0, 0, 0, 0))
    d: ImageDraw.ImageDraw = ImageDraw.Draw(im)

    arc_poly: List[Tuple[float, float]] = []
    for deg in range(0, 181, 2):
        rad: float = math.radians(deg)
        arc_poly.append(pt(70.0 * math.cos(rad), 40.0 + 70.0 * math.sin(rad)))
    for deg in range(180, -1, -2):
        rad: float = math.radians(deg)
        arc_poly.append(pt(40.0 * math.cos(rad), 40.0 + 40.0 * math.sin(rad)))
    d.polygon(arc_poly, fill=(255, 255, 255, 255))

    r_leg: List[Tuple[float, float]] = [
        pt(40.0, 40.0), pt(70.0, 40.0),
        pt(70.0, -110.0), pt(40.0, -110.0)
    ]
    d.polygon(r_leg, fill=(255, 255, 255, 255))

    l_leg: List[Tuple[float, float]] = [
        pt(-70.0, 40.0), pt(-40.0, 40.0),
        pt(-40.0, -30.0), pt(-70.0, -30.0)
    ]
    d.polygon(l_leg, fill=(255, 255, 255, 255))

    t_vert: float = 30.0 * math.sqrt(2.0)
    chev: List[Tuple[float, float]] = [
        pt(-55.0, -110.0),
        pt(-105.0, -60.0),
        pt(-105.0, -60.0 + t_vert),
        pt(-55.0, -110.0 + t_vert),
        pt(-5.0, -60.0 + t_vert),
        pt(-5.0, -60.0)
    ]
    d.polygon(chev, fill=(255, 255, 255, 255))
    return im.resize((TARGET_SIZE, TARGET_SIZE), Image.Resampling.LANCZOS)


STAND_POINTS: List[Tuple[float, float]] = [
    (-1.6, 110.0), (-8.8, 107.1), (-13.3, 100.6), (-12.7, 89.5),
    (-7.8, 76.2), (-33.5, 71.0), (-48.1, 31.7), (-45.2, -6.0),
    (-36.1, -10.2), (-34.8, 27.1), (-28.3, 45.3), (-26.0, 48.3),
    (-20.5, 5.4), (-33.5, -99.3), (-40.0, -103.8), (-40.6, -110.0),
    (-18.8, -110.0), (-14.3, -86.9), (-14.3, -81.1), (-13.3, -80.8),
    (-11.0, -70.7), (-0.6, -15.1), (1.0, -16.4), (18.8, -109.7),
    (40.3, -109.7), (39.6, -103.5), (33.5, -98.3), (28.6, -60.0),
    (27.3, -58.0), (27.3, -50.5), (22.4, -13.8), (20.1, -3.7),
    (20.1, 5.0), (25.7, 48.3), (28.3, 45.3), (28.3, 42.4),
    (34.8, 25.8), (35.4, -10.6), (44.5, -6.7), (48.1, 32.3),
    (33.1, 71.3), (13.6, 74.9), (13.0, 68.4), (13.0, 75.2),
    (8.1, 76.9), (12.0, 89.9), (11.4, 102.2), (5.8, 108.7),
    (-1.6, 110.0)
]

WALK_POINTS: List[Tuple[float, float]] = [
    (0.6, 110.0), (-12.9, 108.1), (-14.2, 106.8), (-12.9, 82.5),
    (-12.3, 81.5), (-3.6, 81.2), (-3.9, 71.8), (-18.1, 67.0),
    (-36.6, 35.3), (-69.6, 12.9), (-69.6, 11.6), (-62.8, 7.4),
    (-55.6, 10.7), (-53.7, 12.9), (-52.1, 12.6), (-26.5, 26.2),
    (-17.5, 40.1), (-7.4, -1.0), (-11.3, -11.3), (-49.2, -89.0),
    (-61.1, -88.0), (-66.3, -93.2), (-42.4, -105.8), (8.1, -22.0),
    (9.7, -26.2), (52.4, -92.2), (47.2, -102.2), (50.5, -110.0),
    (69.6, -97.4), (58.6, -72.8), (56.6, -70.9), (56.0, -67.0),
    (23.9, 3.6), (23.9, 49.8), (24.9, 50.5), (29.8, 45.3),
    (44.3, 27.5), (53.1, -7.4), (60.5, -1.6), (57.9, 21.4),
    (56.6, 23.3), (55.6, 38.5), (30.4, 67.0), (9.4, 76.7),
    (10.0, 106.4), (7.4, 109.4), (0.6, 110.0)
]


def make_pedestrian(points: List[Tuple[float, float]]) -> Image.Image:
    im: Image.Image = \
    Image.new("RGBA", (CANVAS_SIZE, CANVAS_SIZE), (0, 0, 0, 0))
    d: ImageDraw.ImageDraw = ImageDraw.Draw(im)
    poly: List[Tuple[float, float]] = [pt(x, y) for x, y in points]
    d.polygon(poly, fill=(255, 255, 255, 255))
    return im.resize((TARGET_SIZE, TARGET_SIZE), Image.Resampling.LANCZOS)


def draw_bicycle_model(d: ImageDraw.ImageDraw, y_offset: float) -> None:
    tube_w: int = int(5.0 * SCALE)
    ro: float = 42.5 * SCALE
    ri: float = 37.5 * SCALE

    for hx in [-75.0, 75.0]:
        c: Tuple[float, float] = pt(hx, y_offset)
        d.ellipse(
            [c[0] - ro, c[1] - ro, c[0] + ro, c[1] + ro],
            fill=(255, 255, 255, 255)
        )
        d.ellipse(
            [c[0] - ri, c[1] - ri, c[0] + ri, c[1] + ri],
            fill=(0, 0, 0, 0)
        )

    bb: Tuple[float, float] = pt(5.0, y_offset - 12.5)
    sp: Tuple[float, float] = pt(30.0, y_offset + 62.5)
    ht_top: Tuple[float, float] = pt(-45.0, y_offset + 62.5)
    ht_bot: Tuple[float, float] = pt(-48.0, y_offset + 47.5)
    front_hub: Tuple[float, float] = pt(-75.0, y_offset)
    rear_hub: Tuple[float, float] = pt(75.0, y_offset)

    d.line([sp, ht_top], fill=(255, 255, 255, 255), width=tube_w)
    d.line([bb, ht_bot], fill=(255, 255, 255, 255), width=tube_w)
    d.line(
        [bb, pt(28.0, y_offset + 70.5)],
        fill=(255, 255, 255, 255), width=tube_w
    )
    d.line([bb, rear_hub], fill=(255, 255, 255, 255), width=tube_w)
    d.line([sp, rear_hub], fill=(255, 255, 255, 255), width=tube_w)
    d.line(
        [ht_top, ht_bot, pt(-55.0, y_offset + 12.5), front_hub],
        fill=(255, 255, 255, 255), width=tube_w
    )
    d.line(
        [ht_top, pt(-52.0, y_offset + 74.5), pt(-25.0, y_offset + 74.5)],
        fill=(255, 255, 255, 255), width=tube_w
    )
    saddle_poly: List[Tuple[float, float]] = [
        pt(15.0, y_offset + 75.5), pt(55.0, y_offset + 75.5),
        pt(50.0, y_offset + 70.5), pt(20.0, y_offset + 70.5)
    ]
    d.line(
        [pt(28.0, y_offset + 62.5), pt(32.0, y_offset + 72.5)],
        fill=(255, 255, 255, 255), width=tube_w
    )
    d.polygon(saddle_poly, fill=(255, 255, 255, 255))
    crank_end: Tuple[float, float] = pt(-10.0, y_offset - 25.5)
    d.line([bb, crank_end], fill=(255, 255, 255, 255), width=tube_w)
    d.line(
        [pt(-15.0, y_offset - 25.5), pt(-5.0, y_offset - 25.5)],
        fill=(255, 255, 255, 255), width=int(tube_w * 1.2)
    )


def make_bicycle() -> Image.Image:
    im: Image.Image = \
    Image.new("RGBA", (CANVAS_SIZE, CANVAS_SIZE), (0, 0, 0, 0))
    d: ImageDraw.ImageDraw = ImageDraw.Draw(im)
    draw_bicycle_model(d, -15.0)
    return im.resize((TARGET_SIZE, TARGET_SIZE), Image.Resampling.LANCZOS)


def make_bicycle_left() -> Image.Image:
    im: Image.Image = \
    Image.new("RGBA", (CANVAS_SIZE, CANVAS_SIZE), (0, 0, 0, 0))
    d: ImageDraw.ImageDraw = ImageDraw.Draw(im)
    draw_bicycle_model(d, 47.5)

    chev: List[Tuple[float, float]] = [
        pt(-85.0, -55.0),
        pt(-50.0, -20.0),
        pt(-30.0, -20.0),
        pt(-65.0, -55.0),
        pt(-30.0, -90.0),
        pt(-50.0, -90.0)
    ]
    d.polygon(chev, fill=(255, 255, 255, 255))

    shaft: List[Tuple[float, float]] = [
        pt(-50.0, -50.0),
        pt(95.0, -50.0),
        pt(95.0, -60.0),
        pt(-50.0, -60.0)
    ]
    d.polygon(shaft, fill=(255, 255, 255, 255))
    return im.resize((TARGET_SIZE, TARGET_SIZE), Image.Resampling.LANCZOS)


def make_digit(digit: int) -> Image.Image:
    im: Image.Image = \
    Image.new("RGBA", (128, 256), (0, 0, 0, 0))
    d: ImageDraw.ImageDraw = ImageDraw.Draw(im)

    w: float = 120.0
    h: float = 240.0
    t: float = 24.0
    s_gap: float = 7.0
    d_diag: float = (s_gap * 0.5) * math.sqrt(2.0)

    x0: float = 4.0
    x1: float = x0 + w
    y0: float = 8.0
    y2: float = y0 + h
    y1: float = (y0 + y2) * 0.5

    poly_a: List[Tuple[float, float]] = [
        (x0 + d_diag, y0),
        (x1 - d_diag, y0),
        (x1 - t - d_diag, y0 + t),
        (x0 + t + d_diag, y0 + t)
    ]
    poly_d: List[Tuple[float, float]] = [
        (x0 + t + d_diag, y2 - t),
        (x1 - t - d_diag, y2 - t),
        (x1 - d_diag, y2),
        (x0 + d_diag, y2)
    ]
    poly_g: List[Tuple[float, float]] = [
        (x0 + d_diag, y1),
        (x0 + t * 0.5 + d_diag, y1 - t * 0.5),
        (x1 - t * 0.5 - d_diag, y1 - t * 0.5),
        (x1 - d_diag, y1),
        (x1 - t * 0.5 - d_diag, y1 + t * 0.5),
        (x0 + t * 0.5 + d_diag, y1 + t * 0.5)
    ]
    poly_f: List[Tuple[float, float]] = [
        (x0, y0 + d_diag),
        (x0 + t, y0 + t + d_diag),
        (x0 + t, y1 - t * 0.5 - d_diag),
        (x0, y1 - d_diag)
    ]
    poly_b: List[Tuple[float, float]] = [
        (x1 - t, y0 + t + d_diag),
        (x1, y0 + d_diag),
        (x1, y1 - d_diag),
        (x1 - t, y1 - t * 0.5 - d_diag)
    ]
    poly_e: List[Tuple[float, float]] = [
        (x0, y1 + d_diag),
        (x0 + t, y1 + t * 0.5 + d_diag),
        (x0 + t, y2 - t - d_diag),
        (x0, y2 - d_diag)
    ]
    poly_c: List[Tuple[float, float]] = [
        (x1 - t, y1 + t * 0.5 + d_diag),
        (x1, y1 + d_diag),
        (x1, y2 - d_diag),
        (x1 - t, y2 - t - d_diag)
    ]

    segments: Dict[str, List[Tuple[float, float]]] = {
        "A": poly_a, "B": poly_b, "C": poly_c,
        "D": poly_d, "E": poly_e, "F": poly_f, "G": poly_g
    }

    digit_segs: Dict[int, List[str]] = {
        0: ["A", "B", "C", "D", "E", "F"],
        1: ["B", "C"],
        2: ["A", "B", "G", "E", "D"],
        3: ["A", "B", "G", "C", "D"],
        4: ["F", "G", "B", "C"],
        5: ["A", "F", "G", "C", "D"],
        6: ["A", "F", "G", "E", "C", "D"],
        7: ["A", "B", "C"],
        8: ["A", "B", "C", "D", "E", "F", "G"],
        9: ["A", "B", "C", "D", "F", "G"],
        10: ["A", "B", "C", "E", "F", "G"],
        11: ["C", "D", "E", "F", "G"],
        12: ["A", "D", "E", "F"],
        13: ["B", "C", "D", "E", "G"],
        14: ["A", "D", "E", "F", "G"],
        15: ["A", "E", "F", "G"]
    }

    for s_name in digit_segs[digit]:
        d.polygon(segments[s_name], fill=(255, 255, 255, 255))

    return im


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = ArgumentParser(
        description="Generate traffic light signal pattern textures"
    )
    parser.add_argument(
        "--dir", type=str, required=True,
        help="Target output directory for traffic light textures"
    )
    parser.add_argument(
        "--dry-run", action="store_true",
        help="Don't actually generate anything"
    )
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    # 1. Full circle
    write_image_idempotent(
        args.dir, "full_circle.png", make_full_circle(), args.dry_run
    )

    # 2. Arrows (4 directions)
    arrow_left: Image.Image = make_arrow_left()
    write_image_idempotent(
        args.dir, "arrow_left.png", arrow_left, args.dry_run
    )
    write_image_idempotent(
        args.dir, "arrow_straight.png", arrow_left.rotate(270), args.dry_run
    )
    write_image_idempotent(
        args.dir, "arrow_right.png", arrow_left.rotate(180), args.dry_run
    )
    write_image_idempotent(
        args.dir, "arrow_down.png", arrow_left.rotate(90), args.dry_run
    )

    # 3. Cross
    write_image_idempotent(args.dir, "cross.png", make_cross(), args.dry_run)

    # 4. Arrow U-turn
    write_image_idempotent(
        args.dir, "arrow_uturn.png", make_arrow_uturn(), args.dry_run
    )

    # 5. Pedestrians
    write_image_idempotent(
        args.dir, "pedestrian_stand.png",
        make_pedestrian(STAND_POINTS), args.dry_run
    )
    write_image_idempotent(
        args.dir, "pedestrian_walk.png",
        make_pedestrian(WALK_POINTS), args.dry_run
    )

    # 6. Bicycle & Bicycle Left
    write_image_idempotent(
        args.dir, "bicycle.png", make_bicycle(), args.dry_run
    )
    write_image_idempotent(
        args.dir, "bicycle_left.png", make_bicycle_left(), args.dry_run
    )

    # 7. Digits 0..15 (0..9 and A..F)
    for i in range(16):
        write_image_idempotent(
            args.dir, f"digit_{i:x}.png", make_digit(i), args.dry_run
        )


if __name__ == "__main__":
    main()
