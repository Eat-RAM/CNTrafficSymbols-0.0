from typing import Dict, Tuple
EX_DOWN=b"""\
{
  "parent": "minecraft:block/block",
  "textures": {"particle": "#side"},
  "elements": [
    {
      "from": [%d, 0, %d],
      "to": [%d, 7, %d],
      "faces": {
        "north": {"uv": [1, 0, 3, 7], "texture": "#side"},
        "west": {"uv": [0, 0, 1, 7], "texture": "#side"},
        "east": {"uv": [3, 0, 4, 7], "texture": "#side"}
      }
    },
    {
      "from": [%d, 0, %d],
      "to": [%d, 7, %d],
      "faces": {
        "south": {"uv": [1, 0, 3, 7], "texture": "#side"},
        "west": {"uv": [3, 0, 4, 7], "texture": "#side"},
        "east": {"uv": [0, 0, 1, 7], "texture": "#side"}
      }
    },
    {
      "from": [%d, 0, %d],
      "to": [%d, 7, %d],
      "faces": {
        "west": {"uv": [1, 0, 3, 7], "texture": "#side"},
        "north": {"uv": [3, 0, 4, 7], "texture": "#side"},
        "south": {"uv": [0, 0, 1, 7], "texture": "#side"}
      }
    },
    {
      "from": [%d, 0, %d],
      "to": [%d, 7, %d],
      "faces": {
        "east": {"uv": [1, 0, 3, 7], "texture": "#side"},
        "north": {"uv": [0, 0, 1, 7], "texture": "#side"},
        "south": {"uv": [3, 0, 4, 7], "texture": "#side"}
      }
    },
    {
      "from": [%d, 4, %d],
      "to": [%d, 7, %d],
      "faces": {"south": {"uv": [1, 4, 3, 7], "texture": "#side"}}
    },
    {
      "from": [%d, 4, %d],
      "to": [%d, 7, %d],
      "faces": {"north": {"uv": [1, 4, 3, 7], "texture": "#side"}}
    },
    {
      "from": [%d, 4, %d],
      "to": [%d, 7, %d],
      "faces": {"east": {"uv": [1, 4, 3, 7], "texture": "#side"}}
    },
    {
      "from": [%d, 4, %d],
      "to": [%d, 7, %d],
      "faces": {"west": {"uv": [1, 4, 3, 7], "texture": "#side"}}
    },
    {
      "from": [%d, 0, %d],
      "to": [%d, 4, %d],
      "faces": {"up": {"uv": [5, 1, 7, 3], "texture": "#side"}}
    },
    {
      "from": [%d, 0, %d],
      "to": [%d, 7, %d],
      "faces": {"up": {"uv": [1, 7, 3, 8], "texture": "#side"}}
    },
    {
      "from": [%d, 0, %d],
      "to": [%d, 7, %d],
      "faces": {"up": {"uv": [1, 7, 3, 8], "texture": "#side"}}
    },
    {
      "from": [%d, 0, %d],
      "to": [%d, 7, %d],
      "faces": {"up": {"uv": [7, 13, 8, 15], "texture": "#side"}}
    },
    {
      "from": [%d, 0, %d],
      "to": [%d, 7, %d],
      "faces": {"up": {"uv": [7, 13, 8, 15], "texture": "#side"}}
    },
    {
      "from": [%d, 7, %d],
      "to": [%d, 8, %d],
      "faces": {
        "north": {"uv": [1, 7, 3, 8], "texture": "#cover"},
        "west": {"uv": [0, 7, 1, 8], "texture": "#cover"},
        "east": {"uv": [3, 7, 4, 8], "texture": "#cover"}
      }
    },
    {
      "from": [%d, 7, %d],
      "to": [%d, 8, %d],
      "faces": {
        "south": {"uv": [1, 7, 3, 8], "texture": "#cover"},
        "west": {"uv": [3, 7, 4, 8], "texture": "#cover"},
        "east": {"uv": [0, 7, 1, 8], "texture": "#cover"}
      }
    },
    {
      "from": [%d, 7, %d],
      "to": [%d, 8, %d],
      "faces": {
        "west": {"uv": [1, 7, 3, 8], "texture": "#cover"},
        "north": {"uv": [3, 7, 4, 8], "texture": "#cover"},
        "south": {"uv": [0, 7, 1, 8], "texture": "#cover"}
      }
    },
    {
      "from": [%d, 7, %d],
      "to": [%d, 8, %d],
      "faces": {
        "east": {"uv": [1, 7, 3, 8], "texture": "#cover"},
        "north": {"uv": [0, 7, 1, 8], "texture": "#cover"},
        "south": {"uv": [3, 7, 4, 8], "texture": "#cover"}
      }
    },
    {
      "from": [%d, 0, %d],
      "to": [%d, 8, %d],
      "faces": {
        "down": {"uv": [4, 0, 8, 4], "texture": "#side", "cullface": "down"},
        "up": {"uv": [4, 0, 8, 4], "texture": "#cover"}
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
      "from": [%d, 9, %d],
      "to": [%d, 16, %d],
      "faces": {
        "north": {"uv": [1, 0, 3, 7], "texture": "#side"},
        "west": {"uv": [0, 0, 1, 7], "texture": "#side"},
        "east": {"uv": [3, 0, 4, 7], "texture": "#side"}
      }
    },
    {
      "from": [%d, 9, %d],
      "to": [%d, 16, %d],
      "faces": {
        "south": {"uv": [1, 0, 3, 7], "texture": "#side"},
        "west": {"uv": [3, 0, 4, 7], "texture": "#side"},
        "east": {"uv": [0, 0, 1, 7], "texture": "#side"}
      }
    },
    {
      "from": [%d, 9, %d],
      "to": [%d, 16, %d],
      "faces": {
        "west": {"uv": [1, 0, 3, 7], "texture": "#side"},
        "north": {"uv": [3, 0, 4, 7], "texture": "#side"},
        "south": {"uv": [0, 0, 1, 7], "texture": "#side"}
      }
    },
    {
      "from": [%d, 9, %d],
      "to": [%d, 16, %d],
      "faces": {
        "east": {"uv": [1, 0, 3, 7], "texture": "#side"},
        "north": {"uv": [0, 0, 1, 7], "texture": "#side"},
        "south": {"uv": [3, 0, 4, 7], "texture": "#side"}
      }
    },
    {
      "from": [%d, 9, %d],
      "to": [%d, 12, %d],
      "faces": {"south": {"uv": [1, 4, 3, 7], "texture": "#side"}}
    },
    {
      "from": [%d, 9, %d],
      "to": [%d, 12, %d],
      "faces": {"north": {"uv": [1, 4, 3, 7], "texture": "#side"}}
    },
    {
      "from": [%d, 9, %d],
      "to": [%d, 12, %d],
      "faces": {"east": {"uv": [1, 4, 3, 7], "texture": "#side"}}
    },
    {
      "from": [%d, 9, %d],
      "to": [%d, 12, %d],
      "faces": {"west": {"uv": [1, 4, 3, 7], "texture": "#side"}}
    },
    {
      "from": [%d, 12, %d],
      "to": [%d, 16, %d],
      "faces": {"down": {"uv": [5, 1, 7, 3], "texture": "#side"}}
    },
    {
      "from": [%d, 9, %d],
      "to": [%d, 16, %d],
      "faces": {"down": {"uv": [1, 7, 3, 8], "texture": "#side"}}
    },
    {
      "from": [%d, 9, %d],
      "to": [%d, 16, %d],
      "faces": {"down": {"uv": [1, 7, 3, 8], "texture": "#side"}}
    },
    {
      "from": [%d, 9, %d],
      "to": [%d, 16, %d],
      "faces": {"down": {"uv": [7, 13, 8, 15], "texture": "#side"}}
    },
    {
      "from": [%d, 9, %d],
      "to": [%d, 16, %d],
      "faces": {"down": {"uv": [7, 13, 8, 15], "texture": "#side"}}
    },
    {
      "from": [%d, 8, %d],
      "to": [%d, 9, %d],
      "faces": {
        "north": {"uv": [1, 7, 3, 8], "texture": "#cover"},
        "west": {"uv": [0, 7, 1, 8], "texture": "#cover"},
        "east": {"uv": [3, 7, 4, 8], "texture": "#cover"}
      }
    },
    {
      "from": [%d, 8, %d],
      "to": [%d, 9, %d],
      "faces": {
        "south": {"uv": [1, 7, 3, 8], "texture": "#cover"},
        "west": {"uv": [3, 7, 4, 8], "texture": "#cover"},
        "east": {"uv": [0, 7, 1, 8], "texture": "#cover"}
      }
    },
    {
      "from": [%d, 8, %d],
      "to": [%d, 9, %d],
      "faces": {
        "west": {"uv": [1, 7, 3, 8], "texture": "#cover"},
        "north": {"uv": [3, 7, 4, 8], "texture": "#cover"},
        "south": {"uv": [0, 7, 1, 8], "texture": "#cover"}
      }
    },
    {
      "from": [%d, 8, %d],
      "to": [%d, 9, %d],
      "faces": {
        "east": {"uv": [1, 7, 3, 8], "texture": "#cover"},
        "north": {"uv": [0, 7, 1, 8], "texture": "#cover"},
        "south": {"uv": [3, 7, 4, 8], "texture": "#cover"}
      }
    },
    {
      "from": [%d, 8, %d],
      "to": [%d, 16, %d],
      "faces": {
        "down": {"uv": [4, 0, 8, 4], "texture": "#cover"},
        "up": {"uv": [4, 0, 8, 4], "texture": "#side", "cullface": "up"}
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
      "to": [%d, %d, 7],
      "faces": {
        "down": {"uv": [1, 0, 3, 7], "texture": "#side"},
        "west": {"uv": [0, 15, 7, 16], "texture": "#side"},
        "east": {"uv": [0, 15, 7, 16], "texture": "#side"}
      }
    },
    {
      "from": [%d, %d, 0],
      "to": [%d, %d, 7],
      "faces": {
        "up": {"uv": [1, 0, 3, 7], "texture": "#side"},
        "west": {"uv": [0, 12, 7, 13], "texture": "#side"},
        "east": {"uv": [0, 12, 7, 13], "texture": "#side"}
      }
    },
    {
      "from": [%d, %d, 0],
      "to": [%d, %d, 7],
      "faces": {
        "west": {"uv": [0, 13, 7, 15], "texture": "#side"},
        "down": {"uv": [0, 0, 1, 7], "texture": "#side"},
        "up": {"uv": [0, 0, 1, 7], "texture": "#side"}
      }
    },
    {
      "from": [%d, %d, 0],
      "to": [%d, %d, 7],
      "faces": {
        "east": {"uv": [0, 13, 7, 15], "texture": "#side"},
        "down": {"uv": [3, 0, 4, 7], "texture": "#side"},
        "up": {"uv": [3, 0, 4, 7], "texture": "#side"}
      }
    },
    {
      "from": [%d, %d, 4],
      "to": [%d, %d, 7],
      "faces": {"up": {"uv": [1, 4, 3, 7], "texture": "#side"}}
    },
    {
      "from": [%d, %d, 4],
      "to": [%d, %d, 7],
      "faces": {"down": {"uv": [1, 4, 3, 7], "texture": "#side"}}
    },
    {
      "from": [%d, %d, 4],
      "to": [%d, %d, 7],
      "faces": {"east": {"uv": [4, 13, 7, 15], "texture": "#side"}}
    },
    {
      "from": [%d, %d, 4],
      "to": [%d, %d, 7],
      "faces": {"west": {"uv": [4, 13, 7, 15], "texture": "#side"}}
    },
    {
      "from": [%d, %d, 0],
      "to": [%d, %d, 4],
      "faces": {"south": {"uv": [5, 1, 7, 3], "texture": "#side"}}
    },
    {
      "from": [%d, %d, 0],
      "to": [%d, %d, 7],
      "faces": {"south": {"uv": [1, 7, 3, 8], "texture": "#side"}}
    },
    {
      "from": [%d, %d, 0],
      "to": [%d, %d, 7],
      "faces": {"south": {"uv": [1, 7, 3, 8], "texture": "#side"}}
    },
    {
      "from": [%d, %d, 0],
      "to": [%d, %d, 7],
      "faces": {"south": {"uv": [7, 13, 8, 15], "texture": "#side"}}
    },
    {
      "from": [%d, %d, 0],
      "to": [%d, %d, 7],
      "faces": {"south": {"uv": [7, 13, 8, 15], "texture": "#side"}}
    },
    {
      "from": [%d, %d, 7],
      "to": [%d, %d, 8],
      "faces": {
        "down": {"uv": [1, 7, 3, 8], "texture": "#cover"},
        "west": {"uv": [7, 15, 8, 16], "texture": "#cover"},
        "east": {"uv": [7, 15, 8, 16], "texture": "#cover"}
      }
    },
    {
      "from": [%d, %d, 7],
      "to": [%d, %d, 8],
      "faces": {
        "up": {"uv": [1, 7, 3, 8], "texture": "#cover"},
        "west": {"uv": [7, 12, 8, 13], "texture": "#cover"},
        "east": {"uv": [7, 12, 8, 13], "texture": "#cover"}
      }
    },
    {
      "from": [%d, %d, 7],
      "to": [%d, %d, 8],
      "faces": {
        "west": {"uv": [7, 13, 8, 15], "texture": "#cover"},
        "down": {"uv": [0, 7, 1, 8], "texture": "#cover"},
        "up": {"uv": [0, 7, 1, 8], "texture": "#cover"}
      }
    },
    {
      "from": [%d, %d, 7],
      "to": [%d, %d, 8],
      "faces": {
        "east": {"uv": [7, 13, 8, 15], "texture": "#cover"},
        "down": {"uv": [3, 7, 4, 8], "texture": "#cover"},
        "up": {"uv": [3, 7, 4, 8], "texture": "#cover"}
      }
    },
    {
      "from": [%d, %d, 0],
      "to": [%d, %d, 8],
      "faces": {
        "north": {"uv": [4, 0, 8, 4], "texture": "#side", "cullface": "north"},
        "south": {"uv": [4, 0, 8, 4], "texture": "#cover"}
      }
    }
  ]
}
""".replace(b"\n",b"\r\n")
Y_OFFSETS:Dict[Tuple[int,int],str]={
 (0,0):"center",(0,6):"south",(6,6):"southeast",(6,0):"east",
 (6,-6):"northeast",(0,-6):"north",(-6,-6):"northwest",(-6,0):"west",
 (-6,6):"southwest"
}
NORTH_OFFSETS:Dict[Tuple[int,int],str]={
 (0,0):"center",(0,6):"upper",(6,6):"uppereast",(6,0):"east",
 (6,-6):"lowereast",(0,-6):"lower",(-6,-6):"lowerwest",(-6,0):"west",
 (-6,6):"upperwest"
}
for k,v in Y_OFFSETS.items():
 with open(f"rod_with_lamp_down_{v}.json","wb")as f:
  f.write(EX_DOWN%(7+k[0],6+k[1],9+k[0],7+k[1],7+k[0],9+k[1],9+k[0],10+k[1],
                   6+k[0],7+k[1],7+k[0],9+k[1],9+k[0],7+k[1],10+k[0],9+k[1],
                   7+k[0],6+k[1],9+k[0],7+k[1],7+k[0],9+k[1],9+k[0],10+k[1],
                   6+k[0],7+k[1],7+k[0],9+k[1],9+k[0],7+k[1],10+k[0],9+k[1],
                   7+k[0],7+k[1],9+k[0],9+k[1],
                   7+k[0],6+k[1],9+k[0],7+k[1],7+k[0],9+k[1],9+k[0],10+k[1],
                   6+k[0],7+k[1],7+k[0],9+k[1],9+k[0],7+k[1],10+k[0],9+k[1],
                   7+k[0],6+k[1],9+k[0],7+k[1],7+k[0],9+k[1],9+k[0],10+k[1],
                   6+k[0],7+k[1],7+k[0],9+k[1],9+k[0],7+k[1],10+k[0],9+k[1],
                   6+k[0],6+k[1],10+k[0],10+k[1]))
 with open(f"rod_with_lamp_up_{v}.json","wb")as f:
  f.write(EX_UP%(7+k[0],6+k[1],9+k[0],7+k[1],7+k[0],9+k[1],9+k[0],10+k[1],
                 6+k[0],7+k[1],7+k[0],9+k[1],9+k[0],7+k[1],10+k[0],9+k[1],
                 7+k[0],6+k[1],9+k[0],7+k[1],7+k[0],9+k[1],9+k[0],10+k[1],
                 6+k[0],7+k[1],7+k[0],9+k[1],9+k[0],7+k[1],10+k[0],9+k[1],
                 7+k[0],7+k[1],9+k[0],9+k[1],
                 7+k[0],6+k[1],9+k[0],7+k[1],7+k[0],9+k[1],9+k[0],10+k[1],
                 6+k[0],7+k[1],7+k[0],9+k[1],9+k[0],7+k[1],10+k[0],9+k[1],
                 7+k[0],6+k[1],9+k[0],7+k[1],7+k[0],9+k[1],9+k[0],10+k[1],
                 6+k[0],7+k[1],7+k[0],9+k[1],9+k[0],7+k[1],10+k[0],9+k[1],
                 6+k[0],6+k[1],10+k[0],10+k[1]))
