EX=b"""\
{
  "parent": "cntrafficsymbols_0d0:block/%s_cylindrical_rod_%s",
  "textures": {"side": "cntrafficsymbols_0d0:block/%s_%s_cylindrical_rod"}
}
""".replace(b"\n",b"\r\n")
COLORS=("white","orange","magenta","light_blue","yellow","lime","pink","gray",
        "light_gray","cyan","purple","blue","brown","green","red","black")
V=(("half1","down_center"),("half1","down_south"),("half1","down_southeast"),
   ("half1","down_east"),("half1","down_northeast"),("half1","down_north"),
   ("half1","down_northwest"),("half1","down_west"),("half1","down_southwest"),
   ("half1","up_center"),("half1","up_south"),("half1","up_southeast"),
   ("half1","up_east"),("half1","up_northeast"),("half1","up_north"),
   ("half1","up_northwest"),("half1","up_west"),("half1","up_southwest"),
   ("half1","north_center"),("half1","north_upper"),
   ("half1","north_uppereast"),("half1","north_east"),
   ("half1","north_lowereast"),("half1","north_lower"),
   ("half1","north_lowerwest"),("half1","north_west"),
   ("half1","north_upperwest"),("full1","y_center"),("full1","y_south"),
   ("full1","y_southeast"),("full1","y_east"),("full1","y_northeast"),
   ("full1","y_north"),("full1","y_northwest"),("full1","y_west"),
   ("full1","y_southwest"),("full1","z_center"),("full1","z_upper"),
   ("full1","z_uppereast"),("full1","z_east"),("full1","z_lowereast"),
   ("full1","z_lower"),("full1","z_lowerwest"),("full1","z_west"),
   ("full1","z_upperwest"))
for i in COLORS:
 for j in V:
  with open(f"{i}_{j[0]}_cylindrical_rod_{j[1]}.json","wb")as f:
   f.write(EX%(j[0].encode(),j[1].encode(),i.encode(),j[0].encode()))
