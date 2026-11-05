from argparse import ArgumentParser, Namespace
from typing import Any, List, Optional, Tuple

from .reg_utils import (
    CompactDict, create_parser, ensure_output_dir, write_json_idempotent
)


BLOCKS: Tuple[str, ...] = (
    "distance_detection_0m_left",
    "distance_detection_0m_right",
    "distance_detection_50m_left",
    "distance_detection_50m_right",
    "distance_detection_100m_left",
    "distance_detection_100m_right",
    "distance_detection_200m_left",
    "distance_detection_200m_right",
    "keep_space_variant1_upperleft",
    "keep_space_variant1_upper",
    "keep_space_variant1_upperright",
    "keep_space_variant1_left",
    "keep_space_variant1_center",
    "keep_space_variant1_right",
    "keep_space_variant1_lowerleft",
    "keep_space_variant1_lower",
    "keep_space_variant1_lowerright",
    "keep_space_variant2_upperleft",
    "keep_space_variant2_upper",
    "keep_space_variant2_upperright",
    "keep_space_variant2_left",
    "keep_space_variant2_center",
    "keep_space_variant2_right",
    "keep_space_variant2_lowerleft",
    "keep_space_variant2_lower",
    "keep_space_variant2_lowerright"
)

FACING_STATES: Tuple[str, ...] = ("north_south", "east_west")


def make_loot_table(block: str) -> Any:
    modifiers = [
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
    create_parser("Generate all double-face facing-90 loot tables")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for block in BLOCKS:
        to_write = make_loot_table(block)
        write_json_idempotent(args.dir, f"{block}.json", to_write,
                              args.dry_run, compact=True)


if __name__ == "__main__":
    main()
