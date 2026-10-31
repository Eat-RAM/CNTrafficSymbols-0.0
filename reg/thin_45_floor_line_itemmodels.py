from argparse import ArgumentParser, Namespace
from typing import List, Optional, Tuple

from .reg_utils import create_parser, ensure_output_dir, write_json_idempotent


COLORS: Tuple[str, ...] = ("white", "yellow")


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate 45 deg thin floor line item models")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for color in COLORS:
        to_write = {
            "model": {
                "type": "minecraft:model",
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_thin_45_floor_line_q13o_s11"
            }
        }
        write_json_idempotent(args.dir, f"{color}_thin_45_floor_line.json",
                              to_write, args.dry_run)


if __name__ == "__main__":
    main()
