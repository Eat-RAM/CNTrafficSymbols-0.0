from argparse import Namespace
from typing import List, Optional

from .reg_utils import (
    COLORS, CompactDict, create_parser, ensure_output_dir,
    write_json_idempotent
)


def main(argv: Optional[List[str]] = None) -> None:
    args: Namespace = create_parser("Generate all tp recipes").parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for color in COLORS:
        for j in range(4, 11):
            for sp in ("dotted", "lined"):
                to_write = {
                    "type": "minecraft:stonecutting",
                    "count": 10,
                    "ingredient":
                    CompactDict({"item": f"minecraft:{color}_concrete"}),
                    "result": f"cntrafficsymbols_0d0:{color}_{sp}{j}_tp"
                }
                write_json_idempotent(args.dir, f"{color}_{sp}{j}_tp.json",
                                      to_write, args.dry_run, compact=True)


if __name__ == "__main__":
    main()
