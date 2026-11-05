from argparse import ArgumentParser, Namespace
from typing import List, Optional, Tuple

from .reg_utils import (
    COLORS, CompactDict, create_parser, ensure_output_dir,
    write_json_idempotent
)


STYLES1: Tuple[str, ...] = (
    "dotted4_tp",
    "dotted5_tp",
    "dotted6_tp",
    "dotted7_tp",
    "dotted8_tp",
    "dotted9_tp",
    "dotted10_tp"
)

STYLES2: Tuple[str, ...] = (
    "lined4_tp",
    "lined5_tp",
    "lined6_tp",
    "lined7_tp",
    "lined8_tp",
    "lined9_tp",
    "lined10_tp"
)


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = create_parser("Generate all tp blockstates")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for color in COLORS:
        for style in STYLES1:
            to_write = {
                "variants": {
                    "bottom=true": CompactDict({
                        "model":
                        f"cntrafficsymbols_0d0:block/{color}_{style}_bottom"
                    }),
                    "bottom=false": CompactDict({
                        "model":
                        f"cntrafficsymbols_0d0:block/{color}_{style}_up"
                    })
                }
            }
            write_json_idempotent(args.dir, f"{color}_{style}.json", to_write,
                                  args.dry_run, compact=True)
        for style in STYLES2:
            to_write = {
                "variants": {
                    "axis=x,bottom=true": CompactDict({
                        "model":
                        f"cntrafficsymbols_0d0:block/{color}_{style}_x_bottom"
                    }),
                    "axis=x,bottom=false": CompactDict({
                        "model":
                        f"cntrafficsymbols_0d0:block/{color}_{style}_x_up"
                    }),
                    "axis=z,bottom=true": {
                        "model":
                        f"cntrafficsymbols_0d0:block/{color}_{style}_x_bottom",
                        "y": 90,
                        "uvlock": True
                    },
                    "axis=z,bottom=false": {
                        "model":
                        f"cntrafficsymbols_0d0:block/{color}_{style}_x_up",
                        "y": 90,
                        "uvlock": True
                    }
                }
            }
            write_json_idempotent(args.dir, f"{color}_{style}.json", to_write,
                                  args.dry_run, compact=True)


if __name__ == "__main__":
    main()
