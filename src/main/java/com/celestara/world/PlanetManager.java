package com.celestara.world;

import java.util.ArrayList;
import java.util.List;

public class PlanetManager {
    public static final List<PlanetData> planets = new ArrayList<>();

    static {
        planets.add(new PlanetData("Lumen-5", "lush", true, 40));
        planets.add(new PlanetData("Zyphos-3", "volcanic", false, 35));
        planets.add(new PlanetData("Theron-9", "frozen", false, 50));
    }

    public static PlanetData getPlanetByName(String name) {
        return planets.stream().filter(p -> p.getName().equals(name)).findFirst().orElse(null);
    }
}
