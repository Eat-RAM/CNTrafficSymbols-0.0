from argparse import ArgumentParser, Namespace
from typing import Any, Dict, Iterable, List, Optional, Tuple

from .reg_utils import (
    COLORS, CompactDict, create_parser, ensure_output_dir,
    write_json_idempotent
)
from .tag_swap_recipes import resolve_tag_items


TAGS: Dict[Tuple[str, str], Iterable[str]] = {
    ("red_circle_black_text", "{0}"): ("speedlimit_high_special",),
    ("red_circle_blue_text", "{0}"): ("no_stopping",),
    ("blue_circle_white_text", "{0}"): ("speedlimit_low_special",),
    ("black_circle_black_text", "{0}"): ("lift_speedlimit_high_special",),
    ("green_wideboard", "{0}"): ("minecraft:lime_concrete",),
    ("green_wideboard", "{0}_swap"): ("minecraft:lime_concrete",),
    ("yellow_wideboard", "{0}"): ("minecraft:yellow_concrete",),
    ("yellow_wideboard", "{0}_swap"): ("minecraft:yellow_concrete",),
    ("white_12_12_floor_line", "{0}"): ("white_r0_12_c0_12_floor_line",),
    ("yellow_12_12_floor_line", "{0}"): ("yellow_r0_12_c0_12_floor_line",),
    ("white_12_yellow_12_floor_line", "{0}"):
    ("white_r0_f12_yellow_c0_12_floor_line",),
    ("white_12_25_floor_line", "{0}"): ("white_r0_12_c0_25_floor_line",),
    ("yellow_12_25_floor_line", "{0}"): ("yellow_r0_12_c0_25_floor_line",),
    ("white_12_yellow_25_floor_line", "{0}"):
    ("white_r0_f12_yellow_c0_25_floor_line",),
    ("yellow_12_white_25_floor_line", "{0}"):
    ("yellow_r0_f12_white_c0_25_floor_line",),
    ("white_25_25_floor_line", "{0}"): ("white_r0_25_c0_25_floor_line",),
    ("yellow_25_25_floor_line", "{0}"): ("yellow_r0_25_c0_25_floor_line",),
    ("white_25_yellow_25_floor_line", "{0}"):
    ("white_r0_f25_yellow_c0_25_floor_line",)
}

RECIPES_TO_ITEMS: Dict[str, Iterable[str]] = {
    "circle_backboard": ("iron_plate",),
    "iron_plate_from_iron_ingot_stonecutting": ("minecraft:iron_ingot",),
    "iron_plate": ("minecraft:iron_block",),
    "lift_speedlimit_high": ("circle_backboard",),
    "speedlimit_high": ("circle_backboard",),
    "speedlimit_low": ("circle_backboard",),
    "no_stopping_base": ("circle_backboard",),
    "highway_km": ("minecraft:lime_concrete",),
    "barricade_1m_edge_1m_height":
    ("minecraft:orange_concrete", "minecraft:white_concrete"),
    "barricade_50cm_edge_1m_height":
    ("minecraft:orange_concrete", "minecraft:white_concrete"),
    "barricade_50cm_edge_75cm_height":
    ("minecraft:orange_concrete", "minecraft:white_concrete"),
    "full_square_backboard": ("iron_plate",),
    "white_12_12_floor_line": ("white_floor_line_eighth",),
    "yellow_12_12_floor_line": ("yellow_floor_line_eighth",),
    "white_12_yellow_12_floor_line":
    ("white_floor_line_eighth", "yellow_floor_line_eighth"),
    "white_12_25_floor_line": ("white_floor_line_eighth",),
    "yellow_12_25_floor_line": ("yellow_floor_line_eighth",),
    "white_12_yellow_25_floor_line":
    ("white_floor_line_eighth", "yellow_floor_line_eighth"),
    "yellow_12_white_25_floor_line":
    ("white_floor_line_eighth", "yellow_floor_line_eighth"),
    "white_25_25_floor_line": ("white_floor_line_eighth",),
    "yellow_25_25_floor_line": ("yellow_floor_line_eighth",),
    "white_25_yellow_25_floor_line":
    ("white_floor_line_eighth", "yellow_floor_line_eighth")
}


