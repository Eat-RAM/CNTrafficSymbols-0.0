EX=b"""{
  "type": "minecraft:block",
  "pools": [
    {
      "bonus_rolls": 0.0,
      "entries": [
        {
          "type": "minecraft:item",
          "functions": [
            {
              "function": "minecraft:explosion_decay"
            },
            {
              "function": "minecraft:copy_name",
              "source": "block_entity"
            }
          ],
          "name": "cntrafficsymbols_0d0:%s"
        }
      ],
      "rolls": 1.0
    }
  ],
  "random_sequence": "cntrafficsymbols_0d0:%s"
}
""".replace(b"\n",b"\r\n")
BLOCKS=b"""\
white_rod_with_lamp
orange_rod_with_lamp
magenta_rod_with_lamp
light_blue_rod_with_lamp
yellow_rod_with_lamp
lime_rod_with_lamp
pink_rod_with_lamp
gray_rod_with_lamp
light_gray_rod_with_lamp
cyan_rod_with_lamp
purple_rod_with_lamp
blue_rod_with_lamp
brown_rod_with_lamp
green_rod_with_lamp
red_rod_with_lamp
black_rod_with_lamp""".split(b"\n")
for i in BLOCKS:
 with open(f"{i.decode()}.json","wb")as f:f.write(EX%(i,i))
