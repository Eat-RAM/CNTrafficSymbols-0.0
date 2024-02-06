package rege.pegui.cntrafficsymbols.block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import rege.pegui.cntrafficsymbols.be.HighwayHmSignBlockEntity;
public class HighwayHmSignBlock extends Attachment3DoubleFaceFacingBlock
implements net.minecraft.block.BlockEntityProvider{
	public HighwayHmSignBlock(Settings s){super(s);}
	@Override public BlockEntity createBlockEntity(BlockPos p,BlockState st){
		return new HighwayHmSignBlockEntity(p,st);
	}
	@Override public BlockRenderType getRenderType(BlockState state){
		return BlockRenderType.INVISIBLE;
	}
	@Override public void
	onPlaced(World w,BlockPos p,BlockState st,LivingEntity pl,ItemStack itm){
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
