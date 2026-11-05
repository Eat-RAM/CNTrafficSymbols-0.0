import io
from argparse import ArgumentParser, Namespace
from os import makedirs, path
from typing import Iterable, List, Optional

from .floor_line_cross_data import (
    ALL_FLOOR_LINE_CROSSES, generate_cross_texture
)
from .reg_utils import (
    CompactDict, create_parser, ensure_output_dir, write_json_idempotent
)
from .tag_swap_recipes import resolve_tag_items


def blocks(tags_dir: str) -> Iterable[str]:
    for id_ in (
        "#circle_vertical_symbols", "circle_backboard", "#highway_hm",
        "highway_km", "#wideboard"
    ):
        if id_.startswith("#"):
            for item in resolve_tag_items(tags_dir, id_[1:]):
                yield item.split(":", maxsplit=1)[-1]
        else:
            yield id_


def items(tags_dir: str) -> Iterable[str]:
    for id_ in (
        "iron_plate", "white_floor_line_eighth", "yellow_floor_line_eighth",
        "#rod_with_lamps", "#floor_line_crosses"
    ):
        if id_.startswith("#"):
            for item in resolve_tag_items(tags_dir, id_[1:]):
                yield item.split(":", maxsplit=1)[-1]
        else:
            yield id_


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate all generated item models")
    parser.add_argument("--tags-dir", required=True, type=str,
                        help="Directory containing tags")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for name in blocks(args.tags_dir):
        to_write = {
            "parent": "minecraft:item/generated",
            "textures":
            CompactDict({"layer0": f"cntrafficsymbols_0d0:block/{name}"})
        }
        write_json_idempotent(args.dir, f"{name}.json", to_write, args.dry_run,
                              compact=True)

    for name in items(args.tags_dir):
        to_write = {
            "parent": "minecraft:item/generated",
            "textures":
            CompactDict({"layer0": f"cntrafficsymbols_0d0:item/{name}"})
        }
        write_json_idempotent(args.dir, f"{name}.json", to_write, args.dry_run,
                              compact=True)

    tex_dir: str = \
    path.join(path.dirname(path.dirname(args.dir)), "textures", "item")
    if not args.dry_run:
        makedirs(tex_dir, exist_ok=True)
    for info in ALL_FLOOR_LINE_CROSSES:
        tex_path: str = path.join(tex_dir, f"{info.name}.png")
        im = generate_cross_texture(info)
        buf = io.BytesIO()
        im.save(buf, format="PNG")
        png_bytes: bytes = buf.getvalue()
        existing: Optional[bytes] = None
        if path.exists(tex_path):
            with open(tex_path, "rb") as f:
                existing = f.read()
        if existing != png_bytes and not args.dry_run:
            with open(tex_path, "wb") as f:
                f.write(png_bytes)


if __name__ == "__main__":
    main()
