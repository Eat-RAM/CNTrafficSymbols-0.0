EX1=b"""{
  "parent": "regedt32:block/cntrafficsymbols/wideboard_%s",
  "textures": {
    "front": "regedt32:block/cntrafficsymbols/%s",
    "back": "regedt32:block/cntrafficsymbols/full_square_backboard",
    "side": "regedt32:block/cntrafficsymbols/full_square_backboard"
  }
}
""".replace(b"\n",b"\r\n")
EX2=b"""{
  "parent": "regedt32:block/cntrafficsymbols/wideboard_double",
  "textures": {
    "front": "regedt32:block/cntrafficsymbols/%s",
    "side": "regedt32:block/cntrafficsymbols/full_square_backboard"
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
highway_exit_distance_info_right_bottom
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
 for j in b"standing wall".split():
  with open(f"{i.decode()}_{j.decode()}.json","wb")as f:f.write(EX1%(j,i))
 with open(f"{i.decode()}_double.json","wb")as f:f.write(EX2%i)
