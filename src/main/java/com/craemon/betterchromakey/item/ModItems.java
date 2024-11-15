package com.craemon.betterchromakey.item;

import com.craemon.betterchromakey.BetterChromaKey;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item Testitem = registerItem("testitem", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterChromaKey.MOD_ID, "testitem")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BetterChromaKey.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BetterChromaKey.LOGGER.info("Registering Mod Items for "+ BetterChromaKey.MOD_ID);
    }
}
