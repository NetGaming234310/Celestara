package com.celestara.exploration;

import java.util.HashMap;
import java.util.Map;

public class BlueprintSystem {
    private static final Map<String, String> globalBlueprints = new HashMap<>();

    public static void addBlueprint(String player, String blueprint) {
        globalBlueprints.put(player, blueprint);
        System.out.println("[Blueprints]: New design added: " + blueprint);
    }

    public static String getBlueprint(String player) {
        return globalBlueprints.getOrDefault(player, "No blueprints available.");
    }
}
