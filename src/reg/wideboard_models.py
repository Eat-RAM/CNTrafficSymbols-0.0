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
distance_detection_200m_right""".split(b"\n")
for i in BLOCKS:
 for j in b"standing wall".split():
  with open(f"{i.decode()}_{j.decode()}.json","wb")as f:f.write(EX1%(j,i))
 with open(f"{i.decode()}_double.json","wb")as f:f.write(EX2%i)
