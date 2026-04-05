EX1=b"""{
  "variants": {
    "bottom=true": {"model": "cntrafficsymbols_0d0:block/%s_%s_bottom"},
    "bottom=false": {"model": "cntrafficsymbols_0d0:block/%s_%s_up"}
  }
}
""".replace(b"\n",b"\r\n")
EX2=b"""{
  "variants": {
    "axis=x,bottom=true": {"model": "cntrafficsymbols_0d0:block/%s_%s_x_bottom"},
    "axis=x,bottom=false": {"model": "cntrafficsymbols_0d0:block/%s_%s_x_up"},
    "axis=z,bottom=true": {
      "model": "cntrafficsymbols_0d0:block/%s_%s_x_bottom",
      "y": 90,
      "uvlock": true
    },
    "axis=z,bottom=false": {
      "model": "cntrafficsymbols_0d0:block/%s_%s_x_up",
      "y": 90,
      "uvlock": true
    }
  }
}
""".replace(b"\n",b"\r\n")
COLORS=("white","orange","magenta","light_blue","yellow","lime","pink","gray",
        "light_gray","cyan","purple","blue","brown","green","red","black")
STYLES1=(b"dotted4_tp",b"dotted5_tp",b"dotted6_tp",b"dotted7_tp",b"dotted8_tp",
         b"dotted9_tp",b"dotted10_tp")
STYLES2=(b"lined4_tp",b"lined5_tp",b"lined6_tp",b"lined7_tp",b"lined8_tp",
         b"lined9_tp",b"lined10_tp")
for i in COLORS:
 for j in STYLES1:
  with open(f"{i}_{j.decode().rstrip('_x')}.json","wb")as f:
   f.write(EX1%((i.encode(),j)*2))
 for j in STYLES2:
  with open(f"{i}_{j.decode().rstrip('_x')}.json","wb")as f:
   f.write(EX2%((i.encode(),j)*4))
