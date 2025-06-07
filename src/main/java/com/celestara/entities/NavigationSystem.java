package com.celestara.entities;

import com.celestara.world.CelestialBody;
import com.celestara.world.PlanetData;

import java.util.Random;

public class NavigationSystem {
    private static CelestialBody currentPlanet;

    public static void travelToRandomPlanet() {
        Random random = new Random();
        currentPlanet = PlanetData.planets.get(random.nextInt(PlanetData.planets.size()));
        System.out.println("[Navigation]: Now en route to " + currentPlanet.getName());
    }

    public static CelestialBody getCurrentPlanet() {
        return currentPlanet;
    }
}
