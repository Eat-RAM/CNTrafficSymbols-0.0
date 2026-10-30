from argparse import ArgumentParser, Namespace
from typing import Any, Dict, List, Optional, Tuple, Union

from .reg_utils import (
    CompactDict, CompactList, create_parser, ensure_output_dir,
    write_json_idempotent
)


Y_OFFSETS: Dict[Tuple[int, int], str] = {
    (0, 0): "center", (0, 6): "south", (6, 6): "southeast", (6, 0): "east",
    (6, -6): "northeast", (0, -6): "north", (-6, -6): "northwest",
    (-6, 0): "west", (-6, 6): "southwest"
}

Z_OFFSETS: Dict[Tuple[int, int], str] = {
    (0, 0): "center", (0, 6): "upper", (0, -6): "lower", (-6, -6): "lowerwest",
    (-6, 0): "west", (-6, 6): "upperwest"
}

NORTH_OFFSETS: Dict[Tuple[int, int], str]={
    (0, 0): "center", (0, 6): "upper", (6, 6): "uppereast", (6, 0): "east",
    (6, -6): "lowereast", (0, -6): "lower", (-6, -6): "lowerwest",
    (-6, 0): "west", (-6, 6): "upperwest"
}


def add_cullface(element: Dict[str, Any]) -> None:
    for idx, l, face in (
        (0, 0, "west"), (0, 16, "east"),
        (1, 0, "down"), (1, 16, "up"),
        (2, 0, "north"), (2, 16, "south")
    ):
        if element["to" if l else "from"][idx] == l and \
           face in element["faces"]:
            element["faces"][face]["cullface"] = face


def build_y_model(half: Union[bool, None], offset: Tuple[int, int]) -> Any:
    dx: int = offset[0]
    dy: int = offset[1]
    bottom: int = 8 if half else 0
    height: int = 16 if half is None else 8
    top: int = bottom + height
    elements: List[Dict[str, Any]] = [
        {
            "from": CompactList([7+dx, bottom, 6+dy]),
            "to": CompactList([9+dx, top, 7+dy]),
            "faces": {
                "north": CompactDict({
                    "uv": [1, 0, 3, height], "texture": "#side"
                }),
                "west": CompactDict({
                    "uv": [0, 0, 1, height], "texture": "#side"
                }),
                "east": CompactDict({
                    "uv": [3, 0, 4, height], "texture": "#side"
                })
            }
        },
        {
            "from": CompactList([7+dx, bottom, 9+dy]),
            "to": CompactList([9+dx, top, 10+dy]),
            "faces": {
                "south": CompactDict({
                    "uv": [1, 0, 3, height], "texture": "#side"
                }),
                "west": CompactDict({
                    "uv": [3, 0, 4, height], "texture": "#side"
                }),
                "east": CompactDict({
                    "uv": [0, 0, 1, height], "texture": "#side"
                })
            }
        },
        {
            "from": CompactList([6+dx, bottom, 7+dy]),
            "to": CompactList([7+dx, top, 9+dy]),
            "faces": {
                "west": CompactDict({
                    "uv": [1, 0, 3, height], "texture": "#side"
                }),
                "north": CompactDict({
                    "uv": [3, 0, 4, height], "texture": "#side"
                }),
                "south": CompactDict({
                    "uv": [0, 0, 1, height], "texture": "#side"
                })
            }
        },
        {
            "from": CompactList([9+dx, bottom, 7+dy]),
            "to": CompactList([10+dx, top, 9+dy]),
            "faces": {
                "east": CompactDict({
                    "uv": [1, 0, 3, height], "texture": "#side"
                }),
                "north": CompactDict({
                    "uv": [0, 0, 1, height], "texture": "#side"
                }),
                "south": CompactDict({
                    "uv": [3, 0, 4, height], "texture": "#side"
                })
            }
        },
        {
            "from": CompactList([6+dx, bottom, 6+dy]),
            "to": CompactList([10+dx, top, 10+dy]),
            "faces": {
                "down": CompactDict({"uv": [4, 0, 8, 4], "texture": "#side"}),
                "up": CompactDict({"uv": [4, 0, 8, 4], "texture": "#side"})
            }
        }
    ]
    for i in elements:
        add_cullface(i)
    return {
        "parent": "minecraft:block/block",
        "textures": CompactDict({"particle": "#side"}),
        "elements": elements
    }


