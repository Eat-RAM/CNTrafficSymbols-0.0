package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import io.github.eat_ram.cntrafficsymbols.core.traffic.LightConfig;
import io.github.eat_ram.cntrafficsymbols.v0d0.traffic.ModPatternTypes;
import it.unimi.dsi.fastutil.bytes.ByteList;

public class Horizontal2TrafficLightBlock extends HorizontalTrafficLightBlock {
    public Horizontal2TrafficLightBlock(Settings settings) {
        super(2, settings, 11.);
    }

    @Override
    public LightConfig createDefaultLightConfig() {
        return new LightConfig(
            2, ByteList.of(ModPatternTypes.CROSS, ModPatternTypes.ARROW_DOWN)
        );
    }
}
