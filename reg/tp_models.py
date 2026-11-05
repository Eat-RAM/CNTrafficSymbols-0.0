from argparse import ArgumentParser, Namespace
from typing import List, Optional, Tuple

from .reg_utils import (
    COLORS, CompactDict, create_parser, ensure_output_dir,
    write_json_idempotent
)


STYLES: Tuple[str, ...] = (
    "dotted4_tp_bottom", "dotted4_tp_up", "dotted5_tp_bottom", "dotted5_tp_up",
    "dotted6_tp_bottom", "dotted6_tp_up", "dotted7_tp_bottom", "dotted7_tp_up",
    "dotted8_tp_bottom", "dotted8_tp_up", "dotted9_tp_bottom", "dotted9_tp_up",
    "dotted10_tp_bottom", "dotted10_tp_up", "lined4_tp_x_bottom",
    "lined4_tp_x_up", "lined5_tp_x_bottom", "lined5_tp_x_up",
    "lined6_tp_x_bottom", "lined6_tp_x_up", "lined7_tp_x_bottom",
    "lined7_tp_x_up", "lined8_tp_x_bottom", "lined8_tp_x_up",
    "lined9_tp_x_bottom", "lined9_tp_x_up", "lined10_tp_x_bottom",
    "lined10_tp_x_up"
)


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = create_parser("Generate all tp models")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for color in COLORS:
        for style in STYLES:
            to_write = {
                "parent": f"cntrafficsymbols_0d0:block/{style}",
                "textures":
                CompactDict({"this": f"minecraft:block/{color}_concrete"})
            }
            write_json_idempotent(args.dir, f"{color}_{style}.json", to_write,
                                  args.dry_run, compact=True)


if __name__ == "__main__":
    main()
