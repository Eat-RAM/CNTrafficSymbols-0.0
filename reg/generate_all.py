import sys

from argparse import ArgumentParser, Namespace
from io import TextIOWrapper
from os import path
from typing import Any, Callable, List, Optional, Tuple

from . import (
    circle_models,
    circle_parent_models,
    cylindrical_rod_itemmodels,
    cylindrical_rod_models,
    cylindrical_rod_parent_models,
    derived_langs,
    double90_loot_tables,
    double_loot_tables,
    doublefacefacing90_blockstates,
    dyed_ctags,
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
    model_itemmodels,
    recipe_advancements,
    reg_utils,
    rod_with_lamp_blockstates,
    rod_with_lamp_models,
    rod_with_lamp_recipes,
    rotation_blockstates,
    state_independent_loot_tables,
    tag_swap_recipes,
    thin_22d5_floor_blockstates,
    thin_22d5_floor_line_itemmodels,
    thin_22d5_floor_line_models,
    thin_22d5_floor_line_parent_models,
    thin_45_floor_blockstates,
    thin_45_floor_line_itemmodels,
    thin_45_floor_line_models,
    thin_45_floor_line_parent_models,
    tp_blockstates,
    tp_itemmodels,
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
    ArgumentParser(description="Generate all mod resources in process")
    parser.add_argument(
        "--src-dir", type=str, default="src/main/resources",
        help="Root path to source resources directory "
             "(default: src/main/resources)"
    )
    parser.add_argument(
        "--out-dir", type=str, default="src/generated/resources",
        help="Root path to output resources directory "
             "(default: src/generated/resources)"
    )
    parser.add_argument(
        "--dry-run", action="store_true",
        help="Don't write files. Fail with code 1 if any file is outdated."
    )
    args: Namespace = parser.parse_args(argv)

    src_res: str = path.abspath(args.src_dir)
    src_tex_b: str = \
    path.join(src_res, "assets", "cntrafficsymbols_0d0", "textures", "block")
    src_tag_b: str = \
    path.join(src_res, "data", "cntrafficsymbols_0d0", "tags", "block")
    src_tag_i: str = \
    path.join(src_res, "data", "cntrafficsymbols_0d0", "tags", "item")
    src_lang_dir: str = \
    path.join(src_res, "assets", "cntrafficsymbols_0d0", "lang")
    out_res: str = path.abspath(args.out_dir)
    out_b_models: str = \
    path.join(out_res, "assets", "cntrafficsymbols_0d0", "models", "block")
    out_i_models: str = \
    path.join(out_res, "assets", "cntrafficsymbols_0d0", "models", "item")
    out_items: str = \
    path.join(out_res, "assets", "cntrafficsymbols_0d0", "items")
    out_bst: str = \
    path.join(out_res, "assets", "cntrafficsymbols_0d0", "blockstates")
    out_loot: str = \
    path.join(out_res, "data", "cntrafficsymbols_0d0", "loot_table", "blocks")
    out_recipes: str = \
    path.join(out_res, "data", "cntrafficsymbols_0d0", "recipe")
    out_adv: str = path.join(
        out_res, "data", "cntrafficsymbols_0d0", "advancement", "recipes",
        "misc"
    )
    out_ctag_b: str = path.join(out_res, "data", "c", "tags", "block", "dyed")
    out_ctag_i: str = path.join(out_res, "data", "c", "tags", "item", "dyed")
    out_lang_dir: str = \
    path.join(out_res, "assets", "cntrafficsymbols_0d0", "lang")

    dry_arg: List[str] = ["--dry-run"] if args.dry_run else []

    tasks: Tuple[Tuple[Callable[[Optional[List[str]]], None], List[str]], ...]\
    = (
        # Recipes (7)
        (full1_cylindrical_rod_recipes.main, [out_recipes] + dry_arg),
        (half1_cylindrical_rod_recipes.main, [out_recipes] + dry_arg),
        (highway_hm_recipes.main, [out_recipes] + dry_arg),
        (rod_with_lamp_recipes.main, [out_recipes] + dry_arg),
        (tag_swap_recipes.main,
         [out_recipes, "--tags-dir", src_tag_i] + dry_arg),
        (tp_recipes.main, [out_recipes] + dry_arg),
        (wideboard_recipes.main,
         [out_recipes, "--tags-dir", src_tag_i] + dry_arg),
        # Advancements (1)
        (recipe_advancements.main, [out_adv, "--tags-dir", src_tag_i]+dry_arg),
        # Blockstates (9)
        (doublefacefacing90_blockstates.main,
         [out_bst, "--tags-dir", src_tag_b] + dry_arg),
        (floor_line_cross_blockstates.main, [out_bst] + dry_arg),
        (full1_cylindrical_rod_blockstates.main, [out_bst] + dry_arg),
        (half1_cylindrical_rod_blockstates.main, [out_bst] + dry_arg),
        (rod_with_lamp_blockstates.main, [out_bst] + dry_arg),
        (rotation_blockstates.main,
         [out_bst, "--tags-dir", src_tag_b] + dry_arg),
        (thin_22d5_floor_blockstates.main, [out_bst] + dry_arg),
        (thin_45_floor_blockstates.main, [out_bst] + dry_arg),
        (tp_blockstates.main, [out_bst] + dry_arg),
        # Loot tables (5)
        (double_loot_tables.main, [out_loot, "--tags-dir", src_tag_b]+dry_arg),
        (double90_loot_tables.main,
         [out_loot, "--tags-dir", src_tag_b] + dry_arg),
        (highway_exit_distance_info_loot_tables.main, [out_loot] + dry_arg),
        (highway_hm_loot_tables.main, [out_loot] + dry_arg),
        (state_independent_loot_tables.main,
         [out_loot, "--tags-dir", src_tag_b] + dry_arg),
        # Items (3)
        (cylindrical_rod_itemmodels.main, [out_items] + dry_arg),
        (model_itemmodels.main, [out_items, "--tags-dir", src_tag_i]+dry_arg),
        (tp_itemmodels.main, [out_items] + dry_arg),
        # Item models (3)
        (generated_item_models.main,
         [out_i_models, "--tags-dir", src_tag_i] + dry_arg),
        (thin_22d5_floor_line_itemmodels.main, [out_i_models] + dry_arg),
        (thin_45_floor_line_itemmodels.main, [out_i_models] + dry_arg),
        # Block models (15)
        (circle_models.main, [out_b_models, "--tags-dir", src_tag_b]+dry_arg),
        (circle_parent_models.main,
         [out_b_models, "--texture", src_tex_b] + dry_arg),
        (cylindrical_rod_models.main, [out_b_models] + dry_arg),
        (cylindrical_rod_parent_models.main, [out_b_models] + dry_arg),
        (floor_line_cross_models.main, [out_b_models] + dry_arg),
        (floor_line_eighths.main,
         [out_b_models, "--blockstates-dir", out_bst] + dry_arg),
        (highway_hm_models.main, [out_b_models] + dry_arg),
        (highway_km_models.main,
         [out_b_models, "--texture", src_tex_b] + dry_arg),
        (rod_with_lamp_models.main, [out_b_models] + dry_arg),
        (thin_22d5_floor_line_models.main, [out_b_models] + dry_arg),
        (thin_22d5_floor_line_parent_models.main, [out_b_models] + dry_arg),
        (thin_45_floor_line_models.main, [out_b_models] + dry_arg),
        (thin_45_floor_line_parent_models.main, [out_b_models] + dry_arg),
        (tp_models.main, [out_b_models] + dry_arg),
        (tp_parent_models.main, [out_b_models] + dry_arg),
        (wideboard_models.main,
         [out_b_models, "--tags-dir", src_tag_b] + dry_arg),
        # Tags (2)
        (dyed_ctags.main, [out_ctag_b] + dry_arg),
        (dyed_ctags.main, [out_ctag_i] + dry_arg),
        # Languages (1)
        (derived_langs.main,
         [out_lang_dir, "--src-dir", src_lang_dir] + dry_arg),
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
