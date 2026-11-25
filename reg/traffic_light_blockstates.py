from argparse import ArgumentParser, Namespace
from typing import Any, Dict, List, Optional, Tuple

from .reg_utils import (
    CompactDict, create_parser, ensure_output_dir, write_json_idempotent
)
from .tag_swap_recipes import resolve_tag_items


HORIZONTAL_ATTACHMENTS: Tuple[str, ...] = ("down", "middle", "up", "ceiling")

VERTICAL_ATTACHMENTS: Tuple[str, ...] = ("left", "middle", "right")

FACINGS: Tuple[Tuple[str, int], ...] = (
    ("south", 0), ("west", 90), ("north", 180), ("east", 270)
)


def build_blockstate(block: str, attachments: Tuple[str, ...]) -> Any:
    variants: Dict[str, Any] = {}
    for facing, y in FACINGS:
        for att in attachments:
            entry: Dict[str, Any] = {
                "model": f"cntrafficsymbols_0d0:block/{block}_{att}"
            }
            if y != 0:
                entry["y"] = y
            variants[f"facing={facing},attachment={att}"] = CompactDict(entry)
    return {"variants": variants}


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate all traffic light blockstates")
    parser.add_argument(
        "--tags-dir", required=True, type=str, help="Directory containing tags"
    )
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for block in resolve_tag_items(args.tags_dir, "traffic_lights"):
        attachments = (
            HORIZONTAL_ATTACHMENTS
            if block.startswith("horizontal") else
            VERTICAL_ATTACHMENTS
        )
        to_write = build_blockstate(block, attachments)
        write_json_idempotent(
            args.dir, f"{block}.json", to_write, args.dry_run, compact=True
        )


if __name__ == "__main__":
    main()
