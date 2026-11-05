from argparse import ArgumentParser, Namespace
from typing import Any, List, Optional, Tuple

from .reg_utils import (
    CompactList, create_parser, ensure_output_dir, write_json_idempotent
)


BLOCKS: Tuple[str, ...] = (
    "white_rod_with_lamp",
    "orange_rod_with_lamp",
    "magenta_rod_with_lamp",
    "light_blue_rod_with_lamp",
    "yellow_rod_with_lamp",
    "lime_rod_with_lamp",
    "pink_rod_with_lamp",
    "gray_rod_with_lamp",
    "light_gray_rod_with_lamp",
    "cyan_rod_with_lamp",
    "purple_rod_with_lamp",
    "blue_rod_with_lamp",
    "brown_rod_with_lamp",
    "green_rod_with_lamp",
    "red_rod_with_lamp",
    "black_rod_with_lamp"
)


def make_loot_table(block: str) -> Any:
    return {
        "type": "minecraft:block",
        "pools": [
            {
                "bonus_rolls": 0.0,
                "conditions":
                CompactList([{"condition": "minecraft:survives_explosion"}]),
                "entries": [
                    {
                        "type": "minecraft:item",
                        "functions": [
                            {
                                "function": "minecraft:copy_name",
                                "source": "block_entity"
                            }
                        ],
                        "name": f"cntrafficsymbols_0d0:{block}"
                    }
                ],
                "rolls": 1.0
            }
        ],
        "random_sequence": f"cntrafficsymbols_0d0:{block}"
    }


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate all state independent with customname loot tables")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for block in BLOCKS:
        to_write = make_loot_table(block)
        write_json_idempotent(args.dir, f"{block}.json", to_write,
                              args.dry_run, compact=True)


if __name__ == "__main__":
    main()
