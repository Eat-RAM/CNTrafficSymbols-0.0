package rege.pegui.cntrafficsymbols.block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import rege.pegui.cntrafficsymbols.be.HighwayExitDistanceInfoNameBlockEntity;
public class HighwayExitDistanceInfoMiddleBlock extends WideBoardBlock
implements net.minecraft.block.BlockEntityProvider{
	public HighwayExitDistanceInfoMiddleBlock(WideBoardBlock cb,
	Settings s){super(cb,s);}
	@Override public BlockEntity createBlockEntity(BlockPos p,
	BlockState st){return new HighwayExitDistanceInfoNameBlockEntity(p,st);}
	@Override public void onPlaced(net.minecraft.world.World w,BlockPos p,
	BlockState st,net.minecraft.entity.LivingEntity pl,ItemStack itm){
		if(w.isClient){
			w.getBlockEntity(p,HighwayExitDistanceInfoNameBlockEntity.TYPE)
			.ifPresent(be->be.setCustomName(itm.hasCustomName()?itm.getName():null));
		}else if(itm.hasCustomName()){
			w.getBlockEntity(p,HighwayExitDistanceInfoNameBlockEntity.TYPE)
			.ifPresent(be->be.setCustomName(itm.getName()));
		}
	}
	@Override public ItemStack getPickStack(BlockView v,BlockPos p,BlockState st){
		BlockEntity be=v.getBlockEntity(p);
		return (be instanceof HighwayExitDistanceInfoNameBlockEntity)?
		new ItemStack(this.asItem(),st.get(rege.pegui.cntrafficsymbols.struct
		.DoubleFaceFacing.FACING).isSingle()?1:2)
		.setCustomName(((HighwayExitDistanceInfoNameBlockEntity)be).getCustomName()):
		super.getPickStack(v,p,st);
	}
}
