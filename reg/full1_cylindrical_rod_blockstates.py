from argparse import ArgumentParser, Namespace
from typing import Any, Dict, List, Optional, Tuple

from .reg_utils import (
    COLORS, CompactDict, create_parser, ensure_output_dir,
    write_json_idempotent
)


Y_SUBS: Tuple[str, ...] = (
    "center", "south", "southeast", "east", "northeast",
    "north", "northwest", "west", "southwest"
)

HORIZ_AXES: Tuple[Tuple[str, str, str, int, int], ...] = (
    ("z", "west", "east", 0, 180),
    ("x", "north", "south", 90, 270),
)


def build_blockstate(name: str) -> Any:
    variants: Dict[str, Any] = {f"position=y_{sub}": CompactDict({
        "model": (
            "cntrafficsymbols_0d0:block/"
            f"{name}_full1_cylindrical_rod_y_{sub}"
        )
    }) for sub in Y_SUBS}

    for axis, main_dir, opp_dir, base_y, opp_y in HORIZ_AXES:
        items: Tuple[Tuple[str, str, int], ...] = (
            ("center", "center", base_y),
            ("upper", "upper", base_y),
            (f"upper{opp_dir}", "upperwest", opp_y),
            (opp_dir, "west", opp_y),
            (f"lower{opp_dir}", "lowerwest", opp_y),
            ("lower", "lower", base_y),
            (f"lower{main_dir}", "lowerwest", base_y),
            (main_dir, "west", base_y),
            (f"upper{main_dir}", "upperwest", base_y),
        )
        for pos_sub, model_sub, y in items:
            entry: Dict[str, Any] = {
                "model": "cntrafficsymbols_0d0:block/"
                        f"{name}_full1_cylindrical_rod_z_{model_sub}"
            }
            if y != 0:
                entry["y"] = y
            variants[f"position={axis}_{pos_sub}"] = CompactDict(entry)

    return {"variants": variants}


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate all full1 cylindrical rod blockstates")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for color in COLORS:
        to_write = build_blockstate(color)
        write_json_idempotent(args.dir, f"{color}_full1_cylindrical_rod.json",
                              to_write, args.dry_run, compact=True)


if __name__ == "__main__":
    main()
