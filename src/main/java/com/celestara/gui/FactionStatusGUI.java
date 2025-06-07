package com.celestara.gui;

import com.celestara.factions.FactionManager;
import java.util.List;

public class FactionStatusGUI {
    public static void updateFactionStatus(String player) {
        List<String> factions = List.of("Xylox", "Vel’Thar", "Zypherian", "Player Factions");
        System.out.println("[Faction GUI]: Updating faction reputation display for " + player);

        for (String faction : factions) {
            int rep = FactionManager.getReputation(player, faction);
            System.out.println("[" + faction + "] Reputation: " + rep);
        }
    }
}
