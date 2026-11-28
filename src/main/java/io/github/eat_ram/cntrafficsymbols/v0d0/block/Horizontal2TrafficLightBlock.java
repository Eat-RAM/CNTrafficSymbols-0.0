package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import com.mojang.serialization.MapCodec;
import io.github.eat_ram.cntrafficsymbols.core.traffic.LightConfig;
import io.github.eat_ram.cntrafficsymbols.v0d0.traffic.ModPatternTypes;
import it.unimi.dsi.fastutil.bytes.ByteList;
import net.minecraft.block.HorizontalFacingBlock;

public class Horizontal2TrafficLightBlock extends HorizontalTrafficLightBlock {
    public static final MapCodec<Horizontal2TrafficLightBlock> CODEC =
    createCodec(Horizontal2TrafficLightBlock::new);

    public Horizontal2TrafficLightBlock(Settings settings) {
        super(2, settings, 11.);
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }

    @Override
    public LightConfig createDefaultLightConfig() {
        return new LightConfig(
            2, ByteList.of(ModPatternTypes.CROSS, ModPatternTypes.ARROW_DOWN)
        );
    }
}
