package com.celestara.entities;

import java.util.HashMap;
import java.util.Map;

public class FactionNPC {
    private static final Map<String, String> factionStyles = new HashMap<>();

    static {
        factionStyles.put("Xylox", "Advanced cybernetic city with neon-lit buildings.");
        factionStyles.put("Vel’Thar", "Tribal desert settlements with organic structures.");
        factionStyles.put("Zypherians", "Floating sky cities built from antimatter tech.");
    }

    public static String getFactionStyle(String faction) {
        return factionStyles.getOrDefault(faction, "Unknown civilization.");
    }
}
