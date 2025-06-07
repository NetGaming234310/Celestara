package com.celestara.exploration;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Blocks;
import java.util.Random;

public class RelicDiscovery {
    private static final Random random = new Random();

    public static void discoverRelic(ServerLevel world, BlockPos location) {
        if (random.nextFloat() < 0.2) {
            world.setBlock(location, Blocks.ENCHANTING_TABLE.defaultBlockState(), 3);
            System.out.println("[Exploration]: Ancient relic discovered at " + location);
        }
    }
}
