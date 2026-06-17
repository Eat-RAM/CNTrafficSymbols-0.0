package rege.pegui.cntrafficsymbols;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Properties;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class Main implements ModInitializer {
    public static final Logger LOGGER = getLogger("cntrafficsymbols_0d0");
    private static @Nullable Boolean hardcodedFloorLineEighthsLootEnabled =
    null;
    private static boolean waterloggedProperty = true;
    private static @Nullable Boolean hardcodedBarricades1LootEnabled = null;
    private static final @NotNull HashSet<@NotNull Class<?>>
    blockstateOptimizations = new HashSet<>();
    private static boolean preferLegacyIdentifiers = false;

    public static @Nullable Boolean parseNullableBoolean(
        String s, String[] forTrue, String[] forFalse, String[] forNull
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

    @Contract(pure = true)
    public static boolean getWaterloggedProperty() {
        return waterloggedProperty;
    }

    @Contract(pure = true)
    public static @Nullable Boolean getHardcodedBarricades1LootEnabled() {
        return hardcodedBarricades1LootEnabled;
    }

    @Contract(value = "-> new", pure = true)
    public static @NotNull HashSet<@NotNull Class<?>> getBlockstateOptimizations() {
        return new HashSet<>(blockstateOptimizations);
    }

    @Contract(pure = true)
    public static boolean getPreferLegacyIdentifiers() {
        return preferLegacyIdentifiers;
    }

    public static @Nullable Boolean
    setHardcodedFloorLineEighthsLootEnabled(@Nullable Boolean newVal) {
        Boolean r = hardcodedFloorLineEighthsLootEnabled;
        hardcodedFloorLineEighthsLootEnabled = newVal;
        return r;
    }

    public static @Nullable Boolean
    setHardcodedBarricades1LootEnabled(@Nullable Boolean newVal) {
        Boolean r = hardcodedBarricades1LootEnabled;
        hardcodedBarricades1LootEnabled = newVal;
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
            blockstateOptimizations.add(
                rege.pegui.cntrafficsymbols.block.FloorLineEighthBlock.class
            );
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
                LOGGER.info("Overriding property value hardcoded_floor_line_eighths_loot_enabled with " + hardcodedFloorLineEighthsLootEnabled);
            } catch (IllegalArgumentException e) {
                LOGGER.warn("Invalid config property value of hardcoded_floor_line_eighths_loot_enabled: " + e.getMessage());
            }
        } else {
            LOGGER.info("No property hardcoded_floor_line_eighths_loot_enabled found. Use defalt value \"auto\".");
        }
        if (ppts.containsKey("waterlogged_property")) {
            waterloggedProperty = Boolean.parseBoolean(
                ppts.getProperty("waterlogged_property").strip().toUpperCase()
            );
            LOGGER.info("Overriding property value waterlogged_property with "
                        + waterloggedProperty);
        } else {
            LOGGER.info(
                "No property waterlogged_property found. Use default value \"true\"."
            );
        }
        if (ppts.containsKey("hardcoded_barricades_1_loot_enabled")) {
            try {
                hardcodedBarricades1LootEnabled = parseNullableBoolean(
                    ppts.getProperty("hardcoded_barricades_1_loot_enabled")
                    .strip().toLowerCase(),
                    new String[]{"true", "yes", "always"},
                    new String[]{"false", "no", "never"},
                    new String[]{"null", "auto"}
                );
                LOGGER.info("Overriding property value hardcoded_barricades_1_loot_enabled with " + hardcodedBarricades1LootEnabled);
            } catch (IllegalArgumentException e) {
                LOGGER.warn(
                    "Invalid config property value of hardcoded_barricades_1_loot_enabled: " +
                    e.getMessage()
                );
            }
        } else {
            LOGGER.info("No property hardcoded_barricades_1_loot_enabled found. Use defalt value \"auto\".");
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
            LOGGER.info("No property blockstate_optimizations found. Use defalt value \"rege.pegui.cntrafficsymbols.block.FloorLineEighthBlock\".");
        }
        if (ppts.containsKey("prefer_legacy_identifiers")) {
            preferLegacyIdentifiers = Boolean.parseBoolean(ppts.getProperty(
                "prefer_legacy_identifiers"
            ).strip().toUpperCase());
            LOGGER.info(
                "Overriding property value prefer_legacy_identifiers with " +
                preferLegacyIdentifiers
            );
        } else {
            LOGGER.info(
                "No property prefer_legacy_identifiers found. Use default value \"false\"."
            );
        }
    }

    @Deprecated(since = "0.0.2-b2", forRemoval = true)
    public static void readProperties() throws IOException {
        try (FileInputStream fis = new FileInputStream(
            "config/cntrafficsymbols_0d0.properties"
        )) {
            readPropertiesFromFile(fis);
        }
    }

    @Override
    public void onInitialize() {
        try (FileInputStream fis = new FileInputStream(
            "config/cntrafficsymbols_0d0.properties"
        )) {
            readPropertiesFromFile(fis);
        } catch (java.io.FileNotFoundException e) {
            addDefaultBlockstateOptimizations();
            LOGGER.info(
                "No cntrafficsymbols_0d0.properties found. Use default config."
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
        SelfWork.doit();
    }
}
