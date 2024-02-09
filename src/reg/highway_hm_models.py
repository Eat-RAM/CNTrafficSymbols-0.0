EX1=b"""{
  "parent": "regedt32:block/cntrafficsymbols/highway_hm_rotation%s",
  "textures": {
    "front": "regedt32:block/cntrafficsymbols/highway_%dhm",
    "back": "regedt32:block/cntrafficsymbols/highway_hm_backboard",
    "side": "regedt32:block/cntrafficsymbols/highway_hm_backboard"
  }
}
""".replace(b"\n",b"\r\n")
EX2=b"""{
  "parent": "regedt32:block/cntrafficsymbols/highway_hm_rotation%s",
  "textures": {
    "front": "regedt32:block/cntrafficsymbols/highway_%dhm",
    "side": "regedt32:block/cntrafficsymbols/highway_hm_backboard"
  }
}
""".replace(b"\n",b"\r\n")
for i in range(1,10):
 for j in b"0 0_down 0_up 1 1_down 1_up 2 2_down 2_up 15 15_down 15_up \
26 26_down 26_up".split():
  with open(f"highway_{i}hm_rotation{j.decode()}.json","wb")as f:
   f.write(EX1%(j,i))
 for j in b"16 16_down 16_up 17 17_down 17_up 18 18_down 18_up \
23 23_down 23_up".split():
  with open(f"highway_{i}hm_rotation{j.decode()}.json","wb")as f:
   f.write(EX2%(j,i))
