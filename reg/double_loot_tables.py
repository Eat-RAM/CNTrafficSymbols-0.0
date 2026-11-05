from argparse import ArgumentParser, Namespace
from typing import Any, Iterable, List, Optional, Tuple

from .reg_utils import (
    CompactDict, create_parser, ensure_output_dir, write_json_idempotent
)
from .tag_swap_recipes import resolve_tag_items


def blocks(tags_dir: str) -> Iterable[str]:
    for id_ in (
        "#circle_vertical_symbols", "circle_backboard", "full_square_backboard"
    ):
        if id_.startswith("#"):
            for item in resolve_tag_items(tags_dir, id_[1:]):
                yield item.split(":", maxsplit=1)[-1]
        else:
            yield id_


FACING_STATES: Tuple[str, ...] = (
    "north_south", "nne_ssw", "northeast_southwest", "ene_wsw", "east_west",
    "ese_wnw", "northwest_southeast", "sse_nnw"
)


def make_loot_table(block: str) -> Any:
    modifiers: List[Any] = [
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
    create_parser("Generate all double-face facing loot tables")
    parser.add_argument("--tags-dir", required=True, type=str,
                        help="Directory containing tags")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for block in blocks(args.tags_dir):
        to_write = make_loot_table(block)
        write_json_idempotent(args.dir, f"{block}.json", to_write,
                              args.dry_run, compact=True)


if __name__ == "__main__":
    main()
