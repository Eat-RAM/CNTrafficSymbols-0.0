from argparse import ArgumentParser, Namespace
from typing import List, Optional, Tuple

from .reg_utils import (
    CompactDict, create_parser, ensure_output_dir, write_json_idempotent
)


BLOCKS: Tuple[str, ...] = (
    "distance_detection_0m_left",
    "distance_detection_50m_left",
    "distance_detection_100m_left",
    "distance_detection_200m_left",
    "distance_detection_0m_right",
    "distance_detection_50m_right",
    "distance_detection_100m_right",
    "distance_detection_200m_right",
    "highway_exit_distance_info_left_single",
    "highway_exit_distance_info_left_top",
    "highway_exit_distance_info_left_middle",
    "highway_exit_distance_info_left_bottom",
    "highway_exit_distance_info_middle_single",
    "highway_exit_distance_info_middle_top",
    "highway_exit_distance_info_middle_middle",
    "highway_exit_distance_info_middle_bottom",
    "highway_exit_distance_info_right_single",
    "highway_exit_distance_info_right_top",
    "highway_exit_distance_info_right_middle",
    "highway_exit_distance_info_right_bottom"
)


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate all green wideboard recipes")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for block in BLOCKS:
        craft = {
            "type": "minecraft:stonecutting",
            "count": 8,
            "ingredient": CompactDict({"item": "minecraft:lime_concrete"}),
            "result": f"cntrafficsymbols_0d0:{block}"
        }
        swap = {
            "type": "minecraft:stonecutting",
            "count": 1,
            "ingredient":
            CompactDict({"tag": "cntrafficsymbols_0d0:green_wideboard"}),
            "result": f"cntrafficsymbols_0d0:{block}"
        }
        write_json_idempotent(args.dir, f"{block}.json", craft, args.dry_run,
                              compact=True)
        write_json_idempotent(args.dir, f"{block}_swap.json", swap,
                              args.dry_run, compact=True)


if __name__ == "__main__":
    main()
