package com.celestara.research;

import java.util.HashMap;
import java.util.Map;

public class ResearchManager {
    private static final Map<String, Boolean> researchProgress = new HashMap<>();

    public static void unlockResearch(String researchKey) {
        researchProgress.put(researchKey, true);
        System.out.println("[Research] Unlocked: " + researchKey);
    }

    public static boolean isResearched(String researchKey) {
        return researchProgress.getOrDefault(researchKey, false);
    }

    public static void initializeResearch() {
        System.out.println("Research System Initialized.");
    }
}
