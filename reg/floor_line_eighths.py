import itertools

from argparse import ArgumentParser, Namespace
from fractions import Fraction
from os import path
from typing import Any, Dict, List, Optional, Tuple

from .reg_utils import (
    CompactDict, CompactList, ensure_output_dir, write_json_idempotent
)


def pack_ternary(pattern: Tuple[int, ...]) -> int:
    """Pack 8 ternary slice states into an integer base-3 hash."""

    return sum(v * (3 ** i) for i, v in enumerate(pattern))


def unpack_coordinates(hash_code: int) -> Tuple[int, int, int]:
    """Unpack hash integer into blockstate variant coordinates
    (slices, slices16, slices160)."""

    hash_code -= 1
    return hash_code % 16, (hash_code // 16) % 10, (hash_code // 160) % 41


def build_floor_line_model(pattern: Tuple[int, ...]) -> Any:
    """Build the JSON model structure for a given 8-slice pattern."""

    obj: Any = {"elements": [], "textures": {}}
    cursor: int = 0
    delta: int = 0
    current_type: int = 0

    while cursor < 8:
        if current_type == pattern[cursor+delta]:
            delta += 1
            if cursor + delta < 8:
                continue

        should_cull_before: bool = cursor == 0 or pattern[cursor-1] != 0
        should_cull_after: bool = \
        cursor + delta >= 8 or pattern[cursor+delta] != 0
        cursor += delta

        if current_type != 0 and cursor != 0:
            tex_key: str = "a1" if current_type == 1 else "a2"
            tex_val: str = (
                "cntrafficsymbols_0d0:block/white_floor_line_eighths"
                if current_type == 1
                else "cntrafficsymbols_0d0:block/yellow_floor_line_eighths"
            )
            obj["textures"][tex_key] = tex_val

            from_z: int = (cursor-delta) * 2
            to_z: int = cursor * 2
            element: Any = {
                "from": CompactList([0, 0, from_z]),
                "to": CompactList([16, 0.5, to_z]),
                "faces": {
                    "down": CompactDict({
                        "uv": [0, from_z, 16, to_z],
                        "texture": f"#{tex_key}",
                        "cullface": "down"
                    }),
                    "up": CompactDict({
                        "uv": [0, from_z, 16, to_z],
                        "texture": f"#{tex_key}"
                    }),
                    "north": CompactDict({
                        "uv": [0, 15.5, 16, 16],
                        "texture": f"#{tex_key}",
                        "cullface": "north"
                    }),
                    "south": CompactDict({
                        "uv": [0, 15.5, 16, 16],
                        "texture": f"#{tex_key}",
                        "cullface": "south"
                    }),
                    "west": CompactDict({
                        "uv": [from_z, 15.5, to_z, 6],
                        "texture": f"#{tex_key}",
                        "cullface": "west"
                    }),
                    "east": CompactDict({
                        "uv": [(8-cursor)*2, 15.5, (8-cursor+delta)*2, 6],
                        "texture": f"#{tex_key}",
                        "cullface": "east"
                    })
                }
            }

            if cursor > delta:
                if should_cull_before:
                    del element["faces"]["north"]
                else:
                    del element["faces"]["north"]["cullface"]

            if cursor < 8:
                if should_cull_after:
                    del element["faces"]["south"]
                else:
                    del element["faces"]["south"]["cullface"]

            obj["elements"].append(element)

        if cursor < 8:
            delta = 0
            current_type = pattern[cursor]

    white_count: int = pattern.count(1)
    yellow_count: int = pattern.count(2)
    if white_count == 0:
        obj["textures"]["particle"] = \
        "cntrafficsymbols_0d0:block/yellow_floor_line_eighths"
    elif yellow_count == 0:
        obj["textures"]["particle"] = \
        "cntrafficsymbols_0d0:block/white_floor_line_eighths"
    else:
        frac = Fraction(white_count, yellow_count)
        obj["textures"]["particle"] = (
            "cntrafficsymbols_0d0:block/"
            f"floor_line_eighths_particle_{frac.numerator}{frac.denominator}"
        )

    return obj


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = ArgumentParser(
        description="Generate floor line eighths models and blockstates"
    )
    parser.add_argument("dir", help="Directory where model JSON files lie")
    parser.add_argument(
        "--blockstates-dir",
        default=None,
        help="Directory where floor_line_eighths.json blockstate lies "
             "(defaults to sibling 'blockstates' dir or models dir)"
    )
    parser.add_argument("--dry-run", action="store_true",
                        help="Don't actually generate anything")
    args: Namespace = parser.parse_args(argv)

    ensure_output_dir(args.dir, args.dry_run)

    blockstate_dir: str = args.blockstates_dir
    if not blockstate_dir:
        candidate: str = \
        path.normpath(path.join(args.dir, "../../blockstates"))
        blockstate_dir = candidate if path.isdir(candidate) else args.dir

    ensure_output_dir(blockstate_dir, args.dry_run)

    patterns: Dict[Tuple[int, ...], bool] = {}
    for tup in itertools.product((0, 1, 2), repeat=8):
        patterns[tup] = tup[::-1] in patterns

    blockstate_data: Any = {"variants": {}}

    for pattern in patterns:
        if pattern == (0, 0, 0, 0, 0, 0, 0, 0):
            continue

        qp: Tuple[int, int, int] = unpack_coordinates(pack_ternary(pattern))

        if patterns[pattern]:
            rev_str = "".join(str(x) for x in pattern[::-1])
            blockstate_data["variants"][
                f"axis=x,slices={qp[0]},slices16={qp[1]},slices160={qp[2]}"
            ] = {
                "model":
                f"cntrafficsymbols_0d0:block/floor_line_eighths_{rev_str}",
                "y": 180,
                "uvlock": True
            }
            blockstate_data["variants"][
                f"axis=z,slices={qp[0]},slices16={qp[1]},slices160={qp[2]}"
            ] = {
                "model":
                f"cntrafficsymbols_0d0:block/floor_line_eighths_{rev_str}",
                "y": 90,
                "uvlock": True
            }
            continue

        model_data = build_floor_line_model(pattern)
        pattern_str: str = "".join(str(x) for x in pattern)
        write_json_idempotent(
            args.dir, f"floor_line_eighths_{pattern_str}.json", model_data,
            args.dry_run, compact=True
        )

        blockstate_data["variants"][
            f"axis=x,slices={qp[0]},slices16={qp[1]},slices160={qp[2]}"
        ] = {
            "model":
            f"cntrafficsymbols_0d0:block/floor_line_eighths_{pattern_str}"
        }
        blockstate_data["variants"][
            f"axis=z,slices={qp[0]},slices16={qp[1]},slices160={qp[2]}"
        ] = {
            "model":
            f"cntrafficsymbols_0d0:block/floor_line_eighths_{pattern_str}",
            "y": 270,
            "uvlock": True
        }

    write_json_idempotent(blockstate_dir, "floor_line_eighths.json",
                          blockstate_data, args.dry_run)


if __name__ == "__main__":
    main()