for color in COLORS:
    concrete: str = f"minecraft:{color}_concrete"
    RECIPES_TO_ITEMS.update({
        f"{color}_{style}{i}_tp": (concrete,)
        for style in ("dotted", "lined") for i in range(4, 11)
    })
    RECIPES_TO_ITEMS[f"{color}_full1_cylindrical_rod"] = (concrete,)
    RECIPES_TO_ITEMS[f"{color}_half1_cylindrical_rod"] = \
    (f"{color}_full1_cylindrical_rod",)
    RECIPES_TO_ITEMS[f"{color}_rod_with_lamp"] = \
    ("minecraft:redstone_lamp", concrete)
for lc in ("white", "yellow"):
    RECIPES_TO_ITEMS.update({
        f"{lc}_floor_line_eighth": (f"{lc}_thin_45_floor_line",),
        f"{lc}_floor_line_eighth_from_{lc}_thin_22d5_floor_line_stonecutting":
        (f"{lc}_thin_22d5_floor_line",),
        f"{lc}_floor_line_eighth_from_{lc}_thin_45_floor_line_stonecutting":
        (f"{lc}_thin_45_floor_line",),
        f"{lc}_floor_line_eighth_from_{lc}_concrete_stonecutting":
        (f"minecraft:{lc}_concrete",),
        f"{lc}_thin_22d5_floor_line": (f"{lc}_thin_45_floor_line",),
        f"{lc}_thin_22d5_floor_line_from_{lc}_thin_45_floor_line_stonecutting":
        (f"{lc}_thin_45_floor_line",),
        f"{lc}_thin_22d5_floor_line_from_{lc}_concrete_stonecutting":
        (f"minecraft:{lc}_concrete",),
        f"{lc}_thin_45_floor_line_from_{lc}_concrete_stonecutting":
        (f"minecraft:{lc}_concrete",)
    })

RECIPES_TO_ITEMS \
.update({f"highway_{i}hm": ("minecraft:lime_concrete",) for i in range(1, 10)})
RECIPES_TO_ITEMS.update({
    f"highway_{i}hm_swap": ("minecraft:lime_concrete",) for i in range(1, 10)
})


def make_advancement(recipe_id: str, item_ids: Iterable[str]) -> Any:
    criteria: Dict[str, Any] = {}
    requirements: List[str] = ["has_the_recipe"]
    for item_id in item_ids:
        item_short: str = item_id.split(":")[-1]
        criteria[f"has_{item_short}"] = {
            "conditions": CompactDict({"items": [{"items": item_id}]}),
            "trigger": "minecraft:inventory_changed"
        }
        requirements.append(f"has_{item_short}")
    criteria["has_the_recipe"] = {
        "conditions":
        CompactDict({"recipes": f"cntrafficsymbols_0d0:{recipe_id}"}),
        "trigger": "minecraft:recipe_unlocked"
    }
    return {
        "parent": "minecraft:recipes/root",
        "criteria": criteria,
        "requirements": [requirements],
        "rewards":
        CompactDict({"recipes": [f"cntrafficsymbols_0d0:{recipe_id}"]}),
        "sends_telemetry_event": False
    }


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = create_parser("Generate all recipe advancements")
    parser.add_argument("--tags-dir", required=True, type=str,
                        help="Directory containing tags")
    args: Namespace = parser.parse_args(argv)
    ensure_output_dir(args.dir, args.dry_run)

    r2i: Dict[str, Iterable[str]] = RECIPES_TO_ITEMS.copy()
    for tag, req in TAGS.items():
        fmt: str = tag[1]
        for item in resolve_tag_items(args.tags_dir, tag[0]):
            r2i[fmt.format(item)] = req

    for recipe_id, item_ids in r2i.items():
        to_write = make_advancement(recipe_id, (
            item_id if ":" in item_id else "cntrafficsymbols_0d0:"+item_id
            for item_id in item_ids
        ))
        write_json_idempotent(args.dir, f"{recipe_id}.json", to_write,
                              args.dry_run, compact=True)


if __name__ == "__main__":
    main()
