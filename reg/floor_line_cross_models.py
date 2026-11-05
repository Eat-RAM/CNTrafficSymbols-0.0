from argparse import ArgumentParser, Namespace
from typing import Any, Dict, List, Optional

from .floor_line_cross_data import (
    ALL_FLOOR_LINE_CROSSES, FloorLineCrossBlockInfo
)
from .reg_utils import (
    CompactDict, CompactList, create_parser, ensure_output_dir,
    write_json_idempotent
)


def make_cross_model(
    b: FloorLineCrossBlockInfo, transposed: bool = False
) -> Dict[str, Any]:
    r: int = b.c if transposed else b.r
    wr: int = b.wc if transposed else b.wr
    cr: str = b.cc if transposed else b.cr
    fr: bool = b.fc if transposed else b.fr

    c: int = b.r if transposed else b.c
    wc: int = b.wr if transposed else b.wc
    cc: str = b.cr if transposed else b.cc
    fc: bool = b.fr if transposed else b.fc

    z1: int = 2 * r
    z2: int = 2 * r + wr
    x1: int = 2 * c
    x2: int = 2 * c + wc

    tex_r: str = f"cntrafficsymbols_0d0:block/{cr}_floor_line_eighths"
    tex_c: str = f"cntrafficsymbols_0d0:block/{cc}_floor_line_eighths"
    center_tex: str = "#texture_row" if fr or (not fc) else "#texture_col"

    elements: List[Dict[str, Any]] = []

    # 1. West segment of row (x in [0, x1])
    if x1 > 0:
        faces: Dict[str, Any] = {
            "up": CompactDict({
                "uv": [0, z1, x1, z2],
                "texture": "#texture_row"
            }),
            "down": CompactDict({
                "uv": [0, z1, x1, z2],
                "texture": "#texture_row",
                "cullface": "down"
            }),
            "north": CompactDict({
                "uv": [0, 15.5, x1, 16],
                "texture": "#texture_row"
            }),
            "south": CompactDict({
                "uv": [0, 15.5, x1, 16],
                "texture": "#texture_row"
            }),
            "west": CompactDict({
                "uv": [z1, 15.5, z2, 16],
                "texture": "#texture_row",
                "cullface": "west"
            })
        }
        if z1 == 0:
            faces["north"]["cullface"] = "north"
        if z2 == 16:
            faces["south"]["cullface"] = "south"
        elements.append({
            "from": CompactList([0, 0, z1]),
            "to": CompactList([x1, 0.5, z2]),
            "faces": faces
        })

    # 2. East segment of row (x in [x2, 16])
    if x2 < 16:
        faces = {
            "up": CompactDict({
                "uv": [x2, z1, 16, z2],
                "texture": "#texture_row"
            }),
            "down": CompactDict({
                "uv": [x2, z1, 16, z2],
                "texture": "#texture_row",
                "cullface": "down"
            }),
            "north": CompactDict({
                "uv": [x2, 15.5, 16, 16],
                "texture": "#texture_row"
            }),
            "south": CompactDict({
                "uv": [x2, 15.5, 16, 16],
                "texture": "#texture_row"
            }),
            "east": CompactDict({
                "uv": [z1, 15.5, z2, 16],
                "texture": "#texture_row",
                "cullface": "east"
            })
        }
        if z1 == 0:
            faces["north"]["cullface"] = "north"
        if z2 == 16:
            faces["south"]["cullface"] = "south"
        elements.append({
            "from": CompactList([x2, 0, z1]),
            "to": CompactList([16, 0.5, z2]),
            "faces": faces
        })

    # 3. North segment of col (z in [0, z1])
    if z1 > 0:
        faces = {
            "up": CompactDict({
                "uv": [x1, 0, x2, z1],
                "texture": "#texture_col"
            }),
            "down": CompactDict({
                "uv": [x1, 0, x2, z1],
                "texture": "#texture_col",
                "cullface": "down"
            }),
            "west": CompactDict({
                "uv": [0, 15.5, z1, 16],
                "texture": "#texture_col"
            }),
            "east": CompactDict({
                "uv": [0, 15.5, z1, 16],
                "texture": "#texture_col"
            }),
            "north": CompactDict({
                "uv": [x1, 15.5, x2, 16],
                "texture": "#texture_col",
                "cullface": "north"
            })
        }
        if x1 == 0:
            faces["west"]["cullface"] = "west"
        if x2 == 16:
            faces["east"]["cullface"] = "east"
        elements.append({
            "from": CompactList([x1, 0, 0]),
            "to": CompactList([x2, 0.5, z1]),
            "faces": faces
        })

    # 4. South segment of col (z in [z2, 16])
    if z2 < 16:
        faces = {
            "up": CompactDict({
                "uv": [x1, z2, x2, 16],
                "texture": "#texture_col"
            }),
            "down": CompactDict({
                "uv": [x1, z2, x2, 16],
                "texture": "#texture_col",
                "cullface": "down"
            }),
            "west": CompactDict({
                "uv": [z2, 15.5, 16, 16],
                "texture": "#texture_col"
            }),
            "east": CompactDict({
                "uv": [z2, 15.5, 16, 16],
                "texture": "#texture_col"
            }),
            "south": CompactDict({
                "uv": [x1, 15.5, x2, 16],
                "texture": "#texture_col",
                "cullface": "south"
            })
        }
        if x1 == 0:
            faces["west"]["cullface"] = "west"
        if x2 == 16:
            faces["east"]["cullface"] = "east"
        elements.append({
            "from": CompactList([x1, 0, z2]),
            "to": CompactList([x2, 0.5, 16]),
            "faces": faces
        })

    # 5. Center block
    center_faces: Dict[str, Any] = {
        "up": CompactDict({
            "uv": [x1, z1, x2, z2],
            "texture": center_tex
        }),
        "down": CompactDict({
            "uv": [x1, z1, x2, z2],
            "texture": center_tex,
            "cullface": "down"
        })
    }
    if x1 == 0:
        center_faces["west"] = CompactDict({
            "uv": [z1, 15.5, z2, 16],
            "texture": center_tex,
            "cullface": "west"
        })
    if x2 == 16:
        center_faces["east"] = CompactDict({
            "uv": [z1, 15.5, z2, 16],
            "texture": center_tex,
            "cullface": "east"
        })
    if z1 == 0:
        center_faces["north"] = CompactDict({
            "uv": [x1, 15.5, x2, 16],
            "texture": center_tex,
            "cullface": "north"
        })
    if z2 == 16:
        center_faces["south"] = CompactDict({
            "uv": [x1, 15.5, x2, 16],
            "texture": center_tex,
            "cullface": "south"
        })
    elements.append({
        "from": CompactList([x1, 0, z1]),
        "to": CompactList([x2, 0.5, z2]),
        "faces": center_faces
    })

    return {
        "ambientocclusion": False,
        "textures": {
            "particle": tex_r,
            "texture_row": tex_r,
            "texture_col": tex_c
        },
        "elements": elements
    }


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate floor line cross block models")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for info in ALL_FLOOR_LINE_CROSSES:
        model = make_cross_model(info, transposed=False)
        write_json_idempotent(args.dir, f"{info.name}.json", model,
                              args.dry_run, compact=True)

        if info.kind == "chiral":
            t_model = make_cross_model(info, transposed=True)
            write_json_idempotent(args.dir, f"{info.name}_transposed.json",
                                  t_model, args.dry_run, compact=True)


if __name__ == "__main__":
    main()
