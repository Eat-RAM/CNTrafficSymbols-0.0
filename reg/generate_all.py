import sys

from argparse import ArgumentParser, Namespace
from io import TextIOWrapper
from os import path
from typing import Any, Callable, List, Optional, Tuple

from . import (
    circle_models,
    circle_parent_models,
    cylindrical_rod_item_models,
    cylindrical_rod_models,
    cylindrical_rod_parent_models,
    derived_langs,
    double90_loot_tables,
    double_loot_tables,
    doublefacefacing90_blockstates,
    floor_line_cross_blockstates,
    floor_line_cross_models,
    floor_line_eighths,
    full1_cylindrical_rod_blockstates,
    full1_cylindrical_rod_recipes,
    generated_item_models,
    half1_cylindrical_rod_blockstates,
    half1_cylindrical_rod_recipes,
    highway_exit_distance_info_loot_tables,
    highway_hm_loot_tables,
    highway_hm_models,
    highway_hm_recipes,
    highway_km_models,
    recipe_advancements,
    reg_utils,
    rod_with_lamp_blockstates,
    rod_with_lamp_models,
    rod_with_lamp_recipes,
    rotation_blockstates,
    state_independent_loot_tables,
    tag_swap_recipes,
    thin_22d5_floor_blockstates,
    thin_22d5_floor_line_item_models,
    thin_22d5_floor_line_models,
    thin_22d5_floor_line_parent_models,
    thin_45_floor_blockstates,
    thin_45_floor_line_item_models,
    thin_45_floor_line_models,
    thin_45_floor_line_parent_models,
    tp_blockstates,
    tp_item_models,
    tp_models,
    tp_parent_models,
    tp_recipes,
    wideboard_models,
    wideboard_recipes
)


class StderrCounter:
    """Wrap stderr to detect whether any file changes were reported."""

    target: Any
    has_output: bool

    __slots__ = ["target", "has_output"]

    def __init__(self, target: Any) -> None:
        self.target = target
        self.has_output = False

    def write(self, s: str) -> int:
        if s.strip(" \t\r\n\u00a0"):
            self.has_output = True
        return self.target.write(s)

    def flush(self) -> None:
        self.target.flush()


