package io.github.eat_ram.cntrafficsymbols.v0d0;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Properties;

import io.github.eat_ram.cntrafficsymbols.v0d0.block.AllBlockItems;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.AllBlocks;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.FloorLineEighthBlock;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.HighwayHmWallUpConnection;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.RodWallUpConnection;
import io.github.eat_ram.cntrafficsymbols.v0d0.helper.FluidloggingConfig;
import io.github.eat_ram.cntrafficsymbols.v0d0.helper.MapColorConfig;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayExitDistanceInfoKmBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayExitDistanceInfoNameBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayHmSignBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be
       .HighwayKmSignBlockEntity;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.be.RodWithLampBlockEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

import static io.github.eat_ram.cntrafficsymbols.v0d0.bakcompa.DualIds
              .commitAndGet;
import static io.github.eat_ram.cntrafficsymbols.v0d0.bakcompa.DualIds.push;
import static org.slf4j.LoggerFactory.getLogger;

public class Main implements ModInitializer {
    public static final Logger LOGGER = getLogger("cntrafficsymbols_0d0");
    private static final WorldConfig WORLD_CONFIG = new WorldConfig();
    private static final @NotNull HashSet<@NotNull Class<?>>
    blockstateOptimizations = new HashSet<>();

    @Contract(pure = true)
    public static @Nullable Boolean parseNullableBoolean(
        @NotNull String s, String @NotNull[] forTrue,
        String @NotNull[] forFalse, String @NotNull[] forNull
    ) throws IllegalArgumentException {
        for (String i : forTrue) {
            if (s.equals(i)) {
                return Boolean.TRUE;
            }
        }
        for (String i : forFalse) {
            if (s.equals(i)) {
                return Boolean.FALSE;
            }
        }
        for (String i : forNull) {
            if (s.equals(i)) {
                return null;
            }
        }
        throw new IllegalArgumentException(s);
    }

    @Contract(value = "-> new", pure = true)
    public static @NotNull HashSet<@NotNull Class<?>>
    getBlockstateOptimizations() {
        return new HashSet<>(blockstateOptimizations);
    }

    @Contract("_ -> new")
    public static @NotNull HashSet<@NotNull Class<?>>
    setBlockstateOptimizations(@NotNull Iterable<@NotNull Class<?>> newVal) {
        HashSet<Class<?>> r = new HashSet<>(blockstateOptimizations);
        blockstateOptimizations.clear();
        for (Class<?> i : newVal) {
            blockstateOptimizations.add(i);
        }
        return r;
    }

    public static void addDefaultBlockstateOptimizations() {
        if (!FabricLoader.getInstance().isModLoaded("ferritecore")) {
            blockstateOptimizations.add(FloorLineEighthBlock.class);
        }
    }

    @Contract(pure = true)
    public static @Nullable Boolean getHardcodedFloorLineEighthsLootEnabled() {
        return WORLD_CONFIG.hardcodedFloorLineEighthsLootEnabled;
    }

    public static @Nullable Boolean
    setHardcodedFloorLineEighthsLootEnabled(@Nullable Boolean newVal) {
        Boolean r = WORLD_CONFIG.hardcodedFloorLineEighthsLootEnabled;
        WORLD_CONFIG.hardcodedFloorLineEighthsLootEnabled = newVal;
        return r;
    }

    @Contract(pure = true)
    public static @Nullable HighwayHmWallUpConnection
    getHighwayHmWallUpConnectionMode() {
        return WORLD_CONFIG.highwayHmWallUpConnectionMode;
    }

    public static @Nullable HighwayHmWallUpConnection
    setHighwayHmWallUpConnectionMode(
        @Nullable HighwayHmWallUpConnection newVal
    ) {
        HighwayHmWallUpConnection r =
        WORLD_CONFIG.highwayHmWallUpConnectionMode;
        WORLD_CONFIG.highwayHmWallUpConnectionMode = newVal;
        return r;
    }

    @Contract(pure = true)
    public static @Nullable RodWallUpConnection
    getRodWallUpConnectionMode() {
        return WORLD_CONFIG.rodWallUpConnectionMode;
    }

    public static @Nullable RodWallUpConnection
    setRodWallUpConnectionMode(@Nullable RodWallUpConnection newVal) {
        RodWallUpConnection r = WORLD_CONFIG.rodWallUpConnectionMode;
        WORLD_CONFIG.rodWallUpConnectionMode = newVal;
        return r;
    }

