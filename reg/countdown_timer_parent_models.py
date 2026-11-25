from argparse import ArgumentParser, Namespace
from typing import Any, Dict, List, Optional, Tuple, Union

from .reg_utils import (
    CompactDict, CompactList, create_parser, ensure_output_dir,
    write_json_idempotent
)


IntOrFloat = Union[int, float]


def clean_num(n: float) -> IntOrFloat:
    """Return int if number has no decimal part, otherwise round float."""

    r: float = round(n, 4)
    return int(r) if r.as_integer_ratio()[1] == 1 else r


def make_element(
    fx: float, fy: float, fz: float, tx: float, ty: float, tz: float, tex: str
) -> Dict[str, Any]:
    return {
        "from": CompactList([clean_num(fx), clean_num(fy), clean_num(fz)]),
        "to": CompactList([clean_num(tx), clean_num(ty), clean_num(tz)]),
        "faces": {
            "down": CompactDict({"texture": tex}),
            "up": CompactDict({"texture": tex}),
            "north": CompactDict({"texture": tex}),
            "south": CompactDict({"texture": tex}),
            "west": CompactDict({"texture": tex}),
            "east": CompactDict({"texture": tex})
        }
    }


def make_housing_box(
    x1: float, y1: float, z1: float, x2: float, y2: float, z2: float
) -> Dict[str, Any]:
    return {
        "from": CompactList([clean_num(x1), clean_num(y1), clean_num(z1)]),
        "to": CompactList([clean_num(x2), clean_num(y2), clean_num(z2)]),
        "faces": {
            "north": CompactDict({"texture": "#visor"}),
            "south": CompactDict({"texture": "#base"}),
            "down": CompactDict({"texture": "#visor"}),
            "up": CompactDict({"texture": "#visor"}),
            "west": CompactDict({"texture": "#visor"}),
            "east": CompactDict({"texture": "#visor"})
        }
    }


def make_timer_visor(
    x1: float, x2: float, y1: float, y2: float, z1: float, z2: float
) -> List[Dict[str, Any]]:
    top = make_element(x1, y2 - 0.25, z1, x2, y2, z2, "#visor")
    left = make_element(x1, y1, z1, x1 + 0.25, y2, z2, "#visor")
    right = make_element(x2 - 0.25, y1, z1, x2, y2, z2, "#visor")
    return [top, left, right]


ATTACH_RANGES: Dict[str, Tuple[
    Tuple[float, float], Tuple[float, float], Tuple[float, float]
]] = {
    "middle": ((2.5, 13.5), (3.0, 13.0), (0.0, 4.0)),
    "up": ((2.5, 13.5), (6.0, 16.0), (0.0, 4.0)),
    "down": ((2.5, 13.5), (0.0, 10.0), (0.0, 4.0)),
    "ceiling": ((2.5, 13.5), (6.0, 16.0), (8.0, 12.0)),
    "left": ((0.0, 11.0), (3.0, 13.0), (0.0, 4.0)),
    "right": ((5.0, 16.0), (3.0, 13.0), (0.0, 4.0)),
    "center": ((2.5, 13.5), (3.0, 13.0), (6.0, 10.0))
}


def generate_timer_model(
    x_range: Tuple[float, float],
    y_range: Tuple[float, float],
    z_range: Tuple[float, float]
) -> Dict[str, Any]:
    x1, x2 = x_range
    y1, y2 = y_range
    z1, z2 = z_range
    z_mid: float = z1 + 2.0

    elements: List[Dict[str, Any]] = \
    [make_housing_box(x1, y1, z1, x2, y2, z_mid)]
    elements.extend(make_timer_visor(x1, x2, y1, y2, z_mid, z2))

    return {
        "parent": "minecraft:block/block",
        "ambientocclusion": False,
        "textures": {
            "particle": "cntrafficsymbols_0d0:block/traffic_light_visor",
            "visor": "cntrafficsymbols_0d0:block/traffic_light_visor",
            "base": "cntrafficsymbols_0d0:block/traffic_light_base"
        },
        "elements": elements
    }


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate countdown timer parent models")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for att, (xr, yr, zr) in ATTACH_RANGES.items():
        to_write = generate_timer_model(xr, yr, zr)
        write_json_idempotent(
            args.dir, f"countdown_timer_{att}.json", to_write,
            args.dry_run, compact=True
        )


if __name__ == "__main__":
    main()
