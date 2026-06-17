package io.github.eat_ram.cntrafficsymbols.v0d0.bakcompa;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import net.minecraft.registry.Registry;
import net.minecraft.registry.SimpleRegistry;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Contract;

import static rege.pegui.cntrafficsymbols.Main.getPreferLegacyIdentifiers;

public abstract class DualIds {
    private static final HashMap<Entry<SimpleRegistry<?>, String>, Runnable>
    COMMITTERS = new HashMap<>();

    @Contract("_, _ -> new")
    @SuppressWarnings("unchecked")
    public static <T> Identifier
    commitAndGet(SimpleRegistry<T> registry, String path) {
        Identifier legacyId =
        Identifier.of("regedt32", "cntrafficsymbols/" + path);
        Identifier newId = Identifier.of("cntrafficsymbols_0d0", path);
        boolean preferLegacy = getPreferLegacyIdentifiers();
        Identifier preferred = preferLegacy ? legacyId : newId;
        if (!COMMITTERS.containsKey(
            new SimpleImmutableEntry<>(registry, path)
        )) {
            Identifier spare = preferLegacy ? newId : legacyId;
            COMMITTERS.put(new SimpleImmutableEntry<>(registry, path),
                           () -> registry.addAlias(spare, preferred));
        }
        return preferred;
    }

    @Contract("_, _ -> new")
    public static <T> Identifier
    commitAndGet(Registry<T> registry, String path) {
        return commitAndGet((SimpleRegistry<T>)registry, path);
    }

    public static void push() {
        Iterator<Entry<Entry<SimpleRegistry<?>, String>, Runnable>> iterator =
        COMMITTERS.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<Entry<SimpleRegistry<?>, String>, Runnable> entry =
            iterator.next();
            Runnable task = entry.getValue();
            iterator.remove();
            task.run();
        }
    }
}
