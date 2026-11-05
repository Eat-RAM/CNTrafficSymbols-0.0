from argparse import ArgumentParser, Namespace
from typing import List, Optional

from .reg_utils import (
    CompactDict, create_parser, ensure_output_dir, write_json_idempotent
)


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = create_parser("Generate all highway hm recipes")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for i in range(1, 10):
        craft = {
            "type": "minecraft:stonecutting",
            "count": 32,
            "ingredient": CompactDict({"item": "minecraft:lime_concrete"}),
            "result": f"cntrafficsymbols_0d0:highway_{i}hm"
        }
        swap = {
            "type": "minecraft:stonecutting",
            "count": 1,
            "ingredient":
             CompactDict({"tag": "cntrafficsymbols_0d0:highway_hm"}),
            "result": f"cntrafficsymbols_0d0:highway_{i}hm"
        }
        write_json_idempotent(args.dir, f"highway_{i}hm.json", craft,
                              args.dry_run, compact=True)
        write_json_idempotent(args.dir, f"highway_{i}hm_swap.json", swap,
                              args.dry_run, compact=True)


if __name__ == "__main__":
    main()
