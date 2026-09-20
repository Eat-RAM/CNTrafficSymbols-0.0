EX1=b"""{
  "type": "minecraft:stonecutting",
  "count": 32,
  "ingredient": {"item": "minecraft:lime_concrete"},
  "result": "cntrafficsymbols_0d0:highway_%dhm"
}
""".replace(b"\n",b"\r\n")
EX2=b"""{
  "type": "minecraft:stonecutting",
  "count": 1,
  "ingredient": {"tag": "cntrafficsymbols_0d0:highway_hm"},
  "result": "cntrafficsymbols_0d0:highway_%dhm"
}
""".replace(b"\n",b"\r\n")
for i in range(1,10):
 with open(f"highway_{i}hm.json","wb")as f:f.write(EX1%i)
 with open(f"highway_{i}hm_swap.json","wb")as f:f.write(EX2%i)
