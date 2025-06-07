package com.celestara.world;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Blocks;
import java.util.Random;

public class RuinsGenerator {
    private static final Random random = new Random();

    public static void generateRuins(ServerLevel world, BlockPos center) {
        for (int x = -4; x <= 4; x++) {
            for (int z = -4; z <= 4; z++) {
                if (random.nextFloat() < 0.4) {
                    BlockPos ruinPos = center.offset(x, 0, z);
                    world.setBlock(ruinPos, Blocks.CRACKED_STONE_BRICKS.defaultBlockState(), 3);
                }
            }
        }
        world.setBlock(center.above(), Blocks.CHEST.defaultBlockState(), 3);
        System.out.println("[Celestara]: Ruins generated at " + center);
    }
}
