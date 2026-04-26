package com.craemon.betterchromakey.item;

import com.craemon.betterchromakey.BetterChromaKey;
import com.craemon.betterchromakey.block.ModBlocks;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

public class ModItemGroups {
    public static final CreativeModeTab BetterChromaKey_Group = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, "betterchromakey"),
            FabricCreativeModeTab.builder().title(Component.translatable("itemgroup.betterchromakey"))
                    .icon(() -> new ItemStack(ModBlocks.GREEN_CHROMA_BLOCK)).displayItems((displayContext, entries) -> {
                        //Green Blocks
                        entries.accept(ModBlocks.GREEN_CHROMA_BLOCK);
                        entries.accept(ModBlocks.GREEN_CHROMA_LAMP);
                        //Blue Blocks
                        entries.accept(ModBlocks.BLUE_CHROMA_BLOCK);
                        entries.accept(ModBlocks.BLUE_CHROMA_LAMP);
                        //Red Blocks
                        entries.accept(ModBlocks.RED_CHROMA_BLOCK);
                        entries.accept(ModBlocks.RED_CHROMA_LAMP);
                        //Black Blocks
                        entries.accept(ModBlocks.BLACK_CHROMA_BLOCK);
                        entries.accept(ModBlocks.BLACK_CHROMA_LAMP);
                        //White Blocks
                        entries.accept(ModBlocks.WHITE_CHROMA_BLOCK);
                        entries.accept(ModBlocks.WHITE_CHROMA_LAMP);
                        //Yellow Blocks
                        entries.accept(ModBlocks.YELLOW_CHROMA_BLOCK);
                        entries.accept(ModBlocks.YELLOW_CHROMA_LAMP);
                        //Light Blue Blocks
                        entries.accept(ModBlocks.LIGHT_BLUE_CHROMA_BLOCK);
                        entries.accept(ModBlocks.LIGHT_BLUE_CHROMA_LAMP);
                        //Magenta Blocks
                        entries.accept(ModBlocks.MAGENTA_CHROMA_BLOCK);
                        entries.accept(ModBlocks.MAGENTA_CHROMA_LAMP);
                        //Replace Me Blocks
                        entries.accept(ModBlocks.REPLACE_ME_BLOCK);
                        entries.accept(ModBlocks.REPLACE_ME_LAMP);
                    }).build());

    public static void registerItemGroups() {
        BetterChromaKey.LOGGER.info("Registering Items Groups for "+BetterChromaKey.MOD_ID);
    }
}