def build_z_model(half: Union[bool, None], offset: Tuple[int, int]) -> Any:
    dx: int = offset[0]
    dy: int = offset[1]
    bottom: int = 8 if half else 0
    height: int = 16 if half is None else 8
    top: int = bottom + height
    elements: List[Dict[str, Any]] = [
        {
            "from": CompactList([7+dx, 6+dy, bottom]),
            "to": CompactList([9+dx, 7+dy, top]),
            "faces": {
                "down": CompactDict({
                    "uv": [1, 0, 3, height], "texture": "#side"
                }),
                "west": CompactDict({
                    "uv": [0, 15, height, 16], "texture": "#side"
                }),
                "east": CompactDict({
                    "uv": [0, 15, height, 16], "texture": "#side"
                })
            }
        },
        {
            "from": CompactList([7+dx, 9+dy, bottom]),
            "to": CompactList([9+dx, 10+dy, top]),
            "faces": {
                "up": CompactDict({
                    "uv": [1, 0, 3, height], "texture": "#side"
                }),
                "west": CompactDict({
                    "uv": [0, 12, height, 13], "texture": "#side"
                }),
                "east": CompactDict({
                    "uv": [0, 12, height, 13], "texture": "#side"
                })
            }
        },
        {
            "from": CompactList([6+dx, 7+dy, bottom]),
            "to": CompactList([7+dx, 9+dy, top]),
            "faces": {
                "west": CompactDict({
                    "uv": [0, 13, height, 15], "texture": "#side"
                }),
                "down": CompactDict({
                    "uv": [0, 0, 1, height], "texture": "#side"
                }),
                "up": CompactDict({
                    "uv": [0, 0, 1, height], "texture": "#side"
                })
            }
        },
        {
            "from": CompactList([9+dx, 7+dy, bottom]),
            "to": CompactList([10+dx, 9+dy, top]),
            "faces": {
                "east": CompactDict({
                    "uv": [0, 13, height, 15], "texture": "#side"
                }),
                "down": CompactDict({
                    "uv": [3, 0, 4, height], "texture": "#side"
                }),
                "up": CompactDict({
                    "uv": [3, 0, 4, height], "texture": "#side"
                })
            }
        },
        {
            "from": CompactList([6+dx, 6+dy, bottom]),
            "to": CompactList([10+dx, 10+dy, top]),
            "faces": {
                "north": CompactDict({"uv": [4, 0, 8, 4], "texture": "#side"}),
                "south": CompactDict({"uv": [4, 0, 8, 4], "texture": "#side"})
            }
        }
    ]
    for i in elements:
        add_cullface(i)
    return {
        "parent": "minecraft:block/block",
        "textures": CompactDict({"particle": "#side"}),
        "elements": elements
    }


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate all cylindrical rod parent models")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for offset, name in Y_OFFSETS.items():
        for half, p in ((False, "down"), (True, "up"), (None, "y")):
            to_write = build_y_model(half, offset)
            filename: str = \
            (f"{'full' if half is None else 'half'}1_cylindrical_rod_"
             f"{p}_{name}.json")
            write_json_idempotent(
                args.dir, filename, to_write, args.dry_run, compact=True
            )
    for offset, name in Z_OFFSETS.items():
        to_write = build_z_model(None, offset)
        write_json_idempotent(
            args.dir, f"full1_cylindrical_rod_z_{name}.json", to_write,
            args.dry_run, compact=True
        )
    for offset, name in NORTH_OFFSETS.items():
        to_write = build_z_model(False, offset)
        write_json_idempotent(
            args.dir, f"half1_cylindrical_rod_north_{name}.json", to_write,
            args.dry_run, compact=True
        )


if __name__ == "__main__":
    main()
