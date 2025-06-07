package com.celestara.entities;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import com.celestara.world.PlanetGenerator;

public class PlanetLandingHandler {
    public static void landOnPlanet(ServerLevel world) {
        if (NavigationSystem.getCurrentPlanet() == null) {
            System.out.println("[Ship AI]: No planetary target selected.");
            return;
        }

        BlockPos landingZone = new BlockPos(0, 150, 0);
        PlanetGenerator.generatePlanet(world, landingZone, NavigationSystem.getCurrentPlanet());
        System.out.println("[Ship AI]: Successfully landed on " + NavigationSystem.getCurrentPlanet().getName());
    }
}
