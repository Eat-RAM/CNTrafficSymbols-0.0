package rege.pegui.cntrafficsymbols.block;
import static net.minecraft.util.shape.VoxelShapes.cuboid;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import rege.pegui.cntrafficsymbols.be.HighwayHmSignBlockEntity;
public class HighwayHmSignBlock extends Attachment3DoubleFaceFacingBlock
implements net.minecraft.block.BlockEntityProvider{
	public static final VoxelShape SHAPE0=cuboid(.375,.375,.375,.625,.625,.625);
	public static final VoxelShape SHAPE0N=cuboid(.375,.375,.9375,.625,.625,1);
	public static final VoxelShape SHAPE0E=cuboid(0,.375,.375,.0625,.625,.625);
	public static final VoxelShape SHAPE0S=cuboid(.375,.375,0,.625,.625,.0625);
	public static final VoxelShape SHAPE0W=cuboid(.9375,.375,.375,1,.625,.625);
	public static final VoxelShape SHAPE1=cuboid(.375,0,.375,.625,.25,.625);
	public static final VoxelShape SHAPE1N=cuboid(.375,0,.9375,.625,.25,1);
	public static final VoxelShape SHAPE1E=cuboid(0,0,.375,.0625,.25,.625);
	public static final VoxelShape SHAPE1S=cuboid(.375,0,0,.625,.25,.0625);
	public static final VoxelShape SHAPE1W=cuboid(.9375,0,.375,1,.25,.625);
	public static final VoxelShape SHAPE2=cuboid(.375,.75,.375,.625,1,.625);
	public static final VoxelShape SHAPE2N=cuboid(.375,.75,.9375,.625,1,1);
	public static final VoxelShape SHAPE2E=cuboid(0,.75,.375,.0625,1,.625);
	public static final VoxelShape SHAPE2S=cuboid(.375,.75,0,.625,1,.0625);
	public static final VoxelShape SHAPE2W=cuboid(.9375,.75,.375,1,1,.625);
	public HighwayHmSignBlock(Settings s){super(s);}
	@Override public BlockEntity createBlockEntity(BlockPos p,BlockState st){
		return new HighwayHmSignBlockEntity(p,st);
	}
	@Override public VoxelShape
	getOutlineShape(BlockState st,BlockView v,BlockPos p,ShapeContext c){
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
	@Override public VoxelShape
	getCollisionShape(BlockState st,BlockView v, BlockPos p,ShapeContext c){
		return net.minecraft.util.shape.VoxelShapes.empty();
	}
	@Override public void onPlaced(net.minecraft.world.World w,BlockPos p,
	BlockState st,net.minecraft.entity.LivingEntity pl,ItemStack itm){
		if(w.isClient){
			w.getBlockEntity(p,HighwayHmSignBlockEntity.TYPE)
			.ifPresent(be->be.setCustomName(itm.hasCustomName()?itm.getName():null));
		}else if(itm.hasCustomName()){
			w.getBlockEntity(p,HighwayHmSignBlockEntity.TYPE)
			.ifPresent(be->be.setCustomName(itm.getName()));
		}
	}
	@Override public ItemStack getPickStack(BlockView v,BlockPos p,BlockState st){
		BlockEntity be=v.getBlockEntity(p);
		return (be instanceof HighwayHmSignBlockEntity)?
		new ItemStack(this.asItem(),st.get(rege.pegui.cntrafficsymbols.struct
		.DoubleFaceFacing.FACING).isSingle()?1:2)
		.setCustomName(((HighwayHmSignBlockEntity)be).getName()):
		super.getPickStack(v,p,st);
	}
}
