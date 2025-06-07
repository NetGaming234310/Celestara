package com.celestara.factions;

import java.util.HashMap;
import java.util.Map;

public class FactionManager {
    private static final Map<String, Integer> factionReputation = new HashMap<>();

    public static void modifyReputation(String player, String faction, int change) {
        String key = player + "_" + faction;
        factionReputation.put(key, factionReputation.getOrDefault(key, 0) + change);
        FactionReputationTracker.displayReputationChange(player, faction, change);
    }

    public static int getReputation(String player, String faction) {
        return factionReputation.getOrDefault(player + "_" + faction, 0);
    }
}
