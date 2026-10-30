package io.github.eat_ram.cntrafficsymbols.v0d0.helper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;

import io.github.eat_ram.cntrafficsymbols.v0d0.block.FluidloggableType;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;

import org.apache.commons.lang3.tuple.Pair;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static io.github.eat_ram.cntrafficsymbols.v0d0.helper.FluidloggingConfig
              .globToPattern;
import static net.minecraft.state.property.Properties.WATERLOGGED;

public abstract class MapColorConfig {
    public static final String DEFAULT_RULES =
"highway_*hm=green/cyan;highway_km=green/cyan;barricades_1=orange/purple;*=clear";
    private static final Map<String, MapColor> COLOR_MAP = new HashMap<>();
    private static @NotNull List<Function<String, @Nullable String>>
    rules = Collections.emptyList();

    private static void reg(String name, MapColor color) {
        COLOR_MAP.put(name, color);
    }

    public static @Nullable MapColor parseColor(@Nullable String name) {
        if (name == null) {
            return null;
        }
        String clean = name.strip().toLowerCase(Locale.ROOT);
        MapColor res = COLOR_MAP.get(clean);
        if (res != null) {
            return res;
        }
        try {
            int id = Integer.parseInt(clean);
            return MapColor.get(id);
        } catch (NumberFormatException | IndexOutOfBoundsException ignored) {}
        return null;
    }

    public static void loadRules(@Nullable String rawRules) {
        if (rawRules == null || rawRules.isBlank()) {
            rawRules = DEFAULT_RULES;
        }
        List<Function<String, @Nullable String>> list = new ArrayList<>();
        for (String entry : rawRules.split(";")) {
            entry = entry.strip();
            if (entry.isEmpty() || entry.startsWith("#")) {
                continue;
            }
            int eq = entry.indexOf('=');
            if (eq == -1) {
                continue;
            }
            String patternStr = entry.substring(0, eq).strip();
            String valStr = entry.substring(eq + 1).strip();

            if (patternStr.equals("*")) {
                list.add(s -> valStr);
            } else if (patternStr.contains("*") || patternStr.contains("?")) {
                Pattern pattern = globToPattern(patternStr);
                list.add(s -> pattern.matcher(s).matches() ? valStr : null);
            } else {
                list.add(s -> s.equals(patternStr) ? valStr : null);
            }
        }
        rules = List.copyOf(list);
    }

    public static @NotNull Object resolve(@NotNull String path) {
        String fullId = path.contains(":") ?
                        path : "cntrafficsymbols_0d0:" + path;
        String rawPath = path.contains(":") ?
                         path.substring(path.indexOf(':') + 1) : path;
        String valStr = null;
        for (Function<String, @Nullable String> rule : rules) {
            valStr = rule.apply(rawPath);
            if (valStr == null) {
                valStr = rule.apply(fullId);
            }
            if (valStr != null) {
                break;
            }
        }
        if (valStr == null) {
            return MapColor.CLEAR;
        }

        int slash = valStr.indexOf('/');
        if (slash == -1) {
            MapColor color = parseColor(valStr);
            return (color != null) ? color : MapColor.CLEAR;
        }

        String dryStr = valStr.substring(0, slash).strip();
        String wetStr = valStr.substring(slash + 1).strip();
        MapColor dry = parseColor(dryStr);
        if (dry == null) {
            dry = MapColor.CLEAR;
        }

        FluidloggableType type = FluidloggingConfig.resolve(path);
        if (type == FluidloggableType.NONE) {
            return dry;
        }

        if (type == FluidloggableType.VANILLA) {
            MapColor wet = parseColor(wetStr);
            return (wet == null || wet == dry) ? dry : Pair.of(dry, wet);
        }

        Map<String, MapColor> fluidMap = new HashMap<>();
        fluidMap.put("dry", dry);
        if (wetStr.contains(":") || wetStr.contains(",")) {
            for (String part : wetStr.split(",")) {
                int col = part.indexOf(':');
                if (col != -1) {
                    String fName = part.substring(0, col).strip();
                    MapColor fColor = parseColor(part.substring(col + 1));
                    if (fColor != null) {
                        fluidMap.put(fName, fColor);
                    }
                }
            }
        } else {
            MapColor wet = parseColor(wetStr);
            if (wet != null) {
                fluidMap.put("water", wet);
                fluidMap.put("minecraft:water", wet);
            }
        }
        return Collections.unmodifiableMap(fluidMap);
    }

