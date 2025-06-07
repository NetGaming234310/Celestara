package com.celestara.wildlife;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import java.util.Random;

public class WildlifeSpawner {
    private static final Random random = new Random();

    public static void spawnWildlife(ServerLevel world, BlockPos location) {
        if (random.nextFloat() < 0.5) {
            System.out.println("[Wildlife]: Passive creatures are roaming this area.");
        } else {
            System.out.println("[Wildlife]: Hostile alien detected! Proceed with caution.");
        }
    }
}
