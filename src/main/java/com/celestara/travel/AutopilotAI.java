package com.celestara.travel;

import com.celestara.world.PlanetData;
import java.util.Random;

public class AutopilotAI {
    private static int autopilotLevel = 1;

    public static void upgradeAutopilot() {
        autopilotLevel++;
        System.out.println("[Ship AI]: Autopilot upgraded to level " + autopilotLevel);
    }

    public static boolean avoidHazards() {
        Random random = new Random();
        return autopilotLevel >= 3 || random.nextFloat() > 0.5;
    }

    public static void navigateToPlanet(PlanetData planet) {
        if (avoidHazards()) {
            System.out.println("[Ship AI]: Navigating safely to " + planet.getName());
        } else {
            System.out.println("[Ship AI]: Warning – Space debris detected! Manual intervention required.");
        }
    }
}
