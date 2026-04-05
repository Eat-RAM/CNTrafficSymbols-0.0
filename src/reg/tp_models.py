EX=b"""{
  "parent": "cntrafficsymbols_0d0:block/%s",
  "textures": {"this": "minecraft:block/%s_concrete"}
}
"""
COLORS=("white","orange","magenta","light_blue","yellow","lime","pink","gray",
        "light_gray","cyan","purple","blue","brown","green","red","black")
STYLES=(b"dotted4_tp_bottom",b"dotted4_tp_up",b"dotted5_tp_bottom",
        b"dotted5_tp_up",b"dotted6_tp_bottom",b"dotted6_tp_up",
        b"dotted7_tp_bottom",b"dotted7_tp_up",b"dotted8_tp_bottom",
        b"dotted8_tp_up",b"dotted9_tp_bottom",b"dotted9_tp_up",
        b"dotted10_tp_bottom",b"dotted10_tp_up",b"lined4_tp_x_bottom",
        b"lined4_tp_x_up",b"lined5_tp_x_bottom",b"lined5_tp_x_up",
        b"lined6_tp_x_bottom",b"lined6_tp_x_up",b"lined7_tp_x_bottom",
        b"lined7_tp_x_up",b"lined8_tp_x_bottom",b"lined8_tp_x_up",
        b"lined9_tp_x_bottom",b"lined9_tp_x_up",b"lined10_tp_x_bottom",
        b"lined10_tp_x_up")
for i in COLORS:
 for j in STYLES:
  with open(f"{i}_{j.decode()}.json","wb")as f:f.write(EX%(j,i.encode()))
