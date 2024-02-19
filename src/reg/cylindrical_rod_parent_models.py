from typing import Dict, Tuple
EX_DOWN=b"""\
{
  "parent": "minecraft:block/block",
  "textures": {"particle": "#side"},
  "elements": [
    {
      "from": [%d, 0, %d],
      "to": [%d, 8, %d],
      "faces": {
        "north": {"uv": [1, 0, 3, 8], "texture": "#side"},
        "west": {"uv": [0, 0, 1, 8], "texture": "#side"},
        "east": {"uv": [3, 0, 4, 8], "texture": "#side"}
      }
    },
    {
      "from": [%d, 0, %d],
      "to": [%d, 8, %d],
      "faces": {
        "south": {"uv": [1, 0, 3, 8], "texture": "#side"},
        "west": {"uv": [3, 0, 4, 8], "texture": "#side"},
        "east": {"uv": [0, 0, 1, 8], "texture": "#side"}
      }
    },
    {
      "from": [%d, 0, %d],
      "to": [%d, 8, %d],
      "faces": {
        "west": {"uv": [1, 0, 3, 8], "texture": "#side"},
        "north": {"uv": [3, 0, 4, 8], "texture": "#side"},
        "south": {"uv": [0, 0, 1, 8], "texture": "#side"}
      }
    },
    {
      "from": [%d, 0, %d],
      "to": [%d, 8, %d],
      "faces": {
        "east": {"uv": [1, 0, 3, 8], "texture": "#side"},
        "north": {"uv": [0, 0, 1, 8], "texture": "#side"},
        "south": {"uv": [3, 0, 4, 8], "texture": "#side"}
      }
    },
    {
      "from": [%d, 0, %d],
      "to": [%d, 8, %d],
      "faces": {
        "down": {"uv": [4, 0, 8, 4], "texture": "#side", "cullface": "down"},
        "up": {"uv": [4, 0, 8, 4], "texture": "#side"}
      }
    }
  ]
}
""".replace(b"\n",b"\r\n")
EX_UP=b"""\
{
  "parent": "minecraft:block/block",
  "textures": {"particle": "#side"},
  "elements": [
    {
      "from": [%d, 8, %d],
      "to": [%d, 16, %d],
      "faces": {
        "north": {"uv": [1, 0, 3, 8], "texture": "#side"},
        "west": {"uv": [0, 0, 1, 8], "texture": "#side"},
        "east": {"uv": [3, 0, 4, 8], "texture": "#side"}
      }
    },
    {
      "from": [%d, 8, %d],
      "to": [%d, 16, %d],
      "faces": {
        "south": {"uv": [1, 0, 3, 8], "texture": "#side"},
        "west": {"uv": [3, 0, 4, 8], "texture": "#side"},
        "east": {"uv": [0, 0, 1, 8], "texture": "#side"}
      }
    },
    {
      "from": [%d, 8, %d],
      "to": [%d, 16, %d],
      "faces": {
        "west": {"uv": [1, 0, 3, 8], "texture": "#side"},
        "north": {"uv": [3, 0, 4, 8], "texture": "#side"},
        "south": {"uv": [0, 0, 1, 8], "texture": "#side"}
      }
    },
    {
      "from": [%d, 8, %d],
      "to": [%d, 16, %d],
      "faces": {
        "east": {"uv": [1, 0, 3, 8], "texture": "#side"},
        "north": {"uv": [0, 0, 1, 8], "texture": "#side"},
        "south": {"uv": [3, 0, 4, 8], "texture": "#side"}
      }
    },
    {
      "from": [%d, 8, %d],
      "to": [%d, 16, %d],
      "faces": {
        "down": {"uv": [4, 0, 8, 4], "texture": "#side", "cullface": "up"},
        "up": {"uv": [4, 0, 8, 4], "texture": "#side"}
      }
    }
  ]
}
""".replace(b"\n",b"\r\n")
EX_NORTH=b"""\
{
  "parent": "minecraft:block/block",
  "textures": {"particle": "#side"},
  "elements": [
    {
      "from": [%d, %d, 0],
      "to": [%d, %d, 8],
      "faces": {
        "down": {"uv": [1, 0, 3, 8], "texture": "#side"},
        "west": {"uv": [0, 15, 8, 16], "texture": "#side"},
        "east": {"uv": [0, 15, 8, 16], "texture": "#side"}
      }
    },
    {
      "from": [%d, %d, 0],
      "to": [%d, %d, 8],
      "faces": {
        "up": {"uv": [1, 0, 3, 8], "texture": "#side"},
        "west": {"uv": [0, 12, 8, 13], "texture": "#side"},
        "east": {"uv": [0, 12, 8, 13], "texture": "#side"}
      }
    },
    {
      "from": [%d, %d, 0],
      "to": [%d, %d, 8],
      "faces": {
        "west": {"uv": [0, 13, 8, 15], "texture": "#side"},
        "down": {"uv": [0, 0, 1, 8], "texture": "#side"},
        "up": {"uv": [0, 0, 1, 8], "texture": "#side"}
      }
    },
    {
      "from": [%d, %d, 0],
      "to": [%d, %d, 8],
      "faces": {
        "east": {"uv": [0, 13, 8, 15], "texture": "#side"},
        "down": {"uv": [3, 0, 4, 8], "texture": "#side"},
        "up": {"uv": [3, 0, 4, 8], "texture": "#side"}
      }
    },
    {
      "from": [%d, %d, 0],
      "to": [%d, %d, 8],
      "faces": {
        "north": {"uv": [4, 0, 8, 4], "texture": "#side", "cullface": "north"},
        "south": {"uv": [4, 0, 8, 4], "texture": "#side"}
      }
    }
  ]
}
""".replace(b"\n",b"\r\n")
EX_Y=b"""\
{
  "parent": "minecraft:block/block",
  "textures": {"particle": "#side"},
  "elements": [
    {
      "from": [%d, 0, %d],
      "to": [%d, 16, %d],
      "faces": {
        "north": {"uv": [1, 0, 3, 16], "texture": "#side"},
        "west": {"uv": [0, 0, 1, 16], "texture": "#side"},
        "east": {"uv": [3, 0, 4, 16], "texture": "#side"}
      }
    },
    {
      "from": [%d, 0, %d],
      "to": [%d, 16, %d],
      "faces": {
        "south": {"uv": [1, 0, 3, 16], "texture": "#side"},
        "west": {"uv": [3, 0, 4, 16], "texture": "#side"},
        "east": {"uv": [0, 0, 1, 16], "texture": "#side"}
      }
    },
    {
      "from": [%d, 0, %d],
      "to": [%d, 16, %d],
      "faces": {
        "west": {"uv": [1, 0, 3, 16], "texture": "#side"},
        "north": {"uv": [3, 0, 4, 16], "texture": "#side"},
        "south": {"uv": [0, 0, 1, 16], "texture": "#side"}
      }
    },
    {
      "from": [%d, 0, %d],
      "to": [%d, 16, %d],
      "faces": {
        "east": {"uv": [1, 0, 3, 16], "texture": "#side"},
        "north": {"uv": [0, 0, 1, 16], "texture": "#side"},
        "south": {"uv": [3, 0, 4, 16], "texture": "#side"}
      }
    },
    {
      "from": [%d, 0, %d],
      "to": [%d, 16, %d],
      "faces": {
        "down": {"uv": [4, 0, 8, 4], "texture": "#side", "cullface": "down"},
        "up": {"uv": [4, 0, 8, 4], "texture": "#side", "cullface": "up"}
      }
    }
  ]
}
""".replace(b"\n",b"\r\n")
EX_Z=b"""\
{
  "parent": "minecraft:block/block",
  "textures": {"particle": "#side"},
  "elements": [
    {
      "from": [%d, %d, 0],
      "to": [%d, %d, 16],
      "faces": {
        "down": {"uv": [1, 0, 3, 16], "texture": "#side"},
        "west": {"uv": [0, 15, 16, 16], "texture": "#side"},
        "east": {"uv": [0, 15, 16, 16], "texture": "#side"}
      }
    },
    {
      "from": [%d, %d, 0],
      "to": [%d, %d, 16],
      "faces": {
        "up": {"uv": [1, 0, 3, 16], "texture": "#side"},
        "west": {"uv": [0, 12, 16, 13], "texture": "#side"},
        "east": {"uv": [0, 12, 16, 13], "texture": "#side"}
      }
    },
    {
      "from": [%d, %d, 0],
      "to": [%d, %d, 16],
      "faces": {
        "west": {"uv": [0, 13, 16, 15], "texture": "#side"},
        "down": {"uv": [0, 0, 1, 16], "texture": "#side"},
        "up": {"uv": [0, 0, 1, 16], "texture": "#side"}
      }
    },
    {
      "from": [%d, %d, 0],
      "to": [%d, %d, 16],
      "faces": {
        "east": {"uv": [0, 13, 16, 15], "texture": "#side"},
        "down": {"uv": [3, 0, 4, 16], "texture": "#side"},
        "up": {"uv": [3, 0, 4, 16], "texture": "#side"}
      }
    },
    {
      "from": [%d, %d, 0],
      "to": [%d, %d, 16],
      "faces": {
        "north": {"uv": [4, 0, 8, 4], "texture": "#side", "cullface": "north"},
        "south": {"uv": [4, 0, 8, 4], "texture": "#side"}
      }
    }
  ]
}
""".replace(b"\n",b"\r\n")
OFFSETS:Dict[Tuple[int,int],Tuple[str,str]]={
 (0,0):("center","center"),
 (0,6):("south","upper"),
 (6,6):("southeast","uppereast"),
 (6,0):("east","east"),
 (6,-6):("northeast","lowereast"),
 (0,-6):("north","lower"),
 (-6,-6):("northwest","lowerwest"),
 (-6,0):("west","west"),
 (-6,6):("southwest","upperwest")
}
def translate(v:int,*a:int)->Tuple[int,...]:return tuple(x-v for x in a)
for k,v in OFFSETS.items():
 with open(f"half1_cylindrical_rod_down_{v[0]}.json","wb")as f:
  f.write(EX_DOWN%(7+k[0],6+k[1],9+k[0],7+k[1],7+k[0],9+k[1],9+k[0],10+k[1],
                   6+k[0],7+k[1],7+k[0],9+k[1],9+k[0],7+k[1],10+k[0],9+k[1],
                   6+k[0],6+k[1],10+k[0],10+k[1]))
 with open(f"half1_cylindrical_rod_up_{v[0]}.json","wb")as f:
  f.write(EX_UP%(7+k[0],6+k[1],9+k[0],7+k[1],7+k[0],9+k[1],9+k[0],10+k[1],
                 6+k[0],7+k[1],7+k[0],9+k[1],9+k[0],7+k[1],10+k[0],9+k[1],
                 6+k[0],6+k[1],10+k[0],10+k[1]))
 with open(f"full1_cylindrical_rod_y_{v[0]}.json","wb")as f:
  f.write(EX_Y%(7+k[0],6+k[1],9+k[0],7+k[1],7+k[0],9+k[1],9+k[0],10+k[1],
                6+k[0],7+k[1],7+k[0],9+k[1],9+k[0],7+k[1],10+k[0],9+k[1],
                6+k[0],6+k[1],10+k[0],10+k[1]))
 with open(f"half1_cylindrical_rod_north_{v[1]}.json","wb")as f:
  f.write(EX_NORTH%(7+k[0],6+k[1],9+k[0],7+k[1],7+k[0],9+k[1],9+k[0],10+k[1],
                    6+k[0],7+k[1],7+k[0],9+k[1],9+k[0],7+k[1],10+k[0],9+k[1],
                    6+k[0],6+k[1],10+k[0],10+k[1]))
 with open(f"full1_cylindrical_rod_z_{v[1]}.json","wb")as f:
  f.write(EX_Z%(7+k[0],6+k[1],9+k[0],7+k[1],7+k[0],9+k[1],9+k[0],10+k[1],
                6+k[0],7+k[1],7+k[0],9+k[1],9+k[0],7+k[1],10+k[0],9+k[1],
                6+k[0],6+k[1],10+k[0],10+k[1]))
