from argparse import ArgumentParser, Namespace
from copy import deepcopy
from typing import Any, Dict, List, Optional, Tuple, Union

from .reg_utils import (
    CompactDict, CompactList, create_parser, ensure_output_dir,
    write_json_idempotent
)


BASE_BOTTOM: Any = {
    "parent": "minecraft:block/block",
    "textures": CompactDict({"particle": "#this"}),
    "elements": [
        {
            "from": CompactList([0, 0, 0]),
            "to": CompactList([16, 1, 16]),
            "faces": {
                "down": CompactDict({
                    "uv": [0, 0, 16, 16], "texture": "#this",
                    "cullface": "down"
                }),
                "up": CompactDict({"uv": [0, 0, 16, 16], "texture": "#this"}),
                "north": CompactDict({
                    "uv": [0, 15, 16, 16], "texture": "#this",
                    "cullface": "north"
                }),
                "south": CompactDict({
                    "uv": [0, 15, 16, 16], "texture": "#this",
                    "cullface": "south"
                }),
                "west": CompactDict({
                    "uv": [0, 15, 16, 16], "texture": "#this",
                    "cullface": "west"
                }),
                "east": CompactDict({
                    "uv": [0, 15, 16, 16], "texture": "#this",
                    "cullface": "east"
                })
            }
        }
    ]
}

BASE_UP: Any = {
    "parent": "minecraft:block/block",
    "textures": CompactDict({"particle": "#this"}),
    "elements": [
        {
            "from": CompactList([0, 8, 0]),
            "to": CompactList([16, 9, 16]),
            "faces": {
                "down":CompactDict({"uv": [0, 0, 16, 16], "texture": "#this"}),
                "up": CompactDict({"uv": [0, 0, 16, 16], "texture": "#this"}),
                "north": CompactDict({
                    "uv": [0, 7, 16, 8], "texture": "#this",
                    "cullface": "north"
                }),
                "south": CompactDict({
                    "uv": [0, 7, 16, 8], "texture": "#this",
                    "cullface": "south"
                }),
                "west": CompactDict({
                    "uv": [0, 7, 16, 8], "texture": "#this",
                    "cullface": "west"
                }),
                "east": CompactDict({
                    "uv": [0, 7, 16, 8], "texture": "#this",
                    "cullface": "east"
                })
            }
        }
    ]
}

IntOrFloat = Union[int, float]


def gen_boxes(
    startx: float, startz: float, lengthx: float, lengthz: float,
    sepx: float, sepz: float, timesx: int, timesz: int
) -> List[Tuple[IntOrFloat, IntOrFloat, IntOrFloat, IntOrFloat]]:
    res: List[Tuple[IntOrFloat, IntOrFloat, IntOrFloat, IntOrFloat]] = []
    x: float = startx
    for _ in range(timesx):
        z: float = startz
        for _ in range(timesz):
            a: IntOrFloat = x * 16
            b: IntOrFloat = z * 16
            c: IntOrFloat = (x+lengthx) * 16
            d: IntOrFloat = (z+lengthz) * 16
            if a.as_integer_ratio()[1] == 1:
                a = int(a)
            if b.as_integer_ratio()[1] == 1:
                b = int(b)
            if c.as_integer_ratio()[1] == 1:
                c = int(c)
            if d.as_integer_ratio()[1] == 1:
                d = int(d)
            res.append((a, b, c, d))
            z += sepz
        x += sepx
    return res


BOXES: Dict[str, List[Tuple[IntOrFloat, IntOrFloat, IntOrFloat, IntOrFloat]]] \
= {
    "dotted4_tp": gen_boxes(
        .0625, .0625, .125, .125, .25, .25, 4, 4
    ),
    "dotted5_tp": gen_boxes(
        .0625, .0625, .125, .125, .1875, .1875, 5, 5
    ),
    "dotted6_tp": gen_boxes(
        .046875, .046875, .125, .125, .15625, .15625, 6, 6
    ),
    "dotted7_tp": gen_boxes(
        .09375, .09375, .0625, .0625, .125, .125, 7, 7
    ),
    "dotted8_tp": gen_boxes(
        .03125, .03125, .0625, .0625, .125, .125, 8, 8
    ),
    "dotted9_tp": gen_boxes(
        .09375, .09375, .0625, .0625, .09375, .09375, 9, 9
    ),
    "dotted10_tp": gen_boxes(
        .046875, .046875, .0625, .0625, .09375, .09375, 10, 10
    ),
    "lined4_tp_x": gen_boxes(
        .0625, .0625, .875, .125, 0., .25, 1, 4
    ),
    "lined5_tp_x": gen_boxes(
        .0625, .0625, .875, .125, 0., .1875, 1, 5
    ),
    "lined6_tp_x": gen_boxes(
        .046875, .046875, .90625, .125, 0., .15625, 1, 6
    ),
    "lined7_tp_x": gen_boxes(
        .09375, .09375, .8125, .0625, 0., .125, 1, 7
    ),
    "lined8_tp_x": gen_boxes(
        .03125, .03125, .9375, .0625, 0., .125, 1, 8
    ),
    "lined9_tp_x": gen_boxes(
        .09375, .09375, .8125, .0625, 0., .09375, 1, 9
    ),
    "lined10_tp_x": gen_boxes(
        .046875, .046875, .90625, .0625, 0., .09375, 1, 10
    )
}


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = create_parser("Generate all tp parent models")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for k, v in BOXES.items():
        a: Any = deepcopy(BASE_BOTTOM)
        b: Any = deepcopy(BASE_UP)
        for i in v:
            a["elements"].append({
                "from": CompactList([i[0], 1, i[1]]),
                "to": CompactList([i[2], 1.5, i[3]]),
                "faces": {
                    "up": CompactDict({"uv": [*i], "texture": "#this"}),
                    "north": CompactDict({
                        "uv": [16-i[2], 14.5, 16-i[0], 15], "texture": "#this"
                    }),
                    "south": CompactDict({
                        "uv": [i[0], 14.5, i[2], 15], "texture": "#this"
                    }),
                    "west": CompactDict({
                        "uv": [i[1], 14.5, i[3], 15], "texture": "#this"
                    }),
                    "east": CompactDict({
                        "uv": [16-i[3], 14.5, 16-i[1], 15], "texture": "#this"
                    })
                }
            })
            b["elements"].append({
                "from": CompactList([i[0], 9, i[1]]),
                "to": CompactList([i[2], 9.5, i[3]]),
                "faces": {
                    "up": CompactDict({"uv": [*i], "texture": "#this"}),
                    "north": CompactDict({
                        "uv": [16-i[2], 6.5, 16-i[0], 7], "texture": "#this"
                    }),
                    "south": CompactDict({
                        "uv": [i[0], 6.5, i[2], 7], "texture": "#this"
                    }),
                    "west": CompactDict({
                        "uv": [i[1], 6.5, i[3], 7], "texture": "#this"
                    }),
                    "east": CompactDict({
                        "uv": [16-i[3], 6.5, 16-i[1], 7], "texture": "#this"
                    })
                }
            })
        write_json_idempotent(args.dir, f"{k}_bottom.json", a, args.dry_run,
                              compact=True)
        write_json_idempotent(args.dir, f"{k}_up.json", b, args.dry_run,
                              compact=True)


if __name__ == "__main__":
    main()
