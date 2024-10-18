package rege.pegui.cntrafficsymbols.block;
import static net.minecraft.util.shape.VoxelShapes.cuboid;
import static net.minecraft.util.shape.VoxelShapes.union;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.component.ComponentMap;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import rege.pegui.cntrafficsymbols.be.HighwayKmSignBlockEntity;
public class HighwayKmSignBlock extends Attachment3DoubleFaceFacingBlock
implements net.minecraft.block.BlockEntityProvider{
	public static final VoxelShape SHAPE0=cuboid(.375,.25,.375,.625,.75,.625);
	public static final VoxelShape SHAPE0N=union(
		cuboid(.125,.375,.9375,.875,.75,1),
		cuboid(.15625,.34375,.9375,.84375,.375,1),
		cuboid(.1875,.3125,.9375,.8125,.34375,1),
		cuboid(.21875,.28125,.9375,.78125,.3125,1),
		cuboid(.25,.25,.9375,.75,.28125,1)
	);
	public static final VoxelShape SHAPE0E=union(
		cuboid(0,.375,.125,.0625,.75,.875),
		cuboid(0,.34375,.15625,.0625,.375,.84375),
		cuboid(0,.3125,.1875,.0625,.34375,.8125),
		cuboid(0,.28125,.21875,.0625,.3125,.78125),
		cuboid(0,.25,.25,.0625,.28125,.75)
	);
	public static final VoxelShape SHAPE0S=union(
		cuboid(.125,.375,0,.875,.75,.0625),
		cuboid(.15625,.34375,0,.84375,.375,.0625),
		cuboid(.1875,.3125,0,.8125,.34375,.0625),
		cuboid(.21875,.28125,0,.78125,.3125,.0625),
		cuboid(.25,.25,0,.75,.28125,.0625)
	);
	public static final VoxelShape SHAPE0W=union(
		cuboid(.9375,.375,.125,1,.75,.875),
		cuboid(.9375,.34375,.15625,1,.375,.84375),
		cuboid(.9375,.3125,.1875,1,.34375,.8125),
		cuboid(.9375,.28125,.21875,1,.3125,.78125),
		cuboid(.9375,.25,.25,1,.28125,.75)
	);
	public static final VoxelShape SHAPE1=cuboid(.375,0,.375,.625,.5,.625);
	public static final VoxelShape SHAPE1N=union(
		cuboid(.125,.125,.9375,.875,.5,1),
		cuboid(.15625,.09375,.9375,.84375,.125,1),
		cuboid(.1875,.0625,.9375,.8125,.09375,1),
		cuboid(.21875,.03125,.9375,.78125,.0625,1),
		cuboid(.25,0,.9375,.75,.03125,1)
	);
	public static final VoxelShape SHAPE1E=union(
		cuboid(0,.125,.125,.0625,.5,.875),
		cuboid(0,.09375,.15625,.0625,.125,.84375),
		cuboid(0,.0625,.1875,.0625,.09375,.8125),
		cuboid(0,.03125,.21875,.0625,.0625,.78125),
		cuboid(0,0,.25,.0625,.03125,.75)
	);
	public static final VoxelShape SHAPE1S=union(
		cuboid(.125,.125,0,.875,.5,.0625),
		cuboid(.15625,.09375,0,.84375,.125,.0625),
		cuboid(.1875,.0625,0,.8125,.09375,.0625),
		cuboid(.21875,.03125,0,.78125,.0625,.0625),
		cuboid(.25,0,0,.75,.03125,.0625)
	);
	public static final VoxelShape SHAPE1W=union(
		cuboid(.9375,.125,.125,1,.5,.875),
		cuboid(.9375,.09375,.15625,1,.125,.84375),
		cuboid(.9375,.0625,.1875,1,.09375,.8125),
		cuboid(.9375,.03125,.21875,1,.0625,.78125),
		cuboid(.9375,0,.25,1,.03125,.75)
	);
	public static final VoxelShape SHAPE2=cuboid(.375,.5,.375,.625,1,.625);
	public static final VoxelShape SHAPE2N=union(
		cuboid(.125,.625,.9375,.875,1,1),
		cuboid(.15625,.59375,.9375,.84375,.625,1),
		cuboid(.1875,.5625,.9375,.8125,.59375,1),
		cuboid(.21875,.53125,.9375,.78125,.5625,1),
		cuboid(.25,.5,.9375,.75,.53125,1)
	);
	public static final VoxelShape SHAPE2E=union(
		cuboid(0,.625,.125,.0625,1,.875),
		cuboid(0,.59375,.15625,.0625,.625,.84375),
		cuboid(0,.5625,.1875,.0625,.59375,.8125),
		cuboid(0,.53125,.21875,.0625,.5625,.78125),
		cuboid(0,.5,.25,.0625,.53125,.75)
	);
	public static final VoxelShape SHAPE2S=union(
		cuboid(.125,.625,0,.875,1,.0625),
		cuboid(.15625,.59375,0,.84375,.625,.0625),
		cuboid(.1875,.5625,0,.8125,.59375,.0625),
		cuboid(.21875,.53125,0,.78125,.5625,.0625),
		cuboid(.25,.5,0,.75,.53125,.0625)
	);
	public static final VoxelShape SHAPE2W=union(
		cuboid(.9375,.625,.125,1,1,.875),
		cuboid(.9375,.59375,.15625,1,.625,.84375),
		cuboid(.9375,.5625,.1875,1,.59375,.8125),
		cuboid(.9375,.53125,.21875,1,.5625,.78125),
		cuboid(.9375,.5,.25,1,.53125,.75)
	);
	public static final TagKey<net.minecraft.item.Item>LOCKS_HIGHWAY_KM_SIGN=
	TagKey.of(net.minecraft.registry.RegistryKeys.ITEM,
	net.minecraft.util.Identifier.of("regedt32",
	"cntrafficsymbols/locks_highway_km_sign"));
	public HighwayKmSignBlock(Settings s){super(s);}
	@Override public BlockEntity createBlockEntity(BlockPos p,
	BlockState st){return new HighwayKmSignBlockEntity(p,st);}
	@Override public VoxelShape getOutlineShape(BlockState st,BlockView v,
	BlockPos p,net.minecraft.block.ShapeContext c){
		int f=st.get(rege.pegui.cntrafficsymbols.struct.DoubleFaceFacing.FACING).id;
		int i=st.get(rege.pegui.cntrafficsymbols.struct.Attachment3.ATTACHMENT).id;
		switch(f){
			case 24:switch(i){
				case 1:return SHAPE1N;
				case 2:return SHAPE2N;
				default:return SHAPE0N;
			}
			case 25:switch(i){
				case 1:return SHAPE1E;
				case 2:return SHAPE2E;
				default:return SHAPE0E;
			}
			case 26:switch(i){
				case 1:return SHAPE1S;
				case 2:return SHAPE2S;
				default:return SHAPE0S;
			}
			case 27:switch(i){
				case 1:return SHAPE1W;
				case 2:return SHAPE2W;
				default:return SHAPE0W;
			}
		}
		switch(i){
			case 1:return SHAPE1;
			case 2:return SHAPE2;
			default:return SHAPE0;
		}
	}
	@Override public void onPlaced(net.minecraft.world.World w,BlockPos p,
	BlockState st,net.minecraft.entity.LivingEntity pl,ItemStack itm){
		if(w.isClient){
			w.getBlockEntity(p,HighwayKmSignBlockEntity.TYPE)
			.ifPresent(be->be.setCustomName(itm.getComponents()
			.contains(DataComponentTypes.CUSTOM_NAME)?itm.getName():null));
		}else if(itm.getComponents().contains(DataComponentTypes.CUSTOM_NAME)){
			w.getBlockEntity(p,HighwayKmSignBlockEntity.TYPE)
			.ifPresent(be->be.setCustomName(itm.getName()));
		}
	}
	@Override public ItemStack getPickStack(net.minecraft.world.WorldView v,
	BlockPos p,BlockState st){
		if(v.getBlockEntity(p)instanceof HighwayKmSignBlockEntity be){
			ItemStack itm=new ItemStack(this.asItem(),st.get(rege.pegui.cntrafficsymbols
			.struct.DoubleFaceFacing90.FACING).isSingle()?1:2);
			itm.applyComponentsFrom(ComponentMap.builder().add(DataComponentTypes
			.CUSTOM_NAME,be.getCustomName()).build());
			return itm;
		}
		return super.getPickStack(v,p,st);
	}
	@Override public ItemActionResult onUseWithItem(ItemStack itm,BlockState st,
	World w,BlockPos p,net.minecraft.entity.player.PlayerEntity pl,Hand hand,
	BlockHitResult hit){
		BlockEntity ett=w.getBlockEntity(p);
		if(!(ett instanceof HighwayKmSignBlockEntity))return ItemActionResult
		.PASS_TO_DEFAULT_BLOCK_INTERACTION;
		HighwayKmSignBlockEntity sett=(HighwayKmSignBlockEntity)ett;
		ItemStack itm2=pl.getStackInHand(hand);
		if(itm2.isEmpty()){
			int km=sett.getKm();
			if(km>=0){
				byte digit=(byte)(hit.getSide().getHorizontal());
				if(digit==(byte)-1)digit=(byte)4;
				short incr=1;for(byte i=0;i<digit;i++)incr*=10;
				sett.setKm((km+incr)%100000);return ItemActionResult.success(w.isClient);
			}
		}else if(itm2.isIn(LOCKS_HIGHWAY_KM_SIGN)){
			int km=sett.getKm();
			if(km>=0){sett.setKm(~km);return ItemActionResult.success(w.isClient);}
		}
		return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
	}
}
