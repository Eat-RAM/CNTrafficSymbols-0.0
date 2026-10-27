from argparse import ArgumentParser, Namespace
from typing import List, Optional, Tuple

from .reg_utils import (
    CompactDict, create_parser, ensure_output_dir, write_json_idempotent
)


BLOCKS: Tuple[str, ...] = (
    "distance_detection_0m_left",
    "distance_detection_0m_right",
    "distance_detection_50m_left",
    "distance_detection_50m_right",
    "distance_detection_100m_left",
    "distance_detection_100m_right",
    "distance_detection_200m_left",
    "distance_detection_200m_right",
    "highway_exit_distance_info_left_single",
    "highway_exit_distance_info_middle_single",
    "highway_exit_distance_info_right_single",
    "highway_exit_distance_info_left_top",
    "highway_exit_distance_info_middle_top",
    "highway_exit_distance_info_right_top",
    "highway_exit_distance_info_left_middle",
    "highway_exit_distance_info_middle_middle",
    "highway_exit_distance_info_right_middle",
    "highway_exit_distance_info_left_bottom",
    "highway_exit_distance_info_middle_bottom",
    "highway_exit_distance_info_right_bottom",
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
    create_parser("Generate all double-face facing-90 blockstates")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for block in BLOCKS:
        to_write = {
            "variants": {
                "facing=south": CompactDict({
                    "model": f"cntrafficsymbols_0d0:block/{block}_standing"
                }),
                "facing=west": {
                    "model": f"cntrafficsymbols_0d0:block/{block}_standing",
                    "y": 90
                },
                "facing=north": {
                    "model": f"cntrafficsymbols_0d0:block/{block}_standing",
                    "y": 180
                },
                "facing=east": {
                    "model": f"cntrafficsymbols_0d0:block/{block}_standing",
                    "y": 270
                },
                "facing=north_south": CompactDict({
                    "model": f"cntrafficsymbols_0d0:block/{block}_double"
                }),
                "facing=east_west": {
                    "model": f"cntrafficsymbols_0d0:block/{block}_double",
                    "y": 90
                },
                "facing=wall_north": {
                    "model": f"cntrafficsymbols_0d0:block/{block}_wall",
                    "y": 180
                },
                "facing=wall_east": {
                    "model": f"cntrafficsymbols_0d0:block/{block}_wall",
                    "y": 270
                },
                "facing=wall_south": CompactDict({
                    "model": f"cntrafficsymbols_0d0:block/{block}_wall"
                }),
                "facing=wall_west": {
                    "model": f"cntrafficsymbols_0d0:block/{block}_wall",
                    "y": 90
                }
            }
        }
        write_json_idempotent(args.dir, f"{block}.json", to_write,
                              args.dry_run, compact=True)


if __name__ == "__main__":
    main()
