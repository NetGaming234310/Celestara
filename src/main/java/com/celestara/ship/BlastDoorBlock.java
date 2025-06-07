package com.celestara.ship;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.server.level.ServerLevel;

public class BlastDoorBlock extends Block {
    private boolean isClosed = true;

    public BlastDoorBlock() {
        super(Properties.of(Material.METAL).strength(10.0F));
    }

    @Override
    public InteractionResult use(BlockState state, ServerLevel world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        isClosed = !isClosed;
        System.out.println("[Ship]: Blast door " + (isClosed ? "closed." : "opened."));
        return InteractionResult.SUCCESS;
    }
}
