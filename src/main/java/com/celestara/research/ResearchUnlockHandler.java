package com.celestara.research;

import com.celestara.factions.FactionManager;

public class ResearchUnlockHandler {
    public static void shareResearchWithFaction(String player, String tech) {
        String faction = FactionManager.getPlayerFaction(player);
        if (faction != null) {
            ResearchStation.unlockTech(faction, tech);
        }
    }
}
