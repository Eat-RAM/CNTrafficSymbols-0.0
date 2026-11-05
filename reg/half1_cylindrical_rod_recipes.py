from argparse import ArgumentParser, Namespace
from typing import List, Optional

from .reg_utils import (
    COLORS, CompactDict, create_parser, ensure_output_dir,
    write_json_idempotent
)


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate all half1 cylindrical rod recipes")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for color in COLORS:
        to_write = {
            "type": "minecraft:stonecutting",
            "count": 2,
            "ingredient": CompactDict({
                "item": f"cntrafficsymbols_0d0:{color}_full1_cylindrical_rod"
            }),
            "result": f"cntrafficsymbols_0d0:{color}_half1_cylindrical_rod"
        }
        write_json_idempotent(args.dir, f"{color}_half1_cylindrical_rod.json",
                              to_write, args.dry_run, compact=True)


if __name__ == "__main__":
    main()
