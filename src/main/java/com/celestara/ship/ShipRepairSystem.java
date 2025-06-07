package com.celestara.ship;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;

public class ShipRepairSystem {
    public static void manualRepair(ServerLevel world, BlockPos pos, Player player, ItemStack repairItem) {
        if (repairItem.getItem() == net.minecraft.world.item.Items.IRON_INGOT) {
            world.setBlock(pos, Blocks.IRON_BLOCK.defaultBlockState(), 3);
            repairItem.shrink(1);
            System.out.println("[Ship AI]: Hull section repaired at " + pos);
        }
    }

    public static void automatedRepair(ServerLevel world, BlockPos damagedPos) {
        world.setBlock(damagedPos, Blocks.IRON_BLOCK.defaultBlockState(), 3);
        System.out.println("[Ship AI]: Automated repair system activated.");
    }
}
