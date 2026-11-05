from argparse import ArgumentParser, Namespace
from typing import List, Optional, Tuple

from .reg_utils import (
    CompactDict, create_parser, ensure_output_dir, write_json_idempotent
)


COLORS: Tuple[str, ...] = ("white", "yellow")


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate 45 deg thin floor line child models")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for color in COLORS:
        for s in range(12):
            q13o_child = {
                "parent":
                f"cntrafficsymbols_0d0:block/thin_45_floor_line_q13o_s{s}",
                "textures": CompactDict({
                    "this":
                    f"cntrafficsymbols_0d0:block/{color}_floor_line_eighths"
                })
            }
            write_json_idempotent(
                args.dir, f"{color}_thin_45_floor_line_q13o_s{s}.json",
                q13o_child, args.dry_run, compact=True
            )
            q24o_child = {
                "parent":
                f"cntrafficsymbols_0d0:block/thin_45_floor_line_q24o_s{s}",
                "textures": CompactDict({
                    "this":
                    f"cntrafficsymbols_0d0:block/{color}_floor_line_eighths"
                })
            }
            write_json_idempotent(
                args.dir, f"{color}_thin_45_floor_line_q24o_s{s}.json",
                q24o_child, args.dry_run, compact=True
            )


if __name__ == "__main__":
    main()
