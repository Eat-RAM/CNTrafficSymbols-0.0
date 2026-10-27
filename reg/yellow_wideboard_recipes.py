from argparse import ArgumentParser, Namespace
from typing import List, Optional, Tuple

from .reg_utils import create_parser, ensure_output_dir, write_json_idempotent


BLOCKS: Tuple[str, ...] = (
    "keep_space_variant1_upperleft",
    "keep_space_variant1_upper",
    "keep_space_variant1_upperright",
    "keep_space_variant1_left",
    "keep_space_variant1_center",
    "keep_space_variant1_right",
    "keep_space_variant1_lowerleft",
    "keep_space_variant1_lower",
    "keep_space_variant1_lowerright",
    "keep_space_variant2_upperleft",
    "keep_space_variant2_upper",
    "keep_space_variant2_upperright",
    "keep_space_variant2_left",
    "keep_space_variant2_center",
    "keep_space_variant2_right",
    "keep_space_variant2_lowerleft",
    "keep_space_variant2_lower",
    "keep_space_variant2_lowerright"
)


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate all yellow wideboard recipes")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for block in BLOCKS:
        craft = {
            "type": "minecraft:stonecutting",
            "ingredient": "minecraft:yellow_concrete",
            "result": {
                "id": f"cntrafficsymbols_0d0:{block}",
                "count": 8
            }
        }
        swap = {
            "type": "minecraft:stonecutting",
            "ingredient": "#cntrafficsymbols_0d0:yellow_wideboard",
            "result": {
                "id": f"cntrafficsymbols_0d0:{block}"
            }
        }
        write_json_idempotent(args.dir, f"{block}.json", craft, args.dry_run)
        write_json_idempotent(args.dir, f"{block}_swap.json", swap,
                              args.dry_run)


if __name__ == "__main__":
    main()
