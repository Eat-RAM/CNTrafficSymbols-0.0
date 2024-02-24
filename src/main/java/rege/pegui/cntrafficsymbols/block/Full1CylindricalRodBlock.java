package rege.pegui.cntrafficsymbols.block;
import static net.minecraft.state.property.Properties.WATERLOGGED;
import static rege.pegui.cntrafficsymbols.Main.getWaterloggedProperty;
import static rege.pegui.cntrafficsymbols.helper.RangeUtil.closedRangeTo;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import rege.pegui.cntrafficsymbols.struct.AxisPosition9;
public class Full1CylindricalRodBlock extends AbstractCylindricalRodBlock{
	private static final VoxelShape[]SHAPES_BY_ID={X_CENTER,X_UPPER,X_UPPERSOUTH,
	X_SOUTH,X_LOWERSOUTH,X_LOWER,X_LOWERNORTH,X_NORTH,X_UPPERNORTH,Y_CENTER,
	Y_NORTH,Y_NORTHEAST,Y_EAST,Y_SOUTHEAST,Y_SOUTH,Y_SOUTHWEST,Y_WEST,Y_NORTHWEST,
	Z_CENTER,Z_UPPER,Z_UPPEREAST,Z_EAST,Z_LOWEREAST,Z_LOWER,Z_LOWERWEST,Z_WEST,
	Z_UPPERWEST};
	public Full1CylindricalRodBlock(Settings s){
		super(s);setDefaultState(getDefaultState().with(AxisPosition9.POSITION,
		AxisPosition9.Y_CENTER));
	}
	@Override protected void appendProperties(net.minecraft.state.StateManager
	.Builder<net.minecraft.block.Block,BlockState>bd){
		bd.add(AxisPosition9.POSITION);
		if(getWaterloggedProperty())bd.add(WATERLOGGED);
	}
	@Override public VoxelShape getOutlineShape(BlockState st,net.minecraft.world
	.BlockView v,BlockPos p,net.minecraft.block.ShapeContext c){
		return SHAPES_BY_ID[st.get(AxisPosition9.POSITION).id];
	}
	@Override public BlockState
	getPlacementState(net.minecraft.item.ItemPlacementContext ctx){
		BlockState st=getDefaultState();
		double rx=ctx.getHitPos().x-ctx.getBlockPos().getX();
		double ry=ctx.getHitPos().y-ctx.getBlockPos().getY();
		double rz=ctx.getHitPos().z-ctx.getBlockPos().getZ();
		AxisPosition9 rp=st.get(AxisPosition9.POSITION);
		switch(ctx.getSide().getId()){
			case 4:case 5:{
				switch(closedRangeTo(.25,.75,ry)){
					case-1:{
						switch(closedRangeTo(.25,.75,rz)){
							case-1:rp=AxisPosition9.X_LOWERNORTH;break;
							case 0:rp=AxisPosition9.X_LOWER;break;
							case 1:rp=AxisPosition9.X_LOWERSOUTH;break;
						}
						break;
					}
					case 0:{
						switch(closedRangeTo(.25,.75,rz)){
							case-1:rp=AxisPosition9.X_NORTH;break;
							case 0:rp=AxisPosition9.X_CENTER;break;
							case 1:rp=AxisPosition9.X_SOUTH;break;
						}
						break;
					}
					case 1:{
						switch(closedRangeTo(.25,.75,rz)){
							case-1:rp=AxisPosition9.X_UPPERNORTH;break;
							case 0:rp=AxisPosition9.X_UPPER;break;
							case 1:rp=AxisPosition9.X_UPPERSOUTH;break;
						}
						break;
					}
				}
				break;
			}
			case 0:case 1:{
				switch(closedRangeTo(.25,.75,rx)){
					case-1:{
						switch(closedRangeTo(.25,.75,rz)){
							case-1:rp=AxisPosition9.Y_NORTHWEST;break;
							case 0:rp=AxisPosition9.Y_WEST;break;
							case 1:rp=AxisPosition9.Y_SOUTHWEST;break;
						}
						break;
					}
					case 0:{
						switch(closedRangeTo(.25,.75,rz)){
							case-1:rp=AxisPosition9.Y_NORTH;break;
							case 0:rp=AxisPosition9.Y_CENTER;break;
							case 1:rp=AxisPosition9.Y_SOUTH;break;
						}
						break;
					}
					case 1:{
						switch(closedRangeTo(.25,.75,rz)){
							case-1:rp=AxisPosition9.Y_NORTHEAST;break;
							case 0:rp=AxisPosition9.Y_EAST;break;
							case 1:rp=AxisPosition9.Y_SOUTHEAST;break;
						}
						break;
					}
				}
				break;
			}
			case 2:case 3:{
				switch(closedRangeTo(.25,.75,rx)){
					case-1:{
						switch(closedRangeTo(.25,.75,ry)){
							case-1:rp=AxisPosition9.Z_LOWERWEST;break;
							case 0:rp=AxisPosition9.Z_WEST;break;
							case 1:rp=AxisPosition9.Z_UPPERWEST;break;
						}
						break;
					}
					case 0:{
						switch(closedRangeTo(.25,.75,ry)){
							case-1:rp=AxisPosition9.Z_LOWER;break;
							case 0:rp=AxisPosition9.Z_CENTER;break;
							case 1:rp=AxisPosition9.Z_UPPER;break;
						}
						break;
					}
					case 1:{
						switch(closedRangeTo(.25,.75,ry)){
							case-1:rp=AxisPosition9.Z_LOWEREAST;break;
							case 0:rp=AxisPosition9.Z_EAST;break;
							case 1:rp=AxisPosition9.Z_UPPEREAST;break;
						}
						break;
					}
				}
				break;
			}
		}
		if(getWaterloggedProperty())st=st.with(WATERLOGGED,ctx.getWorld()
		.getFluidState(ctx.getBlockPos()).getFluid()==net.minecraft.fluid.Fluids
		.WATER);
		return st.with(AxisPosition9.POSITION,rp);
	}
}
