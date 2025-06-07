package com.celestara.research;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class ResearchTableBlock extends Block {
    public ResearchTableBlock() {
        super(Properties.of(Material.WOOD).strength(2.5F));
    }

    @Override
    public void onPlace(BlockState state, net.minecraft.world.level.Level world, BlockPos pos, BlockState oldState, boolean isMoving) {
        super.onPlace(state, world, pos, oldState, isMoving);
        System.out.println("Research Table placed at: " + pos);
    }
}
