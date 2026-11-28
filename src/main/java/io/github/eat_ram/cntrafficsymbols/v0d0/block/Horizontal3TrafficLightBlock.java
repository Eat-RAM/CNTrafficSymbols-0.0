package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.HorizontalFacingBlock;

public class Horizontal3TrafficLightBlock extends HorizontalTrafficLightBlock {
    public static final MapCodec<Horizontal3TrafficLightBlock> CODEC =
    createCodec(Horizontal3TrafficLightBlock::new);

    public Horizontal3TrafficLightBlock(Settings settings) {
        super(3, settings, 16.);
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }
}
