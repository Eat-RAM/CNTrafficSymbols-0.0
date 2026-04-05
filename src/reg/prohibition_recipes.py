EX=b"""{
  "type": "minecraft:stonecutting",
  "count": 1,
  "ingredient": {
    "tag": "cntrafficsymbols_0d0:red_circle_black_text"
  },
  "result": "cntrafficsymbols_0d0:%s"
}
""".replace(b"\n",b"\r\n")
for i in b"prohibition no_u_turn no_left_turn no_right_turn \
no_parking".split():
 with open(f"{i.decode()}.json","wb")as f:f.write(EX%i)
