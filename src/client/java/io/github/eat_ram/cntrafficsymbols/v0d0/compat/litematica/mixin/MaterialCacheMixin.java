package io.github.eat_ram.cntrafficsymbols.v0d0.compat.litematica.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.google.common.collect.ImmutableList;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import io.github.eat_ram.cntrafficsymbols.core.block.DoubleFaceFacingBlock;
import io.github.eat_ram.cntrafficsymbols.core.block
       .SquareQuarterDefaulted3Block;
import io.github.eat_ram.cntrafficsymbols.core.block.WideBoardBlock;
import io.github.eat_ram.cntrafficsymbols.core.struct.DoubleFaceFacing;
import io.github.eat_ram.cntrafficsymbols.core.struct.DoubleFaceFacing90;
import me.fallenbreath.conditionalmixin.api.annotation.Condition;
import me.fallenbreath.conditionalmixin.api.annotation.Restriction;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import rege.pegui.cntrafficsymbols.SelfWork;
import rege.pegui.cntrafficsymbols.block.FloorLineEighthBlock;

@Restriction(require = @Condition("litematica"))
@Mixin(fi.dy.masa.litematica.materials.MaterialCache.class)
public abstract class MaterialCacheMixin {
    @ModifyReturnValue(method = "requiresMultipleItems", at = @At("RETURN"))
    private boolean addEntries(boolean original, BlockState state) {
        if (state.is(SelfWork.Blocks.FLOOR_LINE_EIGHTHS)) {
            int sl = FloorLineEighthBlock.to3Pow(state);
            boolean white = false;
            boolean yellow = false;
            for (int i = 0; i < 8; ++i) {
                int m = sl % 3;
                if (m == 1) {
                    white = true;
                } else if (m == 2) {
                    yellow = true;
                }
                if (white && yellow) {
                    return true;
                }
                sl /= 3;
            }
            return false;
        }
        if (state.is(SelfWork.Blocks.BARRICADES_1)) {
            boolean s1 = false;
            boolean s2 = false;
            switch (state.get(SquareQuarterDefaulted3Block.NORTHWEST)) {
                case 1: s1 = true; break;
                case 2: s2 = true; break;
            }
            switch (state.get(SquareQuarterDefaulted3Block.NORTHEAST)) {
                case 1: s1 = true; break;
                case 2: s2 = true; break;
            }
            if (s1 && s2) {
                return true;
            }
            switch (state.get(SquareQuarterDefaulted3Block.SOUTHWEST)) {
                case 1: s1 = true; break;
                case 2: s2 = true; break;
            }
            if (s1 && s2) {
                return true;
            }
            switch (state.get(SquareQuarterDefaulted3Block.SOUTHEAST)) {
                case 1: s1 = true; break;
                case 2: s2 = true; break;
            }
            return s1 && s2;
        }
        return original;
    }

    @ModifyReturnValue(method = "getItems", at = @At("RETURN"))
    private ImmutableList<ItemStack>
    addEntries(ImmutableList<ItemStack> original, BlockState state) {
        if (state.is(SelfWork.Blocks.FLOOR_LINE_EIGHTHS)) {
            int pow = FloorLineEighthBlock.to3Pow(state);
            byte s1 = 0;
            byte s2 = 0;
            for (byte i = 0; i < (byte)8; ++i) {
                switch (pow % 3) {
                    case 1:
                        ++s1;
                        break;
                    case 2:
                        ++s2;
                        break;
                }
                pow /= 3;
            }
            ImmutableList.Builder<ItemStack> bd = ImmutableList.builder();
            if (s1 > 0) {
                bd.add(new ItemStack(
                    SelfWork.Items.WHITE_FLOOR_LINE_EIGHTH, s1
                ));
            }
            if (s2 > 0) {
                bd.add(new ItemStack(
                    SelfWork.Items.YELLOW_FLOOR_LINE_EIGHTH, s2
                ));
            }
            return bd.build();
        }
        if (state.is(SelfWork.Blocks.BARRICADES_1)) {
            byte s1 = 0;
            byte s2 = 0;
            switch (state.get(SquareQuarterDefaulted3Block.NORTHWEST)) {
                case 1:
                    ++s1;
                    break;
                case 2:
                    ++s2;
                    break;
            }
            switch (state.get(SquareQuarterDefaulted3Block.NORTHEAST)) {
                case 1:
                    ++s1;
                    break;
                case 2:
                    ++s2;
                    break;
            }
            switch (state.get(SquareQuarterDefaulted3Block.SOUTHWEST)) {
                case 1:
                    ++s1;
                    break;
                case 2:
                    ++s2;
                    break;
            }
            switch (state.get(SquareQuarterDefaulted3Block.SOUTHEAST)) {
                case 1:
                    ++s1;
                    break;
                case 2:
                    ++s2;
                    break;
            }
            if (s1 == (byte)0 && s2 == (byte)0) {
                return ImmutableList.of(new ItemStack(
                    SelfWork.Items.BARRICADE_1M_EDGE_1M_HEIGHT, 1
                ));
            }
            ImmutableList.Builder<ItemStack> bd = ImmutableList.builder();
            if (s1 > 0) {
                bd.add(new ItemStack(
                    SelfWork.Items.BARRICADE_50CM_EDGE_75CM_HEIGHT, s1
                ));
            }
            if (s2 > 0) {
                bd.add(new ItemStack(
                    SelfWork.Items.BARRICADE_50CM_EDGE_1M_HEIGHT, s2
                ));
            }
            return bd.build();
        }
        return original;
    }

    @Inject(method = "overrideStackSize", at = @At("RETURN"))
    private void
    overrideStackSize(BlockState state, ItemStack stack, CallbackInfo ci) {
        Block block = state.getBlock();
        if (block instanceof DoubleFaceFacingBlock &&
            !state.getOrEmpty(DoubleFaceFacing.FACING)
             .orElse(DoubleFaceFacing.SOUTH).isSingle()) {
            stack.setCount(2);
        } else if (block instanceof WideBoardBlock &&
                   !state.getOrEmpty(DoubleFaceFacing90.FACING)
                    .orElse(DoubleFaceFacing90.SOUTH).isSingle()) {
            stack.setCount(2);
        }
    }
}
