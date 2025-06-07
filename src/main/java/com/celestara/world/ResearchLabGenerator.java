package com.celestara.world;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Blocks;
import java.util.Random;

public class ResearchLabGenerator {
    private static final Random random = new Random();

    public static void generateLab(ServerLevel world, BlockPos center) {
        for (int x = -3; x <= 3; x++) {
            for (int z = -3; z <= 3; z++) {
                BlockPos floorPos = center.offset(x, 0, z);
                world.setBlock(floorPos, Blocks.IRON_BLOCK.defaultBlockState(), 3);
            }
        }
        world.setBlock(center.above(), Blocks.LECTERN.defaultBlockState(), 3);
        System.out.println("[Celestara]: Research lab created at " + center);
    }
}
