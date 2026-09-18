EX=b"""{
  "type": "minecraft:stonecutting",
  "ingredient": "minecraft:%s_concrete",
  "result": {
    "id": "cntrafficsymbols_0d0:%s_full1_cylindrical_rod",
    "count": 12
  }
}
""".replace(b"\n",b"\r\n")
COLORS=("white","orange","magenta","light_blue","yellow","lime","pink","gray",
        "light_gray","cyan","purple","blue","brown","green","red","black")
for i in COLORS:
 D=i.encode()
 with open(f"{i}_full1_cylindrical_rod.json","wb")as f:f.write(EX%(D,D))
