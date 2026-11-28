package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import com.mojang.serialization.MapCodec;
import io.github.eat_ram.cntrafficsymbols.core.traffic.LightConfig;
import io.github.eat_ram.cntrafficsymbols.v0d0.traffic.ModPatternTypes;
import it.unimi.dsi.fastutil.bytes.ByteList;
import net.minecraft.block.HorizontalFacingBlock;

public class Vertical2TrafficLightBlock extends VerticalTrafficLightBlock {
    public static final MapCodec<Vertical2TrafficLightBlock> CODEC =
    createCodec(Vertical2TrafficLightBlock::new);

    public Vertical2TrafficLightBlock(Settings settings) {
        super(2, settings, 11.);
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }

    @Override
    public LightConfig createDefaultLightConfig() {
        return new LightConfig(2, ByteList.of(
            ModPatternTypes.PEDESTRIAN_STAND,
            ModPatternTypes.PEDESTRIAN_WALK
        ));
    }
}
