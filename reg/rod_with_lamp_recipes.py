from argparse import ArgumentParser, Namespace
from typing import List, Optional

from .reg_utils import (
    COLORS, create_parser, ensure_output_dir, write_json_idempotent
)


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate all rod with lamp recipes")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for color in COLORS:
        to_write = {
            "type": "minecraft:crafting_shaped",
            "category": "misc",
            "key": {
                "L": "minecraft:redstone_lamp",
                "C": f"minecraft:{color}_concrete"
            },
            "pattern": [
                "L",
                "C",
                "C"
            ],
            "result": {
                "id": f"cntrafficsymbols_0d0:{color}_rod_with_lamp",
                "count": 8
            },
            "show_notification": True
        }
        write_json_idempotent(args.dir, f"{color}_rod_with_lamp.json",
                              to_write, args.dry_run)

if __name__ == "__main__":
    main()
