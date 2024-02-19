import json
p=lambda l0,l1,l2,l3,l4,l5,l6,l7:l7*2187+l6*729+l5*243+l4*81+l3*27+l2*9+l1*3+l0
def q(x):
 x-=1;return x%16,(x//16)%10,(x//160)%41
TUPS={}
for l0 in(0,1,2):
 for l1 in(0,1,2):
  for l2 in(0,1,2):
   for l3 in(0,1,2):
    for l4 in(0,1,2):
     for l5 in(0,1,2):
      for l6 in(0,1,2):
       for l7 in(0,1,2):
        tup=l0,l1,l2,l3,l4,l5,l6,l7
        TUPS[tup]=tup[::-1]in TUPS
lobj={"variants":{}}
for i in TUPS:
 if i==(0,0,0,0,0,0,0,0):continue
 qp=q(p(*i))
 if TUPS[i]:
  lobj["variants"][f"axis=x,slices={qp[0]},slices16={qp[1]},slices160={qp[2]}"]={
   "model":f"regedt32:block/cntrafficsymbols/floor_line_eighths_{''.join(str(x) for x in i[::-1])}",
   "y":180,"uvlock":True
  }
  lobj["variants"][f"axis=z,slices={qp[0]},slices16={qp[1]},slices160={qp[2]}"]={
   "model":f"regedt32:block/cntrafficsymbols/floor_line_eighths_{''.join(str(x) for x in i[::-1])}",
   "y":90,"uvlock":True
  }
  continue
 fc=0;obj={"elements":[],"textures":{}};l=0;deltal=0;ct=0
 while l<8:
  if ct==i[l+deltal]:
   deltal+=1
   if l+deltal<8:continue
  shouldCullBefore=(not l)or i[l-1];shouldCullAfter=l+deltal>=8 or i[l+deltal]
  l+=deltal
  if ct and l:
   if ct==1:obj["textures"]["a1"]="regedt32:block/cntrafficsymbols/white_floor_line_eighths"
   else:obj["textures"]["a2"]="regedt32:block/cntrafficsymbols/yellow_floor_line_eighths"
   obj["elements"].append({
    "from":[0,0,(l-deltal)*2],
    "to":[16,0.5,l*2],
    "faces":{
     "down":{"uv":[0,(l-deltal)*2,16,l*2],"texture":"#a1" if ct==1 else "#a2",
             "cullface":"down"},
     "up":{"uv":[0,(l-deltal)*2,16,l*2],"texture":"#a1" if ct==1 else "#a2"},
     "north":{"uv":[0,15.5,16,16],"texture":"#a1" if ct==1 else "#a2",
              "cullface":"north"},
     "south":{"uv":[0,15.5,16,16],"texture":"#a1" if ct==1 else "#a2",
              "cullface":"south"},
     "west":{"uv":[(l-deltal)*2,15.5,l*2,6],
             "texture":"#a1" if ct==1 else "#a2","cullface":"west"},
     "east":{"uv":[(8-l)*2,15.5,(8-l+deltal)*2,6],
             "texture":"#a1" if ct==1 else "#a2","cullface":"east"}
    }
   })
   if l>deltal:
    if shouldCullBefore:del obj["elements"][-1]["faces"]["north"]
    else:del obj["elements"][-1]["faces"]["north"]["cullface"]
   if l<8:
    if shouldCullAfter:del obj["elements"][-1]["faces"]["south"]
    else:del obj["elements"][-1]["faces"]["south"]["cullface"]
  if l<8:
   deltal=0;ct=i[l]
 with open(f"floor_line_eighths_{''.join(str(x) for x in i)}.json","w")as f:json.dump(obj,f,indent=2)
 lobj["variants"][f"axis=x,slices={qp[0]},slices16={qp[1]},slices160={qp[2]}"]={
  "model":f"regedt32:block/cntrafficsymbols/floor_line_eighths_{''.join(str(x) for x in i)}"
 }
 lobj["variants"][f"axis=z,slices={qp[0]},slices16={qp[1]},slices160={qp[2]}"]={
  "model":f"regedt32:block/cntrafficsymbols/floor_line_eighths_{''.join(str(x) for x in i)}",
  "y":270,"uvlock":True
 }
with open("../../../blockstates/cntrafficsymbols/floor_line_eighths.json",
          "w")as f:
 json.dump(lobj,f,indent=2)
