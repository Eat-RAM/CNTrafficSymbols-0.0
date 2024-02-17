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
              "add": false,
              "conditions": [
                {
                  "block": "regedt32:cntrafficsymbols/%s",
                  "condition": "minecraft:block_state_property",
                  "properties": {"facing": "north_south"}
                }
              ],
              "count": 2.0,
              "function": "minecraft:set_count"
            },
            {
              "add": false,
              "conditions": [
                {
                  "block": "regedt32:cntrafficsymbols/%s",
                  "condition": "minecraft:block_state_property",
                  "properties": {"facing": "east_west"}
                }
              ],
              "count": 2.0,
              "function": "minecraft:set_count"
            },
            {
              "function": "minecraft:explosion_decay"
            }
          ],
          "name": "regedt32:cntrafficsymbols/%s"
        }
      ],
      "rolls": 1.0
    }
  ],
  "random_sequence": "regedt32:cntrafficsymbols/%s"
}
""".replace(b"\n",b"\r\n")
BLOCKS=b"""\
distance_detection_0m_left
distance_detection_0m_right
distance_detection_50m_left
distance_detection_50m_right
distance_detection_100m_left
distance_detection_100m_right
distance_detection_200m_left
distance_detection_200m_right
keep_space_variant1_upperleft
keep_space_variant1_upper
keep_space_variant1_upperright
keep_space_variant1_left
keep_space_variant1_center
keep_space_variant1_right
keep_space_variant1_lowerleft
keep_space_variant1_lower
keep_space_variant1_lowerright
keep_space_variant2_upperleft
keep_space_variant2_upper
keep_space_variant2_upperright
keep_space_variant2_left
keep_space_variant2_center
keep_space_variant2_right
keep_space_variant2_lowerleft
keep_space_variant2_lower
keep_space_variant2_lowerright""".split(b"\n")
for i in BLOCKS:
 with open(f"{i.decode()}.json","wb")as f:f.write(EX%((i,)*4))
