package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import io.github.eat_ram.cntrafficsymbols.core.traffic.LightConfig;
import io.github.eat_ram.cntrafficsymbols.v0d0.traffic.ModPatternTypes;
import it.unimi.dsi.fastutil.bytes.ByteList;

public class Vertical2TrafficLightBlock extends VerticalTrafficLightBlock {
    public Vertical2TrafficLightBlock(Settings settings) {
        super(2, settings, 11.);
    }

    @Override
    public LightConfig createDefaultLightConfig() {
        return new LightConfig(2, ByteList.of(
            ModPatternTypes.PEDESTRIAN_STAND,
            ModPatternTypes.PEDESTRIAN_WALK
        ));
    }
}
