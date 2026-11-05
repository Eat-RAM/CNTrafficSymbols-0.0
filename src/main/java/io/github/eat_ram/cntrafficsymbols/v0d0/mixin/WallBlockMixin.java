package io.github.eat_ram.cntrafficsymbols.v0d0.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import io.github.eat_ram.cntrafficsymbols.core.struct.Attachment3;
import io.github.eat_ram.cntrafficsymbols.core.struct.AxisPosition9;
import io.github.eat_ram.cntrafficsymbols.core.struct.DoubleFaceFacing;
import io.github.eat_ram.cntrafficsymbols.core.struct.FacePosition9;
import io.github.eat_ram.cntrafficsymbols.v0d0.Main;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.Full1CylindricalRodBlock;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.Half1CylindricalRodBlock;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.HighwayHmSignBlock;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.HighwayHmWallUpConnection;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.RodWallUpConnection;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.RodWithLampBlock;
import net.minecraft.block.Block;
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
        Block block = aboveState.getBlock();
        HighwayHmWallUpConnection hhMode =
        Main.getHighwayHmWallUpConnectionMode();
        if (hhMode != null && block instanceof HighwayHmSignBlock) {
            switch (hhMode) {
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
        RodWallUpConnection rMode = Main.getRodWallUpConnectionMode();
        if (rMode != null) {
            if (block instanceof Half1CylindricalRodBlock ||
                block instanceof RodWithLampBlock) {
                switch (rMode) {
                    case NONE: return original.call(
                        instance, state, north, east, south, west, empty()
                    );
                    case THIN_UP:
                    case CENTER_FAT_OTHER_THIN_UP:
                        switch (aboveState.get(FacePosition9.POSITION)) {
                            case DOWN_CENTER: return original.call(
                                instance, state, north, east, south, west,
                                rMode == RodWallUpConnection.THIN_UP ?
                                fullCube() : empty()
                            );
                            case DOWN_SOUTH: return original.call(
                                instance, state, north, east, south, west,
                                south ? fullCube() : empty()
                            );
                            case DOWN_WEST: return original.call(
                                instance, state, north, east, south, west,
                                west ? fullCube() : empty()
                            );
                            case DOWN_NORTH: return original.call(
                                instance, state, north, east, south, west,
                                north ? fullCube() : empty()
                            );
                            case DOWN_EAST: return original.call(
                                instance, state, north, east, south, west,
                                east ? fullCube() : empty()
                            );
                        }
                        break;
                }
            } else if (block instanceof Full1CylindricalRodBlock) {
                switch (rMode) {
                    case NONE: return original.call(
                        instance, state, north, east, south, west, empty()
                    );
                    case THIN_UP:
                    case CENTER_FAT_OTHER_THIN_UP:
                        switch (aboveState.get(AxisPosition9.POSITION)) {
                            case Y_CENTER: return original.call(
                                instance, state, north, east, south, west,
                                rMode == RodWallUpConnection.THIN_UP ?
                                fullCube() : empty()
                            );
                            case Y_SOUTH: return original.call(
                                instance, state, north, east, south, west,
                                south ? fullCube() : empty()
                            );
                            case Y_WEST: return original.call(
                                instance, state, north, east, south, west,
                                west ? fullCube() : empty()
                            );
                            case Y_NORTH: return original.call(
                                instance, state, north, east, south, west,
                                north ? fullCube() : empty()
                            );
                            case Y_EAST: return original.call(
                                instance, state, north, east, south, west,
                                east ? fullCube() : empty()
                            );
                        }
                        break;
                }
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
        Block block = aboveState.getBlock();
        HighwayHmWallUpConnection hhMode =
        Main.getHighwayHmWallUpConnectionMode();
        if (hhMode != null && block instanceof HighwayHmSignBlock) {
            return hhMode == HighwayHmWallUpConnection.FAT_UP &&
                   aboveState.get(Attachment3.ATTACHMENT) == Attachment3.DOWN
                   && !aboveState.get(DoubleFaceFacing.FACING).isWall();
        }
        RodWallUpConnection rMode = Main.getRodWallUpConnectionMode();
        if (rMode != null) {
            if (block instanceof Half1CylindricalRodBlock ||
                block instanceof RodWithLampBlock) {
                return rMode == RodWallUpConnection.CENTER_FAT_OTHER_THIN_UP &&
                       aboveState.get(FacePosition9.POSITION) ==
                       FacePosition9.DOWN_CENTER;
            }
            if (block instanceof Full1CylindricalRodBlock) {
                return rMode == RodWallUpConnection.CENTER_FAT_OTHER_THIN_UP &&
                       aboveState.get(AxisPosition9.POSITION) ==
                       AxisPosition9.Y_CENTER;
            }
        }
        return original;
    }
}
