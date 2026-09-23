EX=b"""\
{
  "model": {
    "type": "minecraft:model",
    "model": "cntrafficsymbols_0d0:block/%s_rod_with_lamp_unlit_down_center"
  }
}
""".replace(b"\n",b"\r\n")
COLORS=("white","orange","magenta","light_blue","yellow","lime","pink","gray",
        "light_gray","cyan","purple","blue","brown","green","red","black")
for i in COLORS:
 with open(f"{i}_rod_with_lamp.json","wb")as f:f.write(EX%i.encode())
