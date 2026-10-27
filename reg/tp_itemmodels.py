from argparse import ArgumentParser, Namespace
from typing import List, Optional, Tuple

from .reg_utils import (
    COLORS, create_parser, ensure_output_dir, write_json_idempotent
)


STYLES: Tuple[str, ...] = (
    "dotted4_tp",
    "dotted5_tp",
    "dotted6_tp",
    "dotted7_tp",
    "dotted8_tp",
    "dotted9_tp",
    "dotted10_tp",
    "lined4_tp_x",
    "lined5_tp_x",
    "lined6_tp_x",
    "lined7_tp_x",
    "lined8_tp_x",
    "lined9_tp_x",
    "lined10_tp_x"
)


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = create_parser("Generate all tp item-models")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for color in COLORS:
        for style in STYLES:
            clean_name: str = style[:-2] if style.endswith("_x") else style
            to_write = {
                "model": {
                    "type": "minecraft:model",
                    "model":
                    f"cntrafficsymbols_0d0:block/{color}_{style}_bottom"
                }
            }
            write_json_idempotent(args.dir, f"{color}_{clean_name}.json",
                                  to_write, args.dry_run)


if __name__ == "__main__":
    main()
