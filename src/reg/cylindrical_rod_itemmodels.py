EX=b"""\
{
  "model": {
    "type": "minecraft:model",
    "model": "cntrafficsymbols_0d0:block/%s_%s_cylindrical_rod_%s"
  }
}
""".replace(b"\n",b"\r\n")
COLORS=("white","orange","magenta","light_blue","yellow","lime","pink","gray",
        "light_gray","cyan","purple","blue","brown","green","red","black")
FL={"half1":b"down_center","full1":b"y_center"}
for i in COLORS:
 for k,v in FL.items():
  with open(f"{i}_{k}_cylindrical_rod.json","wb")as f:
   f.write(EX%(i.encode(),k.encode(),v))
