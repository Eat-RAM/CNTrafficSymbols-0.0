package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import org.jetbrains.annotations.Nullable;

public enum FluidloggableType {
    NONE,
    VANILLA,
    REFLOG;

    public static @Nullable FluidloggableType
    fromString(@Nullable String str) {
        return (str == null) ? null : switch (str.strip().toLowerCase()) {
            case "none", "false", "no", "off", "dry" -> NONE;
            case "vanilla", "true", "yes", "water",
                 "waterlogged" -> VANILLA;
            case "reflog", "fluid", "fluidlogged" -> REFLOG;
            default -> null;
        };
    }
}
