EX=b"""\
{
  "parent": "cntrafficsymbols_0d0:block/rod_with_lamp_%s",
  "textures": {
    "side": "cntrafficsymbols_0d0:block/%s_half1_cylindrical_rod",
    "cover": "cntrafficsymbols_0d0:block/rod_with_lamp_cover_%s"
  }
}
""".replace(b"\n",b"\r\n")
COLORS=("white","orange","magenta","light_blue","yellow","lime","pink","gray",
        "light_gray","cyan","purple","blue","brown","green","red","black")
V=("down_center","down_south","down_southeast","down_east","down_northeast",
   "down_north","down_northwest","down_west","down_southwest","up_center",
   "up_south","up_southeast","up_east","up_northeast","up_north",
   "up_northwest","up_west","up_southwest","north_center","north_upper",
   "north_uppereast","north_east","north_lowereast","north_lower",
   "north_lowerwest","north_west","north_upperwest")
L=("unlit","white","lightyellow","yellow","orange")
for i in COLORS:
 for j in V:
  for k in L:
   with open(f"{i}_rod_with_lamp_{k}_{j}.json","wb")as f:
    f.write(EX%(j.encode(),i.encode(),k.encode()))
