import glob
import os
from argparse import ArgumentParser, Namespace
from typing import List, Optional
from PIL import Image

from .reg_utils import create_parser


def main(argv: Optional[List[str]] = None) -> None:
    parser: ArgumentParser = create_parser(
        "Generate lift_speedlimit_high textures from speedlimit_high "
        "and lift_speedlimit_high_special"
    )
    args: Namespace = parser.parse_args(argv)

    tex_dir: str = args.dir
    sp_path: str = os.path.join(tex_dir, "heightlimit_special_legacy.png")
    sp_img: Image.Image = Image.open(sp_path).convert("RGBA")
    w: int
    h: int
    w, h = sp_img.size

    pattern: str = os.path.join(tex_dir, "heightlimit_*.png")
    high_files: List[str] = sorted(glob.glob(pattern))

    count: int = 0
    for hf in high_files:
        base: str = os.path.basename(hf)
        val: str = base.replace("heightlimit_", "").replace(".png", "")
        if "special" in val:
            continue

        h_img: Image.Image = Image.open(hf).convert("RGBA")
        out: Image.Image = Image.open(os.path.join(tex_dir, "heightlimit_special.png"))
        out.convert("RGBA")

        for y in range(h):
            for x in range(w):
                c_s = sp_img.getpixel((x, y))
                c_h = h_img.getpixel((x, y))
                if c_h == (0, 0, 0, 255) and c_s == (255, 255, 255, 255):
                    out.putpixel((x, y), (0, 0, 0, 255))

        target: str = os.path.join(tex_dir, f"heightlimit_{val}.png")
        if not args.dry_run:
            out.save(target)
        count += 1

    print(f"Processed {count} heightlimit textures.")


if __name__ == "__main__":
    main()
