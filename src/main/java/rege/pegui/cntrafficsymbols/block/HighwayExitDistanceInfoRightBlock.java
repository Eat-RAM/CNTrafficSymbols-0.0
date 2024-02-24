package rege.pegui.cntrafficsymbols.block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import rege.pegui.cntrafficsymbols.be.HighwayExitDistanceInfoKmBlockEntity;
public class HighwayExitDistanceInfoRightBlock extends WideBoardBlock
implements net.minecraft.block.BlockEntityProvider{
	public HighwayExitDistanceInfoRightBlock(WideBoardBlock cb,
	Settings s){super(cb,s);}
	@Override public BlockEntity createBlockEntity(BlockPos p,
	BlockState st){return new HighwayExitDistanceInfoKmBlockEntity(p,st);}
	@Override public void onPlaced(net.minecraft.world.World w,BlockPos p,
	BlockState st,net.minecraft.entity.LivingEntity pl,ItemStack itm){
		if(w.isClient){
			w.getBlockEntity(p,HighwayExitDistanceInfoKmBlockEntity.TYPE)
			.ifPresent(be->{
				if(itm.hasCustomName()){
					try{be.setKm(Float.parseFloat(itm.getName().getString()));}
					catch(NumberFormatException e){}
				}
			});
		}else if(itm.hasCustomName()){
			w.getBlockEntity(p,HighwayExitDistanceInfoKmBlockEntity.TYPE)
			.ifPresent(be->{
				try{be.setKm(Float.parseFloat(itm.getName().getString()));}
				catch(NumberFormatException e){}
			});
		}
	}
	@Override public ItemStack getPickStack(BlockView v,BlockPos p,BlockState st){
		BlockEntity be=v.getBlockEntity(p);return(be instanceof
		HighwayExitDistanceInfoKmBlockEntity)?new ItemStack(asItem(),st.get(rege
		.pegui.cntrafficsymbols.struct.DoubleFaceFacing90.FACING).isSingle()?1:2)
		.setCustomName(((HighwayExitDistanceInfoKmBlockEntity)be).getCustomName()):
		super.getPickStack(v,p,st);
	}
}