    public static @NotNull Block.Settings
    apply(@NotNull Block.Settings settings, @NotNull String name) {
        Object colorConf = resolve(name);
        if (colorConf instanceof MapColor) {
            return colorConf != MapColor.CLEAR ?
                   settings.mapColor((MapColor)colorConf) : settings;
        }
        if (colorConf instanceof Pair<?, ?> p) {
            MapColor dry = (MapColor)p.getLeft();
            MapColor wet = (MapColor)p.getRight();
            return settings.mapColor(st -> (
                st.getOrEmpty(WATERLOGGED).orElse(Boolean.FALSE)
            ) ? wet : dry);
        }/* else if (colorConf instanceof Map<?, ?> m) {
            @SuppressWarnings("unchecked")
            Map<String, MapColor> fluidMap = (Map<String, MapColor>)m;
            MapColor dry = fluidMap.getOrDefault("dry", MapColor.CLEAR);
            settings.mapColor(st -> {
                FluidState fs = st.getFluidState();
                if (fs.isEmpty()) {
                    return dry;
                }
                Identifier fid = Registries.FLUID.getId(fs.getFluid());
                MapColor mc = fluidMap.get(fid.toString());
                if (mc == null) {
                    mc = fluidMap.get(fid.getPath());
                }
                return (mc != null) ?
                       mc : fs.getBlockState().getMapColor(null, null);
            });
        }*/
        return settings;
    }

