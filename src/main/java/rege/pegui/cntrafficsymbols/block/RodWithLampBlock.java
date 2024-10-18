package rege.pegui.cntrafficsymbols.block;
import java.util.List;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.component.ComponentMap;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ItemActionResult;import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.World;
import rege.pegui.cntrafficsymbols.be.RodWithLampBlockEntity;
import rege.pegui.cntrafficsymbols.struct.FacePosition9;
import static net.minecraft.fluid.Fluids.WATER;
import static net.minecraft.state.property.Properties.LIT;
import static net.minecraft.state.property.Properties.WATERLOGGED;
import static rege.pegui.cntrafficsymbols.Main.getWaterloggedProperty;
import static rege.pegui.cntrafficsymbols.block.AbstractCylindricalRodBlock.*;
import static rege.pegui.cntrafficsymbols.helper.RangeUtil.closedRangeTo;
public class RodWithLampBlock extends net.minecraft.block.BlockWithEntity
implements ManagedWaterloggable{
	private static final VoxelShape[]SHAPES_BY_ID={X_CENTER,X_UPPER,X_UPPERSOUTH,
	X_SOUTH,X_LOWERSOUTH,X_LOWER,X_LOWERNORTH,X_NORTH,X_UPPERNORTH,X_CENTER,
	X_UPPER,X_UPPERSOUTH,X_SOUTH,X_LOWERSOUTH,X_LOWER,X_LOWERNORTH,X_NORTH,
	X_UPPERNORTH,Y_CENTER,Y_NORTH,Y_NORTHEAST,Y_EAST,Y_SOUTHEAST,Y_SOUTH,
	Y_SOUTHWEST,Y_WEST,Y_NORTHWEST,Y_CENTER,Y_NORTH,Y_NORTHEAST,Y_EAST,
	Y_SOUTHEAST,Y_SOUTH,Y_SOUTHWEST,Y_WEST,Y_NORTHWEST,Z_CENTER,Z_UPPER,
	Z_UPPEREAST,Z_EAST,Z_LOWEREAST,Z_LOWER,Z_LOWERWEST,Z_WEST,Z_UPPERWEST,
	Z_CENTER,Z_UPPER,Z_UPPEREAST,Z_EAST,Z_LOWEREAST,Z_LOWER,Z_LOWERWEST,Z_WEST,
	Z_UPPERWEST};
	public static enum LightVisualColor
	implements net.minecraft.util.StringIdentifiable{
		WHITE("white",0),LIGHT_YELLOW("light_yellow",1),YELLOW("yellow",2),
		ORANGE("orange",3);
		public final String str;
		public final int id;
		private LightVisualColor(String n,int i){str=n;id=i;}
		@Override public String asString(){return str;}
		public static final List<LightVisualColor>VARS=
		List.of(WHITE,LIGHT_YELLOW,YELLOW,ORANGE);
		public static LightVisualColor byID(int id){return VARS.get(id);}
	}
	public static final EnumProperty<LightVisualColor>COLOR=
	EnumProperty.of("color",LightVisualColor.class);
	public static final java.util.function.ToIntFunction<BlockState>LUMINANCE=st->
	st.get(LIT).booleanValue()?15:0;
	public RodWithLampBlock(Settings s){super(s);BlockState st=getDefaultState()
	.with(LIT,false).with(FacePosition9.POSITION,FacePosition9.DOWN_CENTER)
	.with(COLOR,LightVisualColor.WHITE);
	if(getWaterloggedProperty())st=st.with(WATERLOGGED,false);
	setDefaultState(st);}
	@Override protected MapCodec<?extends RodWithLampBlock>getCodec(){
		return createCodec(RodWithLampBlock::new);
	}
	@Override public BlockEntity createBlockEntity(BlockPos p,
	BlockState st){return new RodWithLampBlockEntity(p,st);}
	@Override public void
	onPlaced(World w,BlockPos p,BlockState st,LivingEntity pl,ItemStack itm){
		if(w.isClient){
			w.getBlockEntity(p,RodWithLampBlockEntity.TYPE).ifPresent(be->{
				if(itm.getComponents().contains(DataComponentTypes.CUSTOM_NAME)){
					try{be.setDuration(Integer.valueOf(itm.getName().getString()));}
					catch(NumberFormatException e){}
				}
			});
		}else if(itm.getComponents().contains(DataComponentTypes.CUSTOM_NAME)){
			w.getBlockEntity(p,RodWithLampBlockEntity.TYPE).ifPresent(be->{
				try{be.setDuration(Integer.valueOf(itm.getName().getString()));}
				catch(NumberFormatException e){}
			});
		}
	}
	@Override public ItemStack getPickStack(net.minecraft.world.WorldView v,
	BlockPos p,BlockState st){
		if(v.getBlockEntity(p)instanceof RodWithLampBlockEntity be){
			ItemStack itm=new ItemStack(this.asItem(),st.get(rege.pegui.cntrafficsymbols
			.struct.DoubleFaceFacing90.FACING).isSingle()?1:2);
			itm.applyComponentsFrom(ComponentMap.builder().add(DataComponentTypes
			.CUSTOM_NAME,be.getCustomName()).build());
			return itm;
		}
		return super.getPickStack(v,p,st);
	}
	@Override protected void appendProperties(net.minecraft.state.StateManager
	.Builder<net.minecraft.block.Block,BlockState>bd){
		bd.add(LIT,FacePosition9.POSITION,COLOR);
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
	@Override public ItemActionResult onUseWithItem(ItemStack itm,BlockState st,
	World w,BlockPos p,net.minecraft.entity.player.PlayerEntity pl,net.minecraft
	.util.Hand hand,net.minecraft.util.hit.BlockHitResult hit){
		if(pl.getStackInHand(hand).isEmpty()){
			w.setBlockState(p,st.cycle(COLOR),3);
			return ItemActionResult.success(w.isClient);
		}
		return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
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
	@Override public BlockRenderType
	getRenderType(BlockState st){return BlockRenderType.MODEL;}
	@Override @org.jetbrains.annotations.Nullable public<T extends BlockEntity>
	BlockEntityTicker<T> getTicker(World w,BlockState st,BlockEntityType<T>type){
		return!w.isClient?validateTicker(type,RodWithLampBlockEntity.TYPE,(world,p,
		state,t)->t.tick(world,p,state)):null;
	}
}
