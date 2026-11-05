from argparse import ArgumentParser, Namespace
from typing import List, Optional, Tuple

from .reg_utils import create_parser, ensure_output_dir, write_json_idempotent


ITEMS: Tuple[str, ...] = (
    "3", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60",
    "65", "70", "75", "80", "85", "90", "95", "100", "105", "110", "115",
    "120", "125", "130", "135", "140", "145", "150", "special"
)


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate all lift speedlimit high recipes")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for item in ITEMS:
        to_write = {
            "type": "minecraft:stonecutting",
            "count": 1,
            "ingredient": {
                "tag": "cntrafficsymbols_0d0:black_circle_black_text"
            },
            "result": f"cntrafficsymbols_0d0:lift_speedlimit_high_{item}"
        }
        write_json_idempotent(args.dir, f"lift_speedlimit_high_{item}.json",
                              to_write, args.dry_run)


if __name__ == "__main__":
    main()
