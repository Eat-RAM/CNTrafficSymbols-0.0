from argparse import ArgumentParser, Namespace
from typing import Any, Iterable, List, Optional

from .reg_utils import (
    CompactList, create_parser, ensure_output_dir, write_json_idempotent
)
from .tag_swap_recipes import resolve_tag_items


def blocks(tags_dir: str) -> Iterable[str]:
    for id_ in (
        "#half1_cylindrical_rods", "#full1_cylindrical_rods",
        "#rod_with_lamps", "#dotted_tp", "#lined_tp",
        "white_thin_22d5_floor_line", "yellow_thin_22d5_floor_line",
        "white_thin_45_floor_line", "yellow_thin_45_floor_line",
        "#floor_line_crosses"
    ):
        if id_.startswith("#"):
            for item in resolve_tag_items(tags_dir, id_[1:]):
                yield item.split(":", maxsplit=1)[-1]
        else:
            yield id_


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
    create_parser("Generate all state independent loot tables")
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
