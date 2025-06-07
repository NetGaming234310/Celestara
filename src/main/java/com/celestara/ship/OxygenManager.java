package com.celestara.ship;

import com.celestara.world.CelestialBody;

public class OxygenManager {
    public static boolean isOxygenAvailable(CelestialBody planet) {
        return planet.getName().equals("Lumen-5"); // Example: Only Lumen-5 has oxygen
    }

    public static void checkOxygenStatus(CelestialBody planet) {
        if (isOxygenAvailable(planet)) {
            System.out.println("[Ship AI]: Oxygen levels stable. Environment is safe.");
        } else {
            System.out.println("[Ship AI]: Warning – No oxygen detected! A suit is required.");
        }
    }
}
