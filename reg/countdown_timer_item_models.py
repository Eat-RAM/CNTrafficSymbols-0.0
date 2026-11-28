from argparse import ArgumentParser, Namespace
from typing import Any, Dict, List, Optional

from .reg_utils import (
    CompactList, create_parser, ensure_output_dir, write_json_idempotent
)


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
    create_parser("Generate countdown timer item-models")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    to_write = {
        "parent": "cntrafficsymbols_0d0:block/countdown_timer_middle",
        "gui_light": "front",
        "display": DISPLAY
    }
    write_json_idempotent(
        args.dir, "countdown_timer.json", to_write, args.dry_run, compact=True
    )


if __name__ == "__main__":
    main()
