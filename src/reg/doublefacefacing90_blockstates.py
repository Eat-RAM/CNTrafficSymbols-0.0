EX=b"""{
  "variants": {
    "facing=south": {"model": "regedt32:block/cntrafficsymbols/%s_standing"},
    "facing=west": {
      "model": "regedt32:block/cntrafficsymbols/%s_standing",
      "y": 90
    },
    "facing=north": {
      "model": "regedt32:block/cntrafficsymbols/%s_standing",
      "y": 180
    },
    "facing=east": {
      "model": "regedt32:block/cntrafficsymbols/%s_standing",
      "y": 270
    },
    "facing=north_south": {"model": "regedt32:block/cntrafficsymbols/%s_double"},
    "facing=east_west": {
      "model": "regedt32:block/cntrafficsymbols/%s_double",
      "y": 90
    },
    "facing=wall_north": {
      "model": "regedt32:block/cntrafficsymbols/%s_wall",
      "y": 180
    },
    "facing=wall_east": {
      "model": "regedt32:block/cntrafficsymbols/%s_wall",
      "y": 270
    },
    "facing=wall_south": {"model": "regedt32:block/cntrafficsymbols/%s_wall"},
    "facing=wall_west": {
      "model": "regedt32:block/cntrafficsymbols/%s_wall",
      "y": 90
    }
  }
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
highway_exit_distance_info_left_single
highway_exit_distance_info_middle_single
highway_exit_distance_info_right_single
highway_exit_distance_info_left_top
highway_exit_distance_info_middle_top
highway_exit_distance_info_right_top
highway_exit_distance_info_left_middle
highway_exit_distance_info_middle_middle
highway_exit_distance_info_right_middle
highway_exit_distance_info_left_bottom
highway_exit_distance_info_middle_bottom
highway_exit_distance_info_right_bottom""".split(b"\n")
for i in BLOCKS:
 with open(f"{i.decode()}.json","wb")as f:f.write(EX%((i,)*10))
