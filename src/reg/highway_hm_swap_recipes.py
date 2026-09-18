EX=b"""{
  "type": "minecraft:stonecutting",
  "ingredient": "#cntrafficsymbols_0d0:highway_hm",
  "result": {
    "id": "cntrafficsymbols_0d0:highway_%dhm"
  }
}
""".replace(b"\n",b"\r\n")
for i in range(1,10):
 with open(f"highway_{i}hm_swap.json","wb")as f:f.write(EX%i)
