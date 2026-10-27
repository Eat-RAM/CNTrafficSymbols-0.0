from argparse import ArgumentParser, Namespace
from typing import List, Optional, Tuple

from .reg_utils import create_parser, ensure_output_dir, write_json_idempotent


SINGLE_ROTATIONS: Tuple[str, ...] = (
    "0", "0_down", "0_up", "1", "1_down", "1_up", "2", "2_down", "2_up", "15",
    "15_down", "15_up", "26", "26_down", "26_up"
)

DOUBLE_ROTATIONS: Tuple[str, ...] = (
    "16", "16_down", "16_up", "17", "17_down", "17_up", "18", "18_down",
    "18_up", "23", "23_down", "23_up"
)


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = create_parser("Generate all highway hm models")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for i in range(1, 10):
        for rot in SINGLE_ROTATIONS:
            to_write = {
                "parent":
                f"cntrafficsymbols_0d0:block/highway_hm_rotation{rot}",
                "textures": {
                    "front": f"cntrafficsymbols_0d0:block/highway_{i}hm",
                    "back": "cntrafficsymbols_0d0:block/highway_hm_backboard",
                    "side": "cntrafficsymbols_0d0:block/highway_hm_backboard"
                }
            }
            write_json_idempotent(
                args.dir, f"highway_{i}hm_rotation{rot}.json", to_write,
                args.dry_run
            )
        for rot in DOUBLE_ROTATIONS:
            to_write = {
                "parent":
                f"cntrafficsymbols_0d0:block/highway_hm_rotation{rot}",
                "textures": {
                    "front": f"cntrafficsymbols_0d0:block/highway_{i}hm",
                    "side": "cntrafficsymbols_0d0:block/highway_hm_backboard"
                }
            }
            write_json_idempotent(
                args.dir, f"highway_{i}hm_rotation{rot}.json", to_write,
                args.dry_run
            )


if __name__ == "__main__":
    main()
