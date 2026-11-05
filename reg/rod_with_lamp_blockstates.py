from argparse import ArgumentParser, Namespace
from typing import Any, Dict, Iterable, List, Optional, Tuple

from .reg_utils import (
    COLORS, CompactDict, create_parser, ensure_output_dir,
    write_json_idempotent
)


DIRECTIONS: Tuple[str, str, str, str] = ("north", "east", "south", "west")
UD_SUB: Tuple[str, ...] = (
    "center", "south", "southeast", "east", "northeast", "north",
    "northwest", "west", "southwest"
)
GROUPS: Dict[str, str] = {
    "lit=false": "unlit",
    "lit=true,color=white": "white",
    "lit=true,color=light_yellow": "lightyellow",
    "lit=true,color=yellow": "yellow",
    "lit=true,color=orange": "orange"
}


def dir_positions() -> Iterable[Tuple[str, str, int]]:
    for d, dname in enumerate(DIRECTIONS):
        y: int = d * 90
        r: str = DIRECTIONS[(1+d) % 4]
        l: str = DIRECTIONS[(3+d) % 4]
        yield f"{dname}_center", "north_center", y
        yield f"{dname}_upper", "north_upper", y
        yield f"{dname}_upper{r}", "north_uppereast", y
        yield f"{dname}_{r}", "north_east", y
        yield f"{dname}_lower{r}", "north_lowereast", y
        yield f"{dname}_lower", "north_lower", y
        yield f"{dname}_lower{l}", "north_lowerwest", y
        yield f"{dname}_{l}", "north_west", y
        yield f"{dname}_upper{l}", "north_upperwest", y


def build_blockstate(color: str) -> Any:
    variants: Dict[str, Any] = {}
    for group, cl in GROUPS.items():
        for pos in ("down_", "up_"):
            for sub in UD_SUB:
                variants[f"{group},position={pos}{sub}"] = CompactDict({
                    "model": "cntrafficsymbols_0d0:block/"
                            f"{color}_rod_with_lamp_{cl}_{pos}{sub}"
                })
        for pos_name, model_suffix, y in dir_positions():
            d: Dict[str, Any] = {
                "model": "cntrafficsymbols_0d0:block/"
                        f"{color}_rod_with_lamp_{cl}_{model_suffix}"
            }
            if y:
                d["y"] = y
            variants[f"{group},position={pos_name}"] = CompactDict(d)
    return {"variants": variants}


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate all rod with lamp blockstates")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for color in COLORS:
        to_write = build_blockstate(color)
        write_json_idempotent(args.dir, f"{color}_rod_with_lamp.json",
                              to_write, args.dry_run, compact=True)


if __name__ == "__main__":
    main()
