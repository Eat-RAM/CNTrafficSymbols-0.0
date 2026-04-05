package io.github.eat_ram.cntrafficsymbols.v0d0.mixin;

import java.util.Map;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

@Mixin(net.minecraft.registry.SimpleRegistry.class)
public interface SimpleRegistryAccessor<T> {
    @Accessor("idToEntry")
    public Map<Identifier, RegistryEntry.Reference<T>> getIdToEntry();

    @Accessor("keyToEntry")
    public Map<RegistryKey<T>, RegistryEntry.Reference<T>> getKeyToEntry();
}
