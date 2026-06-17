package io.github.eat_ram.cntrafficsymbols.v0d0.client.render.be;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.command.ModelCommandRenderer;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.Nullable;

public interface CustomBERenderer<T extends BlockEntity>
extends BlockEntityRenderer<T, CustomBERenderState<T>> {
    @Override
    public default CustomBERenderState<T> createRenderState() {
        return new CustomBERenderState<>();
    }

    public default void updateRenderState(
        T blockEntity, CustomBERenderState<T> state, float partialTicks,
        Vec3d cameraPosition,
        @Nullable ModelCommandRenderer.CrumblingOverlayCommand breakProgress
    ) {
        BlockEntityRenderer.super.updateRenderState(
            blockEntity, state, partialTicks, cameraPosition, breakProgress
        );
        state.blockEntity = blockEntity;
    }
}
