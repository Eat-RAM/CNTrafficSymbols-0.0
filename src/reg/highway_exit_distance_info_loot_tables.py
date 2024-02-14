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
                  "block": "regedt32:cntrafficsymbols/highway_exit_distance_info_%s",
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
                  "block": "regedt32:cntrafficsymbols/highway_exit_distance_info_%s",
                  "condition": "minecraft:block_state_property",
                  "properties": {"facing": "east_west"}
                }
              ],
              "count": 2.0,
              "function": "minecraft:set_count"
            },
            {
              "function": "minecraft:explosion_decay"
            },
            {
              "function": "minecraft:copy_name",
              "source": "block_entity"
            }
          ],
          "name": "regedt32:cntrafficsymbols/highway_exit_distance_info_%s"
        }
      ],
      "rolls": 1.0
    }
  ],
  "random_sequence": "regedt32:cntrafficsymbols/highway_exit_distance_info_%s"
}
"""
for i in (b"left_single",b"middle_single",b"right_single",b"left_top",
          b"middle_top",b"right_top",b"left_middle",b"middle_middle",
          b"right_middle",b"left_bottom",b"middle_bottom",b"right_bottom"):
 with open(f"highway_exit_distance_info_{i.decode()}.json","wb")as f:
  f.write(EX%((i,)*4))
