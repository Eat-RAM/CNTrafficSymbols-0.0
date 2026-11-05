from argparse import ArgumentParser, Namespace
from typing import List, Optional, Tuple

from .reg_utils import create_parser, ensure_output_dir, write_json_idempotent


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
    parser: ArgumentParser = create_parser("Generate all wideboard models")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for block in BLOCKS:
        to_write: object
        for mode in ("standing", "wall"):
            to_write = {
                "parent": f"cntrafficsymbols_0d0:block/wideboard_{mode}",
                "textures": {
                    "front": f"cntrafficsymbols_0d0:block/{block}",
                    "back": "cntrafficsymbols_0d0:block/full_square_backboard",
                    "side": "cntrafficsymbols_0d0:block/full_square_backboard"
                }
            }
            write_json_idempotent(args.dir, f"{block}_{mode}.json", to_write,
                                  args.dry_run)
        to_write = {
            "parent": "cntrafficsymbols_0d0:block/wideboard_double",
            "textures": {
                "front": f"cntrafficsymbols_0d0:block/{block}",
                "side": "cntrafficsymbols_0d0:block/full_square_backboard"
            }
        }
        write_json_idempotent(args.dir, f"{block}_double.json", to_write,
                              args.dry_run)


if __name__ == "__main__":
    main()
