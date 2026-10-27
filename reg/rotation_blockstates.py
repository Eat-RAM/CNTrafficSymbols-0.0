from argparse import ArgumentParser, Namespace
from typing import Any, Dict, List, Optional, Tuple

from .reg_utils import (
    CompactDict, create_parser, ensure_output_dir, write_json_idempotent
)


BLOCKS: Tuple[str, ...] = (
    "speedlimit_high_100",
    "speedlimit_high_105",
    "speedlimit_high_10",
    "speedlimit_high_110",
    "speedlimit_high_115",
    "speedlimit_high_120",
    "speedlimit_high_125",
    "speedlimit_high_130",
    "speedlimit_high_135",
    "speedlimit_high_140",
    "speedlimit_high_145",
    "speedlimit_high_150",
    "speedlimit_high_15",
    "speedlimit_high_20",
    "speedlimit_high_25",
    "speedlimit_high_30",
    "speedlimit_high_35",
    "speedlimit_high_3",
    "speedlimit_high_40",
    "speedlimit_high_45",
    "speedlimit_high_50",
    "speedlimit_high_55",
    "speedlimit_high_5",
    "speedlimit_high_60",
    "speedlimit_high_65",
    "speedlimit_high_70",
    "speedlimit_high_75",
    "speedlimit_high_80",
    "speedlimit_high_85",
    "speedlimit_high_90",
    "speedlimit_high_95",
    "speedlimit_high_special",
    "speedlimit_low_100",
    "speedlimit_low_105",
    "speedlimit_low_10",
    "speedlimit_low_110",
    "speedlimit_low_115",
    "speedlimit_low_120",
    "speedlimit_low_125",
    "speedlimit_low_130",
    "speedlimit_low_135",
    "speedlimit_low_140",
    "speedlimit_low_145",
    "speedlimit_low_150",
    "speedlimit_low_15",
    "speedlimit_low_20",
    "speedlimit_low_25",
    "speedlimit_low_30",
    "speedlimit_low_35",
    "speedlimit_low_3",
    "speedlimit_low_40",
    "speedlimit_low_45",
    "speedlimit_low_50",
    "speedlimit_low_55",
    "speedlimit_low_5",
    "speedlimit_low_60",
    "speedlimit_low_65",
    "speedlimit_low_70",
    "speedlimit_low_75",
    "speedlimit_low_80",
    "speedlimit_low_85",
    "speedlimit_low_90",
    "speedlimit_low_95",
    "speedlimit_low_special",
    "lift_speedlimit_high_100",
    "lift_speedlimit_high_105",
    "lift_speedlimit_high_10",
    "lift_speedlimit_high_110",
    "lift_speedlimit_high_115",
    "lift_speedlimit_high_120",
    "lift_speedlimit_high_125",
    "lift_speedlimit_high_130",
    "lift_speedlimit_high_135",
    "lift_speedlimit_high_140",
    "lift_speedlimit_high_145",
    "lift_speedlimit_high_150",
    "lift_speedlimit_high_15",
    "lift_speedlimit_high_20",
    "lift_speedlimit_high_25",
    "lift_speedlimit_high_30",
    "lift_speedlimit_high_35",
    "lift_speedlimit_high_3",
    "lift_speedlimit_high_40",
    "lift_speedlimit_high_45",
    "lift_speedlimit_high_50",
    "lift_speedlimit_high_55",
    "lift_speedlimit_high_5",
    "lift_speedlimit_high_60",
    "lift_speedlimit_high_65",
    "lift_speedlimit_high_70",
    "lift_speedlimit_high_75",
    "lift_speedlimit_high_80",
    "lift_speedlimit_high_85",
    "lift_speedlimit_high_90",
    "lift_speedlimit_high_95",
    "lift_speedlimit_high_special",
    "circle_backboard",
    "heightlimit_special",
    "heightlimit_0d1",
    "heightlimit_0d2",
    "heightlimit_0d3",
    "heightlimit_0d4",
    "heightlimit_0d5",
    "heightlimit_0d6",
    "heightlimit_0d7",
    "heightlimit_0d8",
    "heightlimit_0d9",
    "heightlimit_1",
    "heightlimit_1d1",
    "heightlimit_1d2",
    "heightlimit_1d3",
    "heightlimit_1d4",
    "heightlimit_1d5",
    "heightlimit_1d6",
    "heightlimit_1d7",
    "heightlimit_1d8",
    "heightlimit_1d9",
    "heightlimit_2",
    "heightlimit_2d1",
    "heightlimit_2d2",
    "heightlimit_2d3",
    "heightlimit_2d4",
    "heightlimit_2d5",
    "heightlimit_2d6",
    "heightlimit_2d7",
    "heightlimit_2d8",
    "heightlimit_2d9",
    "heightlimit_3",
    "heightlimit_3d1",
    "heightlimit_3d2",
    "heightlimit_3d3",
    "heightlimit_3d4",
    "heightlimit_3d5",
    "heightlimit_3d6",
    "heightlimit_3d7",
    "heightlimit_3d8",
    "heightlimit_3d9",
    "heightlimit_4",
    "heightlimit_4d1",
    "heightlimit_4d2",
    "heightlimit_4d3",
    "heightlimit_4d4",
    "heightlimit_4d5",
    "heightlimit_4d6",
    "heightlimit_4d7",
    "heightlimit_4d8",
    "heightlimit_4d9",
    "heightlimit_5",
    "heightlimit_5d1",
    "heightlimit_5d2",
    "heightlimit_5d3",
    "heightlimit_5d4",
    "heightlimit_5d5",
    "heightlimit_5d6",
    "heightlimit_5d7",
    "heightlimit_5d8",
    "heightlimit_5d9",
    "heightlimit_6",
    "heightlimit_6d1",
    "heightlimit_6d2",
    "heightlimit_6d3",
    "heightlimit_6d4",
    "heightlimit_6d5",
    "heightlimit_6d6",
    "heightlimit_6d7",
    "heightlimit_6d8",
    "heightlimit_6d9",
    "heightlimit_7",
    "heightlimit_7d1",
    "heightlimit_7d2",
    "heightlimit_7d3",
    "heightlimit_7d4",
    "heightlimit_7d5",
    "heightlimit_7d6",
    "heightlimit_7d7",
    "heightlimit_7d8",
    "heightlimit_7d9",
    "heightlimit_8",
    "heightlimit_8d1",
    "heightlimit_8d2",
    "heightlimit_8d3",
    "heightlimit_8d4",
    "heightlimit_8d5",
    "heightlimit_8d6",
    "heightlimit_8d7",
    "heightlimit_8d8",
    "heightlimit_8d9",
    "heightlimit_9",
    "heightlimit_9d1",
    "heightlimit_9d2",
    "heightlimit_9d3",
    "heightlimit_9d4",
    "heightlimit_9d5",
    "heightlimit_9d6",
    "heightlimit_9d7",
    "heightlimit_9d8",
    "heightlimit_9d9",
    "heightlimit_10",
    "prohibition",
    "no_u_turn",
    "no_left_turn",
    "no_right_turn",
    "no_parking",
    "highway_1hm",
    "highway_2hm",
    "highway_3hm",
    "highway_4hm",
    "highway_5hm",
    "highway_6hm",
    "highway_7hm",
    "highway_8hm",
    "highway_9hm",
    "highway_km"
)


