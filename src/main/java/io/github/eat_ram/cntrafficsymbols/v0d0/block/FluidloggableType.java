package io.github.eat_ram.cntrafficsymbols.v0d0.block;

import java.util.Locale;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

public enum FluidloggableType {
    NONE,
    VANILLA,
    REFLOG;

    @Contract(value = "null -> null", pure = true)
    public static @Nullable FluidloggableType
    fromString(@Nullable String str) {
        return str == null ? null :
               switch (str.strip().toLowerCase(Locale.ROOT)) {
            case "none", "no", "off" -> NONE;
            case "vanilla", "water", "waterlogged" -> VANILLA;
            case "reflog" -> REFLOG;
            default -> null;
        };
    }
}
