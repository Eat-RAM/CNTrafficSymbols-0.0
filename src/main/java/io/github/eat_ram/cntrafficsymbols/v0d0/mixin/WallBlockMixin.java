package io.github.eat_ram.cntrafficsymbols.v0d0.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import io.github.eat_ram.cntrafficsymbols.core.struct.Attachment3;
import io.github.eat_ram.cntrafficsymbols.core.struct.DoubleFaceFacing;
import io.github.eat_ram.cntrafficsymbols.v0d0.Main;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.HighwayHmSignBlock;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.HighwayHmWallUpConnection;
import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;
import net.minecraft.util.shape.VoxelShape;

import static net.minecraft.util.shape.VoxelShapes.empty;
import static net.minecraft.util.shape.VoxelShapes.fullCube;

@Mixin(net.minecraft.block.WallBlock.class)
public abstract class WallBlockMixin {
    @WrapOperation(
        method =
"getStateWith(Lnet/minecraft/world/WorldView;Lnet/minecraft/block/BlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;ZZZZ)Lnet/minecraft/block/BlockState;",
        at = @At(
            value = "INVOKE",
            target =
"Lnet/minecraft/block/WallBlock;getStateWith(Lnet/minecraft/block/BlockState;ZZZZLnet/minecraft/util/shape/VoxelShape;)Lnet/minecraft/block/BlockState;"
        )
    )
    private BlockState modifyState(
        WallBlock instance, BlockState state, boolean north, boolean east,
        boolean south, boolean west, VoxelShape aboveShape,
        Operation<BlockState> original,
        @Local(ordinal = 1, argsOnly = true) final BlockState aboveState
    ) {
        HighwayHmWallUpConnection mode =
        Main.getHighwayHmWallUpConnectionMode();
        if (mode != null &&
            aboveState.getBlock() instanceof HighwayHmSignBlock) {
            switch (mode) {
                case NONE:
                case FAT_UP: return original.call(
                    instance, state, north, east, south, west, empty()
                );
                case THIN_UP: return original.call(
                    instance, state, north, east, south, west,
                    aboveState.get(Attachment3.ATTACHMENT) == Attachment3.DOWN
                    && !aboveState.get(DoubleFaceFacing.FACING).isWall() ?
                    fullCube() : empty()
                );
            }
        }
        return original.call(
            instance, state, north, east, south, west, aboveShape
        );
    }

    @ModifyExpressionValue(method = "shouldHavePost", at = @At(
        value = "INVOKE",
        target =
"Lnet/minecraft/block/BlockState;isIn(Lnet/minecraft/registry/tag/TagKey;)Z",
        ordinal = 0
    ))
    private boolean modifyShouldHavePost(
        boolean original,
        @Local(ordinal = 1, argsOnly = true) final BlockState aboveState
    ) {
        HighwayHmWallUpConnection mode =
        Main.getHighwayHmWallUpConnectionMode();
        if (mode != null &&
            aboveState.getBlock() instanceof HighwayHmSignBlock) {
            return mode == HighwayHmWallUpConnection.FAT_UP &&
                   aboveState.get(Attachment3.ATTACHMENT) == Attachment3.DOWN
                   && !aboveState.get(DoubleFaceFacing.FACING).isWall();
        }
        return original;
    }
}
