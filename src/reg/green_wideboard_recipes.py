EX1=b"""{
  "type": "minecraft:stonecutting",
  "ingredient": "minecraft:lime_concrete",
  "result": {
    "id": "cntrafficsymbols_0d0:%s",
    "count": 8
  }
}
""".replace(b"\n",b"\r\n")
EX2=b"""{
  "type": "minecraft:stonecutting",
  "ingredient": "#cntrafficsymbols_0d0:green_wideboard",
  "result": {
    "id": "cntrafficsymbols_0d0:%s"
  }
}
""".replace(b"\n",b"\r\n")
for i in b"""\
distance_detection_0m_left
distance_detection_50m_left
distance_detection_100m_left
distance_detection_200m_left
distance_detection_0m_right
distance_detection_50m_right
distance_detection_100m_right
distance_detection_200m_right
highway_exit_distance_info_left_single
highway_exit_distance_info_left_top
highway_exit_distance_info_left_middle
highway_exit_distance_info_left_bottom
highway_exit_distance_info_middle_single
highway_exit_distance_info_middle_top
highway_exit_distance_info_middle_middle
highway_exit_distance_info_middle_bottom
highway_exit_distance_info_right_single
highway_exit_distance_info_right_top
highway_exit_distance_info_right_middle
highway_exit_distance_info_right_bottom""".split():
 with open(f"{i.decode()}.json","wb")as f:f.write(EX1%i)
 with open(f"{i.decode()}_swap.json","wb")as f:f.write(EX2%i)
