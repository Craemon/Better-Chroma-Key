package com.craemon.betterchromakey;

import com.craemon.betterchromakey.block.ModBlocks;
import com.craemon.betterchromakey.item.ModItemGroups;
import com.craemon.betterchromakey.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterChromaKey implements ModInitializer {
	public static final String MOD_ID = "betterchromakey";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}