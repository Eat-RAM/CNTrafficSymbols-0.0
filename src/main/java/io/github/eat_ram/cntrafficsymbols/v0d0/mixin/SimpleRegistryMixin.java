package io.github.eat_ram.cntrafficsymbols.v0d0.mixin;

import java.util.HashMap;

import io.github.eat_ram.cntrafficsymbols.v0d0.bakcompa.DualIds;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(net.minecraft.registry.SimpleRegistry.class)
public abstract class SimpleRegistryMixin<T> implements DualIds.Aliasable {
    @Shadow
    @Final
    RegistryKey<? extends Registry<T>> key;

    @Unique
    private @Nullable HashMap<Identifier, Identifier>
    cntrafficsymbols_0d0$aliases = null;

    @Override
    public void cntrafficsymbols_0d0$addAlias(Identifier from, Identifier to) {
        if (this.cntrafficsymbols_0d0$aliases == null) {
            this.cntrafficsymbols_0d0$aliases = new HashMap<>();
        }
        this.cntrafficsymbols_0d0$aliases.put(from, to);
    }

    @ModifyVariable(method = {
        "get(Lnet/minecraft/util/Identifier;)Ljava/lang/Object;", "containsId"
    }, at = @At("HEAD"), argsOnly = true)
    private Identifier redirectIdentifier(@Nullable Identifier id) {
        return (id != null && this.cntrafficsymbols_0d0$aliases != null) ?
               this.cntrafficsymbols_0d0$aliases.getOrDefault(id, id) : id;
    }

    @ModifyVariable(method = {
        "get(Lnet/minecraft/registry/RegistryKey;)Ljava/lang/Object;",
        "getEntry(Lnet/minecraft/registry/RegistryKey;)Ljava/util/Optional;",
        "getOrCreateEntry", "contains"
    }, at = @At("HEAD"), argsOnly = true)
    private RegistryKey<T>
    redirectRegistryKey(@Nullable RegistryKey<T> original) {
        if (original == null || this.cntrafficsymbols_0d0$aliases == null) {
            return original;
        }
        Identifier alias =
        this.cntrafficsymbols_0d0$aliases.get(original.getValue());
        return (alias != null) ? RegistryKey.of(this.key, alias) : original;
    }
}
