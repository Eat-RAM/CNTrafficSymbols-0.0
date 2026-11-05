from argparse import ArgumentParser, Namespace
from typing import Any, List, Optional

from .reg_utils import (
    CompactDict, CompactList, create_parser, ensure_output_dir,
    write_json_idempotent
)


def make_parent_model(s: int, is_q13o: bool) -> Any:
    xc: float = round((s + 0.5) * 2.0 / 3.0, 4)
    x1: float = round(xc - 0.7706, 4)
    x2: float = round(xc + 0.7706, 4)
    angle: int = 45 if is_q13o else -45
    return {
        "ambientocclusion": False,
        "textures": CompactDict({"particle": "#this"}),
        "elements": [
            {
                "from": CompactList([x1, 0.0, -4.0843]),
                "to": CompactList([x2, 0.5, 20.0843]),
                "rotation": CompactDict({
                    "origin": [xc, 0.0, 8.0],
                    "axis": "y",
                    "angle": angle
                }),
                "faces": {
                    "down": CompactDict({
                        "uv": [0, 0, 16, 16],
                        "texture": "#this",
                        "cullface": "down"
                    }),
                    "up":
                    CompactDict({"uv": [0, 0, 16, 16], "texture": "#this"}),
                    "north":
                    CompactDict({"uv": [0, 15.5, 16, 16], "texture": "#this"}),
                    "south":
                    CompactDict({"uv": [0, 15.5, 16, 16], "texture": "#this"}),
                    "west":
                    CompactDict({"uv": [0, 15.5, 16, 16], "texture": "#this"}),
                    "east":
                    CompactDict({"uv": [0, 15.5, 16, 16], "texture": "#this"})
                }
            }
        ]
    }


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate 45 deg thin floor line parent models")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for s in range(12):
        write_json_idempotent(
            args.dir, f"thin_45_floor_line_q13o_s{s}.json",
            make_parent_model(s, True), args.dry_run, compact=True
        )
        write_json_idempotent(
            args.dir, f"thin_45_floor_line_q24o_s{s}.json",
            make_parent_model(s, False), args.dry_run, compact=True
        )


if __name__ == "__main__":
    main()
