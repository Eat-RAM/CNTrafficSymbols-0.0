EX=b"""{
  "variants": {
    "facing=south": {"model": "regedt32:block/cntrafficsymbols/%s_rotation0"},
    "facing=ssw": {"model": "regedt32:block/cntrafficsymbols/%s_rotation1"},
    "facing=southwest": {"model": "regedt32:block/cntrafficsymbols/%s_rotation2"},
    "facing=wsw": {
      "model": "regedt32:block/cntrafficsymbols/%s_rotation15",
      "y": 90
    },
    "facing=west": {
      "model": "regedt32:block/cntrafficsymbols/%s_rotation0",
      "y": 90
    },
    "facing=wnw": {
      "model": "regedt32:block/cntrafficsymbols/%s_rotation1",
      "y": 90
    },
    "facing=northwest": {
      "model": "regedt32:block/cntrafficsymbols/%s_rotation2",
      "y": 90
    },
    "facing=nnw": {
      "model": "regedt32:block/cntrafficsymbols/%s_rotation15",
      "y": 180
    },
    "facing=north": {
      "model": "regedt32:block/cntrafficsymbols/%s_rotation0",
      "y": 180
    },
    "facing=nne": {
      "model": "regedt32:block/cntrafficsymbols/%s_rotation1",
      "y": 180
    },
    "facing=northeast": {
      "model": "regedt32:block/cntrafficsymbols/%s_rotation2",
      "y": 180
    },
    "facing=ene": {
      "model": "regedt32:block/cntrafficsymbols/%s_rotation15",
      "y": 270
    },
    "facing=east": {
      "model": "regedt32:block/cntrafficsymbols/%s_rotation0",
      "y": 270
    },
    "facing=ese": {
      "model": "regedt32:block/cntrafficsymbols/%s_rotation1",
      "y": 270
    },
    "facing=southeast": {
      "model": "regedt32:block/cntrafficsymbols/%s_rotation2",
      "y": 270
    },
    "facing=sse": {"model": "regedt32:block/cntrafficsymbols/%s_rotation15"},
    "facing=north_south": {"model": "regedt32:block/cntrafficsymbols/%s_rotation16"},
    "facing=nne_ssw": {"model": "regedt32:block/cntrafficsymbols/%s_rotation17"},
    "facing=northeast_southwest": {"model": "regedt32:block/cntrafficsymbols/%s_rotation18"},
    "facing=ene_wsw": {
      "model": "regedt32:block/cntrafficsymbols/%s_rotation23",
      "y": 90
    },
    "facing=east_west": {
      "model": "regedt32:block/cntrafficsymbols/%s_rotation16",
      "y": 90
    },
    "facing=ese_wnw": {
      "model": "regedt32:block/cntrafficsymbols/%s_rotation17",
      "y": 90
    },
    "facing=northwest_southeast": {
      "model": "regedt32:block/cntrafficsymbols/%s_rotation18",
      "y": 90
    },
    "facing=sse_nnw": {"model": "regedt32:block/cntrafficsymbols/%s_rotation23"}
  }
}
""".replace(b"\n",b"\r\n")
BLOCKS=b"""\
speedlimit_high_100
speedlimit_high_105
speedlimit_high_10
speedlimit_high_110
speedlimit_high_115
speedlimit_high_120
speedlimit_high_125
speedlimit_high_130
speedlimit_high_135
speedlimit_high_140
speedlimit_high_145
speedlimit_high_150
speedlimit_high_15
speedlimit_high_20
speedlimit_high_25
speedlimit_high_30
speedlimit_high_35
speedlimit_high_3
speedlimit_high_40
speedlimit_high_45
speedlimit_high_50
speedlimit_high_55
speedlimit_high_5
speedlimit_high_60
speedlimit_high_65
speedlimit_high_70
speedlimit_high_75
speedlimit_high_80
speedlimit_high_85
speedlimit_high_90
speedlimit_high_95
speedlimit_high_special
speedlimit_low_100
speedlimit_low_105
speedlimit_low_10
speedlimit_low_110
speedlimit_low_115
speedlimit_low_120
speedlimit_low_125
speedlimit_low_130
speedlimit_low_135
speedlimit_low_140
speedlimit_low_145
speedlimit_low_150
speedlimit_low_15
speedlimit_low_20
speedlimit_low_25
speedlimit_low_30
speedlimit_low_35
speedlimit_low_3
speedlimit_low_40
speedlimit_low_45
speedlimit_low_50
speedlimit_low_55
speedlimit_low_5
speedlimit_low_60
speedlimit_low_65
speedlimit_low_70
speedlimit_low_75
speedlimit_low_80
speedlimit_low_85
speedlimit_low_90
speedlimit_low_95
speedlimit_low_special
lift_speedlimit_high_100
lift_speedlimit_high_105
lift_speedlimit_high_10
lift_speedlimit_high_110
lift_speedlimit_high_115
lift_speedlimit_high_120
lift_speedlimit_high_125
lift_speedlimit_high_130
lift_speedlimit_high_135
lift_speedlimit_high_140
lift_speedlimit_high_145
lift_speedlimit_high_150
lift_speedlimit_high_15
lift_speedlimit_high_20
lift_speedlimit_high_25
lift_speedlimit_high_30
lift_speedlimit_high_35
lift_speedlimit_high_3
lift_speedlimit_high_40
lift_speedlimit_high_45
lift_speedlimit_high_50
lift_speedlimit_high_55
lift_speedlimit_high_5
lift_speedlimit_high_60
lift_speedlimit_high_65
lift_speedlimit_high_70
lift_speedlimit_high_75
lift_speedlimit_high_80
lift_speedlimit_high_85
lift_speedlimit_high_90
lift_speedlimit_high_95
lift_speedlimit_high_special
circle_backboard""".split(b"\n")
for i in BLOCKS:
 with open(f"{i.decode()}.json","wb")as f:f.write(EX%((i,)*24))
