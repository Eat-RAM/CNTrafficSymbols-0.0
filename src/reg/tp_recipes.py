EX=b"""{
  "type": "minecraft:stonecutting",
  "ingredient": "minecraft:%s_concrete",
  "result": {
    "id": "cntrafficsymbols_0d0:%s_%s%d_tp",
    "count": 10
  }
}
""".replace(b"\n",b"\r\n")
COLORS=("white","orange","magenta","light_blue","yellow","lime","pink","gray",
        "light_gray","cyan","purple","blue","brown","green","red","black")
for i in COLORS:
 for j in range(4,11):
  D=i.encode()
  with open(f"{i}_dotted{j}_tp.json","wb")as f:f.write(EX%(D,D,b"dotted",j))
  with open(f"{i}_lined{j}_tp.json","wb")as f:f.write(EX%(D,D,b"lined",j))
