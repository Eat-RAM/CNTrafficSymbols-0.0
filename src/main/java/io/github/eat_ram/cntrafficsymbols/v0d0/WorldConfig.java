package io.github.eat_ram.cntrafficsymbols.v0d0;

import io.github.eat_ram.cntrafficsymbols.v0d0.block.HighwayHmWallUpConnection;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.RodWallUpConnection;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class WorldConfig {
    public @Nullable Boolean hardcodedFloorLineEighthsLootEnabled = null;
    public @Nullable HighwayHmWallUpConnection highwayHmWallUpConnectionMode =
    HighwayHmWallUpConnection.THIN_UP;
    public @Nullable RodWallUpConnection rodWallUpConnectionMode =
    RodWallUpConnection.THIN_UP;

    @Contract(value = "-> new", pure = true)
    public @NotNull WorldConfig copy() {
        WorldConfig copied = new WorldConfig();
        copied.hardcodedFloorLineEighthsLootEnabled =
        this.hardcodedFloorLineEighthsLootEnabled;
        copied.highwayHmWallUpConnectionMode =
        this.highwayHmWallUpConnectionMode;
        copied.rodWallUpConnectionMode = this.rodWallUpConnectionMode;
        return copied;
    }
}
