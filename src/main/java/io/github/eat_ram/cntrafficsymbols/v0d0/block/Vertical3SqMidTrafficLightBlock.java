package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.HorizontalFacingBlock;

public class Vertical3SqMidTrafficLightBlock
extends VerticalTrafficLightBlock {
    public static final MapCodec<Vertical3SqMidTrafficLightBlock> CODEC =
    createCodec(Vertical3SqMidTrafficLightBlock::new);

    public Vertical3SqMidTrafficLightBlock(Settings settings) {
        super(3, settings, 16.);
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }
}
