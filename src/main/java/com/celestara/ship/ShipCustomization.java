package com.celestara.ship;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;

public class ShipCustomization {
    public static void addBlock(Level world, BlockPos pos) {
        world.setBlock(pos, Blocks.IRON_BLOCK.defaultBlockState(), 3);
        System.out.println("[Ship]: Block added to ship at " + pos);
    }

    public static void removeBlock(Level world, BlockPos pos) {
        world.setBlock(pos, Blocks.AIR.defaultBlockState(), 3);
        System.out.println("[Ship]: Block removed from ship at " + pos);
    }
}
