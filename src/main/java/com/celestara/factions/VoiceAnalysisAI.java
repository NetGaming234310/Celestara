package com.celestara.factions;

public class VoiceAnalysisAI {
    public static void processSpeech(String player, String speech) {
        boolean isJoking = detectJoke(speech);
        int reputationImpact = isJoking ? 0 : determineImpact(speech);
        String faction = PlayerFactionSystem.getPlayerFaction(player);

        if (faction != null) {
            FactionManager.modifyReputation(player, faction, reputationImpact);
        }
    }

    private static boolean detectJoke(String speech) {
        return speech.contains("/s") || speech.contains("just kidding");
    }

    private static int determineImpact(String speech) {
        if (speech.contains("helpful") || speech.contains("heroic")) return 10;
        if (speech.contains("rude") || speech.contains("threat")) return -10;
        return 0;
    }
}
