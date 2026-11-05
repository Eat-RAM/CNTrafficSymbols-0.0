package io.github.eat_ram.cntrafficsymbols.v0d0.helper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Pattern;

import io.github.eat_ram.cntrafficsymbols.v0d0.block.FluidloggableType;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class FluidloggingConfig {
    public static final String DEFAULT_RULES =
    "floor_line_eighths*=none;*=vanilla";
    private static @NotNull List<Function<String, @Nullable FluidloggableType>>
    rules = Collections.emptyList();
    private static final @NotNull FluidloggableType DEFAULT_FALLBACK =
    FluidloggableType.NONE;

    static {
        loadRules(DEFAULT_RULES);
    }

    public static void loadRules(@Nullable String rawRules) {
        if (rawRules == null || rawRules.isBlank()) {
            rawRules = DEFAULT_RULES;
        }
        List<Function<String, @Nullable FluidloggableType>> list =
        new ArrayList<>();
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
            FluidloggableType type =
            FluidloggableType.fromString(entry.substring(eq + 1));
            if (type == null) {
                continue;
            }

            if (patternStr.equals("*")) {
                list.add(s -> type);
            } else if (patternStr.contains("*") || patternStr.contains("?")) {
                Pattern pattern = globToPattern(patternStr);
                list.add(s -> pattern.matcher(s).matches() ? type : null);
            } else {
                list.add(s -> s.equals(patternStr) ? type : null);
            }
        }
        rules = List.copyOf(list);
    }

    public static @NotNull Pattern globToPattern(String glob) {
        StringBuilder sb = new StringBuilder("^");
        for (int i = 0; i < glob.length(); i++) {
            char c = glob.charAt(i);
            switch (c) {
                case '*' -> sb.append(".*");
                case '?' -> sb.append(".");
                case '.', '$', '^', '{', '}', '(', ')', '[', ']', '+', '|',
                     '\\' -> sb.append('\\').append(c);
                default -> sb.append(c);
            }
        }
        return Pattern.compile(sb.append('$').toString());
    }

    public static @NotNull FluidloggableType resolve(String path) {
        String fullId = path.contains(":") ?
                        path : "cntrafficsymbols_0d0:" + path;
        String rawPath = path.contains(":") ?
                         path.substring(path.indexOf(':') + 1) : path;
        for (Function<String, @Nullable FluidloggableType> rule : rules) {
            FluidloggableType type = rule.apply(rawPath);
            if (type == null) {
                type = rule.apply(fullId);
            }
            if (type != null) {
                return type;
            }
        }
        return DEFAULT_FALLBACK;
    }

    @Contract(value = "-> fail", pure = true)
    private FluidloggingConfig() {
        throw new UnsupportedOperationException("Utility class");
    }
}
