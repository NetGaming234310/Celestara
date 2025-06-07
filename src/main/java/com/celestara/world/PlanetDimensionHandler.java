package com.celestara.world;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;

public class PlanetDimensionHandler {
    public static void enterPlanet(Player player, PlanetData planet, ServerLevel planetDimension) {
        BlockPos spawnPoint = new BlockPos(0, 150, 0);
        player.teleportTo(planetDimension, spawnPoint.getX(), spawnPoint.getY(), spawnPoint.getZ(), 0, 0);
        System.out.println("[Ship AI]: Entering planetary atmosphere – Welcome to " + planet.getName());
    }
}
