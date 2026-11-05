from argparse import ArgumentParser, Namespace
from typing import Any, Dict, List, Optional

from .reg_utils import (
    COLORS, CompactDict, create_parser, ensure_output_dir,
    write_json_idempotent
)


def build_blockstate(color: str) -> Any:
    variants: Dict[str, Any] = {}
    for group, cl in {
        "lit=false": "unlit",
        "lit=true,color=white": "white",
        "lit=true,color=light_yellow": "lightyellow",
        "lit=true,color=yellow": "yellow",
        "lit=true,color=orange": "orange"
    }.items():
        variants.update({
            f"{group},position=down_center": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_down_center"
            }),
            f"{group},position=down_south": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_down_south"
            }),
            f"{group},position=down_southeast": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_down_southeast"
            }),
            f"{group},position=down_east": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_down_east"
            }),
            f"{group},position=down_northeast": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_down_northeast"
            }),
            f"{group},position=down_north": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_down_north"
            }),
            f"{group},position=down_northwest": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_down_northwest"
            }),
            f"{group},position=down_west": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_down_west"
            }),
            f"{group},position=down_southwest": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_down_southwest"
            }),
            f"{group},position=up_center": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_up_center"
            }),
            f"{group},position=up_south": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_up_south"
            }),
            f"{group},position=up_southeast": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_up_southeast"
            }),
            f"{group},position=up_east": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_up_east"
            }),
            f"{group},position=up_northeast": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_up_northeast"
            }),
            f"{group},position=up_north": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_up_north"
            }),
            f"{group},position=up_northwest": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_up_northwest"
            }),
            f"{group},position=up_west": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_up_west"
            }),
            f"{group},position=up_southwest": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_up_southwest"
            }),
            f"{group},position=north_center": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_center"
            }),
            f"{group},position=north_upper": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_upper"
            }),
            f"{group},position=north_uppereast": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_uppereast"
            }),
            f"{group},position=north_east": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_east"
            }),
            f"{group},position=north_lowereast": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_lowereast"
            }),
            f"{group},position=north_lower": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_lower"
            }),
            f"{group},position=north_lowerwest": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_lowerwest"
            }),
            f"{group},position=north_west": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_west"
            }),
            f"{group},position=north_upperwest": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_upperwest"
            }),
            f"{group},position=east_center": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_center", "y": 90
            }),
            f"{group},position=east_upper": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_upper", "y": 90
            }),
            f"{group},position=east_uppersouth": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_uppereast", "y": 90
            }),
            f"{group},position=east_south": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_east", "y": 90
            }),
            f"{group},position=east_lowersouth": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_lowereast", "y": 90
            }),
            f"{group},position=east_lower": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_lower", "y": 90
            }),
            f"{group},position=east_lowernorth": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_lowerwest", "y": 90
            }),
            f"{group},position=east_north": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_west", "y": 90
            }),
            f"{group},position=east_uppernorth": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_upperwest", "y": 90
            }),
            f"{group},position=south_center": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_center", "y": 180
            }),
            f"{group},position=south_upper": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_upper", "y": 180
            }),
            f"{group},position=south_upperwest": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_uppereast", "y": 180
            }),
            f"{group},position=south_west": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_east", "y": 180
            }),
            f"{group},position=south_lowerwest": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_lowereast", "y": 180
            }),
            f"{group},position=south_lower": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_lower", "y": 180
            }),
            f"{group},position=south_lowereast": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_lowerwest", "y": 180
            }),
            f"{group},position=south_east": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_west", "y": 180
            }),
            f"{group},position=south_uppereast": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_upperwest", "y": 180
            }),
            f"{group},position=west_center": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_center", "y": 270
            }),
            f"{group},position=west_upper": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_upper", "y": 270
            }),
            f"{group},position=west_uppernorth": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_uppereast", "y": 270
            }),
            f"{group},position=west_north": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_east", "y": 270
            }),
            f"{group},position=west_lowernorth": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_lowereast", "y": 270
            }),
            f"{group},position=west_lower": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_lower", "y": 270
            }),
            f"{group},position=west_lowersouth": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_lowerwest", "y": 270
            }),
            f"{group},position=west_south": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_west", "y": 270
            }),
            f"{group},position=west_uppersouth": CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_north_upperwest", "y": 270
            }),
        })
    return {"variants": variants}


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate all rod with lamp blockstates")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for color in COLORS:
        to_write = build_blockstate(color)
        write_json_idempotent(args.dir, f"{color}_rod_with_lamp.json",
                              to_write, args.dry_run, compact=True)


if __name__ == "__main__":
    main()
