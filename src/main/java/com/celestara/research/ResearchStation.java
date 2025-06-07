package com.celestara.research;

import java.util.HashMap;
import java.util.Map;

public class ResearchStation {
    private static final Map<String, Boolean> unlockedTechs = new HashMap<>();

    public static void unlockTech(String faction, String tech) {
        unlockedTechs.put(faction + "_" + tech, true);
        System.out.println("[Research]: " + tech + " unlocked for faction " + faction);
    }

    public static boolean isTechUnlocked(String faction, String tech) {
        return unlockedTechs.getOrDefault(faction + "_" + tech, false);
    }
}