    public static void readPropertiesFromFile(InputStream inputStream)
    throws IOException {
        Properties ppts = new Properties();
        ppts.load(inputStream);
        if (ppts.containsKey("fluidlogging_rules")) {
            String rules = ppts.getProperty("fluidlogging_rules").strip();
            FluidloggingConfig.loadRules(rules);
            LOGGER.info("Loaded fluidlogging_rules: " + rules);
        } else {
            FluidloggingConfig.loadRules(null);
            LOGGER.info(
                "No property fluidlogging_rules found. Use default value \"" +
                FluidloggingConfig.DEFAULT_RULES + "\"."
            );
        }
        if (ppts.containsKey("block_map_colors")) {
            String rules = ppts.getProperty("block_map_colors").strip();
            MapColorConfig.loadRules(rules);
            LOGGER.info("Loaded block_map_colors: " + rules);
        } else {
            MapColorConfig.loadRules(null);
            LOGGER.info(
                "No property block_map_colors found. Use default value \"" +
                MapColorConfig.DEFAULT_RULES + "\"."
            );
        }
        if (ppts.containsKey("blockstate_optimizations")) {
            try {
                for (String i : ppts.getProperty("blockstate_optimizations")
                                .strip().split(";")) {
                    blockstateOptimizations.add(Class.forName(i));
                }
                LOGGER.info(
                    "Overriding property value blockstate_optimizations with "
                    + blockstateOptimizations
                );
            } catch (ClassNotFoundException e) {
                blockstateOptimizations.clear();
                addDefaultBlockstateOptimizations();
                LOGGER.warn(
"Invalid config property value of blockstate_optimizations", e
                );
            }
        } else {
            addDefaultBlockstateOptimizations();
            ArrayList<String> classNames = new ArrayList<>();
            for (Class<?> i : blockstateOptimizations) {
                classNames.add(i.getName());
            }
            LOGGER.info(
"No property blockstate_optimizations found. Use defalt value \"" +
String.join(";", classNames) + "\"."
            );
        }
        if (ppts.containsKey("hardcoded_floor_line_eighths_loot_enabled")) {
            try {
                WORLD_CONFIG.hardcodedFloorLineEighthsLootEnabled =
                parseNullableBoolean(
                    ppts.getProperty(
                        "hardcoded_floor_line_eighths_loot_enabled"
                    ).strip().toLowerCase(Locale.ROOT),
                    new String[]{"true", "yes", "always"},
                    new String[]{"false", "no", "never"},
                    new String[]{"null", "auto"}
                );
                LOGGER.info(
"Overriding property value hardcoded_floor_line_eighths_loot_enabled with " +
WORLD_CONFIG.hardcodedFloorLineEighthsLootEnabled
                );
            } catch (IllegalArgumentException e) {
                LOGGER.warn(
"Invalid config property value of hardcoded_floor_line_eighths_loot_enabled", e
                );
            }
        } else {
            LOGGER.info(
"No property hardcoded_floor_line_eighths_loot_enabled found. Use defalt value \"auto\"."
            );
        }
        if (ppts.containsKey("highway_hm_wall_up_connection_mode")) {
            String val = ppts.getProperty(
                "highway_hm_wall_up_connection_mode"
            ).toUpperCase(Locale.ROOT);
            if ("UNSET".equals(val)) {
                WORLD_CONFIG.highwayHmWallUpConnectionMode = null;
                LOGGER.info(
"Overriding property value highway_hm_wall_up_connection_mode with UNSET"
                );
            } else {
                try {
                    WORLD_CONFIG.highwayHmWallUpConnectionMode =
                    HighwayHmWallUpConnection.valueOf(val);
                    LOGGER.info(
"Overriding property value highway_hm_wall_up_connection_mode with " +
WORLD_CONFIG.highwayHmWallUpConnectionMode.name()
                    );
                } catch (IllegalArgumentException e) {
                    LOGGER.warn(
"Invalid config property value of highway_hm_wall_up_connection_mode", e
                    );
                }
            }
        } else {
            LOGGER.info(
"No property highway_hm_wall_up_connection_mode found. Use defalt value \"thin_up\"."
            );
        }
        if (ppts.containsKey("rod_wall_up_connection_mode")) {
            String val = ppts.getProperty(
                "rod_wall_up_connection_mode"
            ).toUpperCase(Locale.ROOT);
            if ("UNSET".equals(val)) {
                WORLD_CONFIG.rodWallUpConnectionMode = null;
                LOGGER.info(
"Overriding property value rod_wall_up_connection_mode with UNSET"
                );
            } else {
                try {
                    WORLD_CONFIG.rodWallUpConnectionMode =
                    RodWallUpConnection.valueOf(val);
                    LOGGER.info(
"Overriding property value rod_wall_up_connection_mode with " +
WORLD_CONFIG.rodWallUpConnectionMode.name()
                    );
                } catch (IllegalArgumentException e) {
                    LOGGER.warn(
"Invalid config property value of rod_wall_up_connection_mode", e
                    );
                }
            }
        } else {
            LOGGER.info(
"No property rod_wall_up_connection_mode found. Use defalt value \"thin_up\"."
            );
        }
    }

    @Override
    public void onInitialize() {
        try (FileInputStream fis = new FileInputStream(
            FabricLoader.getInstance().getConfigDir()
            .resolve("cntrafficsymbols_0d0.properties").toFile()
        )) {
            readPropertiesFromFile(fis);
        } catch (java.io.FileNotFoundException e) {
            addDefaultBlockstateOptimizations();
            LOGGER.info(
                "No cntrafficsymbols_0d0.properties found. Use default config."
            );
        } catch (IOException e) {
            LOGGER.error("Error reading cntrafficsymbols_0d0.properties", e);
        }
        AllBlocks.init();
        AllBlockItems.init();
        Registry.register(Registries.BLOCK_ENTITY_TYPE, commitAndGet(
            Registries.BLOCK_ENTITY_TYPE, "highway_hm"
        ), HighwayHmSignBlockEntity.TYPE);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, commitAndGet(
            Registries.BLOCK_ENTITY_TYPE, "highway_km"
        ), HighwayKmSignBlockEntity.TYPE);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, commitAndGet(
            Registries.BLOCK_ENTITY_TYPE, "highway_exit_distance_info_name"
        ), HighwayExitDistanceInfoNameBlockEntity.TYPE);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, commitAndGet(
            Registries.BLOCK_ENTITY_TYPE, "highway_exit_distance_info_km"
        ), HighwayExitDistanceInfoKmBlockEntity.TYPE);
        Registry.register(Registries.BLOCK_ENTITY_TYPE, commitAndGet(
            Registries.BLOCK_ENTITY_TYPE, "rod_with_lamp"
        ), RodWithLampBlockEntity.TYPE);
        io.github.eat_ram.cntrafficsymbols.v0d0.network.ModNetworking.init();
        push();
    }
}
