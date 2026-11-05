from argparse import ArgumentParser, Namespace
from typing import Any, List, Optional, Tuple

from .reg_utils import (
    CompactDict, create_parser, ensure_output_dir, write_json_idempotent
)


ITEMS: Tuple[str, ...] = (
    "left_single", "middle_single", "right_single", "left_top", "middle_top",
    "right_top", "left_middle", "middle_middle", "right_middle", "left_bottom",
    "middle_bottom", "right_bottom"
)

FACING_STATES: Tuple[str, ...] = ("north_south", "east_west")


def make_loot_table(block: str) -> Any:
    modifiers: Any = [
        {
            "add": False,
            "conditions": [
                {
                    "block": f"cntrafficsymbols_0d0:{block}",
                    "condition": "minecraft:block_state_property",
                    "properties": CompactDict({"facing": facing})
                }
            ],
            "count": 2.0,
            "function": "minecraft:set_count"
        } for facing in FACING_STATES
    ]
    modifiers.append({"function": "minecraft:explosion_decay"})
    modifiers.append({
        "function": "minecraft:copy_name", "source": "block_entity"
    })
    return {
        "type": "minecraft:block",
        "pools": [
            {
                "bonus_rolls": 0.0,
                "entries": [
                    {
                        "type": "minecraft:item",
                        "functions": modifiers,
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
    create_parser("Generate all highway exit distance info loot tables")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for item in ITEMS:
        block: str = f"highway_exit_distance_info_{item}"
        data = make_loot_table(block)
        write_json_idempotent(args.dir, f"{block}.json", data, args.dry_run,
                              compact=True)


if __name__ == "__main__":
    main()
