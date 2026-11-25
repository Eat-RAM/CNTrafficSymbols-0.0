package io.github.eat_ram.cntrafficsymbols.v0d0.traffic;

import io.github.eat_ram.cntrafficsymbols.core.struct.PatternTypes;

public abstract class ModPatternTypes {
    public static final byte FULL_CIRCLE =
    PatternTypes.register((byte)0, "cntrafficsymbols_0d0:full_circle");
    public static final byte ARROW_STRAIGHT =
    PatternTypes.register((byte)1, "cntrafficsymbols_0d0:arrow_straight");
    public static final byte ARROW_LEFT =
    PatternTypes.register((byte)2, "cntrafficsymbols_0d0:arrow_left");
    public static final byte ARROW_RIGHT =
    PatternTypes.register((byte)3, "cntrafficsymbols_0d0:arrow_right");
    public static final byte ARROW_UTURN =
    PatternTypes.register((byte)4, "cntrafficsymbols_0d0:arrow_uturn");
    public static final byte ARROW_DOWN =
    PatternTypes.register((byte)5, "cntrafficsymbols_0d0:arrow_down");
    public static final byte CROSS =
    PatternTypes.register((byte)6, "cntrafficsymbols_0d0:cross");
    public static final byte PEDESTRIAN_STAND =
    PatternTypes.register((byte)7, "cntrafficsymbols_0d0:pedestrian_stand");
    public static final byte PEDESTRIAN_WALK =
    PatternTypes.register((byte)8, "cntrafficsymbols_0d0:pedestrian_walk");
    public static final byte BICYCLE =
    PatternTypes.register((byte)9, "cntrafficsymbols_0d0:bicycle");
    public static final byte BICYCLE_LEFT =
    PatternTypes.register((byte)10, "cntrafficsymbols_0d0:bicycle_left");

    public static void init() {}

    private ModPatternTypes() {}
}
