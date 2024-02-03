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
                  "properties": {"facing": "nne_ssw"}
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
                  "properties": {"facing": "northeast_southwest"}
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
                  "properties": {"facing": "ene_wsw"}
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
              "add": false,
              "conditions": [
                {
                  "block": "regedt32:cntrafficsymbols/%s",
                  "condition": "minecraft:block_state_property",
                  "properties": {"facing": "ese_wnw"}
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
                  "properties": {"facing": "northwest_southeast"}
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
                  "properties": {"facing": "sse_nnw"}
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
"""
BLOCKS=b"""\
speedlimit_high_100
speedlimit_high_105
speedlimit_high_10
speedlimit_high_110
speedlimit_high_115
speedlimit_high_120
speedlimit_high_125
speedlimit_high_130
speedlimit_high_135
speedlimit_high_140
speedlimit_high_145
speedlimit_high_150
speedlimit_high_15
speedlimit_high_20
speedlimit_high_25
speedlimit_high_30
speedlimit_high_35
speedlimit_high_3
speedlimit_high_40
speedlimit_high_45
speedlimit_high_50
speedlimit_high_55
speedlimit_high_5
speedlimit_high_60
speedlimit_high_65
speedlimit_high_70
speedlimit_high_75
speedlimit_high_80
speedlimit_high_85
speedlimit_high_90
speedlimit_high_95
speedlimit_high_special
speedlimit_low_100
speedlimit_low_105
speedlimit_low_10
speedlimit_low_110
speedlimit_low_115
speedlimit_low_120
speedlimit_low_125
speedlimit_low_130
speedlimit_low_135
speedlimit_low_140
speedlimit_low_145
speedlimit_low_150
speedlimit_low_15
speedlimit_low_20
speedlimit_low_25
speedlimit_low_30
speedlimit_low_35
speedlimit_low_3
speedlimit_low_40
speedlimit_low_45
speedlimit_low_50
speedlimit_low_55
speedlimit_low_5
speedlimit_low_60
speedlimit_low_65
speedlimit_low_70
speedlimit_low_75
speedlimit_low_80
speedlimit_low_85
speedlimit_low_90
speedlimit_low_95
speedlimit_low_special
lift_speedlimit_high_100
lift_speedlimit_high_105
lift_speedlimit_high_10
lift_speedlimit_high_110
lift_speedlimit_high_115
lift_speedlimit_high_120
lift_speedlimit_high_125
lift_speedlimit_high_130
lift_speedlimit_high_135
lift_speedlimit_high_140
lift_speedlimit_high_145
lift_speedlimit_high_150
lift_speedlimit_high_15
lift_speedlimit_high_20
lift_speedlimit_high_25
lift_speedlimit_high_30
lift_speedlimit_high_35
lift_speedlimit_high_3
lift_speedlimit_high_40
lift_speedlimit_high_45
lift_speedlimit_high_50
lift_speedlimit_high_55
lift_speedlimit_high_5
lift_speedlimit_high_60
lift_speedlimit_high_65
lift_speedlimit_high_70
lift_speedlimit_high_75
lift_speedlimit_high_80
lift_speedlimit_high_85
lift_speedlimit_high_90
lift_speedlimit_high_95
lift_speedlimit_high_special
circle_backboard""".split(b"\n")
for i in BLOCKS:
 with open(f"{i.decode()}.json","wb")as f:f.write(EX%((i,)*10))
