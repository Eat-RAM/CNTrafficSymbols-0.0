from argparse import ArgumentParser, Namespace
from typing import Dict, List, Optional

from .reg_utils import (
    COLORS, create_parser, ensure_output_dir, write_json_idempotent
)


FORMS: Dict[str, str] = {"half1": "down_center", "full1": "y_center"}


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate all cylindrical rod item-models")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for color in COLORS:
        for form, pos in FORMS.items():
            to_write = {
                "parent": "cntrafficsymbols_0d0:block/"
                         f"{color}_{form}_cylindrical_rod_{pos}"
            }
            write_json_idempotent(
                args.dir, f"{color}_{form}_cylindrical_rod.json", to_write,
                args.dry_run
            )


if __name__ == "__main__":
    main()
