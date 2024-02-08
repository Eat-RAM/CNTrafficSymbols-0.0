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
  "parent": "regedt32:block/cntrafficsymbols/highway_hm_rotation%d",
  "textures": {
    "front": "regedt32:block/cntrafficsymbols/highway_%dhm",
    "side": "regedt32:block/cntrafficsymbols/highway_hm_backboard"
  }
}
""".replace(b"\n",b"\r\n")
for i in range(1,10):
 for j in(b"0",b"1",b"2",b"15",b"26"):
  with open(f"highway_{i}hm_rotation{j.decode()}.json","wb")as f:f.write(EX1%(j,i))
 for j in(16,17,18,23):
  with open(f"highway_{i}hm_rotation{j}.json","wb")as f:f.write(EX2%(j,i))
