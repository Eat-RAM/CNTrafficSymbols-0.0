EX=b"""{
  "type": "minecraft:stonecutting",
  "ingredient": "cntrafficsymbols_0d0:%s_full1_cylindrical_rod",
  "result": {
    "id": "cntrafficsymbols_0d0:%s_half1_cylindrical_rod",
    "count": 2
  }
}
""".replace(b"\n",b"\r\n")
COLORS=("white","orange","magenta","light_blue","yellow","lime","pink","gray",
        "light_gray","cyan","purple","blue","brown","green","red","black")
for i in COLORS:
 D=i.encode()
 with open(f"{i}_half1_cylindrical_rod.json","wb")as f:f.write(EX%(D,D))
