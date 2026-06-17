package io.github.eat_ram.cntrafficsymbols.v0d0.client.render.be;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.render.block.entity.state.BlockEntityRenderState;

public class CustomBERenderState<T extends BlockEntity>
extends BlockEntityRenderState {
    public T blockEntity;
}
