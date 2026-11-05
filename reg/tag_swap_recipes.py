import json

from argparse import ArgumentParser, Namespace
from os import path
from typing import Dict, List, Optional, Tuple

from .reg_utils import (
    CompactDict, create_parser, ensure_output_dir, write_json_idempotent
)


def resolve_tag_items(tag_dir: str, tag_name: str) -> List[str]:
    res: List[str] = []
    with open(path.join(tag_dir, f"{tag_name}.json"), "r") as f:
        tag_defi: List[str] = json.load(f)["values"]
        for i in tag_defi:
            if i[0] == "#":
                res.extend(resolve_tag_items(tag_dir, i[1:].split(":", 1)[-1]))
            else:
                res.append(i.split(":", 1)[-1])
    return res


TAGS: Dict[Tuple[str, str], Tuple[str, ...]] = {
    ("red_circle_black_text", "{0}"): (),
    ("red_circle_blue_text", "{0}"): (),
    ("blue_circle_white_text", "{0}"): (),
    ("black_circle_black_text", "{0}"): (),
    ("white_12_12_floor_line", "{0}"): (),
    ("yellow_12_12_floor_line", "{0}"): (),
    ("white_12_yellow_12_floor_line", "{0}"): (),
    ("white_12_25_floor_line", "{0}"): (),
    ("yellow_12_25_floor_line", "{0}"): (),
    ("white_12_yellow_25_floor_line", "{0}"): (),
    ("yellow_12_white_25_floor_line", "{0}"): (),
    ("white_25_25_floor_line", "{0}"): (),
    ("yellow_25_25_floor_line", "{0}"): (),
    ("white_25_yellow_25_floor_line", "{0}"): ()
}


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = create_parser("Generate all swap recipes")
    parser.add_argument("--tags-dir", required=True, type=str,
                        help="Directory containing tags")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for tag, exclude in TAGS.items():
        for item in resolve_tag_items(args.tags_dir, tag[0]):
            if item not in exclude:
                to_write = {
                    "type": "minecraft:stonecutting",
                    "count": 1,
                    "ingredient":
                    CompactDict({"tag": f"cntrafficsymbols_0d0:{tag[0]}"}),
                    "result": f"cntrafficsymbols_0d0:{item}"
                }
                write_json_idempotent(
                    args.dir, f"{tag[1].format(item)}.json", to_write,
                    args.dry_run, compact=True
                )


if __name__ == "__main__":
    main()
