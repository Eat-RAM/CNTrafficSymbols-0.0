from argparse import ArgumentParser, Namespace
from typing import Any, Dict, List, Optional, Tuple

from .reg_utils import (
    CompactDict, create_parser, ensure_output_dir, write_json_idempotent
)


COLORS: Tuple[str, ...] = ("white", "yellow")


def make_blockstates(color: str) -> Any:
    variants: Dict[str, Any] = {}
    for s in range(24):
        if s <= 11:
            variants[f"rotation=q13o,shift={s}"] = CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_thin_45_floor_line_q13o_s{s}"
            })
            variants[f"rotation=q24o,shift={s}"] = CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_thin_45_floor_line_q24o_s{s}"
            })
            variants[f"rotation=q24a,shift={s}"] = CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_thin_45_floor_line_q13o_s{s}",
                "y": 90,
                "uvlock": True
            })
            variants[f"rotation=q13a,shift={s}"] = CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_thin_45_floor_line_q24o_s{s}",
                "y": 90,
                "uvlock": True
            })
        else:
            base_s: int = 23 - s
            variants[f"rotation=q13o,shift={s}"] = CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_thin_45_floor_line_q13o_s{base_s}",
                "y": 180,
                "uvlock": True
            })
            variants[f"rotation=q24o,shift={s}"] = CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_thin_45_floor_line_q24o_s{base_s}",
                "y": 180,
                "uvlock": True
            })
            variants[f"rotation=q24a,shift={s}"] = CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_thin_45_floor_line_q13o_s{base_s}",
                "y": 270,
                "uvlock": True
            })
            variants[f"rotation=q13a,shift={s}"] = CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_thin_45_floor_line_q24o_s{base_s}",
                "y": 270,
                "uvlock": True
            })
    return {"variants": variants}


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate 45 deg thin floor line blockstates")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for color in COLORS:
        to_write = make_blockstates(color)
        write_json_idempotent(args.dir, f"{color}_thin_45_floor_line.json",
                              to_write, args.dry_run, compact=True)


if __name__ == "__main__":
    main()
