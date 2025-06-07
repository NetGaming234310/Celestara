package com.celestara.world;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Blocks;
import java.util.Random;

public class SpaceWorldGenerator {
    private static final Random random = new Random();

    public static void generatePlanet(ServerLevel world, BlockPos center, PlanetData planet) {
        int radius = planet.getSize();
        for (int x = -radius; x <= radius; x++) {
            for (int y = -radius; y <= radius; y++) {
                for (int z = -radius; z <= radius; z++) {
                    if (Math.sqrt(x*x + y*y + z*z) <= radius) {
                        world.setBlock(center.offset(x, y, z), Blocks.STONE.defaultBlockState(), 3);
                    }
                }
            }
        }
        System.out.println("[Celestara]: Generated space planet " + planet.getName());
    }
}
