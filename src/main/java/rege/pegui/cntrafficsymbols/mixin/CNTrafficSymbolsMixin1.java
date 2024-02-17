package rege.pegui.cntrafficsymbols.mixin;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
@Mixin(net.minecraft.item.BucketItem.class)
public abstract class CNTrafficSymbolsMixin1{
	@Inject(method="placeFluid(Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/hit/BlockHitResult;)Z",
	at=@At(value="HEAD"),cancellable=true) private void
	injectPlaceFluid(@Nullable net.minecraft.entity.player.PlayerEntity player,
	net.minecraft.world.World world,net.minecraft.util.math.BlockPos pos,
	@Nullable net.minecraft.util.hit.BlockHitResult hitResult,
	org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable<Boolean>
	info){
		if((!rege.pegui.cntrafficsymbols.Main.getWaterloggedProperty())&&
		net.minecraft.item.Items.WATER_BUCKET==
		(net.minecraft.item.BucketItem)(Object)this){
			net.minecraft.block.Block b=world.getBlockState(pos).getBlock();
			if((b instanceof rege.pegui.cntrafficsymbols.block.DoubleFaceFacingBlock)||
			(b instanceof rege.pegui.cntrafficsymbols.block.FloorLineEighthBlock)||(b
			instanceof rege.pegui.cntrafficsymbols.block.WideBoardBlock)||(b instanceof
			rege.pegui.cntrafficsymbols.block.SquareQuarterDefaulted3Block))info
			.setReturnValue(false);
		}
	}
}
