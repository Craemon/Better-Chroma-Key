package com.craemon.betterchromakey.block;

import com.craemon.betterchromakey.BetterChromaKey;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    //Chroma Blocks
    public static final Block GREEN_CHROMA_BLOCK = registerBlock("green_chroma_block", new Block(AbstractBlock.Settings.create()));
    public static final Block BLUE_CHROMA_BLOCK = registerBlock("blue_chroma_block", new Block(AbstractBlock.Settings.create()));
    public static final Block RED_CHROMA_BLOCK = registerBlock("red_chroma_block", new Block(AbstractBlock.Settings.create()));
    public static final Block BLACK_CHROMA_BLOCK = registerBlock("black_chroma_block", new Block(AbstractBlock.Settings.create()));
    public static final Block WHITE_CHROMA_BLOCK = registerBlock("white_chroma_block", new Block(AbstractBlock.Settings.create()));
    public static final Block YELLOW_CHROMA_BLOCK = registerBlock("yellow_chroma_block", new Block(AbstractBlock.Settings.create()));
    public static final Block LIGHT_BLUE_CHROMA_BLOCK = registerBlock("light_blue_chroma_block", new Block(AbstractBlock.Settings.create()));
    public static final Block MAGENTA_CHROMA_BLOCK = registerBlock("magenta_chroma_block", new Block(AbstractBlock.Settings.create()));
    public static final Block REPLACE_ME_BLOCK = registerBlock("replace_me_block", new Block(AbstractBlock.Settings.create()));
    //Chroma Lamp Blocks
    public static final Block GREEN_CHROMA_LAMP = registerBlock("green_chroma_lamp", new Block(AbstractBlock.Settings.create().luminance(value -> 15)));
    public static final Block BLUE_CHROMA_LAMP = registerBlock("blue_chroma_lamp", new Block(AbstractBlock.Settings.create().luminance(value -> 15)));
    public static final Block RED_CHROMA_LAMP = registerBlock("red_chroma_lamp", new Block(AbstractBlock.Settings.create().luminance(value -> 15)));
    public static final Block BLACK_CHROMA_LAMP = registerBlock("black_chroma_lamp", new Block(AbstractBlock.Settings.create().luminance(value -> 15)));
    public static final Block WHITE_CHROMA_LAMP = registerBlock("white_chroma_lamp", new Block(AbstractBlock.Settings.create().luminance(value -> 15)));
    public static final Block YELLOW_CHROMA_LAMP = registerBlock("yellow_chroma_lamp", new Block(AbstractBlock.Settings.create().luminance(value -> 15)));
    public static final Block LIGHT_BLUE_CHROMA_LAMP = registerBlock("light_blue_chroma_lamp", new Block(AbstractBlock.Settings.create().luminance(value -> 15)));
    public static final Block MAGENTA_CHROMA_LAMP = registerBlock("magenta_chroma_lamp", new Block(AbstractBlock.Settings.create().luminance(value -> 15)));
    public static final Block REPLACE_ME_LAMP = registerBlock("replace_me_lamp", new Block(AbstractBlock.Settings.create().luminance(value -> 15)));

    //block register stuff
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BetterChromaKey.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(BetterChromaKey.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        BetterChromaKey.LOGGER.info("Registering Mod Blocks for "+ BetterChromaKey.MOD_ID);
    }
}
