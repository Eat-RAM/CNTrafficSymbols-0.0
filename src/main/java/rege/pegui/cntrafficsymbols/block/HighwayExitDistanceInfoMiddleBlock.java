package rege.pegui.cntrafficsymbols.block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.component.ComponentMap;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
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
			.ifPresent(be->be.setCustomName(itm.getComponents()
			.contains(DataComponentTypes.CUSTOM_NAME)?itm.getName():null));
		}else if(itm.getComponents().contains(DataComponentTypes.CUSTOM_NAME)){
			w.getBlockEntity(p,HighwayExitDistanceInfoNameBlockEntity.TYPE)
			.ifPresent(be->be.setCustomName(itm.getName()));
		}
	}
	@Override public ItemStack getPickStack(net.minecraft.world.WorldView v,
	BlockPos p,BlockState st){
		if(v.getBlockEntity(p)instanceof HighwayExitDistanceInfoNameBlockEntity be){
			ItemStack itm=new ItemStack(this.asItem(),st.get(rege.pegui.cntrafficsymbols
			.struct.DoubleFaceFacing90.FACING).isSingle()?1:2);
			itm.applyComponentsFrom(ComponentMap.builder().add(DataComponentTypes
			.CUSTOM_NAME,be.getCustomName()).build());
			return itm;
		}
		return super.getPickStack(v,p,st);
	}
}
