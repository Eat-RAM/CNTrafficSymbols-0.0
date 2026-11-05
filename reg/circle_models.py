from argparse import ArgumentParser, Namespace
from typing import Iterable, List, Optional

from .reg_utils import create_parser, ensure_output_dir, write_json_idempotent
from .tag_swap_recipes import resolve_tag_items


def blocks(tags_dir: str) -> Iterable[str]:
    for item in resolve_tag_items(tags_dir, "circle_vertical_symbols"):
        yield item.split(":", maxsplit=1)[-1]
    yield "circle_backboard"


def rotations(s: Iterable[int]) -> Iterable[str]:
    for i in s:
        yield f"{i}"
        yield f"{i}_down"
        yield f"{i}_up"


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = create_parser("Generate all circle models")
    parser.add_argument("--tags-dir", required=True, type=str,
                        help="Directory containing tags")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for block in blocks(args.tags_dir):
        for rot in rotations((0, 1, 2, 15, 26)):
            to_write = {
                "parent": f"cntrafficsymbols_0d0:block/circle_rotation{rot}",
                "textures": {
                    "front": f"cntrafficsymbols_0d0:block/{block}",
                    "back": "cntrafficsymbols_0d0:block/circle_backboard",
                    "side": "cntrafficsymbols_0d0:block/circle_backboard"
                }
            }
            write_json_idempotent(args.dir, f"{block}_rotation{rot}.json",
                                  to_write, args.dry_run)
        for rot in rotations((16, 17, 18, 23)):
            to_write = {
                "parent": f"cntrafficsymbols_0d0:block/circle_rotation{rot}",
                "textures": {
                    "front": f"cntrafficsymbols_0d0:block/{block}",
                    "side": "cntrafficsymbols_0d0:block/circle_backboard"
                }
            }
            write_json_idempotent(args.dir, f"{block}_rotation{rot}.json",
                                  to_write, args.dry_run)


if __name__ == "__main__":
    main()
