from argparse import ArgumentParser, Namespace
from typing import Iterable, List, Optional

from .reg_utils import (
    CompactDict, create_parser, ensure_output_dir, write_json_idempotent
)
from .tag_swap_recipes import resolve_tag_items


def blocks(tags_dir: str) -> Iterable[str]:
    for item in resolve_tag_items(tags_dir, "wideboard"):
        yield item.split(":", maxsplit=1)[-1]


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate all double-face facing-90 blockstates")
    parser.add_argument("--tags-dir", required=True, type=str,
                        help="Directory containing tags")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for block in blocks(args.tags_dir):
        to_write = {
            "variants": {
                "facing=south": CompactDict({
                    "model": f"cntrafficsymbols_0d0:block/{block}_standing"
                }),
                "facing=west": {
                    "model": f"cntrafficsymbols_0d0:block/{block}_standing",
                    "y": 90
                },
                "facing=north": {
                    "model": f"cntrafficsymbols_0d0:block/{block}_standing",
                    "y": 180
                },
                "facing=east": {
                    "model": f"cntrafficsymbols_0d0:block/{block}_standing",
                    "y": 270
                },
                "facing=north_south": CompactDict({
                    "model": f"cntrafficsymbols_0d0:block/{block}_double"
                }),
                "facing=east_west": {
                    "model": f"cntrafficsymbols_0d0:block/{block}_double",
                    "y": 90
                },
                "facing=wall_north": {
                    "model": f"cntrafficsymbols_0d0:block/{block}_wall",
                    "y": 180
                },
                "facing=wall_east": {
                    "model": f"cntrafficsymbols_0d0:block/{block}_wall",
                    "y": 270
                },
                "facing=wall_south": CompactDict({
                    "model": f"cntrafficsymbols_0d0:block/{block}_wall"
                }),
                "facing=wall_west": {
                    "model": f"cntrafficsymbols_0d0:block/{block}_wall",
                    "y": 90
                }
            }
        }
        write_json_idempotent(args.dir, f"{block}.json", to_write,
                              args.dry_run, compact=True)


if __name__ == "__main__":
    main()
