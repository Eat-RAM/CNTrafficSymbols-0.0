EX=b"""{
  "type": "minecraft:crafting_shaped",
  "category": "misc",
  "key": {
    "L": {"item": "minecraft:redstone_lamp"},
    "C": {"item": "minecraft:%s_concrete"}
  },
  "pattern": [
    "L",
    "C",
    "C"
  ],
  "result": {
    "item": "cntrafficsymbols_0d0:%s_rod_with_lamp",
    "count": 8
  },
  "show_notification": true
}
""".replace(b"\n",b"\r\n")
COLORS=("white","orange","magenta","light_blue","yellow","lime","pink","gray",
        "light_gray","cyan","purple","blue","brown","green","red","black")
for i in COLORS:
 D=i.encode()
 with open(f"{i}_rod_with_lamp.json","wb")as f:f.write(EX%(D,D))
