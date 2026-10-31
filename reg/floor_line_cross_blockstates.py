from argparse import ArgumentParser, Namespace
from typing import Any, Dict, List, Optional

from .floor_line_cross_data import (
    ALL_FLOOR_LINE_CROSSES, FloorLineCrossBlockInfo
)
from .reg_utils import (
    CompactDict, create_parser, ensure_output_dir, write_json_idempotent
)


def make_cross_blockstates(b: FloorLineCrossBlockInfo) -> Any:
    variants: Dict[str, Any] = {}
    base_model: str = f"cntrafficsymbols_0d0:block/{b.name}"

    if b.kind == "center_symmetric":
        variants[""] = CompactDict({"model": base_model})
    elif b.kind == "diagonal":
        variants["corner=northwest"] = CompactDict({"model": base_model})
        variants["corner=northeast"] = CompactDict({
            "model": base_model, "y": 90, "uvlock": True
        })
        variants["corner=southeast"] = CompactDict({
            "model": base_model, "y": 180, "uvlock": True
        })
        variants["corner=southwest"] = CompactDict({
            "model": base_model, "y": 270, "uvlock": True
        })
    elif b.kind == "axial":
        variants["facing=north"] = CompactDict({"model": base_model})
        variants["facing=east"] = CompactDict({
            "model": base_model, "y": 90, "uvlock": True
        })
        variants["facing=south"] = CompactDict({
            "model": base_model, "y": 180, "uvlock": True
        })
        variants["facing=west"] = CompactDict({
            "model": base_model, "y": 270, "uvlock": True
        })
    else:  # chiral
        transposed_model: str = f"cntrafficsymbols_0d0:block/{b.name}_transposed"
        variants["corner=northwest,transposed=false"] = CompactDict({
            "model": base_model
        })
        variants["corner=northeast,transposed=false"] = CompactDict({
            "model": base_model, "y": 90, "uvlock": True
        })
        variants["corner=southeast,transposed=false"] = CompactDict({
            "model": base_model, "y": 180, "uvlock": True
        })
        variants["corner=southwest,transposed=false"] = CompactDict({
            "model": base_model, "y": 270, "uvlock": True
        })

        variants["corner=northwest,transposed=true"] = CompactDict({
            "model": transposed_model
        })
        variants["corner=northeast,transposed=true"] = CompactDict({
            "model": transposed_model, "y": 90, "uvlock": True
        })
        variants["corner=southeast,transposed=true"] = CompactDict({
            "model": transposed_model, "y": 180, "uvlock": True
        })
        variants["corner=southwest,transposed=true"] = CompactDict({
            "model": transposed_model, "y": 270, "uvlock": True
        })

    return {"variants": variants}


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate floor line cross blockstates")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for info in ALL_FLOOR_LINE_CROSSES:
        bs = make_cross_blockstates(info)
        write_json_idempotent(args.dir, f"{info.name}.json", bs,
                              args.dry_run, compact=True)


if __name__ == "__main__":
    main()
