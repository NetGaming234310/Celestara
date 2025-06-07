package com.celestara.travel;

import java.util.HashSet;
import java.util.Set;

public class NavigationSystem {
    private static final Set<String> discoveredPlanets = new HashSet<>();

    public static void discoverPlanet(String planet) {
        if (!discoveredPlanets.contains(planet)) {
            discoveredPlanets.add(planet);
            System.out.println("[Navigation]: New planet discovered – " + planet);
        }
    }

    public static boolean isPlanetDiscovered(String planet) {
        return discoveredPlanets.contains(planet);
    }
}
