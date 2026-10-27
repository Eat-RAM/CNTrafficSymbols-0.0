package io.github.eat_ram.cntrafficsymbols.v0d0.bakcompa;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import net.minecraft.registry.Registry;
import net.minecraft.registry.SimpleRegistry;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Contract;

public abstract class DualIds {
    private static final HashMap<Entry<SimpleRegistry<?>, String>, Runnable>
    COMMITTERS = new HashMap<>();

    @Contract("_, _ -> new")
    public static <T> Identifier
    commitAndGet(SimpleRegistry<T> registry, String path) {
        Identifier preferred = Identifier.of("cntrafficsymbols_0d0", path);
        if (!COMMITTERS.containsKey(
            new SimpleImmutableEntry<SimpleRegistry<?>, String>(registry, path)
        )) {
            Identifier legacyId =
            Identifier.of("regedt32", "cntrafficsymbols/" + path);
            COMMITTERS.put(new SimpleImmutableEntry<>(registry, path),
                           () -> registry.addAlias(legacyId, preferred));
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
