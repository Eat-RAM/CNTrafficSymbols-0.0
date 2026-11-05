from argparse import ArgumentParser, Namespace
from typing import List, Optional, Tuple

from .reg_utils import (
    COLORS, CompactDict, create_parser, ensure_output_dir,
    write_json_idempotent
)


VARIANTS: Tuple[Tuple[str, str], ...] = (
    ("half1", "down_center"), ("half1", "down_south"),
    ("half1", "down_southeast"), ("half1", "down_east"),
    ("half1", "down_northeast"), ("half1", "down_north"),
    ("half1", "down_northwest"), ("half1", "down_west"),
    ("half1", "down_southwest"), ("half1", "up_center"), ("half1", "up_south"),
    ("half1", "up_southeast"), ("half1", "up_east"), ("half1", "up_northeast"),
    ("half1", "up_north"), ("half1", "up_northwest"), ("half1", "up_west"),
    ("half1", "up_southwest"), ("half1", "north_center"),
    ("half1", "north_upper"), ("half1", "north_uppereast"),
    ("half1", "north_east"), ("half1", "north_lowereast"),
    ("half1", "north_lower"), ("half1", "north_lowerwest"),
    ("half1", "north_west"), ("half1", "north_upperwest"),
    ("full1", "y_center"), ("full1", "y_south"), ("full1", "y_southeast"),
    ("full1", "y_east"), ("full1", "y_northeast"), ("full1", "y_north"),
    ("full1", "y_northwest"), ("full1", "y_west"), ("full1", "y_southwest"),
    ("full1", "z_center"), ("full1", "z_upper"), ("full1", "z_lower"),
    ("full1", "z_lowerwest"), ("full1", "z_west"), ("full1", "z_upperwest")
)


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate all cylindrical rod models")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for color in COLORS:
        for form, pos in VARIANTS:
            to_write = {
                "parent":
                f"cntrafficsymbols_0d0:block/{form}_cylindrical_rod_{pos}",
                "textures": CompactDict({
                    "side": "cntrafficsymbols_0d0:block/"
                           f"{color}_{form}_cylindrical_rod"
                })
            }
            write_json_idempotent(
                args.dir, f"{color}_{form}_cylindrical_rod_{pos}.json",
                to_write, args.dry_run, compact=True
            )


if __name__ == "__main__":
    main()
