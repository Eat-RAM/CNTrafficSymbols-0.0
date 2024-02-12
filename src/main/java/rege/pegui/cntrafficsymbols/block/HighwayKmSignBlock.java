package rege.pegui.cntrafficsymbols.block;
import static net.minecraft.util.shape.VoxelShapes.cuboid;
import static net.minecraft.util.shape.VoxelShapes.union;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
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
		cuboid(.125,.3125,.9375,.875,.75,1),
		cuboid(.15625,.28125,.9375,.84375,.3125,1),
		cuboid(.1875,.25,.9375,.8125,.28125,1)
	);
	public static final VoxelShape SHAPE0E=union(
		cuboid(0,.3125,.125,.0625,.75,.875),
		cuboid(0,.28125,.15625,.0625,.3125,.84375),
		cuboid(0,.25,.1875,.0625,.28125,.8125)
	);
	public static final VoxelShape SHAPE0S=union(
		cuboid(.125,.3125,0,.875,.75,.0625),
		cuboid(.15625,.28125,0,.84375,.3125,.0625),
		cuboid(.1875,.25,0,.8125,.28125,.0625)
	);
	public static final VoxelShape SHAPE0W=union(
		cuboid(.9375,.3125,.125,1,.75,.875),
		cuboid(.9375,.28125,.15625,1,.3125,.84375),
		cuboid(.9375,.25,.1875,1,.28125,.8125)
	);
	public static final VoxelShape SHAPE1=cuboid(.375,0,.375,.625,.5,.625);
	public static final VoxelShape SHAPE1N=union(
		cuboid(.125,.0625,.9375,.875,.5,1),
		cuboid(.15625,.03125,.9375,.84375,.0625,1),
		cuboid(.1875,0,.9375,.8125,.03125,1)
	);
	public static final VoxelShape SHAPE1E=union(
		cuboid(0,.0625,.125,.0625,.5,.875),
		cuboid(0,.03125,.15625,.0625,.0625,.84375),
		cuboid(0,0,.1875,.0625,.03125,.8125)
	);
	public static final VoxelShape SHAPE1S=union(
		cuboid(.125,.0625,0,.875,.5,.0625),
		cuboid(.15625,.03125,0,.84375,.0625,.0625),
		cuboid(.1875,0,0,.8125,.03125,.0625)
	);
	public static final VoxelShape SHAPE1W=union(
		cuboid(.9375,.0625,.125,1,.5,.875),
		cuboid(.9375,.03125,.15625,1,.0625,.84375),
		cuboid(.9375,0,.1875,1,.03125,.8125)
	);
	public static final VoxelShape SHAPE2=cuboid(.375,.5,.375,.625,1,.625);
	public static final VoxelShape SHAPE2N=union(
		cuboid(.125,.5625,.9375,.875,1,1),
		cuboid(.15625,.53125,.9375,.84375,.5625,1),
		cuboid(.1875,.5,.9375,.8125,.53125,1)
	);
	public static final VoxelShape SHAPE2E=union(
		cuboid(0,.5625,.125,.0625,1,.875),
		cuboid(0,.53125,.15625,.0625,.5625,.84375),
		cuboid(0,.5,.1875,.0625,.53125,.8125)
	);
	public static final VoxelShape SHAPE2S=union(
		cuboid(.125,.5625,0,.875,1,.0625),
		cuboid(.15625,.53125,0,.84375,.5625,.0625),
		cuboid(.1875,.5,0,.8125,.53125,.0625)
	);
	public static final VoxelShape SHAPE2W=union(
		cuboid(.9375,.5625,.125,1,1,.875),
		cuboid(.9375,.53125,.15625,1,.5625,.84375),
		cuboid(.9375,.5,.1875,1,.53125,.8125)
	);
	public static final TagKey<net.minecraft.item.Item>LOCKS_HIGHWAY_KM_SIGN=
	TagKey.of(net.minecraft.registry.RegistryKeys.ITEM,
	new net.minecraft.util.Identifier("regedt32",
	"cntrafficsymbols/locks_highway_km_sign"));
	public HighwayKmSignBlock(Settings s){super(s);}
	@Override public BlockEntity createBlockEntity(BlockPos p,BlockState st){
		return new HighwayKmSignBlockEntity(p,st);
	}
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
			.ifPresent(be->be.setCustomName(itm.hasCustomName()?itm.getName():null));
		}else if(itm.hasCustomName()){
			w.getBlockEntity(p,HighwayKmSignBlockEntity.TYPE)
			.ifPresent(be->be.setCustomName(itm.getName()));
		}
	}
	@Override public ItemStack getPickStack(BlockView v,BlockPos p,BlockState st){
		BlockEntity be=v.getBlockEntity(p);
		return (be instanceof HighwayKmSignBlockEntity)?
		new ItemStack(this.asItem(),st.get(rege.pegui.cntrafficsymbols.struct
		.DoubleFaceFacing.FACING).isSingle()?1:2)
		.setCustomName(((HighwayKmSignBlockEntity)be).getCustomName()):
		super.getPickStack(v,p,st);
	}
	@Override public ActionResult onUse(BlockState st,World w,BlockPos p,
	PlayerEntity pl,Hand hand,BlockHitResult hit){
		BlockEntity ett=w.getBlockEntity(p);
		if(!(ett instanceof HighwayKmSignBlockEntity))return ActionResult.PASS;
		HighwayKmSignBlockEntity sett=(HighwayKmSignBlockEntity)ett;
		ItemStack itm=pl.getStackInHand(hand);
		if(itm.isEmpty()){
			int km=sett.getKm();
			if(km>=0){
				byte digit=(byte)(hit.getSide().getHorizontal());
				if(digit==(byte)-1)digit=(byte)4;
				short incr=1;for(byte i=0;i<digit;i++)incr*=10;
				sett.setKm((km+incr)%100000);return ActionResult.success(w.isClient);
			}
		}else if(itm.isIn(LOCKS_HIGHWAY_KM_SIGN)){
			int km=sett.getKm();
			if(km>=0){sett.setKm(~km);return ActionResult.success(w.isClient);}
		}
		return ActionResult.PASS;
	}
}
