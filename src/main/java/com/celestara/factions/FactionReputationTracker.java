package com.celestara.factions;

import com.celestara.gui.FactionStatusGUI;

public class FactionReputationTracker {
    public static void displayReputationChange(String player, String faction, int change) {
        String changeType = change > 0 ? "Positive" : "Negative";
        System.out.println("[Faction System]: " + player + "'s reputation with " + faction + " changed: " + change);

        String sound = change > 0 ? "faction_reputation_positive.ogg" : "faction_reputation_negative.ogg";
        playSound(player, sound);

        FactionStatusGUI.updateFactionStatus(player);
    }

    private static void playSound(String player, String sound) {
        System.out.println("[Sound]: Playing " + sound + " for " + player);
    }
}
