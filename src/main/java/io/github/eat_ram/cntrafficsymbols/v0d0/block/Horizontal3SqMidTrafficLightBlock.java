package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.HorizontalFacingBlock;

public class Horizontal3SqMidTrafficLightBlock
extends HorizontalTrafficLightBlock {
    public static final MapCodec<Horizontal3SqMidTrafficLightBlock> CODEC =
    createCodec(Horizontal3SqMidTrafficLightBlock::new);

    public Horizontal3SqMidTrafficLightBlock(Settings settings) {
        super(3, settings, 16.);
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }
}
