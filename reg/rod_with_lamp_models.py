from argparse import ArgumentParser, Namespace
from typing import List, Optional, Tuple

from .reg_utils import (
    COLORS, create_parser, ensure_output_dir, write_json_idempotent
)


POSITIONS: Tuple[str, ...] = (
    "down_center", "down_south", "down_southeast", "down_east",
    "down_northeast", "down_north", "down_northwest", "down_west",
    "down_southwest", "up_center", "up_south", "up_southeast", "up_east",
    "up_northeast", "up_north", "up_northwest", "up_west", "up_southwest",
    "north_center", "north_upper", "north_uppereast", "north_east",
    "north_lowereast", "north_lower", "north_lowerwest", "north_west",
    "north_upperwest"
)

LIGHT_COLORS: Tuple[str, ...] = \
("unlit", "white", "lightyellow", "yellow", "orange")


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = create_parser("Generate all rod with lamp models")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for color in COLORS:
        for pos in POSITIONS:
            for light in LIGHT_COLORS:
                to_write = {
                    "parent":
                    f"cntrafficsymbols_0d0:block/rod_with_lamp_{pos}",
                    "textures": {
                        "side": "cntrafficsymbols_0d0:"
                               f"block/{color}_half1_cylindrical_rod",
                        "cover": "cntrafficsymbols_0d0:block/"
                                f"rod_with_lamp_cover_{light}"
                    }
                }
                write_json_idempotent(
                    args.dir, f"{color}_rod_with_lamp_{light}_{pos}.json",
                    to_write, args.dry_run
                )


if __name__ == "__main__":
    main()
