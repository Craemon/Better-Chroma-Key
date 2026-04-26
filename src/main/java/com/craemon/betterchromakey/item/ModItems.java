package com.craemon.betterchromakey.item;

import com.craemon.betterchromakey.BetterChromaKey;
import net.minecraft.world.item.Item;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;

public class ModItems {
    public static final Item Testitem = registerItem("testitem", new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, "testitem")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BetterChromaKey.LOGGER.info("Registering Mod Items for "+ BetterChromaKey.MOD_ID);
    }
}
