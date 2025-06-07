package com.celestara.automation;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Blocks;
import java.util.Random;

public class FactorySystem {
    private static final Random random = new Random();

    public static void generateFactory(ServerLevel world, BlockPos location) {
        for (int x = -3; x <= 3; x++) {
            for (int z = -3; z <= 3; z++) {
                world.setBlock(location.offset(x, 0, z), Blocks.IRON_BLOCK.defaultBlockState(), 3);
            }
        }
        System.out.println("[Automation]: Factory established at " + location);
    }
}
