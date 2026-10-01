import json
import sys
from os import makedirs, path
from typing import Tuple


COLORS: Tuple[str, ...] = (
    "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink",
    "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red",
    "black"
)

ALL_BLOCKS: Tuple[str, ...] = (
    "dotted4_tp",
    "dotted5_tp",
    "dotted6_tp",
    "dotted7_tp",
    "dotted8_tp",
    "dotted9_tp",
    "dotted10_tp",
    "lined4_tp",
    "lined5_tp",
    "lined6_tp",
    "lined7_tp",
    "lined8_tp",
    "lined9_tp",
    "lined10_tp",
    "half1_cylindrical_rod",
    "full1_cylindrical_rod",
    "rod_with_lamp"
)


makedirs(sys.argv[1], exist_ok=True)

for color in COLORS:
    to_write = {"replace": False, "values": [
        f"cntrafficsymbols_0d0:{color}_{block}" for block in ALL_BLOCKS
    ]}
    same: bool = False
    try:
        with open(path.join(sys.argv[1], color+".json"), "r") as f:
            original = json.load(f)
            same = original == to_write
    except (json.JSONDecodeError, FileNotFoundError):
        pass
    if not same:
        with open(path.join(sys.argv[1], color+".json"), "w") as f:
            json.dump(to_write, f, indent=2, sort_keys=True)
            sys.stderr.write(f"Wrote {color}.json\n")
