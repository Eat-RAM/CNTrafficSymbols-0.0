EX=b"""{
  "type": "minecraft:stonecutting",
  "ingredient": "#cntrafficsymbols_0d0:yellow_wideboard",
  "result": {
    "id": "cntrafficsymbols_0d0:%s"
  }
}
""".replace(b"\n",b"\r\n")
for i in b"""\
keep_space_variant1_upperleft
keep_space_variant1_upper
keep_space_variant1_upperright
keep_space_variant1_left
keep_space_variant1_center
keep_space_variant1_right
keep_space_variant1_lowerleft
keep_space_variant1_lower
keep_space_variant1_lowerright
keep_space_variant2_upperleft
keep_space_variant2_upper
keep_space_variant2_upperright
keep_space_variant2_left
keep_space_variant2_center
keep_space_variant2_right
keep_space_variant2_lowerleft
keep_space_variant2_lower
keep_space_variant2_lowerright""".split():
 with open(f"{i.decode()}_swap.json","wb")as f:f.write(EX%i)
