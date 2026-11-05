from argparse import ArgumentParser, Namespace
from typing import Iterable, List, Optional

from .reg_utils import create_parser, ensure_output_dir, write_json_idempotent
from .tag_swap_recipes import resolve_tag_items


def blocks(tags_dir: str) -> Iterable[str]:
    for item in resolve_tag_items(tags_dir, "wideboard"):
        yield item.split(":", maxsplit=1)[-1]


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = create_parser("Generate all wideboard models")
    parser.add_argument("--tags-dir", required=True, type=str,
                        help="Directory containing tags")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for block in blocks(args.tags_dir):
        to_write: object
        for mode in ("standing", "wall"):
            to_write = {
                "parent": f"cntrafficsymbols_0d0:block/wideboard_{mode}",
                "textures": {
                    "front": f"cntrafficsymbols_0d0:block/{block}",
                    "back": "cntrafficsymbols_0d0:block/full_square_backboard",
                    "side": "cntrafficsymbols_0d0:block/full_square_backboard"
                }
            }
            write_json_idempotent(args.dir, f"{block}_{mode}.json", to_write,
                                  args.dry_run)
        to_write = {
            "parent": "cntrafficsymbols_0d0:block/wideboard_double",
            "textures": {
                "front": f"cntrafficsymbols_0d0:block/{block}",
                "side": "cntrafficsymbols_0d0:block/full_square_backboard"
            }
        }
        write_json_idempotent(args.dir, f"{block}_double.json", to_write,
                              args.dry_run)


if __name__ == "__main__":
    main()
