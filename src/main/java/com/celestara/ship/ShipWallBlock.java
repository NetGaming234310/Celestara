package com.celestara.ship;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;

public class ShipWallBlock extends Block {
    public ShipWallBlock() {
        super(Properties.of(Material.METAL).strength(4.0F));
    }

    @Override
    public InteractionResult use(BlockState state, ServerLevel world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack heldItem = player.getItemInHand(hand);

        if (player.isCrouching()) {
            ShipRetextureHandler.removeTexture(world, pos, hit.getDirection().ordinal());
            return InteractionResult.SUCCESS;
        }

        if (!heldItem.isEmpty()) {
            ShipRetextureHandler.applyTexture(world, pos, heldItem, hit.getDirection().ordinal());
            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }
}
