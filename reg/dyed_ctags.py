from argparse import ArgumentParser, Namespace
from typing import List, Optional, Tuple

from .reg_utils import (
    COLORS, create_parser, ensure_output_dir, write_json_idempotent
)


ALL_BLOCKS: Tuple[str, ...] = (
    "dotted4_tp",
    "dotted5_tp",
    "dotted6_tp",
    "dotted7_tp",
    "dotted8_tp",
    "dotted9_tp",
    "dotted10_tp",
    "lined4_tp",
    "lined5_tp",
    "lined6_tp",
    "lined7_tp",
    "lined8_tp",
    "lined9_tp",
    "lined10_tp",
    "half1_cylindrical_rod",
    "full1_cylindrical_rod",
    "rod_with_lamp"
)


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = create_parser("Generate all #c:dyed/* tags")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for color in COLORS:
        to_write = {
            "replace": False,
            "values": [
                f"cntrafficsymbols_0d0:{color}_{block}" for block in ALL_BLOCKS
            ]
        }
        write_json_idempotent(args.dir, f"{color}.json", to_write,
                              args.dry_run, sort_keys=True)


if __name__ == "__main__":
    main()
