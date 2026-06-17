package io.github.eat_ram.cntrafficsymbols.v0d0.helper;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.function.Function;

import static io.github.eat_ram.cntrafficsymbols.v0d0.bakcompa.DualIds
              .commitAndGet;

public abstract class RegisterHelper {
    public static <T extends Block> T registerBlock(
        Identifier iden,
        @NotNull Function<? super Block.Settings, T> blockFactory,
        @NotNull Block.Settings settings
    ) {
        RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, iden);
        settings.registryKey(blockKey);
        return Registry.register(
            Registries.BLOCK, blockKey, blockFactory.apply(settings)
        );
    }

    public static <T extends Item> T registerItem(
        Identifier iden,
        @NotNull Function<? super Item.Settings, T> itemFactory,
        @NotNull Item.Settings settings
    ) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, iden);
        settings.registryKey(itemKey);
        return Registry.register(
            Registries.ITEM, itemKey, itemFactory.apply(settings)
        );
    }

    @Contract("_, _ -> new")
    public static BlockItem registerBlockItem(
        @NotNull Block block, @NotNull Item.Settings settings
    ) {
        RegistryKey<Item> itemKey = RegistryKey.of(
            RegistryKeys.ITEM, Registries.BLOCK.getKey(block).get().getValue()
        );
        settings.registryKey(itemKey).useBlockPrefixedTranslationKey();
        return Registry.register(
            Registries.ITEM, itemKey, new BlockItem(block, settings)
        );
    }

    @Contract("_ -> new")
    public static Identifier commitDouble(String path) {
        commitAndGet(Registries.ITEM, path);
        return commitAndGet(Registries.BLOCK, path);
    }
}
