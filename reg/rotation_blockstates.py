from argparse import ArgumentParser, Namespace
from typing import Any, Dict, Iterable, List, Optional

from .reg_utils import (
    CompactDict, create_parser, ensure_output_dir, write_json_idempotent
)
from .tag_swap_recipes import resolve_tag_items


def blocks(tags_dir: str) -> Iterable[str]:
    for id_ in (
        "#circle_vertical_symbols", "circle_backboard", "#highway_hm",
        "highway_km"
    ):
        if id_.startswith("#"):
            for item in resolve_tag_items(tags_dir, id_[1:]):
                yield item.split(":", maxsplit=1)[-1]
        else:
            yield id_


def build_blockstate(name: str) -> Any:
    variants: Dict[str, Any] = {}
    for attachment, suff in {"none": "", "down": "_down", "up": "_up"}.items():
        variants.update({
            f"facing=south,attachment={attachment}": CompactDict({
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation0{suff}"
            }),
            f"facing=ssw,attachment={attachment}": CompactDict({
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation1{suff}"
            }),
            f"facing=southwest,attachment={attachment}": CompactDict({
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation2{suff}"
            }),
            f"facing=wsw,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation15{suff}",
                "y": 90
            },
            f"facing=west,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation0{suff}",
                "y": 90
            },
            f"facing=wnw,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation1{suff}",
                "y": 90
            },
            f"facing=northwest,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation2{suff}",
                "y": 90
            },
            f"facing=nnw,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation15{suff}",
                "y": 180
            },
            f"facing=north,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation0{suff}",
                "y": 180
            },
            f"facing=nne,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation1{suff}",
                "y": 180
            },
            f"facing=northeast,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation2{suff}",
                "y": 180
            },
            f"facing=ene,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation15{suff}",
                "y": 270
            },
            f"facing=east,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation0{suff}",
                "y": 270
            },
            f"facing=ese,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation1{suff}",
                "y": 270
            },
            f"facing=southeast,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation2{suff}",
                "y": 270
            },
            f"facing=sse,attachment={attachment}": CompactDict({
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation15{suff}"
            }),
            f"facing=north_south,attachment={attachment}": CompactDict({
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation16{suff}"
            }),
            f"facing=nne_ssw,attachment={attachment}": CompactDict({
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation17{suff}"
            }),
            f"facing=northeast_southwest,attachment={attachment}":CompactDict({
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation18{suff}"
            }),
            f"facing=ene_wsw,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation23{suff}",
                "y": 90
            },
            f"facing=east_west,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation16{suff}",
                "y": 90
            },
            f"facing=ese_wnw,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation17{suff}",
                "y": 90
            },
            f"facing=northwest_southeast,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation18{suff}",
                "y": 90
            },
            f"facing=sse_nnw,attachment={attachment}": CompactDict({
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation23{suff}"
            }),
            f"facing=wall_north,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation26{suff}",
                "y": 180
            },
            f"facing=wall_east,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation26{suff}",
                "y": 270
            },
            f"facing=wall_south,attachment={attachment}": CompactDict({
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation26{suff}"
            }),
            f"facing=wall_west,attachment={attachment}": {
                "model": f"cntrafficsymbols_0d0:block/{name}_rotation26{suff}",
                "y": 90
            }
        })
    return {"variants": variants}


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = create_parser("Generate all rotation blockstates")
    parser.add_argument("--tags-dir", required=True, type=str,
                        help="Directory containing tags")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    for block in blocks(args.tags_dir):
        to_write = build_blockstate(block)
        write_json_idempotent(args.dir, f"{block}.json", to_write,
                              args.dry_run, compact=True)


if __name__ == "__main__":
    main()
