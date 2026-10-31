from argparse import ArgumentParser, Namespace
from typing import Any, Dict, List, Optional, Tuple

from .reg_utils import (
    CompactDict, CompactList, create_parser, ensure_output_dir,
    write_json_idempotent
)


COLORS: Tuple[str, ...] = ("white", "yellow")

DISPLAY: Dict[str, Any] = {
    "gui": CompactDict({
        "rotation": CompactList([90, 0, 0]),
        "scale": CompactList([1, 1, 1])
    }),
    "ground": CompactDict({
        "rotation": CompactList([90, 0, 0]),
        "translation": CompactList([0, 3, 0]),
        "scale": CompactList([0.25, 0.25, 0.25])
    }),
    "fixed": CompactDict({
        "rotation": CompactList([90, 0, 0]),
        "scale": CompactList([1, 1, 1])
    }),
    "thirdperson_righthand": CompactDict({
        "rotation": CompactList([75, 45, 0]),
        "translation": CompactList([0, 2.5, 0]),
        "scale": CompactList([0.375, 0.375, 0.375])
    }),
    "thirdperson_lefthand": CompactDict({
        "rotation": CompactList([75, 45, 0]),
        "translation": CompactList([0, 2.5, 0]),
        "scale": CompactList([0.375, 0.375, 0.375])
    }),
    "firstperson_righthand": CompactDict({
        "rotation": CompactList([0, 45, 0]),
        "scale": CompactList([0.4, 0.4, 0.4])
    }),
    "firstperson_lefthand": CompactDict({
        "rotation": CompactList([0, 225, 0]),
        "scale": CompactList([0.4, 0.4, 0.4])
    })
}


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate 22.5 deg thin floor line item models")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for color in COLORS:
        to_write = {
            "parent": (
                "cntrafficsymbols_0d0:block/"
                f"{color}_thin_22d5_floor_line_q13o_s11"
            ),
            "gui_light": "front",
            "display": DISPLAY
        }
        write_json_idempotent(
            args.dir, f"{color}_thin_22d5_floor_line.json", to_write,
            args.dry_run, compact=True
        )


if __name__ == "__main__":
    main()
