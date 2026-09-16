EX=b"""{
  "type": "minecraft:block",
  "pools": [
    {
      "entries": [
        {
          "type": "minecraft:item",
          "modifier": [
            {
              "type": "minecraft:set_count",
              "add": false,
              "condition": {
                "type": "minecraft:match_block",
                "blocks": "cntrafficsymbols_0d0:highway_exit_distance_info_%s",
                "state": {"facing": "north_south"}
              },
              "count": 2
            },
            {
              "type": "minecraft:set_count",
              "add": false,
              "condition": {
                "type": "minecraft:match_block",
                "blocks": "cntrafficsymbols_0d0:highway_exit_distance_info_%s",
                "state": {"facing": "east_west"}
              },
              "count": 2
            },
            {
              "type": "minecraft:explosion_decay"
            },
            {
              "type": "minecraft:copy_components",
              "include": [
                "minecraft:custom_name"
              ],
              "source": "block_entity"
            }
          ],
          "name": "cntrafficsymbols_0d0:highway_exit_distance_info_%s"
        }
      ],
      "rolls": 1
    }
  ],
  "random_sequence": "cntrafficsymbols_0d0:highway_exit_distance_info_%s"
}
"""
for i in (b"left_single",b"middle_single",b"right_single",b"left_top",
          b"middle_top",b"right_top",b"left_middle",b"middle_middle",
          b"right_middle",b"left_bottom",b"middle_bottom",b"right_bottom"):
 with open(f"highway_exit_distance_info_{i.decode()}.json","wb")as f:
  f.write(EX%((i,)*4))
