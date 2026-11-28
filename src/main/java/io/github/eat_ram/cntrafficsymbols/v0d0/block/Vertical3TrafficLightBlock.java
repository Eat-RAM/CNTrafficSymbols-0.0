package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.HorizontalFacingBlock;

public class Vertical3TrafficLightBlock extends VerticalTrafficLightBlock {
    public static final MapCodec<Vertical3TrafficLightBlock> CODEC =
    createCodec(Vertical3TrafficLightBlock::new);

    public Vertical3TrafficLightBlock(Settings settings) {
        super(3, settings, 16.);
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }
}
