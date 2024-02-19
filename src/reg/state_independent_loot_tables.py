EX=b"""{
  "type": "minecraft:block",
  "pools": [
    {
      "bonus_rolls": 0.0,
      "entries": [
        {
          "type": "minecraft:item",
          "functions": [{"function": "minecraft:explosion_decay"}],
          "name": "regedt32:cntrafficsymbols/%s"
        }
      ],
      "rolls": 1.0
    }
  ],
  "random_sequence": "regedt32:cntrafficsymbols/%s"
}
"""
BLOCKS=b"""\
white_half1_cylindrical_rod
orange_half1_cylindrical_rod
magenta_half1_cylindrical_rod
light_blue_half1_cylindrical_rod
yellow_half1_cylindrical_rod
lime_half1_cylindrical_rod
pink_half1_cylindrical_rod
gray_half1_cylindrical_rod
light_gray_half1_cylindrical_rod
cyan_half1_cylindrical_rod
purple_half1_cylindrical_rod
blue_half1_cylindrical_rod
brown_half1_cylindrical_rod
green_half1_cylindrical_rod
red_half1_cylindrical_rod
black_half1_cylindrical_rod
white_full1_cylindrical_rod
orange_full1_cylindrical_rod
magenta_full1_cylindrical_rod
light_blue_full1_cylindrical_rod
yellow_full1_cylindrical_rod
lime_full1_cylindrical_rod
pink_full1_cylindrical_rod
gray_full1_cylindrical_rod
light_gray_full1_cylindrical_rod
cyan_full1_cylindrical_rod
purple_full1_cylindrical_rod
blue_full1_cylindrical_rod
brown_full1_cylindrical_rod
green_full1_cylindrical_rod
red_full1_cylindrical_rod
black_full1_cylindrical_rod""".split(b"\n")
for i in BLOCKS:
 with open(f"{i.decode()}.json","wb")as f:f.write(EX%(i,i))
