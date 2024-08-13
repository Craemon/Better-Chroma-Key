package com.craemon.betterchromakey.item;

import com.craemon.betterchromakey.BetterChromaKey;
import com.craemon.betterchromakey.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BetterChromaKey_Group = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BetterChromaKey.MOD_ID, "betterchromakey"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.betterchromakey"))
                    .icon(() -> new ItemStack(ModBlocks.GREEN_CHROMA_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModItems.Testitem);
                        //Chroma Blocks
                        entries.add(ModBlocks.GREEN_CHROMA_BLOCK);
                        entries.add(ModBlocks.BLUE_CHROMA_BLOCK);
                        entries.add(ModBlocks.RED_CHROMA_BLOCK);
                        //Chroma Lamp Blocks
                        entries.add(ModBlocks.GREEN_CHROMA_LAMP);
                        entries.add(ModBlocks.BLUE_CHROMA_LAMP);
                        entries.add(ModBlocks.RED_CHROMA_LAMP);
                    }).build());

    public static void registerItemGroups() {
        BetterChromaKey.LOGGER.info("Registering Items Groups for "+BetterChromaKey.MOD_ID);
    }
}
