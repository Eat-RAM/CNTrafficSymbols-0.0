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
    fx: float, fy: float, fz: float, tx: float, ty: float, tz: float, tex: str,
    rot: Optional[Dict[str, Any]] = None # no automatic copy to rot
) -> Dict[str, Any]:
    elem: Dict[str, Any] = {
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
    if rot:
        elem["rotation"] = rot
    return elem


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


def make_circular_visor(
    cx: float, cy: float, z1: float, z2: float
) -> List[Dict[str, Any]]:
    top = make_element(cx-1.0, cy+2.2, z1, cx+1.0, cy+2.4, z2, "#visor")
    left = make_element(cx-2.4, cy-0.5, z1, cx-2.2, cy+1.0, z2, "#visor")
    right = make_element(cx+2.2, cy-0.5, z1, cx+2.4, cy+1.0, z2, "#visor")
    top_left = make_element(
        cx-1.0, cy+2.2, z1, cx+1.0, cy+2.4, z2, "#visor", rot=CompactDict({
            "origin": CompactList([
                clean_num(cx), clean_num(cy), clean_num(z1)
            ]),
            "axis": "z",
            "angle": 45
        })
    )
    top_right = make_element(
        cx-1.0, cy+2.2, z1, cx+1.0, cy+2.4, z2, "#visor", rot=CompactDict({
            "origin": CompactList([
                clean_num(cx), clean_num(cy), clean_num(z1)
            ]),
            "axis": "z",
            "angle": -45
        })
    )
    return [top, left, right, top_left, top_right]


def make_square_visor(
    cx: float, cy: float, z1: float, z2: float
) -> List[Dict[str, Any]]:
    top = make_element(cx-2.4, cy+2.2, z1, cx+2.4, cy+2.4, z2, "#visor")
    left = make_element(cx-2.4, cy-2.4, z1, cx-2.2, cy+2.4, z2, "#visor")
    right = make_element(cx+2.2, cy-2.4, z1, cx+2.4, cy+2.4, z2, "#visor")
    return [top, left, right]


def generate_horizontal_model(
    width: float, y_range: Tuple[float, float], z_range: Tuple[float, float],
    centers: List[float], sq_mid: bool = False
) -> Dict[str, Any]:
    x1: float = (16.0 - width) / 2.0
    x2: float = 16.0 - x1
    y1, y2 = y_range
    z1, z2 = z_range
    z_mid: float = z1 + 2.0
    cy: float = (y1 + y2) / 2.0

    elements: List[Dict[str, Any]] = \
    [make_housing_box(x1, y1, z1, x2, y2, z_mid)]
    for i, cx in enumerate(centers):
        elements.extend((
            make_square_visor if sq_mid and i == 1 else make_circular_visor
        )(cx, cy, z_mid, z2))

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


def generate_vertical_model(
    x_range: Tuple[float, float], height: float, z_range: Tuple[float, float],
    centers: List[float], sq_mid: bool = False
) -> Dict[str, Any]:
    x1, x2 = x_range
    y1: float = (16.0 - height) / 2.0
    y2: float = 16.0 - y1
    z1, z2 = z_range
    z_mid: float = z1 + 2.0
    cx: float = (x1 + x2) / 2.0

    elements: List[Dict[str, Any]] = \
    [make_housing_box(x1, y1, z1, x2, y2, z_mid)]
    for i, cy in enumerate(centers):
        elements.extend((
            make_square_visor if sq_mid and i == 1 else make_circular_visor
        )(cx, cy, z_mid, z2))

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


def generate_all_traffic_light_parents() -> Dict[str, Dict[str, Any]]:
    models: Dict[str, Dict[str, Any]] = {}
    h_y_ranges: Dict[str, Tuple[float, float]] = {
        "down": (0.0, 6.0),
        "middle": (5.0, 11.0),
        "up": (10.0, 16.0),
        "ceiling": (10.0, 16.0)
    }

    # Horizontal 2: width 11
    h2_centers: List[float] = [5.25, 10.75]
    for att, y_rng in h_y_ranges.items():
        z_rng: Tuple[float, float] = \
        (8.0, 12.0) if att == "ceiling" else (0.0, 4.0)
        name: str = f"horizontal2_traffic_light_{att}"
        models[name] = \
        generate_horizontal_model(11.0, y_rng, z_rng, h2_centers)

    # Horizontal 3: width 16
    h3_centers: List[float] = [3.0, 8.0, 13.0]
    for att, y_rng in h_y_ranges.items():
        z_rng: Tuple[float, float] = \
        (8.0, 12.0) if att == "ceiling" else (0.0, 4.0)
        models[f"horizontal3_traffic_light_{att}"] = \
        generate_horizontal_model(16.0, y_rng, z_rng, h3_centers)
        models[f"horizontal3_sqmid_traffic_light_{att}"] = \
        generate_horizontal_model(16.0, y_rng, z_rng, h3_centers, sq_mid=True)

    v_x_ranges: Dict[str, Tuple[float, float]] = {
        "left": (0.0, 6.0),
        "middle": (5.0, 11.0),
        "right": (10.0, 16.0)
    }
    z_std: Tuple[float, float] = (0.0, 4.0)

    # Vertical 2: height 11
    v2_centers: List[float] = [10.5, 5.5]
    for att, x_rng in v_x_ranges.items():
        name: str = f"vertical2_traffic_light_{att}"
        models[name] = generate_vertical_model(x_rng, 11.0, z_std, v2_centers)

    # Vertical 3: height 16
    v3_centers: List[float] = [13.0, 8.0, 3.0]
    for att, x_rng in v_x_ranges.items():
        models[f"vertical3_traffic_light_{att}"] = \
        generate_vertical_model(x_rng, 16.0, z_std, v3_centers)
        models[f"vertical3_sqmid_traffic_light_{att}"] = \
        generate_vertical_model(x_rng, 16.0, z_std, v3_centers, sq_mid=True)

    return models


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate traffic light parent models")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)
    models = generate_all_traffic_light_parents()
    for name, model in models.items():
        write_json_idempotent(
            args.dir, f"{name}.json", model, args.dry_run, compact=True
        )


if __name__ == "__main__":
    main()
