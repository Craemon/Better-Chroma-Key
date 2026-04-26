package com.craemon.betterchromakey.block;

import com.craemon.betterchromakey.BetterChromaKey;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;

public class ModBlocks {

    //Chroma Blocks
    public static final Block GREEN_CHROMA_BLOCK = registerBlock("green_chroma_block",
            new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, "green_chroma_block")))));
    public static final Block BLUE_CHROMA_BLOCK = registerBlock("blue_chroma_block",
            new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, "blue_chroma_block")))));
    public static final Block RED_CHROMA_BLOCK = registerBlock("red_chroma_block",
            new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, "red_chroma_block")))));
    public static final Block BLACK_CHROMA_BLOCK = registerBlock("black_chroma_block",
            new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, "black_chroma_block")))));
    public static final Block WHITE_CHROMA_BLOCK = registerBlock("white_chroma_block",
            new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, "white_chroma_block")))));
    public static final Block YELLOW_CHROMA_BLOCK = registerBlock("yellow_chroma_block",
            new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, "yellow_chroma_block")))));
    public static final Block LIGHT_BLUE_CHROMA_BLOCK = registerBlock("light_blue_chroma_block",
            new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, "light_blue_chroma_block")))));
    public static final Block MAGENTA_CHROMA_BLOCK = registerBlock("magenta_chroma_block",
            new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, "magenta_chroma_block")))));
    public static final Block REPLACE_ME_BLOCK = registerBlock("replace_me_block",
            new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, "replace_me_block")))));
    //Chroma Lamp Blocks
    public static final Block GREEN_CHROMA_LAMP = registerBlock("green_chroma_lamp",
            new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, "green_chroma_lamp")))
                    .lightLevel(value -> 15)));
    public static final Block BLUE_CHROMA_LAMP = registerBlock("blue_chroma_lamp",
            new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, "blue_chroma_lamp")))
                    .lightLevel(value -> 15)));
    public static final Block RED_CHROMA_LAMP = registerBlock("red_chroma_lamp",
            new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, "red_chroma_lamp")))
                    .lightLevel(value -> 15)));
    public static final Block BLACK_CHROMA_LAMP = registerBlock("black_chroma_lamp",
            new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, "black_chroma_lamp")))
                    .lightLevel(value -> 15)));
    public static final Block WHITE_CHROMA_LAMP = registerBlock("white_chroma_lamp",
            new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, "white_chroma_lamp")))
                    .lightLevel(value -> 15)));
    public static final Block YELLOW_CHROMA_LAMP = registerBlock("yellow_chroma_lamp",
            new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, "yellow_chroma_lamp")))
                    .lightLevel(value -> 15)));
    public static final Block LIGHT_BLUE_CHROMA_LAMP = registerBlock("light_blue_chroma_lamp",
            new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, "light_blue_chroma_lamp")))
                    .lightLevel(value -> 15)));
    public static final Block MAGENTA_CHROMA_LAMP = registerBlock("magenta_chroma_lamp",
            new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, "magenta_chroma_lamp")))
                    .lightLevel(value -> 15)));
    public static final Block REPLACE_ME_LAMP = registerBlock("replace_me_lamp",
            new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, "replace_me_lamp")))
                    .lightLevel(value -> 15)));

    //block register stuff
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, name),
                new BlockItem(block, new net.minecraft.world.item.Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(BetterChromaKey.MOD_ID, name))).useBlockDescriptionPrefix()));
    }

    public static void registerModBlocks() {
        BetterChromaKey.LOGGER.info("Registering Mod Blocks for "+ BetterChromaKey.MOD_ID);
    }
}
