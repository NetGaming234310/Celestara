package com.celestara.research;

import java.util.HashMap;
import java.util.Map;

public class TechTree {
    public static final Map<String, String[]> techCategories = new HashMap<>();

    static {
        techCategories.put("Automation", new String[]{"Factory Module", "Ore Processor", "AI Assistance"});
        techCategories.put("Spacecraft Upgrades", new String[]{"Fuel Efficiency", "Enhanced Shields", "Advanced Thrusters"});
        techCategories.put("Weaponry", new String[]{"Plasma Rifle", "EMP Blast", "Energy Shield"});
    }

    public static String[] getTechs(String category) {
        return techCategories.getOrDefault(category, new String[]{});
    }
}
