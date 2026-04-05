EX=b"""{
  "type": "minecraft:stonecutting",
  "count": 1,
  "ingredient": {
    "tag": "cntrafficsymbols_0d0:blue_circle_white_text"
  },
  "result": "cntrafficsymbols_0d0:speedlimit_low_%s"
}
""".replace(b"\n",b"\r\n")
for i in b"3 5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100 105 110 115 120 125 130 135 140 145 150 special".split():
 with open(f"speedlimit_low_{i.decode()}.json","wb")as f:f.write(EX%i)
