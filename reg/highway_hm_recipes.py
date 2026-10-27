from argparse import ArgumentParser, Namespace
from typing import List, Optional

from .reg_utils import create_parser, ensure_output_dir, write_json_idempotent


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = create_parser("Generate all highway hm recipes")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for i in range(1, 10):
        craft = {
            "type": "minecraft:stonecutting",
            "ingredient": "minecraft:lime_concrete",
            "result": {
                "id": f"cntrafficsymbols_0d0:highway_{i}hm",
                "count": 32
            }
        }
        swap = {
            "type": "minecraft:stonecutting",
            "ingredient": "#cntrafficsymbols_0d0:highway_hm",
            "result": {
                "id": f"cntrafficsymbols_0d0:highway_{i}hm"
            }
        }
        write_json_idempotent(args.dir, f"highway_{i}hm.json", craft,
                              args.dry_run)
        write_json_idempotent(args.dir, f"highway_{i}hm_swap.json", swap,
                              args.dry_run)


if __name__ == "__main__":
    main()
