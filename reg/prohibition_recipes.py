from argparse import ArgumentParser, Namespace
from typing import List, Optional, Tuple

from .reg_utils import create_parser, ensure_output_dir, write_json_idempotent


ITEMS: Tuple[str, ...] = (
    "prohibition", "no_u_turn", "no_left_turn", "no_right_turn", "no_parking"
)


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = create_parser("Generate all prohibition recipes")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for item in ITEMS:
        to_write = {
            "type": "minecraft:stonecutting",
            "count": 1,
            "ingredient": {
                "tag": "cntrafficsymbols_0d0:red_circle_black_text"
            },
            "result": f"cntrafficsymbols_0d0:{item}"
        }
        write_json_idempotent(args.dir, f"{item}.json", to_write, args.dry_run)


if __name__ == "__main__":
    main()
