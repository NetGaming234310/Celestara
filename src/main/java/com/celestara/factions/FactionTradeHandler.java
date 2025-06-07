package com.celestara.factions;

import net.minecraft.world.item.ItemStack;
import java.util.HashMap;
import java.util.Map;

public class FactionTradeHandler {
    private static final Map<String, ItemStack> tradeOffers = new HashMap<>();

    public static void registerTrade(String faction, ItemStack item) {
        tradeOffers.put(faction, item);
    }

    public static ItemStack getTradeOffer(String faction) {
        return tradeOffers.getOrDefault(faction, ItemStack.EMPTY);
    }
}