def main(argv: Optional[List[str]] = None) -> None:
    # Protect against Windows cp936 / ANSI encoding crashes on stderr
    if isinstance(sys.stderr, TextIOWrapper) and \
       sys.stderr.encoding.lower() not in ("utf-8", "utf8"):
        try:
            sys.stderr.reconfigure(encoding="utf-8")
        except AttributeError:
            pass

    parser: ArgumentParser = \
    ArgumentParser(description="Generate all mod assets in process")
    parser.add_argument(
        "resources_dir", nargs="?", default="src/main/resources",
        help="Root path to resources directory (default: src/main/resources)"
    )
    parser.add_argument(
        "--dry-run", action="store_true",
        help="Don't write files. Fail with code 1 if any file is outdated."
    )
    args: Namespace = parser.parse_args(argv)

    res: str = path.abspath(args.resources_dir)
    b_models: str = \
    path.join(res, "assets", "cntrafficsymbols_0d0", "models", "block")
    i_models: str = \
    path.join(res, "assets", "cntrafficsymbols_0d0", "models", "item")
    bst: str = \
    path.join(res, "assets", "cntrafficsymbols_0d0", "blockstates")
    loot: str = \
    path.join(res, "data", "cntrafficsymbols_0d0", "loot_tables", "blocks")
    recipes: str = path.join(res, "data", "cntrafficsymbols_0d0", "recipes")
    adv: str = path.join(
        res, "data", "cntrafficsymbols_0d0", "advancements", "recipes", "misc"
    )
    tag_b: str = path.join(res, "data", "cntrafficsymbols_0d0","tags","blocks")
    tag_i: str = path.join(res, "data", "cntrafficsymbols_0d0","tags", "items")
    lang_dir: str = path.join(res, "assets", "cntrafficsymbols_0d0", "lang")

    dry_arg: List[str] = ["--dry-run"] if args.dry_run else []

    tasks: Tuple[Tuple[Callable[[Optional[List[str]]], None], List[str]], ...]\
    = (
        # Recipes (7)
        (full1_cylindrical_rod_recipes.main, [recipes] + dry_arg),
        (half1_cylindrical_rod_recipes.main, [recipes] + dry_arg),
        (highway_hm_recipes.main, [recipes] + dry_arg),
        (rod_with_lamp_recipes.main, [recipes] + dry_arg),
        (tag_swap_recipes.main, [recipes, "--tags-dir", tag_i] + dry_arg),
        (tp_recipes.main, [recipes] + dry_arg),
        (wideboard_recipes.main, [recipes, "--tags-dir", tag_i] + dry_arg),
        # Advancements (1)
        (recipe_advancements.main, [adv, "--tags-dir", tag_i] + dry_arg),
        # Blockstates (9)
        (doublefacefacing90_blockstates.main,
         [bst, "--tags-dir", tag_b] + dry_arg),
        (floor_line_cross_blockstates.main, [bst] + dry_arg),
        (full1_cylindrical_rod_blockstates.main, [bst] + dry_arg),
        (half1_cylindrical_rod_blockstates.main, [bst] + dry_arg),
        (rod_with_lamp_blockstates.main, [bst] + dry_arg),
        (rotation_blockstates.main, [bst, "--tags-dir", tag_b] + dry_arg),
        (thin_22d5_floor_blockstates.main, [bst] + dry_arg),
        (thin_45_floor_blockstates.main, [bst] + dry_arg),
        (tp_blockstates.main, [bst] + dry_arg),
        # Loot tables (5)
        (double_loot_tables.main, [loot, "--tags-dir", tag_b] + dry_arg),
        (double90_loot_tables.main, [loot, "--tags-dir", tag_b] + dry_arg),
        (highway_exit_distance_info_loot_tables.main, [loot] + dry_arg),
        (highway_hm_loot_tables.main, [loot] + dry_arg),
        (state_independent_loot_tables.main,
         [loot, "--tags-dir", tag_b] + dry_arg),
        # Item models (5)
        (cylindrical_rod_item_models.main, [i_models] + dry_arg),
        (generated_item_models.main, [i_models, "--tags-dir", tag_i]+dry_arg),
        (thin_22d5_floor_line_item_models.main, [i_models] + dry_arg),
        (thin_45_floor_line_item_models.main, [i_models] + dry_arg),
        (tp_item_models.main, [i_models] + dry_arg),
        # Block models (15)
        (circle_models.main, [b_models, "--tags-dir", tag_b] + dry_arg),
        (circle_parent_models.main, [b_models] + dry_arg),
        (cylindrical_rod_models.main, [b_models] + dry_arg),
        (cylindrical_rod_parent_models.main, [b_models] + dry_arg),
        (floor_line_cross_models.main, [b_models] + dry_arg),
        (floor_line_eighths.main,
         [b_models, "--blockstates-dir", bst] + dry_arg),
        (highway_hm_models.main, [b_models] + dry_arg),
        (highway_km_models.main, [b_models] + dry_arg),
        (rod_with_lamp_models.main, [b_models] + dry_arg),
        (thin_22d5_floor_line_models.main, [b_models] + dry_arg),
        (thin_22d5_floor_line_parent_models.main, [b_models] + dry_arg),
        (thin_45_floor_line_models.main, [b_models] + dry_arg),
        (thin_45_floor_line_parent_models.main, [b_models] + dry_arg),
        (tp_models.main, [b_models] + dry_arg),
        (tp_parent_models.main, [b_models] + dry_arg),
        (wideboard_models.main, [b_models, "--tags-dir", tag_b] + dry_arg),
        # Languages (1)
        (derived_langs.main, [lang_dir] + dry_arg),
    )

    counter: StderrCounter = StderrCounter(sys.stderr)
    old_stderr: Any = sys.stderr
    sys.stderr = counter
    reg_utils.stderr = counter

    try:
        for run_fn, run_args in tasks:
            run_fn(run_args)
    finally:
        sys.stderr = old_stderr
        reg_utils.stderr = old_stderr

    if args.dry_run and counter.has_output:
        sys.stderr.write(
            "\n[ERROR] Generated resources are OUTDATED!\n"
            "Please run: python -m reg.generate_all src/main/resources\n"
        )
        sys.exit(1)


if __name__ == "__main__":
    main()