def build_blockstate(name: str) -> Any:
    variants: Dict[str, Any] = {}
    for attachment, suff in {"none": "", "down": "_down", "up": "_up"}.items():
        variants.update({
            f"facing=south,attachment={attachment}": CompactDict({
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation0{suff}"
            }),
            f"facing=ssw,attachment={attachment}": CompactDict({
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation1{suff}"
            }),
            f"facing=southwest,attachment={attachment}": CompactDict({
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation2{suff}"
            }),
            f"facing=wsw,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation15{suff}",
                "y": 90
            },
            f"facing=west,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation0{suff}",
                "y": 90
            },
            f"facing=wnw,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation1{suff}",
                "y": 90
            },
            f"facing=northwest,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation2{suff}",
                "y": 90
            },
            f"facing=nnw,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation15{suff}",
                "y": 180
            },
            f"facing=north,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation0{suff}",
                "y": 180
            },
            f"facing=nne,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation1{suff}",
                "y": 180
            },
            f"facing=northeast,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation2{suff}",
                "y": 180
            },
            f"facing=ene,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation15{suff}",
                "y": 270
            },
            f"facing=east,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation0{suff}",
                "y": 270
            },
            f"facing=ese,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation1{suff}",
                "y": 270
            },
            f"facing=southeast,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation2{suff}",
                "y": 270
            },
            f"facing=sse,attachment={attachment}": CompactDict({
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation15{suff}"
            }),
            f"facing=north_south,attachment={attachment}": CompactDict({
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation16{suff}"
            }),
            f"facing=nne_ssw,attachment={attachment}": CompactDict({
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation17{suff}"
            }),
            f"facing=northeast_southwest,attachment={attachment}":CompactDict({
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation18{suff}"
            }),
            f"facing=ene_wsw,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation23{suff}",
                "y": 90
            },
            f"facing=east_west,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation16{suff}",
                "y": 90
            },
            f"facing=ese_wnw,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation17{suff}",
                "y": 90
            },
            f"facing=northwest_southeast,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation18{suff}",
                "y": 90
            },
            f"facing=sse_nnw,attachment={attachment}": CompactDict({
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation23{suff}"
            }),
            f"facing=wall_north,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation26{suff}",
                "y": 180
            },
            f"facing=wall_east,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation26{suff}",
                "y": 270
            },
            f"facing=wall_south,attachment={attachment}": CompactDict({
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation26{suff}"
            }),
            f"facing=wall_west,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation26{suff}",
                "y": 90
            }
        })
    return {"variants": variants}


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = create_parser("Generate all rotation blockstates")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for block in BLOCKS:
        to_write = build_blockstate(block)
        write_json_idempotent(args.dir, f"{block}.json", to_write,
                              args.dry_run, compact=True)


if __name__ == "__main__":
    main()
