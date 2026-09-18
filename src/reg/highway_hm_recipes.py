EX=b"""{
  "type": "minecraft:stonecutting",
  "ingredient": "minecraft:lime_concrete",
  "result": {
    "id": "cntrafficsymbols_0d0:highway_%dhm",
    "count": 32
  }
}
""".replace(b"\n",b"\r\n")
for i in range(1,10):
 with open(f"highway_{i}hm.json","wb")as f:f.write(EX%i)
