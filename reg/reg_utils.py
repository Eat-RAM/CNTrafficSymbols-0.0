import json

from argparse import ArgumentParser
from os import makedirs, path
from sys import stderr
from typing import Any, List, NoReturn, Tuple, Union


__all__: List[str] = [
    "COLORS", "CompactDict", "CompactList", "strict_json_equal",
    "create_parser", "dumps_compact", "ensure_output_dir",
    "write_json_idempotent"
]


COLORS: Tuple[str, ...] = (
    "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink",
    "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red",
    "black"
)


class CompactList(list):
    """List marked to be serialized as a single-line compact JSON array."""


class CompactDict(dict):
    """Dict marked to be serialized as a single-line compact JSON object."""


def strict_json_equal(a: Any, b: Any, compare_order: bool = True) -> bool:
    """Strictly compare two JSON-compatible objects,
    including int vs float vs bool."""

    if isinstance(a, dict):
        if not isinstance(b, dict) or len(a) != len(b):
            return False
        itlr = list if compare_order else set
        return itlr(a.keys()) == itlr(b.keys()) and \
               all(strict_json_equal(a[k], b[k], compare_order) for k in a)
    if isinstance(a, list):
        return isinstance(b, list) and len(a) == len(b) and all(
            strict_json_equal(x, y, compare_order) for x, y in zip(a, b)
        )
    return type(a) is type(b) and a == b


def create_parser(desc: str) -> ArgumentParser:
    """Create a standard argument parser for asset generation scripts."""

    parser: ArgumentParser = ArgumentParser(description=desc)
    parser.add_argument("dir", help="The directory to where JSON files lie")
    parser.add_argument("--dry-run", action="store_true",
                        help="Don't actually generate anything")
    return parser


def ensure_output_dir(target_dir: str, dry_run: bool) -> Union[None, NoReturn]:
    """Ensure target directory exists when not in dry-run mode."""

    if not dry_run:
        makedirs(target_dir, exist_ok=True)
    elif not path.isdir(target_dir):
        stderr.write("Target directory not exist, all'll be generated\n")
        exit(0)


def dumps_compact(obj: Any, indent: int = 2, level: int = 0) -> str:
    """Dump JSON with indented top-level structures but inline compact leaves.

    CompactList or CompactDict elements are rendered in a single line.
    """

    pad: str = " " * (indent * level)
    pad_next: str = " " * (indent * (level + 1))

    if isinstance(obj, (CompactList, CompactDict)):
        return json.dumps(obj)

    if isinstance(obj, list):
        if not obj:
            return "[]"
        items: List[str] = [
            f"{pad_next}{dumps_compact(x, indent, level+1)}" for x in obj
        ]
        return "[\n" + ",\n".join(items) + f"\n{pad}]"

    if isinstance(obj, dict):
        if not obj:
            return "{}"
        items: List[str] = [
            f"{pad_next}{json.dumps(k)}: {dumps_compact(v, indent, level+1)}"
            for k, v in obj.items()
        ]
        return "{\n" + ",\n".join(items) + f"\n{pad}}}"

    return json.dumps(obj)


def write_json_idempotent(
    target_dir: str,
    filename: str,
    to_write: Any,
    dry_run: bool,
    indent: int = 2,
    sort_keys: bool = False,
    compact: bool = False
) -> bool:
    """Compare with existing file and write only if content has changed.

    :param compact: Set to True if to_write contains CompactList or CompactDict
    :return: True if the file was written (or would be written in dry-run).
    """

    target_path: str = path.join(target_dir, filename)
    same: bool = False
    new_file: bool = False
    try:
        with open(target_path, "r", encoding="utf-8") as f:
            original = json.load(f)
            same = strict_json_equal(original, to_write)
    except FileNotFoundError:
        new_file = True
    except json.JSONDecodeError:
        pass
    log_string: str = f"Wrote {target_path}\n"
    if new_file:
        log_string = "[NEW] " + log_string

    if same:
        return False
    if dry_run:
        stderr.write(log_string)
    else:
        with open(target_path, "w", encoding="utf-8") as f:
            if compact:
                f.write(dumps_compact(to_write, indent=indent))
            else:
                json.dump(to_write, f, indent=indent, sort_keys=sort_keys,
                          ensure_ascii=False)
            stderr.write(log_string)
    return True
