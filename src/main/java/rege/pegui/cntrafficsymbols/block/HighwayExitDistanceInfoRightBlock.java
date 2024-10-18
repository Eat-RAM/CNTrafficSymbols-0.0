package rege.pegui.cntrafficsymbols.block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.component.ComponentMap;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
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
				if(itm.getComponents().contains(DataComponentTypes.CUSTOM_NAME)){
					try{be.setKm(Float.parseFloat(itm.getName().getString()));}
					catch(NumberFormatException e){}
				}
			});
		}else if(itm.getComponents().contains(DataComponentTypes.CUSTOM_NAME)){
			w.getBlockEntity(p,HighwayExitDistanceInfoKmBlockEntity.TYPE)
			.ifPresent(be->{
				try{be.setKm(Float.parseFloat(itm.getName().getString()));}
				catch(NumberFormatException e){}
			});
		}
	}
	@Override public ItemStack getPickStack(net.minecraft.world.WorldView v,
	BlockPos p,BlockState st){
		if(v.getBlockEntity(p)instanceof HighwayExitDistanceInfoKmBlockEntity be){
			ItemStack itm=new ItemStack(this.asItem(),st.get(rege.pegui.cntrafficsymbols
			.struct.DoubleFaceFacing90.FACING).isSingle()?1:2);
			itm.applyComponentsFrom(ComponentMap.builder().add(DataComponentTypes
			.CUSTOM_NAME,be.getCustomName()).build());
			return itm;
		}
		return super.getPickStack(v,p,st);
	}
}
