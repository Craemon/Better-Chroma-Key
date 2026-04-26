package com.craemon.betterchromakey.datagen;

import com.craemon.betterchromakey.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModLootTableGenerator extends FabricBlockLootSubProvider {
    public ModLootTableGenerator(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        //Chroma Blocks
        dropSelf(ModBlocks.GREEN_CHROMA_BLOCK);
        dropSelf(ModBlocks.BLUE_CHROMA_BLOCK);
        dropSelf(ModBlocks.RED_CHROMA_BLOCK);
        dropSelf(ModBlocks.BLACK_CHROMA_BLOCK);
        dropSelf(ModBlocks.WHITE_CHROMA_BLOCK);
        dropSelf(ModBlocks.YELLOW_CHROMA_BLOCK);
        dropSelf(ModBlocks.LIGHT_BLUE_CHROMA_BLOCK);
        dropSelf(ModBlocks.MAGENTA_CHROMA_BLOCK);
        dropSelf(ModBlocks.REPLACE_ME_BLOCK);
        //Chroma Lamp Blocks
        dropSelf(ModBlocks.GREEN_CHROMA_LAMP);
        dropSelf(ModBlocks.BLUE_CHROMA_LAMP);
        dropSelf(ModBlocks.RED_CHROMA_LAMP);
        dropSelf(ModBlocks.BLACK_CHROMA_LAMP);
        dropSelf(ModBlocks.WHITE_CHROMA_LAMP);
        dropSelf(ModBlocks.YELLOW_CHROMA_LAMP);
        dropSelf(ModBlocks.LIGHT_BLUE_CHROMA_LAMP);
        dropSelf(ModBlocks.MAGENTA_CHROMA_LAMP);
        dropSelf(ModBlocks.REPLACE_ME_LAMP);
    }
}