    static {
        reg("clear", MapColor.CLEAR);
        reg("none", MapColor.CLEAR);
        reg("pale_green", MapColor.PALE_GREEN);
        reg("grass", MapColor.PALE_GREEN);
        reg("pale_yellow", MapColor.PALE_YELLOW);
        reg("sand", MapColor.PALE_YELLOW);
        reg("white_gray", MapColor.WHITE_GRAY);
        reg("wool", MapColor.WHITE_GRAY);
        reg("bright_red", MapColor.BRIGHT_RED);
        reg("fire", MapColor.BRIGHT_RED);
        reg("pale_purple", MapColor.PALE_PURPLE);
        reg("ice", MapColor.PALE_PURPLE);
        reg("iron_gray", MapColor.IRON_GRAY);
        reg("metal", MapColor.IRON_GRAY);
        reg("dark_green", MapColor.DARK_GREEN);
        reg("plant", MapColor.DARK_GREEN);
        reg("white", MapColor.WHITE);
        reg("snow", MapColor.WHITE);
        reg("light_blue_gray", MapColor.LIGHT_BLUE_GRAY);
        reg("clay", MapColor.LIGHT_BLUE_GRAY);
        reg("dirt_brown", MapColor.DIRT_BROWN);
        reg("dirt", MapColor.DIRT_BROWN);
        reg("stone_gray", MapColor.STONE_GRAY);
        reg("stone", MapColor.STONE_GRAY);
        reg("water_blue", MapColor.WATER_BLUE);
        reg("water", MapColor.WATER_BLUE);
        reg("oak_tan", MapColor.OAK_TAN);
        reg("wood", MapColor.OAK_TAN);
        reg("off_white", MapColor.OFF_WHITE);
        reg("quartz", MapColor.OFF_WHITE);
        reg("orange", MapColor.ORANGE);
        reg("color_orange", MapColor.ORANGE);
        reg("magenta", MapColor.MAGENTA);
        reg("color_magenta", MapColor.MAGENTA);
        reg("light_blue", MapColor.LIGHT_BLUE);
        reg("color_light_blue", MapColor.LIGHT_BLUE);
        reg("yellow", MapColor.YELLOW);
        reg("color_yellow", MapColor.YELLOW);
        reg("lime", MapColor.LIME);
        reg("color_light_green", MapColor.LIME);
        reg("pink", MapColor.PINK);
        reg("color_pink", MapColor.PINK);
        reg("gray", MapColor.GRAY);
        reg("color_gray", MapColor.GRAY);
        reg("light_gray", MapColor.LIGHT_GRAY);
        reg("color_light_gray", MapColor.LIGHT_GRAY);
        reg("cyan", MapColor.CYAN);
        reg("color_cyan", MapColor.CYAN);
        reg("purple", MapColor.PURPLE);
        reg("color_purple", MapColor.PURPLE);
        reg("blue", MapColor.BLUE);
        reg("color_blue", MapColor.BLUE);
        reg("brown", MapColor.BROWN);
        reg("color_brown", MapColor.BROWN);
        reg("green", MapColor.GREEN);
        reg("color_green", MapColor.GREEN);
        reg("red", MapColor.RED);
        reg("color_red", MapColor.RED);
        reg("black", MapColor.BLACK);
        reg("color_black", MapColor.BLACK);
        reg("gold", MapColor.GOLD);
        reg("diamond_blue", MapColor.DIAMOND_BLUE);
        reg("diamond", MapColor.DIAMOND_BLUE);
        reg("lapis_blue", MapColor.LAPIS_BLUE);
        reg("lapis", MapColor.LAPIS_BLUE);
        reg("emerald_green", MapColor.EMERALD_GREEN);
        reg("emerald", MapColor.EMERALD_GREEN);
        reg("spruce_brown", MapColor.SPRUCE_BROWN);
        reg("podzol", MapColor.SPRUCE_BROWN);
        reg("dark_red", MapColor.DARK_RED);
        reg("nether", MapColor.DARK_RED);
        reg("terracotta_white", MapColor.TERRACOTTA_WHITE);
        reg("terracotta_orange", MapColor.TERRACOTTA_ORANGE);
        reg("terracotta_magenta", MapColor.TERRACOTTA_MAGENTA);
        reg("terracotta_light_blue", MapColor.TERRACOTTA_LIGHT_BLUE);
        reg("terracotta_yellow", MapColor.TERRACOTTA_YELLOW);
        reg("terracotta_lime", MapColor.TERRACOTTA_LIME);
        reg("terracotta_pink", MapColor.TERRACOTTA_PINK);
        reg("terracotta_gray", MapColor.TERRACOTTA_GRAY);
        reg("terracotta_light_gray", MapColor.TERRACOTTA_LIGHT_GRAY);
        reg("terracotta_cyan", MapColor.TERRACOTTA_CYAN);
        reg("terracotta_purple", MapColor.TERRACOTTA_PURPLE);
        reg("terracotta_blue", MapColor.TERRACOTTA_BLUE);
        reg("terracotta_brown", MapColor.TERRACOTTA_BROWN);
        reg("terracotta_green", MapColor.TERRACOTTA_GREEN);
        reg("terracotta_red", MapColor.TERRACOTTA_RED);
        reg("terracotta_black", MapColor.TERRACOTTA_BLACK);
        reg("dull_red", MapColor.DULL_RED);
        reg("crimson_nylium", MapColor.DULL_RED);
        reg("dull_pink", MapColor.DULL_PINK);
        reg("crimson_stem", MapColor.DULL_PINK);
        reg("dark_crimson", MapColor.DARK_CRIMSON);
        reg("crimson_hyphae", MapColor.DARK_CRIMSON);
        reg("teal", MapColor.TEAL);
        reg("warped_nylium", MapColor.TEAL);
        reg("dark_aqua", MapColor.DARK_AQUA);
        reg("warped_stem", MapColor.DARK_AQUA);
        reg("dark_dull_pink", MapColor.DARK_DULL_PINK);
        reg("warped_hyphae", MapColor.DARK_DULL_PINK);
        reg("bright_teal", MapColor.BRIGHT_TEAL);
        reg("warped_wart_block", MapColor.BRIGHT_TEAL);
        reg("deepslate_gray", MapColor.DEEPSLATE_GRAY);
        reg("deepslate", MapColor.DEEPSLATE_GRAY);
        reg("raw_iron_pink", MapColor.RAW_IRON_PINK);
        reg("raw_iron", MapColor.RAW_IRON_PINK);
        reg("lichen_green", MapColor.LICHEN_GREEN);
        reg("glow_lichen", MapColor.LICHEN_GREEN);
        loadRules(DEFAULT_RULES);
    }

    @Contract(value = "-> fail", pure = true)
    private MapColorConfig() {
        throw new UnsupportedOperationException("Utility class");
    }
}
