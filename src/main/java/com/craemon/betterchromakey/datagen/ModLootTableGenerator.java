package com.craemon.betterchromakey.datagen;

import com.craemon.betterchromakey.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        //Chroma Blocks
        addDrop(ModBlocks.GREEN_CHROMA_BLOCK);
        addDrop(ModBlocks.BLUE_CHROMA_BLOCK);
        addDrop(ModBlocks.RED_CHROMA_BLOCK);
        addDrop(ModBlocks.BLACK_CHROMA_BLOCK);
        addDrop(ModBlocks.WHITE_CHROMA_BLOCK);
        addDrop(ModBlocks.YELLOW_CHROMA_BLOCK);
        addDrop(ModBlocks.LIGHT_BLUE_CHROMA_BLOCK);
        addDrop(ModBlocks.MAGENTA_CHROMA_BLOCK);
        addDrop(ModBlocks.REPLACE_ME_BLOCK);
        //Chroma Lamp Blocks
        addDrop(ModBlocks.GREEN_CHROMA_LAMP);
        addDrop(ModBlocks.BLUE_CHROMA_LAMP);
        addDrop(ModBlocks.RED_CHROMA_LAMP);
        addDrop(ModBlocks.BLUE_CHROMA_LAMP);
        addDrop(ModBlocks.WHITE_CHROMA_LAMP);
        addDrop(ModBlocks.YELLOW_CHROMA_LAMP);
        addDrop(ModBlocks.LIGHT_BLUE_CHROMA_LAMP);
        addDrop(ModBlocks.MAGENTA_CHROMA_LAMP);
        addDrop(ModBlocks.REPLACE_ME_LAMP);
    }
}
