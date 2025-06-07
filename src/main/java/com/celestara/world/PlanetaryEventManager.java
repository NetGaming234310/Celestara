package com.celestara.world;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Blocks;
import java.util.Random;

public class PlanetaryEventManager {
    private static final Random random = new Random();

    public static void triggerEvent(ServerLevel world, BlockPos location) {
        int eventType = random.nextInt(3);
        switch (eventType) {
            case 0:
                startStorm(world, location);
                break;
            case 1:
                triggerMeteorShower(world, location);
                break;
            case 2:
                causeTerrainShift(world, location);
                break;
        }
    }

    private static void startStorm(ServerLevel world, BlockPos location) {
        System.out.println("[Celestara]: A storm is raging at " + location);
    }

    private static void triggerMeteorShower(ServerLevel world, BlockPos location) {
        for (int i = 0; i < 5; i++) {
            BlockPos impact = location.offset(random.nextInt(10) - 5, 10, random.nextInt(10) - 5);
            world.setBlock(impact, Blocks.FIRE.defaultBlockState(), 3);
        }
        System.out.println("[Celestara]: Meteor shower detected!");
    }

    private static void causeTerrainShift(ServerLevel world, BlockPos location) {
        world.setBlock(location.below(), Blocks.COBBLESTONE.defaultBlockState(), 3);
        System.out.println("[Celestara]: Terrain shift detected at " + location);
    }
}