for k,v in NORTH_OFFSETS.items():
 with open(f"rod_with_lamp_north_{v}.json","wb")as f:
  f.write(EX_NORTH%(7+k[0],6+k[1],9+k[0],7+k[1],7+k[0],9+k[1],9+k[0],10+k[1],
                    6+k[0],7+k[1],7+k[0],9+k[1],9+k[0],7+k[1],10+k[0],9+k[1],
                    7+k[0],6+k[1],9+k[0],7+k[1],7+k[0],9+k[1],9+k[0],10+k[1],
                    6+k[0],7+k[1],7+k[0],9+k[1],9+k[0],7+k[1],10+k[0],9+k[1],
                    7+k[0],7+k[1],9+k[0],9+k[1],
                    7+k[0],6+k[1],9+k[0],7+k[1],7+k[0],9+k[1],9+k[0],10+k[1],
                    6+k[0],7+k[1],7+k[0],9+k[1],9+k[0],7+k[1],10+k[0],9+k[1],
                    7+k[0],6+k[1],9+k[0],7+k[1],7+k[0],9+k[1],9+k[0],10+k[1],
                    6+k[0],7+k[1],7+k[0],9+k[1],9+k[0],7+k[1],10+k[0],9+k[1],
                    6+k[0],6+k[1],10+k[0],10+k[1]))
