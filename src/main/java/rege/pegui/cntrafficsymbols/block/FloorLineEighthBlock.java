package rege.pegui.cntrafficsymbols.block;
import static net.minecraft.fluid.Fluids.WATER;
import static net.minecraft.state.property.Properties.HORIZONTAL_AXIS;
import static net.minecraft.state.property.Properties.WATERLOGGED;
import static net.minecraft.util.shape.VoxelShapes.cuboid;
import static net.minecraft.util.shape.VoxelShapes.union;
import static
rege.pegui.cntrafficsymbols.Main.getHardcodedFloorLineEighthsLootEnabled;
import static rege.pegui.cntrafficsymbols.Main.getWaterloggedProperty;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;
public class FloorLineEighthBlock extends Block
implements ManagedWaterloggable,rege.pegui.cntrafficsymbols.state
.StateOptimizable{
	public static final IntProperty SLICES160=IntProperty.of("slices160",0,40);
	public static final IntProperty SLICES16=IntProperty.of("slices16",0,9);
	public static final IntProperty SLICES=IntProperty.of("slices",0,15);
	public static final VoxelShape L0X=cuboid(0,0,0,1,.03125,.125);
	public static final VoxelShape L1X=cuboid(0,0,.125,1,.03125,.25);
	public static final VoxelShape L2X=cuboid(0,0,.25,1,.03125,.375);
	public static final VoxelShape L3X=cuboid(0,0,.375,1,.03125,.5);
	public static final VoxelShape L4X=cuboid(0,0,.5,1,.03125,.625);
	public static final VoxelShape L5X=cuboid(0,0,.625,1,.03125,.75);
	public static final VoxelShape L6X=cuboid(0,0,.75,1,.03125,.875);
	public static final VoxelShape L7X=cuboid(0,0,.875,1,.03125,1);
	public static final VoxelShape L0Z=cuboid(0,0,0,.125,.03125,1);
	public static final VoxelShape L1Z=cuboid(.125,0,0,.25,.03125,1);
	public static final VoxelShape L2Z=cuboid(.25,0,0,.375,.03125,1);
	public static final VoxelShape L3Z=cuboid(.375,0,0,.5,.03125,1);
	public static final VoxelShape L4Z=cuboid(.5,0,0,.625,.03125,1);
	public static final VoxelShape L5Z=cuboid(.625,0,0,.75,.03125,1);
	public static final VoxelShape L6Z=cuboid(.75,0,0,.875,.03125,1);
	public static final VoxelShape L7Z=cuboid(.875,0,0,1,.03125,1);
	private Item itm1;
	private Item itm2;
	public static int to3Pow(BlockState st){return st.get(SLICES160).intValue()*
	160+(st.get(SLICES16).intValue()*16)+st.get(SLICES).intValue()+1;}
	public static BlockState from3Pow(BlockState st,int pow){
		pow--;st=st.with(SLICES,pow%16);pow/=16;st=st.with(SLICES16,pow%10);pow/=10;
		return st.with(SLICES160,pow%41);
	}
	public FloorLineEighthBlock(Item itm1,Item itm2,Settings s){
		super(s);this.itm1=itm1;this.itm2=itm2;BlockState st=getDefaultState()
		.with(SLICES160,0).with(SLICES16,0).with(SLICES,0).with(HORIZONTAL_AXIS,
		Direction.Axis.X);if(getWaterloggedProperty())st=st.with(WATERLOGGED,false);
		setDefaultState(st);
	}
	public FloorLineEighthBlock(Settings s){
		super(s);BlockState st=getDefaultState().with(SLICES160,0).with(SLICES16,0)
		.with(SLICES,0).with(HORIZONTAL_AXIS,Direction.Axis.X);
		if(getWaterloggedProperty())st=st.with(WATERLOGGED,false);
		setDefaultState(st);
	}
	@Override public VoxelShape getOutlineShape(BlockState st,BlockView v,BlockPos
	p,net.minecraft.block.ShapeContext c){
		VoxelShape res=net.minecraft.util.shape.VoxelShapes.empty();int r=to3Pow(st);
		if(st.get(HORIZONTAL_AXIS)==Direction.Axis.X){
			if(r%3!=0)res=union(res,L0X);
			r/=3;
			if(r%3!=0)res=union(res,L1X);
			r/=3;
			if(r%3!=0)res=union(res,L2X);
			r/=3;
			if(r%3!=0)res=union(res,L3X);
			r/=3;
			if(r%3!=0)res=union(res,L4X);
			r/=3;
			if(r%3!=0)res=union(res,L5X);
			r/=3;
			if(r%3!=0)res=union(res,L6X);
			r/=3;
			if(r%3!=0)res=union(res,L7X);
		}else{
			if(r%3!=0)res=union(res,L0Z);
			r/=3;
			if(r%3!=0)res=union(res,L1Z);
			r/=3;
			if(r%3!=0)res=union(res,L2Z);
			r/=3;
			if(r%3!=0)res=union(res,L3Z);
			r/=3;
			if(r%3!=0)res=union(res,L4Z);
			r/=3;
			if(r%3!=0)res=union(res,L5Z);
			r/=3;
			if(r%3!=0)res=union(res,L6Z);
			r/=3;
			if(r%3!=0)res=union(res,L7Z);
		}
		return res;
	}
	@Override public void afterBreak(net.minecraft.world.World w,net.minecraft
	.entity.player.PlayerEntity player,BlockPos p,BlockState st,@Nullable net
	.minecraft.block.entity.BlockEntity ett,ItemStack tool){
		super.afterBreak(w,player,p,st,ett,tool);
		if((w instanceof ServerWorld)&&
		(Boolean.TRUE.equals(getHardcodedFloorLineEighthsLootEnabled())||
		(getHardcodedFloorLineEighthsLootEnabled()==null&&
		getDroppedStacks(st,(ServerWorld)w,p,ett,player,tool).isEmpty()))){
			byte i1=0;byte i2=0;int r=to3Pow(st);
			for(int i=0;i<8;i++){
				switch(r%3){
					case 1:i1++;break;
					case 2:i2++;break;
				}
				r/=3;
			}
			ItemScatterer.spawn(w,p.getX(),p.getY(),p.getZ(),new ItemStack(itm1,i1));
			ItemScatterer.spawn(w,p.getX(),p.getY(),p.getZ(),new ItemStack(itm2,i2));
		}
	}

	@Override public ItemStack getPickStack(net.minecraft.world.WorldView v,
	BlockPos p,BlockState st){
		int pow=to3Pow(st);byte s1=0;byte s2=0;for(byte i=0;i<(byte)8;i++){
			switch(pow%3){
				case 1:s1++;break;
				case 2:s2++;break;
			}
			pow/=3;
		}
		if(s1==(byte)0){
			if(s2==(byte)0)assert false;
			return new ItemStack(itm2);
		}
		if(s2==(byte)0)return new ItemStack(itm1);
		return new ItemStack((Math.random()<.5)?itm1:itm2);
	}
	@Override protected void appendProperties(net.minecraft.state.StateManager
	.Builder<Block,BlockState>bd){
		bd.add(SLICES,SLICES16,SLICES160,HORIZONTAL_AXIS);
		if(getWaterloggedProperty())bd.add(WATERLOGGED);
	}
	@Override public BlockState getPlacementState(ItemPlacementContext ctx){
		BlockState st=ctx.getWorld().getBlockState(ctx.getBlockPos());byte repl=1;
		if(ctx.getStack().isOf(itm2)){repl++;}else if(!ctx.getStack().isOf(itm1)){
		throw new IllegalStateException("Unexpected item "+ctx.getStack().getItem());
		}
		if(st.isOf(this)){
			Direction d=ctx.getSide();BlockPos p=ctx.getBlockPos();
			net.minecraft.util.math.Vec3d v=ctx.getHitPos();int l=0;
			if(d.getAxis().isVertical()){
				l=(int)(((st.get(HORIZONTAL_AXIS)==Direction.Axis.X)?
				v.z-p.getZ():(v.x-p.getX()))*8);
			}else{
				double c;
				switch(d){
					case NORTH:c=v.z-p.getZ();l=((int)c)-((c%.125==0)?1:0);break;
					case SOUTH:c=v.z-p.getZ();l=(int)c;break;
					case WEST:c=v.x-p.getX();l=((int)c)-((c%.125==0)?1:0);break;
					case EAST:c=v.x-p.getX();l=(int)c;break;
					default:assert false;
				}
			}
			if(l<0){l=0;}else if(l>7){l=7;}
			int base=1;for(int i=0;i<l;i++)base*=3;
			return from3Pow(st,base*repl+to3Pow(st));
		}
		if(ctx.getHorizontalPlayerFacing().getAxis()==Direction.Axis.X){
			int l=(int)((ctx.getHitPos().z-ctx.getBlockPos().getZ())*8);
			if(l<0){l=0;}else if(l>7){l=7;}
			int base=1;for(int i=0;i<l;i++)base*=3;
			BlockState sst=from3Pow(getDefaultState()
			.with(HORIZONTAL_AXIS,Direction.Axis.X),base*repl);
			if(getWaterloggedProperty())sst=sst.with(WATERLOGGED,ctx.getWorld()
			.getFluidState(ctx.getBlockPos()).getFluid()==WATER);
			return sst;
		}else{
			int l=(int)((ctx.getHitPos().x-ctx.getBlockPos().getX())*8);
			if(l<0){l=0;}else if(l>7){l=7;}
			int base=1;
			for(int i=0;i<l;i++)base*=3;
			BlockState sst=from3Pow(getDefaultState()
			.with(HORIZONTAL_AXIS,Direction.Axis.Z),base*repl);
			if(getWaterloggedProperty())sst=sst.with(WATERLOGGED,ctx.getWorld()
			.getFluidState(ctx.getBlockPos()).getFluid()==WATER);
			return sst;
		}
	}
	@Override public BlockState getStateForNeighborUpdate(BlockState st,Direction
	d,BlockState nst,net.minecraft.world.WorldAccess w,BlockPos p,BlockPos np){
		if(getWaterloggedProperty()&&st.get(WATERLOGGED).booleanValue())w
		.scheduleFluidTick(p,WATER,WATER.getTickRate(w));
		return super.getStateForNeighborUpdate(st,d,nst,w,p,np);
	}
	@Override public net.minecraft.fluid.FluidState getFluidState(BlockState st){
		return(getWaterloggedProperty()&&st.get(WATERLOGGED).booleanValue())?
		WATER.getStill(false):super.getFluidState(st);
	}
	@Override public boolean canReplace(BlockState st,ItemPlacementContext ctx){
		if(!(ctx.getStack().isOf(itm1)||ctx.getStack().isOf(itm2)))return false;
		Direction d=ctx.getSide();BlockPos p=ctx.getBlockPos();
		net.minecraft.util.math.Vec3d v=ctx.getHitPos();int l=0;
		if(d.getAxis().isVertical()){
			l=(int)(((st.get(HORIZONTAL_AXIS)==Direction.Axis.X)?
			v.z-p.getZ():(v.x-p.getX()))*8);
		}else if(d.getAxis()==st.get(HORIZONTAL_AXIS)){return false;}else{
			double c;
			switch(d){
				case NORTH:c=v.z-p.getZ();l=((int)c)-((c%.125==0)?1:0);break;
				case SOUTH:c=v.z-p.getZ();l=(int)c;break;
				case WEST:c=v.x-p.getX();l=((int)c)-((c%.125==0)?1:0);break;
				case EAST:c=v.x-p.getX();l=(int)c;break;
				default:assert false;
			}
		}
		if(l<0){l=0;}else if(l>7){l=7;}
		int s=to3Pow(st);for(int i=0;i<l;i++)s/=3;
		return s%3==0;
	}
	@Override public BlockState
	rotate(BlockState st,net.minecraft.util.BlockRotation rtt){
		boolean shouldReverse;switch(rtt){
			case CLOCKWISE_90:{
				shouldReverse=st.get(HORIZONTAL_AXIS)==Direction.Axis.X;st=
				st.with(HORIZONTAL_AXIS,shouldReverse?Direction.Axis.Z:Direction.Axis.X);
				break;
			}
			case CLOCKWISE_180:shouldReverse=true;break;
			case COUNTERCLOCKWISE_90:{
				shouldReverse=st.get(HORIZONTAL_AXIS)==Direction.Axis.Z;st=
				st.with(HORIZONTAL_AXIS,shouldReverse?Direction.Axis.X:Direction.Axis.Z);
				break;
			}
			default:return st;
		}
		if(shouldReverse){
			int ns=0;int r=to3Pow(st);for(int i=0;i<8;i++){ns*=3;ns+=r%3;r/=3;}
			return from3Pow(st,ns);
		}
		return st;
	}
	@Override public BlockState
	mirror(BlockState st,net.minecraft.util.BlockMirror mirror){
		switch(mirror){
			case FRONT_BACK:if(st.get(HORIZONTAL_AXIS)==Direction.Axis.X)return st;break;
			case LEFT_RIGHT:if(st.get(HORIZONTAL_AXIS)==Direction.Axis.Z)return st;break;
			default:return st;
		}
		int ns=0;int r=to3Pow(st);for(int i=0;i<8;i++){ns*=3;ns+=r%3;r/=3;}
		return from3Pow(st,ns);
	}
	public@Nullable Item setItm1(@Nullable Item v){
		Item r=itm1;if(r==null)itm1=v;
		return v;
	}
	public@Nullable Item setItm2(@Nullable Item v){
		Item r=itm2;if(r==null)itm2=v;
		return v;
	}
	@Override public float calcBlockBreakingDelta(BlockState st,PlayerEntity
	pl,BlockView v,BlockPos p){
		int pow=to3Pow(st);byte s=0;for(byte i=0;i<(byte)8;i++){
			if(pow%3!=0)s++;
			pow/=3;
		}
		return(s>1)?super.calcBlockBreakingDelta(st,pl,v,p)/((s+1)*0.5f):super
		.calcBlockBreakingDelta(st,pl,v,p);
	}
}
