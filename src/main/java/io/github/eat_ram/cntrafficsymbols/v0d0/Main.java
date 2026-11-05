package io.github.eat_ram.cntrafficsymbols.v0d0;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Properties;

import io.github.eat_ram.cntrafficsymbols.v0d0.block.AllBlockItems;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.AllBlocks;
import io.github.eat_ram.cntrafficsymbols.v0d0.block.FloorLineEighthBlock;
import io.github.eat_ram.cntrafficsymbols.v0d0.helper.FluidloggingConfig;
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
    private static @Nullable Boolean hardcodedFloorLineEighthsLootEnabled =
    null;
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

    @Contract(pure = true)
    public static @Nullable Boolean getHardcodedFloorLineEighthsLootEnabled() {
        return hardcodedFloorLineEighthsLootEnabled;
    }

    @Contract(value = "-> new", pure = true)
    public static @NotNull HashSet<@NotNull Class<?>>
    getBlockstateOptimizations() {
        return new HashSet<>(blockstateOptimizations);
    }

    public static @Nullable Boolean
    setHardcodedFloorLineEighthsLootEnabled(@Nullable Boolean newVal) {
        Boolean r = hardcodedFloorLineEighthsLootEnabled;
        hardcodedFloorLineEighthsLootEnabled = newVal;
        return r;
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

    public static void readPropertiesFromFile(InputStream inputStream)
    throws IOException {
        Properties ppts = new Properties();
        ppts.load(inputStream);
        if (ppts.containsKey("hardcoded_floor_line_eighths_loot_enabled")) {
            try {
                hardcodedFloorLineEighthsLootEnabled = parseNullableBoolean(
                    ppts.getProperty(
                        "hardcoded_floor_line_eighths_loot_enabled"
                    ).strip().toLowerCase(),
                    new String[]{"true", "yes", "always"},
                    new String[]{"false", "no", "never"},
                    new String[]{"null", "auto"}
                );
                LOGGER.info(
"Overriding property value hardcoded_floor_line_eighths_loot_enabled with " +
hardcodedFloorLineEighthsLootEnabled
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
                    "Invalid config property value of blockstate_optimizations: " +
                    e.getMessage()
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
        push();
    }
}
