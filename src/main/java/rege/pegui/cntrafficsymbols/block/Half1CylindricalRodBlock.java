package rege.pegui.cntrafficsymbols.block;
import static net.minecraft.state.property.Properties.WATERLOGGED;
import static rege.pegui.cntrafficsymbols.Main.getWaterloggedProperty;
import static rege.pegui.cntrafficsymbols.helper.RangeUtil.closedRangeTo;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import rege.pegui.cntrafficsymbols.struct.FacePosition9;
public class Half1CylindricalRodBlock extends AbstractCylindricalRodBlock{
	private static final VoxelShape[]SHAPES_BY_ID={WEST_CENTER,
	WEST_UPPER,WEST_UPPERSOUTH,WEST_SOUTH,WEST_LOWERSOUTH,WEST_LOWER,
	WEST_LOWERNORTH,WEST_NORTH,WEST_UPPERNORTH,EAST_CENTER,EAST_UPPER,
	EAST_UPPERSOUTH,EAST_SOUTH,EAST_LOWERSOUTH,EAST_LOWER,EAST_LOWERNORTH,
	EAST_NORTH,EAST_UPPERNORTH,DOWN_CENTER,DOWN_NORTH,DOWN_NORTHEAST,DOWN_EAST,
	DOWN_SOUTHEAST,DOWN_SOUTH,DOWN_SOUTHWEST,DOWN_WEST,DOWN_NORTHWEST,UP_CENTER,
	UP_NORTH,UP_NORTHEAST,UP_EAST,UP_SOUTHEAST,UP_SOUTH,UP_SOUTHWEST,UP_WEST,
	UP_NORTHWEST,NORTH_CENTER,NORTH_UPPER,NORTH_UPPEREAST,NORTH_EAST,
	NORTH_LOWEREAST,NORTH_LOWER,NORTH_LOWERWEST,NORTH_WEST,NORTH_UPPERWEST,
	SOUTH_CENTER,SOUTH_UPPER,SOUTH_UPPEREAST,SOUTH_EAST,SOUTH_LOWEREAST,
	SOUTH_LOWER,SOUTH_LOWERWEST,SOUTH_WEST,SOUTH_UPPERWEST};
	public Half1CylindricalRodBlock(Settings s){
		super(s);setDefaultState(getDefaultState().with(FacePosition9.POSITION,
		FacePosition9.DOWN_CENTER));
	}
	@Override protected void appendProperties(net.minecraft.state.StateManager
	.Builder<net.minecraft.block.Block,BlockState>bd){
		bd.add(FacePosition9.POSITION);
		if(getWaterloggedProperty())bd.add(WATERLOGGED);
	}
	@Override public VoxelShape getOutlineShape(BlockState st,net.minecraft.world
	.BlockView v,BlockPos p,net.minecraft.block.ShapeContext c){
		return SHAPES_BY_ID[st.get(FacePosition9.POSITION).id];
	}
	@Override public BlockState
	getPlacementState(net.minecraft.item.ItemPlacementContext ctx){
		BlockState st=getDefaultState();
		double rx=ctx.getHitPos().x-ctx.getBlockPos().getX();
		double ry=ctx.getHitPos().y-ctx.getBlockPos().getY();
		double rz=ctx.getHitPos().z-ctx.getBlockPos().getZ();
		FacePosition9 rp=st.get(FacePosition9.POSITION);
		switch(ctx.getSide().getId()){
			case 5:{
				switch(closedRangeTo(.25,.75,ry)){
					case-1:{
						switch(closedRangeTo(.25,.75,rz)){
							case-1:rp=FacePosition9.WEST_LOWERNORTH;break;
							case 0:rp=FacePosition9.WEST_LOWER;break;
							case 1:rp=FacePosition9.WEST_LOWERSOUTH;break;
						}
						break;
					}
					case 0:{
						switch(closedRangeTo(.25,.75,rz)){
							case-1:rp=FacePosition9.WEST_NORTH;break;
							case 0:rp=FacePosition9.WEST_CENTER;break;
							case 1:rp=FacePosition9.WEST_SOUTH;break;
						}
						break;
					}
					case 1:{
						switch(closedRangeTo(.25,.75,rz)){
							case-1:rp=FacePosition9.WEST_UPPERNORTH;break;
							case 0:rp=FacePosition9.WEST_UPPER;break;
							case 1:rp=FacePosition9.WEST_UPPERSOUTH;break;
						}
						break;
					}
				}
				break;
			}
			case 4:{
				switch(closedRangeTo(.25,.75,ry)){
					case-1:{
						switch(closedRangeTo(.25,.75,rz)){
							case-1:rp=FacePosition9.EAST_LOWERNORTH;break;
							case 0:rp=FacePosition9.EAST_LOWER;break;
							case 1:rp=FacePosition9.EAST_LOWERSOUTH;break;
						}
						break;
					}
					case 0:{
						switch(closedRangeTo(.25,.75,rz)){
							case-1:rp=FacePosition9.EAST_NORTH;break;
							case 0:rp=FacePosition9.EAST_CENTER;break;
							case 1:rp=FacePosition9.EAST_SOUTH;break;
						}
						break;
					}
					case 1:{
						switch(closedRangeTo(.25,.75,rz)){
							case-1:rp=FacePosition9.EAST_UPPERNORTH;break;
							case 0:rp=FacePosition9.EAST_UPPER;break;
							case 1:rp=FacePosition9.EAST_UPPERSOUTH;break;
						}
						break;
					}
				}
				break;
			}
			case 1:{
				switch(closedRangeTo(.25,.75,rx)){
					case-1:{
						switch(closedRangeTo(.25,.75,rz)){
							case-1:rp=FacePosition9.DOWN_NORTHWEST;break;
							case 0:rp=FacePosition9.DOWN_WEST;break;
							case 1:rp=FacePosition9.DOWN_SOUTHWEST;break;
						}
						break;
					}
					case 0:{
						switch(closedRangeTo(.25,.75,rz)){
							case-1:rp=FacePosition9.DOWN_NORTH;break;
							case 0:rp=FacePosition9.DOWN_CENTER;break;
							case 1:rp=FacePosition9.DOWN_SOUTH;break;
						}
						break;
					}
					case 1:{
						switch(closedRangeTo(.25,.75,rz)){
							case-1:rp=FacePosition9.DOWN_NORTHEAST;break;
							case 0:rp=FacePosition9.DOWN_EAST;break;
							case 1:rp=FacePosition9.DOWN_SOUTHEAST;break;
						}
						break;
					}
				}
				break;
			}
			case 0:{
				switch(closedRangeTo(.25,.75,rx)){
					case-1:{
						switch(closedRangeTo(.25,.75,rz)){
							case-1:rp=FacePosition9.UP_NORTHWEST;break;
							case 0:rp=FacePosition9.UP_WEST;break;
							case 1:rp=FacePosition9.UP_SOUTHWEST;break;
						}
						break;
					}
					case 0:{
						switch(closedRangeTo(.25,.75,rz)){
							case-1:rp=FacePosition9.UP_NORTH;break;
							case 0:rp=FacePosition9.UP_CENTER;break;
							case 1:rp=FacePosition9.UP_SOUTH;break;
						}
						break;
					}
					case 1:{
						switch(closedRangeTo(.25,.75,rz)){
							case-1:rp=FacePosition9.UP_NORTHEAST;break;
							case 0:rp=FacePosition9.UP_EAST;break;
							case 1:rp=FacePosition9.UP_SOUTHEAST;break;
						}
						break;
					}
				}
				break;
			}
			case 3:{
				switch(closedRangeTo(.25,.75,rx)){
					case-1:{
						switch(closedRangeTo(.25,.75,ry)){
							case-1:rp=FacePosition9.NORTH_LOWERWEST;break;
							case 0:rp=FacePosition9.NORTH_WEST;break;
							case 1:rp=FacePosition9.NORTH_UPPERWEST;break;
						}
						break;
					}
					case 0:{
						switch(closedRangeTo(.25,.75,ry)){
							case-1:rp=FacePosition9.NORTH_LOWER;break;
							case 0:rp=FacePosition9.NORTH_CENTER;break;
							case 1:rp=FacePosition9.NORTH_UPPER;break;
						}
						break;
					}
					case 1:{
						switch(closedRangeTo(.25,.75,ry)){
							case-1:rp=FacePosition9.NORTH_LOWEREAST;break;
							case 0:rp=FacePosition9.NORTH_EAST;break;
							case 1:rp=FacePosition9.NORTH_UPPEREAST;break;
						}
						break;
					}
				}
				break;
			}
			case 2:{
				switch(closedRangeTo(.25,.75,rx)){
					case-1:{
						switch(closedRangeTo(.25,.75,ry)){
							case-1:rp=FacePosition9.SOUTH_LOWERWEST;break;
							case 0:rp=FacePosition9.SOUTH_WEST;break;
							case 1:rp=FacePosition9.SOUTH_UPPERWEST;break;
						}
						break;
					}
					case 0:{
						switch(closedRangeTo(.25,.75,ry)){
							case-1:rp=FacePosition9.SOUTH_LOWER;break;
							case 0:rp=FacePosition9.SOUTH_CENTER;break;
							case 1:rp=FacePosition9.SOUTH_UPPER;break;
						}
						break;
					}
					case 1:{
						switch(closedRangeTo(.25,.75,ry)){
							case-1:rp=FacePosition9.SOUTH_LOWEREAST;break;
							case 0:rp=FacePosition9.SOUTH_EAST;break;
							case 1:rp=FacePosition9.SOUTH_UPPEREAST;break;
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
		return st.with(FacePosition9.POSITION,rp);
	}
}
