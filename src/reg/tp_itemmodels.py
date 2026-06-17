EX=b"""{
  "model": {
    "type": "minecraft:model",
    "model": "cntrafficsymbols_0d0:block/%s_%s_bottom"
  }
}
""".replace(b"\n",b"\r\n")
COLORS=("white","orange","magenta","light_blue","yellow","lime","pink","gray",
        "light_gray","cyan","purple","blue","brown","green","red","black")
STYLES=(b"dotted4_tp",b"dotted5_tp",b"dotted6_tp",b"dotted7_tp",b"dotted8_tp",
        b"dotted9_tp",b"dotted10_tp",b"lined4_tp_x",b"lined5_tp_x",
        b"lined6_tp_x",b"lined7_tp_x",b"lined8_tp_x",b"lined9_tp_x",
        b"lined10_tp_x")
for i in COLORS:
 for j in STYLES:
  with open(f"{i}_{j.decode().rstrip('_x')}.json","wb")as f:
   f.write(EX%(i.encode(),j))
