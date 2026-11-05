from argparse import ArgumentParser, Namespace
from io import TextIOWrapper
from os import path
import sys
from typing import Any, Callable, List, Optional, Tuple

from . import (
    circle_models,
    cylindrical_rod_item_models,
    cylindrical_rod_models,
    double90_loot_tables,
    double_loot_tables,
    doublefacefacing90_blockstates,
    floor_line_eighths,
    full1_cylindrical_rod_blockstates,
    full1_cylindrical_rod_recipes,
    generated_item_models,
    green_wideboard_recipes,
    half1_cylindrical_rod_blockstates,
    half1_cylindrical_rod_recipes,
    heightlimit_recipes,
    highway_exit_distance_info_loot_tables,
    highway_hm_loot_tables,
    highway_hm_models,
    highway_hm_recipes,
    lift_speedlimit_high_recipes,
    prohibition_recipes,
    recipe_advancements,
    reg_utils,
    rod_with_lamp_blockstates,
    rod_with_lamp_models,
    rod_with_lamp_recipes,
    rotation_blockstates,
    speedlimit_high_recipes,
    speedlimit_low_recipes,
    state_independent_loot_tables,
    state_independent_with_customname_loot_tables,
    tp_blockstates,
    tp_item_models,
    tp_models,
    tp_parent_models,
    tp_recipes,
    wideboard_models,
    yellow_wideboard_recipes
)


class StderrCounter:
    """Wrap stderr to detect whether any file changes were reported."""

    def __init__(self, target: Any) -> None:
        self.target: Any = target
        self.has_output: bool = False

    def write(self, s: str) -> int:
        if s.strip():
            self.has_output = True
        return self.target.write(s)

    def flush(self) -> None:
        self.target.flush()


def main(argv: Optional[List[str]] = None) -> None:
    # Protect against Windows cp936 / ANSI encoding crashes on stderr
    if (
        isinstance(sys.stderr, TextIOWrapper) and
        sys.stderr.encoding != "utf-8"
    ):
        try:
            sys.stderr.reconfigure(encoding="utf-8")
        except AttributeError:
            pass

    parser: ArgumentParser = ArgumentParser(
        description="Generate all mod assets in process"
    )
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
    b_models: str = path.join(
        res, "assets", "cntrafficsymbols_0d0", "models", "block"
    )
    i_models: str = path.join(
        res, "assets", "cntrafficsymbols_0d0", "models", "item"
    )
    blockstates: str = path.join(
        res, "assets", "cntrafficsymbols_0d0", "blockstates"
    )
    loot: str = path.join(
        res, "data", "cntrafficsymbols_0d0", "loot_tables", "blocks"
    )
    recipes: str = path.join(
        res, "data", "cntrafficsymbols_0d0", "recipes"
    )
    adv: str = path.join(
        res, "data", "cntrafficsymbols_0d0", "advancements", "recipes", "misc"
    )

    dry_arg: List[str] = ["--dry-run"] if args.dry_run else []

    tasks: List[Tuple[Callable[[Optional[List[str]]], None], List[str]]] = [
        # Recipes (12)
        (full1_cylindrical_rod_recipes.main, [recipes] + dry_arg),
        (half1_cylindrical_rod_recipes.main, [recipes] + dry_arg),
        (green_wideboard_recipes.main, [recipes] + dry_arg),
        (yellow_wideboard_recipes.main, [recipes] + dry_arg),
        (heightlimit_recipes.main, [recipes] + dry_arg),
        (highway_hm_recipes.main, [recipes] + dry_arg),
        (lift_speedlimit_high_recipes.main, [recipes] + dry_arg),
        (prohibition_recipes.main, [recipes] + dry_arg),
        (rod_with_lamp_recipes.main, [recipes] + dry_arg),
        (speedlimit_high_recipes.main, [recipes] + dry_arg),
        (speedlimit_low_recipes.main, [recipes] + dry_arg),
        (tp_recipes.main, [recipes] + dry_arg),
        # Advancements (1)
        (recipe_advancements.main, [adv] + dry_arg),
        # Blockstates (6)
        (tp_blockstates.main, [blockstates] + dry_arg),
        (doublefacefacing90_blockstates.main, [blockstates] + dry_arg),
        (full1_cylindrical_rod_blockstates.main, [blockstates] + dry_arg),
        (half1_cylindrical_rod_blockstates.main, [blockstates] + dry_arg),
        (rod_with_lamp_blockstates.main, [blockstates] + dry_arg),
        (rotation_blockstates.main, [blockstates] + dry_arg),
        # Loot tables (6)
        (double_loot_tables.main, [loot] + dry_arg),
        (double90_loot_tables.main, [loot] + dry_arg),
        (highway_exit_distance_info_loot_tables.main, [loot] + dry_arg),
        (highway_hm_loot_tables.main, [loot] + dry_arg),
        (state_independent_loot_tables.main, [loot] + dry_arg),
        (
            state_independent_with_customname_loot_tables.main,
            [loot] + dry_arg
        ),
        # Item models (3)
        (cylindrical_rod_item_models.main, [i_models] + dry_arg),
        (generated_item_models.main, [i_models] + dry_arg),
        (tp_item_models.main, [i_models] + dry_arg),
        # Block models (8)
        (circle_models.main, [b_models] + dry_arg),
        (cylindrical_rod_models.main, [b_models] + dry_arg),
        (highway_hm_models.main, [b_models] + dry_arg),
        (rod_with_lamp_models.main, [b_models] + dry_arg),
        (tp_models.main, [b_models] + dry_arg),
        (tp_parent_models.main, [b_models] + dry_arg),
        (wideboard_models.main, [b_models] + dry_arg),
        (
            floor_line_eighths.main,
            [b_models, "--blockstates-dir", blockstates] + dry_arg
        )
    ]

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
            "\n[ERROR] Generated assets are OUTDATED!\n"
            "Please run: python -m src.reg.generate_all src/main/resources\n"
        )
        sys.exit(1)


if __name__ == "__main__":
    main()
