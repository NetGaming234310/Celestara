package com.celestara.ship;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.level.Level;

public class Cockpit extends Block {
    public Cockpit(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
        if (!world.isClientSide) {
            ShipEntity ship = new ShipEntity(EntityType.BOAT, world); // Placeholder for custom entity
            ship.setPos(pos.getX(), pos.getY(), pos.getZ());
            world.addFreshEntity(ship);
            ship.setPiloted(true);
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }
}
