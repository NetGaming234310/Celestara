package com.celestara.world;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Blocks;
import java.util.Random;

public class DomedSettlementHandler {
    private static final Random random = new Random();

    public static void generateDome(ServerLevel world, BlockPos center) {
        int radius = 10;
        for (int x = -radius; x <= radius; x++) {
            for (int y = -radius; y <= radius; y++) {
                for (int z = -radius; z <= radius; z++) {
                    if (Math.sqrt(x*x + y*y + z*z) <= radius) {
                        world.setBlock(center.offset(x, y, z), Blocks.GLASS.defaultBlockState(), 3);
                    }
                }
            }
        }
        System.out.println("[Celestara]: Created oxygen dome at " + center);
    }
}
