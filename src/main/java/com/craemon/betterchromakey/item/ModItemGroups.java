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
                        //Green Blocks
                        entries.add(ModBlocks.GREEN_CHROMA_BLOCK);
                        entries.add(ModBlocks.GREEN_CHROMA_LAMP);
                        //Blue Blocks
                        entries.add(ModBlocks.BLUE_CHROMA_BLOCK);
                        entries.add(ModBlocks.BLUE_CHROMA_LAMP);
                        //Red Blocks
                        entries.add(ModBlocks.RED_CHROMA_BLOCK);
                        entries.add(ModBlocks.RED_CHROMA_LAMP);
                        //Black Blocks
                        entries.add(ModBlocks.BLACK_CHROMA_BLOCK);
                        entries.add(ModBlocks.BLACK_CHROMA_LAMP);
                        //White Blocks
                        entries.add(ModBlocks.WHITE_CHROMA_BLOCK);
                        entries.add(ModBlocks.WHITE_CHROMA_LAMP);
                        //Yellow Blocks
                        entries.add(ModBlocks.YELLOW_CHROMA_BLOCK);
                        entries.add(ModBlocks.YELLOW_CHROMA_LAMP);
                        //Light Blue Blocks
                        entries.add(ModBlocks.LIGHT_BLUE_CHROMA_BLOCK);
                        entries.add(ModBlocks.LIGHT_BLUE_CHROMA_LAMP);
                        //Magenta Blocks
                        entries.add(ModBlocks.MAGENTA_CHROMA_BLOCK);
                        entries.add(ModBlocks.MAGENTA_CHROMA_LAMP);
                    }).build());

    public static void registerItemGroups() {
        BetterChromaKey.LOGGER.info("Registering Items Groups for "+BetterChromaKey.MOD_ID);
    }
}
