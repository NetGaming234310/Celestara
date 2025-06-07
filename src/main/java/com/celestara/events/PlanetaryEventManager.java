package com.celestara.events;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import java.util.Random;

public class PlanetaryEventManager {
    private static final Random random = new Random();

    public static void triggerEvent(ServerLevel world, BlockPos location) {
        int eventType = random.nextInt(4);
        switch (eventType) {
            case 0 -> startSandstorm(world, location);
            case 1 -> triggerMeteorShower(world, location);
            case 2 -> activateGravityAnomaly(world, location);
            case 3 -> causeSolarFlare(world);
        }
    }

    private static void startSandstorm(ServerLevel world, BlockPos location) {
        System.out.println("[Celestara]: A massive sandstorm has engulfed " + location);
    }

    private static void triggerMeteorShower(ServerLevel world, BlockPos location) {
        System.out.println("[Celestara]: Meteor shower incoming!");
    }

    private static void activateGravityAnomaly(ServerLevel world, BlockPos location) {
        System.out.println("[Celestara]: Gravity fluctuations detected!");
    }

    private static void causeSolarFlare(ServerLevel world) {
        System.out.println("[Celestara]: A solar flare is disrupting communications.");
    }
}
