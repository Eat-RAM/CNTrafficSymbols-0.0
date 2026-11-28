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

NORTH_OFFSETS: Dict[Tuple[int, int], str] = {
    (0, 0): "center", (0, 6): "upper", (6, 6): "uppereast", (6, 0): "east",
    (6, -6): "lowereast", (0, -6): "lower", (-6, -6): "lowerwest",
    (-6, 0): "west", (-6, 6): "upperwest"
}

HALF_SIDE: float = 0.3979


def add_cullface(element: Dict[str, Any]) -> None:
    axis: Optional[str] = \
    element["rotation"]["axis"] if "rotation" in element else None
    for idx, l, face in (
        (0, 0, "west"), (0, 16, "east"),
        (1, 0, "down"), (1, 16, "up"),
        (2, 0, "north"), (2, 16, "south")
    ):
        if (axis == "y" and face not in ("down", "up")) or \
           (axis == "z" and face not in ("north", "south")):
            continue
        if element["to" if l else "from"][idx] == l and \
           face in element["faces"]:
            element["faces"][face]["cullface"] = face


def build_y_model(half: Union[bool, None], offset: Tuple[int, int]) -> Any:
    dx: int = offset[0]
    dy: int = offset[1]
    bottom: int = 8 if half else 0
    height: int = 16 if half is None else 8
    top: int = bottom + height
    x0: int = 8 + dx
    z0: int = 8 + dy

    elements: List[Dict[str, Any]] = []
    for angle in (0, 45, 22.5, -22.5):
        elem_tall: Dict[str, Any] = {
            "from": CompactList([round(x0-HALF_SIDE, 4), bottom, z0 - 2]),
            "to": CompactList([round(x0+HALF_SIDE, 4), top, z0 + 2]),
            "faces": {
                "north":
                CompactDict({"uv": [1, 0, 3, height], "texture": "#side"}),
                "south":
                CompactDict({"uv": [1, 0, 3, height], "texture": "#side"}),
                "down": CompactDict({"uv": [1, 0, 3, 10], "texture": "#side"}),
                "up": CompactDict({"uv": [1, 0, 3, 10], "texture": "#side"})
            }
        }
        elem_wide: Dict[str, Any] = {
            "from": CompactList([x0 - 2, bottom, round(z0-HALF_SIDE, 4)]),
            "to": CompactList([x0 + 2, top, round(z0+HALF_SIDE, 4)]),
            "faces": {
                "west":
                CompactDict({"uv": [1, 0, 3, height], "texture": "#side"}),
                "east":
                CompactDict({"uv": [1, 0, 3, height], "texture": "#side"}),
                "down":
                CompactDict({"uv": [6, 13, 16, 15], "texture": "#side"}),
                "up": CompactDict({"uv": [6, 13, 16, 15], "texture": "#side"})
            }
        }
        if angle != 0:
            rot: Dict[str, Any] = CompactDict({
                "origin": CompactList([x0, bottom, z0]),
                "axis": "y",
                "angle": angle
            })
            elem_tall["rotation"] = rot
            elem_wide["rotation"] = rot
        add_cullface(elem_tall)
        add_cullface(elem_wide)
        elements.extend([elem_tall, elem_wide])

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
    x0: int = 8 + dx
    y0: int = 8 + dy

    elements: List[Dict[str, Any]] = []
    for angle in (0, 45, 22.5, -22.5):
        elem_tall: Dict[str, Any] = {
            "from": CompactList([round(x0-HALF_SIDE, 4), y0 - 2, bottom]),
            "to": CompactList([round(x0+HALF_SIDE, 4), y0 + 2, top]),
            "faces": {
                "down":
                CompactDict({"uv": [0, 13, height, 15], "texture": "#side"}),
                "up":
                CompactDict({"uv": [0, 13, height, 15], "texture": "#side"}),
                "north":
                CompactDict({"uv": [1, 0, 3, 10], "texture": "#side"}),
                "south": CompactDict({"uv": [1, 0, 3, 10], "texture": "#side"})
            }
        }
        elem_wide: Dict[str, Any] = {
            "from": CompactList([x0 - 2, round(y0-HALF_SIDE, 4), bottom]),
            "to": CompactList([x0 + 2, round(y0+HALF_SIDE, 4), top]),
            "faces": {
                "west":
                CompactDict({"uv": [0, 13, height, 15], "texture": "#side"}),
                "east":
                CompactDict({"uv": [0, 13, height, 15], "texture": "#side"}),
                "north":
                CompactDict({"uv": [6, 13, 16, 15], "texture": "#side"}),
                "south":
                CompactDict({"uv": [6, 13, 16, 15], "texture": "#side"})
            }
        }
        if angle != 0:
            rot: Dict[str, Any] = CompactDict({
                "origin": CompactList([x0, y0, bottom]),
                "axis": "z",
                "angle": angle
            })
            elem_tall["rotation"] = rot
            elem_wide["rotation"] = rot
        add_cullface(elem_tall)
        add_cullface(elem_wide)
        elements.extend([elem_tall, elem_wide])

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
