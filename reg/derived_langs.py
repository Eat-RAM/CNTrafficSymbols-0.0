import json
import os
import re
import shutil
import subprocess

from argparse import ArgumentParser, Namespace
from os import path
from typing import Callable, Dict, List, Optional, Pattern, Tuple, Union

from .reg_utils import create_parser, ensure_output_dir, write_json_idempotent


ENGB_KEY_OVERRIDES: Dict[str, str] = {
    "gui.cntrafficsymbols_0d0.clocktime.0600": "06:00",
    "gui.cntrafficsymbols_0d0.clocktime_sunset": "18:00 (sunset)",
    "gui.cntrafficsymbols_0d0.tag_clocktime_01v": (
        "{0}: {1,number,00}:{2,number,00} ({3,number,0.0000})"
    ),
}


METER_PAT: Pattern[str] = re.compile(r"\b([A-Za-z\-]*?)meter(s?)\b", re.I)


def _repl_meter(m: re.Match[str]) -> str:
    prefix: str = m.group(1)
    plural: str = m.group(2)
    meter_part: str = m.group(0)[len(prefix):len(prefix) + 5]
    if meter_part.isupper():
        m_str: str = "METRE"
    elif meter_part[0].isupper():
        m_str: str = "Metre"
    else:
        m_str: str = "metre"
    return prefix + m_str + plural


CENTER_PAT: Pattern[str] = re.compile(r"\b([A-Za-z\-]*?)center(s?)\b", re.I)


def _repl_center(m: re.Match[str]) -> str:
    prefix: str = m.group(1)
    plural: str = m.group(2)
    c_part: str = m.group(0)[len(prefix):len(prefix)+6]
    c_str: str
    if c_part.isupper():
        c_str = "CENTRE"
    elif c_part[0].isupper():
        c_str = "Centre"
    else:
        c_str = "centre"
    return prefix + c_str + plural


COLOR_PAT: Pattern[str] = re.compile(r"\b([A-Za-z\-]*?)color(s?)\b", re.I)


def _repl_color(m: re.Match[str]) -> str:
    prefix: str = m.group(1)
    plural: str = m.group(2)
    c_part: str = m.group(0)[len(prefix):len(prefix)+5]
    if c_part.isupper():
        c_str: str = "COLOUR"
    elif c_part[0].isupper():
        c_str: str = "Colour"
    else:
        c_str: str = "colour"
    return prefix + c_str + plural


ENUS_TO_ENGB_PATS: Tuple[
    Tuple[Pattern[str], Union[str, Callable[[re.Match[str]], str]]], ...
] = (
    (METER_PAT, _repl_meter),
    (CENTER_PAT, _repl_center),
    (COLOR_PAT, _repl_color)
)


def transform_enus_to_engb(enus_data: Dict[str, str]) -> Dict[str, str]:
    """Derive en_GB translations from en_US with British spelling and 24h."""

    en_gb: Dict[str, str] = {}
    for k, v in enus_data.items():
        if k in ENGB_KEY_OVERRIDES:
            en_gb[k] = ENGB_KEY_OVERRIDES[k]
        else:
            val: str = v
            val = re.sub(r"\b(?<!<)Gray(?!>)\b", "Grey", val)
            val = re.sub(r"\b(?<!<)gray(?!>)\b", "grey", val)
            for pat, repl_func in ENUS_TO_ENGB_PATS:
                val = pat.sub(repl_func, val)
            en_gb[k] = val
    return en_gb


def get_s2hk_converter() -> Callable[[str], str]:
    """Get OpenCC s2hk converter via python package or system binary."""

    try:
        import opencc
        cc = opencc.OpenCC("s2hk.json")
        return cc.convert
    except ImportError:
        if shutil.which("opencc"):
            def convert_cli(text: str) -> str:
                res = subprocess.run(
                    ["opencc", "-c", "s2hk.json"],
                    input=text, capture_output=True, text=True, check=True
                )
                return res.stdout
            return convert_cli
        raise RuntimeError(
            "opencc is required to generate zh_hk.json. Please install " +
            ("opencc from PyPI" if os.name == "nt"
             else "python-opencc or /usr/bin/opencc") + "."
        )


ZHCN_TO_ZHHK_PATS: Tuple[
    Tuple[Pattern[str], Union[str, Callable[[re.Match[str]], str]]], ...
] = (
    (re.compile("青色"), "青藍色"), # Cyan
    (re.compile("淡蓝色"), "淺藍色"), # Light Blue
    (re.compile("淡灰色"), "淺灰色"), # Light Gray
    (re.compile("品红色"), "紫紅色") # Magenta
)


def transform_zhcn_to_zhhk(
    zhcn_data: Dict[str, str],
    converter: Callable[[str], str]
) -> Dict[str, str]:
    """Derive zh_HK translations from zh_CN via OpenCC s2hk conversion."""

    zh_hk: Dict[str, str] = {}
    for k, v in zhcn_data.items():
        val: str = v
        for pat, repl_func in ZHCN_TO_ZHHK_PATS:
            val = pat.sub(repl_func, val)
        zh_hk[k] = converter(val)
    return zh_hk


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = \
    create_parser("Generate derived language files (en_gb.json, zh_hk.json)")
    parser.add_argument(
        "--src-dir", type=str, required=True,
        help="Path to source lang JSON files"
    )
    args: Namespace = parser.parse_args(argv)
    out_lang_dir: str = path.abspath(args.dir)
    src_lang_dir: str = path.abspath(args.src_dir)
    ensure_output_dir(out_lang_dir, args.dry_run)

    enus_path: str = path.join(src_lang_dir, "en_us.json")
    with open(enus_path, "r", encoding="utf-8") as f:
        en_us_data: Dict[str, str] = json.load(f)

    engb_data: Dict[str, str] = transform_enus_to_engb(en_us_data)
    write_json_idempotent(out_lang_dir, "en_gb.json", engb_data, args.dry_run)

    zhcn_path: str = path.join(src_lang_dir, "zh_cn.json")
    with open(zhcn_path, "r", encoding="utf-8") as f:
        zh_cn_data: Dict[str, str] = json.load(f)

    converter: Callable[[str], str] = get_s2hk_converter()
    zhhk_data: Dict[str, str] = transform_zhcn_to_zhhk(zh_cn_data, converter)
    write_json_idempotent(out_lang_dir, "zh_hk.json", zhhk_data, args.dry_run)


if __name__ == "__main__":
    main()
