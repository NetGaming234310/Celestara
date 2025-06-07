package com.celestara.factions;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class PlayerFactionSystem {
    private static final Map<String, String> playerFactions = new HashMap<>();
    private static final Map<String, List<String>> factionPrinciples = new HashMap<>();

    public static void createFaction(String player, String factionName, List<String> principles) {
        playerFactions.put(player, factionName);
        factionPrinciples.put(factionName, principles);
        System.out.println("[Faction System]: " + factionName + " created with principles: " + principles);
    }

    public static List<String> getFactionPrinciples(String factionName) {
        return factionPrinciples.getOrDefault(factionName, List.of("Unknown"));
    }

    public static String getPlayerFaction(String player) {
        return playerFactions.getOrDefault(player, null);
    }
}
