from argparse import ArgumentParser, Namespace
from typing import Iterable, List, Optional

from .reg_utils import create_parser, ensure_output_dir, write_json_idempotent
from .tag_swap_recipes import resolve_tag_items


def block_forms(tags_dir: str) -> Iterable[str]:
    yield "barricade_1m_edge_1m_height"


def item_forms(tags_dir: str) -> Iterable[str]:
    for id_ in (
        "#circle_vertical_symbols", "circle_backboard", "#highway_hm",
        "highway_km", "#wideboard", "iron_plate", "white_floor_line_eighth",
        "yellow_floor_line_eighth", "white_thin_22d5_floor_line",
        "yellow_thin_22d5_floor_line", "white_thin_45_floor_line",
        "yellow_thin_45_floor_line", "#rod_with_lamps", "#floor_line_crosses"
    ):
        if id_.startswith("#"):
            for item in resolve_tag_items(tags_dir, id_[1:]):
                yield item.split(":", maxsplit=1)[-1]
        else:
            yield id_


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = create_parser("Generate model item-models")
    parser.add_argument("--tags-dir", required=True, type=str,
                        help="Directory containing tags")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for name in block_forms(args.tags_dir):
        to_write = {
            "model": {
                "type": "minecraft:model",
                "model": f"cntrafficsymbols_0d0:block/{name}"
            }
        }
        write_json_idempotent(args.dir, f"{name}.json", to_write, args.dry_run)

    for name in item_forms(args.tags_dir):
        to_write = {
            "model": {
                "type": "minecraft:model",
                "model": f"cntrafficsymbols_0d0:item/{name}"
            }
        }
        write_json_idempotent(args.dir, f"{name}.json", to_write, args.dry_run)


if __name__ == "__main__":
    main()
