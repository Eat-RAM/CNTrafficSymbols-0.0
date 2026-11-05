from argparse import ArgumentParser, Namespace
from typing import Any, Dict, List, Optional, Tuple

from .reg_utils import (
    COLORS, CompactDict, create_parser, ensure_output_dir,
    write_json_idempotent
)


DIRS: Tuple[str, ...] = ("north", "east", "south", "west")

VERT_SUBS: Tuple[str, ...] = (
    "center", "south", "southeast", "east", "northeast", "north", "northwest",
    "west", "southwest"
)


def build_blockstate(name: str) -> Any:
    variants: Dict[str, Any] = {}
    for plane in ("down", "up"):
        for sub in VERT_SUBS:
            variants[f"position={plane}_{sub}"] = CompactDict({
                "model": "cntrafficsymbols_0d0:block/"
                        f"{name}_half1_cylindrical_rod_{plane}_{sub}"
            })

    for i, facing in enumerate(DIRS):
        right: str = DIRS[(i+1)%4]
        left: str = DIRS[(i-1)%4]
        y: int = i * 90
        for model_sub, pos_sub in (
            ("center", "center"),
            ("upper", "upper"),
            ("uppereast", f"upper{right}"),
            ("east", right),
            ("lowereast", f"lower{right}"),
            ("lower", "lower"),
            ("lowerwest", f"lower{left}"),
            ("west", left),
            ("upperwest", f"upper{left}"),
        ):
            entry: Dict[str, Any] = {
                "model": "cntrafficsymbols_0d0:block/"
                        f"{name}_half1_cylindrical_rod_north_{model_sub}"
            }
            if y != 0:
                entry["y"] = y
            variants[f"position={facing}_{pos_sub}"] = CompactDict(entry)

    return {"variants": variants}


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate all half1 cylindrical rod blockstates")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for color in COLORS:
        to_write = build_blockstate(color)
        write_json_idempotent(args.dir, f"{color}_half1_cylindrical_rod.json",
                              to_write, args.dry_run, compact=True)


if __name__ == "__main__":
    main()
