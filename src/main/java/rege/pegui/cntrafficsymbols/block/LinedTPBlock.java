package rege.pegui.cntrafficsymbols.block;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction.Axis;
import net.minecraft.util.shape.VoxelShape;
import static net.minecraft.fluid.Fluids.WATER;
import static net.minecraft.state.property.Properties.BOTTOM;
import static net.minecraft.state.property.Properties.HORIZONTAL_AXIS;
import static net.minecraft.state.property.Properties.WATERLOGGED;
import static net.minecraft.util.shape.VoxelShapes.cuboid;
import static rege.pegui.cntrafficsymbols.Main.getWaterloggedProperty;
public class LinedTPBlock extends Block implements ManagedWaterloggable{
	public static final VoxelShape DOWN_BASE=cuboid(0,0,0,1,.0625,1);
	public static final VoxelShape UP_BASE=cuboid(0,.5,0,1,.5625,1);
	public static final VoxelShape DOWN_X4=patternZ(DOWN_BASE,.0625,.0625,.0625,
	.875,.03125,.125,.25,4);
	public static final VoxelShape UP_X4=patternZ(UP_BASE,.0625,.5625,.0625,.875,
	.03125,.125,.25,4);
	public static final VoxelShape DOWN_X5=patternZ(DOWN_BASE,.0625,.0625,.0625,
	.875,.03125,.125,.1875,5);
	public static final VoxelShape UP_X5=patternZ(UP_BASE,.0625,.5625,.0625,.875,
	.03125,.125,.1875,5);
	public static final VoxelShape DOWN_X6=patternZ(DOWN_BASE,.046875,.0625,
	.046875,.90625,.03125,.125,.15625,6);
	public static final VoxelShape UP_X6=patternZ(UP_BASE,.046875,.5625,.046875,
	.90625,.03125,.125,.15625,6);
	public static final VoxelShape DOWN_X7=patternZ(DOWN_BASE,.09375,.0625,.09375,
	.8125,.03125,.0625,.125,7);
	public static final VoxelShape UP_X7=patternZ(UP_BASE,.09375,.5625,.09375,
	.8125,.03125,.0625,.125,7);
	public static final VoxelShape DOWN_X8=patternZ(DOWN_BASE,.03125,.0625,.09375,
	.9375,.03125,.0625,.125,8);
	public static final VoxelShape UP_X8=patternZ(UP_BASE,.03125,.5625,.09375,
	.9375,.03125,.0625,.125,8);
	public static final VoxelShape DOWN_X9=patternZ(DOWN_BASE,.09375,.0625,.09375,
	.8125,.03125,.0625,.09375,9);
	public static final VoxelShape UP_X9=patternZ(UP_BASE,.09375,.5625,.09375,
	.8125,.03125,.0625,.09375,9);
	public static final VoxelShape DOWN_X10=patternZ(DOWN_BASE,.046875,.0625,
	.046875,.90625,.03125,.0625,.09375,10);
	public static final VoxelShape UP_X10=patternZ(UP_BASE,.046875,.5625,.046875,
	.90625,.03125,.0625,.09375,10);
	public static final VoxelShape DOWN_Z4=patternX(DOWN_BASE,.0625,.0625,.0625,
	.125,.03125,.875,.25,4);
	public static final VoxelShape UP_Z4=patternX(UP_BASE,.0625,.5625,.0625,.125,
	.03125,.875,.25,4);
	public static final VoxelShape DOWN_Z5=patternX(DOWN_BASE,.0625,.0625,.0625,
	.125,.03125,.875,.1875,5);
	public static final VoxelShape UP_Z5=patternX(UP_BASE,.0625,.5625,.0625,.125,
	.03125,.875,.1875,5);
	public static final VoxelShape DOWN_Z6=patternX(DOWN_BASE,.046875,.0625,
	.046875,.125,.03125,.90625,.15625,6);
	public static final VoxelShape UP_Z6=patternX(UP_BASE,.046875,.5625,.046875,
	.125,.03125,.90625,.15625,6);
	public static final VoxelShape DOWN_Z7=patternX(DOWN_BASE,.09375,.0625,.09375,
	.0625,.03125,.8125,.125,7);
	public static final VoxelShape UP_Z7=patternX(UP_BASE,.09375,.5625,.09375,
	.0625,.03125,.8125,.125,7);
	public static final VoxelShape DOWN_Z8=patternX(DOWN_BASE,.03125,.0625,.09375,
	.0625,.03125,.9375,.125,8);
	public static final VoxelShape UP_Z8=patternX(UP_BASE,.03125,.5625,.09375,
	.0625,.03125,.9375,.125,8);
	public static final VoxelShape DOWN_Z9=patternX(DOWN_BASE,.09375,.0625,.09375,
	.0625,.03125,.8125,.09375,9);
	public static final VoxelShape UP_Z9=patternX(UP_BASE,.09375,.5625,.09375,
	.0625,.03125,.8125,.09375,9);
	public static final VoxelShape DOWN_Z10=patternX(DOWN_BASE,.046875,.0625,
	.046875,.0625,.03125,.90625,.09375,10);
	public static final VoxelShape UP_Z10=patternX(UP_BASE,.046875,.5625,.046875,
	.0625,.03125,.90625,.09375,10);
	public static VoxelShape patternX(VoxelShape base,double startX,double startY,
	double startZ,double xLength,double yLength,double zLength,double sep,
	int times){return DottedTPBlock.pattern(base,startX,startY,startZ,xLength,
	yLength,zLength,sep,0,0,times,1,1);}
	public static VoxelShape patternZ(VoxelShape base,double startX,double startY,
	double startZ,double xLength,double yLength,double zLength,double sep,
	int times){return DottedTPBlock.pattern(base,startX,startY,startZ,xLength,
		yLength,zLength,0,0,sep,1,1,times);}
	public final byte asize;
	public LinedTPBlock(byte asize,Settings s)throws IllegalArgumentException{
		super(s);
		if(asize<(byte)4||asize>(byte)10){
			throw new IllegalArgumentException("The asize "+Byte.toString(asize)+
			" is not acceptable. You can extend this class.");
		}
		this.asize=asize;BlockState st=getDefaultState().with(BOTTOM,true)
		.with(HORIZONTAL_AXIS,Axis.X);
		if(getWaterloggedProperty())st=st.with(WATERLOGGED,false);
		setDefaultState(st);
	}
	@Override public VoxelShape getOutlineShape(BlockState st,net.minecraft.world
	.BlockView v,BlockPos p,net.minecraft.block.ShapeContext c){
		if(st.get(HORIZONTAL_AXIS)==Axis.X){
			if(st.get(BOTTOM).booleanValue()){
				switch(asize){
					case 4:return DOWN_X4;
					case 5:return DOWN_X5;
					case 6:return DOWN_X6;
					case 7:return DOWN_X7;
					case 8:return DOWN_X8;
					case 9:return DOWN_X9;
					case 10:return DOWN_X10;
					default:return DOWN_BASE;
				}
			}
			switch(asize){
				case 4:return UP_X4;
				case 5:return UP_X5;
				case 6:return UP_X6;
				case 7:return UP_X7;
				case 8:return UP_X8;
				case 9:return UP_X9;
				case 10:return UP_X10;
				default:return UP_BASE;
			}
		}
		if(st.get(BOTTOM).booleanValue()){
			switch(asize){
				case 4:return DOWN_Z4;
				case 5:return DOWN_Z5;
				case 6:return DOWN_Z6;
				case 7:return DOWN_Z7;
				case 8:return DOWN_Z8;
				case 9:return DOWN_Z9;
				case 10:return DOWN_Z10;
				default:return DOWN_BASE;
			}
		}
		switch(asize){
			case 4:return UP_Z4;
			case 5:return UP_Z5;
			case 6:return UP_Z6;
			case 7:return UP_Z7;
			case 8:return UP_Z8;
			case 9:return UP_Z9;
			case 10:return UP_Z10;
			default:return UP_BASE;
		}
	}
	@Override protected void appendProperties(net.minecraft.state.StateManager
	.Builder<Block,BlockState>bd){
		bd.add(BOTTOM,HORIZONTAL_AXIS);
		if(getWaterloggedProperty())bd.add(WATERLOGGED);
	}
	@Override public BlockState
	getPlacementState(net.minecraft.item.ItemPlacementContext ctx){
		BlockState st=getDefaultState().with(BOTTOM,ctx.getHitPos().y-ctx
		.getBlockPos().getY()<.5).with(HORIZONTAL_AXIS,ctx
		.getHorizontalPlayerFacing().getAxis());
		if(getWaterloggedProperty())st=st.with(WATERLOGGED,
		ctx.getWorld().getFluidState(ctx.getBlockPos()).getFluid()==WATER);
		return st;
	}
	@Override public BlockState getStateForNeighborUpdate(BlockState st,net
	.minecraft.util.math.Direction d,BlockState nst,net.minecraft.world
	.WorldAccess w,BlockPos p,BlockPos np){
		if(getWaterloggedProperty()&&st.get(WATERLOGGED).booleanValue())w
		.scheduleFluidTick(p,WATER,WATER.getTickRate(w));
		return super.getStateForNeighborUpdate(st,d,nst,w,p,np);
	}
	@Override public net.minecraft.fluid.FluidState getFluidState(BlockState st){
		return(getWaterloggedProperty()&&st.get(WATERLOGGED).booleanValue())?
		WATER.getStill(false):super.getFluidState(st);
	}
	@Override public BlockState
	rotate(BlockState st,net.minecraft.util.BlockRotation rotation){
		switch(rotation){
			case CLOCKWISE_90:case COUNTERCLOCKWISE_90:return st.with(HORIZONTAL_AXIS,
			(st.get(HORIZONTAL_AXIS)==Axis.X)?Axis.Z:Axis.X);
			default:return st;
		}
	}
}
