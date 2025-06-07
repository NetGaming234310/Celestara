package com.celestara.ship;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Blocks;
import java.util.Random;

public class ShipDamageHandler {
    private static final Random random = new Random();

    public static void applyDamage(ServerLevel world, BlockPos impactPoint, int severity) {
        System.out.println("[Ship AI]: Warning – Impact detected! Assessing damage...");

        for (int i = 0; i < severity; i++) {
            BlockPos breach = impactPoint.offset(random.nextInt(3) - 1, random.nextInt(3) - 1, random.nextInt(3) - 1);
            world.setBlock(breach, Blocks.AIR.defaultBlockState(), 3);
            System.out.println("[Ship AI]: Hull breach at " + breach);
        }
    }
}
