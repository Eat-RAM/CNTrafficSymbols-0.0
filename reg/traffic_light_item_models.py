from argparse import ArgumentParser, Namespace
from typing import Any, Dict, List, Optional

from .reg_utils import (
    CompactList, create_parser, ensure_output_dir, write_json_idempotent
)
from .tag_swap_recipes import resolve_tag_items


DISPLAY: Dict[str, Any] = {
    "gui": {
        "rotation": CompactList([0, 0, 0]),
        "scale": CompactList([1, 1, 1])
    },
    "fixed": {
        "rotation": CompactList([0, 0, 0]),
        "scale": CompactList([1, 1, 1])
    }
}


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate all traffic light item-models")
    parser.add_argument(
        "--tags-dir", required=True, type=str, help="Directory containing tags"
    )
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for block in resolve_tag_items(args.tags_dir, "traffic_lights"):
        to_write = {
            "parent": f"cntrafficsymbols_0d0:block/{block}_middle",
            "gui_light": "front",
            "display": DISPLAY
        }
        write_json_idempotent(
            args.dir, f"{block}.json", to_write, args.dry_run, compact=True
        )


if __name__ == "__main__":
    main()
