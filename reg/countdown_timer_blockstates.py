from argparse import ArgumentParser, Namespace
from typing import Any, Dict, List, Optional, Tuple

from .reg_utils import (
    CompactDict, create_parser, ensure_output_dir, write_json_idempotent
)


ATTACHMENTS: Tuple[str, ...] = \
("middle", "up", "down", "ceiling", "left", "right", "center")

FACINGS: Tuple[Tuple[str, int], ...] = \
(("south", 0), ("west", 90), ("north", 180), ("east", 270))


def build_blockstate() -> Any:
    variants: Dict[str, Any] = {}
    for facing, y in FACINGS:
        for att in ATTACHMENTS:
            entry: Dict[str, Any] = {
                "model": f"cntrafficsymbols_0d0:block/countdown_timer_{att}"
            }
            if y != 0:
                entry["y"] = y
            variants[f"facing={facing},attachment={att}"] = CompactDict(entry)
    return {"variants": variants}


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate countdown timer blockstates")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    to_write = build_blockstate()
    write_json_idempotent(
        args.dir, "countdown_timer.json", to_write, args.dry_run, compact=True
    )


if __name__ == "__main__":
    main()
