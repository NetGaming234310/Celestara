package com.celestara.research;

import java.util.HashMap;
import java.util.Map;

public class ResearchData {
    public static final Map<String, String> researchDescriptions = new HashMap<>();

    static {
        researchDescriptions.put("basic_space_travel", "Unlocks the ability to build a simple rocket.");
        researchDescriptions.put("advanced_fuel", "Enables crafting of high-efficiency fuel.");
    }
}
