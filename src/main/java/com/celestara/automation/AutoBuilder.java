package com.celestara.automation;

import java.util.HashMap;
import java.util.Map;

public class AutoBuilder {
    private static final Map<String, String> blueprintLibrary = new HashMap<>();

    public static void addBlueprint(String player, String blueprint) {
        blueprintLibrary.put(player, blueprint);
        System.out.println("[Blueprints]: New blueprint added: " + blueprint);
    }

    public static String getBlueprint(String player) {
        return blueprintLibrary.getOrDefault(player, "No blueprints available.");
    }
}
