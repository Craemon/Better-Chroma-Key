package com.craemon.betterchromakey;

import com.craemon.betterchromakey.item.ModItemGroups;
import net.fabricmc.api.ClientModInitializer;

public class BetterChromaKeyClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItemGroups.registerItemGroups();
    }
}
