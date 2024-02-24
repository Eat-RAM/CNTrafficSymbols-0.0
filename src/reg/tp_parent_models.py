from copy import deepcopy
import json
from typing import List,Dict,Tuple,Union
BASE_BOTTOM:Dict[str,
                 Union[List[Dict[str,
                                 Union[List[int],
                                       Dict[str,
                                            Dict[str,Union[List[int],str]]]]]],
                       Dict[str,str],str]]={
 "parent":"minecraft:block/block",
 "textures":{"particle":"#this"},
 "elements":[{
  "from":[0,0,0],"to":[16,1,16],"faces":{
   "down":{"uv":[0,0,16,16],"texture":"#this","cullface":"down"},
   "up":{"uv":[0,0,16,16],"texture":"#this"},
   "north":{"uv":[0,15,16,16],"texture":"#this","cullface":"north"},
   "south":{"uv":[0,15,16,16],"texture":"#this","cullface":"south"},
   "west":{"uv":[0,15,16,16],"texture":"#this","cullface":"west"},
   "east":{"uv":[0,15,16,16],"texture":"#this","cullface":"east"}
  }
 }]
}
BASE_UP:Dict[str,
             Union[List[Dict[str,
                             Union[List[int],
                                   Dict[str,Dict[str,Union[List[int],str]]]]]],
                   Dict[str,str],str]]={
 "parent":"minecraft:block/block",
 "textures":{"particle":"#this"},
 "elements":[{
  "from":[0,8,0],"to":[16,9,16],"faces":{
   "down":{"uv":[0,0,16,16],"texture":"#this"},
   "up":{"uv":[0,0,16,16],"texture":"#this"},
   "north":{"uv":[0,7,16,8],"texture":"#this","cullface":"north"},
   "south":{"uv":[0,7,16,8],"texture":"#this","cullface":"south"},
   "west":{"uv":[0,7,16,8],"texture":"#this","cullface":"west"},
   "east":{"uv":[0,7,16,8],"texture":"#this","cullface":"east"}
  }
 }]
}
def gen_boxes(startx:float,startz:float,lengthx:float,lengthz:float,sepx:float,
              sepz:float,timesx:int,timesz:int)->List[Tuple[
 Union[int,float],Union[int,float],Union[int,float],Union[int,float]]
]:
 res:List[Tuple[
  Union[int,float],Union[int,float],Union[int,float],Union[int,float]]
 ]=[]
 x=startx
 for _ in range(timesx):
  z=startz
  for _ in range(timesz):
   a:Union[int,float]=x*16
   b:Union[int,float]=z*16
   c:Union[int,float]=(x+lengthx)*16
   d:Union[int,float]=(z+lengthz)*16
   if a.as_integer_ratio()[1]==1:a=int(a)
   if b.as_integer_ratio()[1]==1:b=int(b)
   if c.as_integer_ratio()[1]==1:c=int(c)
   if d.as_integer_ratio()[1]==1:d=int(d)
   res.append((a,b,c,d))
   z+=sepz
  x+=sepx
 return res
BOXES:Dict[str,List[Tuple[
 Union[int,float],Union[int,float],Union[int,float],Union[int,float]]
]]={
 "dotted4_tp":gen_boxes(.0625,.0625,.125,.125,.25,.25,4,4),
 "dotted5_tp":gen_boxes(.0625,.0625,.125,.125,.1875,.1875,5,5),
 "dotted6_tp":gen_boxes(.046875,.046875,.125,.125,.15625,.15625,6,6),
 "dotted7_tp":gen_boxes(.09375,.09375,.0625,.0625,.125,.125,7,7),
 "dotted8_tp":gen_boxes(.03125,.03125,.0625,.0625,.125,.125,8,8),
 "dotted9_tp":gen_boxes(.09375,.09375,.0625,.0625,.09375,.09375,9,9),
 "dotted10_tp":gen_boxes(.046875,.046875,.0625,.0625,.09375,.09375,10,10),
 "lined4_tp_x":gen_boxes(.0625,.0625,.875,.125,0.,.25,1,4),
 "lined5_tp_x":gen_boxes(.0625,.0625,.875,.125,0.,.1875,1,5),
 "lined6_tp_x":gen_boxes(.046875,.046875,.90625,.125,0.,.15625,1,6),
 "lined7_tp_x":gen_boxes(.09375,.09375,.8125,.0625,0.,.125,1,7),
 "lined8_tp_x":gen_boxes(.03125,.03125,.9375,.0625,0.,.125,1,8),
 "lined9_tp_x":gen_boxes(.09375,.09375,.8125,.0625,0.,.09375,1,9),
 "lined10_tp_x":gen_boxes(.046875,.046875,.90625,.0625,0.,.09375,1,10)
}
for k,v in BOXES.items():
 a=deepcopy(BASE_BOTTOM)
 b=deepcopy(BASE_UP)
 for i in v:
  getattr(a["elements"],"append")({
   "from":[i[0],1,i[1]],"to":[i[2],1.5,i[3]],"faces":{
    "up":{"uv":[*i],"texture":"#this"},
    "north":{"uv":[16-i[2],14.5,16-i[0],15],"texture":"#this"},
    "south":{"uv":[i[0],14.5,i[2],15],"texture":"#this"},
    "west":{"uv":[i[1],14.5,i[3],15],"texture":"#this"},
    "east":{"uv":[16-i[3],14.5,16-i[1],15],"texture":"#this"}
   }
  })
  getattr(b["elements"],"append")({
   "from":[i[0],9,i[1]],"to":[i[2],9.5,i[3]],"faces":{
    "up":{"uv":[*i],"texture":"#this"},
    "north":{"uv":[16-i[2],6.5,16-i[0],7],"texture":"#this"},
    "south":{"uv":[i[0],6.5,i[2],7],"texture":"#this"},
    "west":{"uv":[i[1],6.5,i[3],7],"texture":"#this"},
    "east":{"uv":[16-i[3],6.5,16-i[1],7],"texture":"#this"}
   }
  })
 with open(f"{k}_bottom.json","w")as f:json.dump(a,f,indent=2)
 with open(f"{k}_up.json","w")as f:json.dump(b,f,indent=2)
