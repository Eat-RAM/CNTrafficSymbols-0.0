from argparse import ArgumentParser, Namespace
from typing import List, Optional, Tuple

from .reg_utils import create_parser, ensure_output_dir, write_json_idempotent


ITEMS: Tuple[str, ...] = (
    "special", "0d1", "0d2", "0d3", "0d4", "0d5", "0d6", "0d7", "0d8", "0d9",
    "1", "1d1", "1d2", "1d3", "1d4", "1d5", "1d6", "1d7", "1d8", "1d9",
    "2", "2d1", "2d2", "2d3", "2d4", "2d5", "2d6", "2d7", "2d8", "2d9",
    "3", "3d1", "3d2", "3d3", "3d4", "3d5", "3d6", "3d7", "3d8", "3d9",
    "4", "4d1", "4d2", "4d3", "4d4", "4d5", "4d6", "4d7", "4d8", "4d9",
    "5", "5d1", "5d2", "5d3", "5d4", "5d5", "5d6", "5d7", "5d8", "5d9",
    "6", "6d1", "6d2", "6d3", "6d4", "6d5", "6d6", "6d7", "6d8", "6d9",
    "7", "7d1", "7d2", "7d3", "7d4", "7d5", "7d6", "7d7", "7d8", "7d9",
    "8", "8d1", "8d2", "8d3", "8d4", "8d5", "8d6", "8d7", "8d8", "8d9",
    "9", "9d1", "9d2", "9d3", "9d4", "9d5", "9d6", "9d7", "9d8", "9d9",
    "10"
)


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = create_parser("Generate all heightlimit recipes")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for item in ITEMS:
        to_write = {
            "type": "minecraft:stonecutting",
            "ingredient": "#cntrafficsymbols_0d0:red_circle_black_text",
            "result": {
                "id": f"cntrafficsymbols_0d0:heightlimit_{item}"
            }
        }
        write_json_idempotent(args.dir, f"heightlimit_{item}.json", to_write,
                              args.dry_run)


if __name__ == "__main__":
    main()
