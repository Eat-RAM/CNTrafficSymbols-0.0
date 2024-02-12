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
distance_detection_200m_right""".split(b"\n")
for i in BLOCKS:
 with open(f"{i.decode()}.json","wb")as f:f.write(EX%((i,)*4))
