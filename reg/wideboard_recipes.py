from argparse import ArgumentParser, Namespace
from typing import Dict, List, Optional

from .reg_utils import (
    CompactDict, create_parser, ensure_output_dir, write_json_idempotent
)
from .tag_swap_recipes import resolve_tag_items


COLORS: Dict[str, str] = {"green": "lime", "yellow": "yellow"}


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = create_parser("Generate all wideboard recipes")
    parser.add_argument("--tags-dir", required=True, type=str,
                        help="Directory containing tags")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for board_color, ing_color in COLORS.items():
        tag_name: str = board_color + "_wideboard"
        for block in resolve_tag_items(args.tags_dir, tag_name):
            craft = {
                "type": "minecraft:stonecutting",
                "count": 8,
                "ingredient":
                CompactDict({"item": f"minecraft:{ing_color}_concrete"}),
                "result": f"cntrafficsymbols_0d0:{block}"
            }
            swap = {
                "type": "minecraft:stonecutting",
                "count": 1,
                "ingredient":
                CompactDict({"tag": f"cntrafficsymbols_0d0:{tag_name}"}),
                "result": f"cntrafficsymbols_0d0:{block}"
            }
            write_json_idempotent(
                args.dir, f"{block}.json", craft, args.dry_run, compact=True
            )
            write_json_idempotent(
                args.dir, f"{block}_swap.json", swap, args.dry_run, compact=True
            )


if __name__ == "__main__":
    main()
