package io.github.eat_ram.cntrafficsymbols.v0d0.client.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.DottedTPBlock;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.LinedTPBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;

import static net.minecraft.state.property.Properties.BOTTOM;

@Mixin(net.minecraft.client.world.ClientWorld.class)
public abstract class ClientWorldMixin {
    @ModifyExpressionValue(method = "addBlockBreakParticles", at = @At(
        value = "INVOKE",
        target =
"Lnet/minecraft/block/BlockState;getOutlineShape(Lnet/minecraft/world/BlockView;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/shape/VoxelShape;",
        ordinal = 0
    ))
    private VoxelShape modifyVoxelShape(
        VoxelShape original, final BlockPos pos, final BlockState state
    ) {
        Block block = state.getBlock();
        if (block instanceof DottedTPBlock || block instanceof LinedTPBlock) {
            return state.get(BOTTOM) ? DottedTPBlock.DOWN_BASE :
                   DottedTPBlock.UP_BASE;
        }
        return original;
    }
}
