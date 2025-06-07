package com.celestara.ship;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.HashMap;
import java.util.Map;

public class ShipRetextureHandler {
    private static final Map<BlockPos, BlockState[]> retexturedBlocks = new HashMap<>();

    public static void applyTexture(ServerLevel world, BlockPos pos, ItemStack item, int faceIndex) {
        Block newTextureBlock = Block.byItem(item.getItem());
        if (newTextureBlock == Blocks.AIR) return;

        if (!retexturedBlocks.containsKey(pos)) {
            retexturedBlocks.put(pos, new BlockState[6]);
        }

        if (newTextureBlock == Blocks.GLASS) {
            System.out.println("[Ship]: One-way glass applied to face " + faceIndex);
        } else {
            System.out.println("[Ship]: Face " + faceIndex + " retextured with " + newTextureBlock.getDescriptionId());
        }

        retexturedBlocks.get(pos)[faceIndex] = newTextureBlock.defaultBlockState();
    }

    public static void removeTexture(ServerLevel world, BlockPos pos, int faceIndex) {
        if (retexturedBlocks.containsKey(pos)) {
            retexturedBlocks.get(pos)[faceIndex] = null;
            System.out.println("[Ship]: Texture removed from face " + faceIndex);
        }
    }

    public static BlockState getTexture(BlockPos pos, int faceIndex) {
        return retexturedBlocks.getOrDefault(pos, new BlockState[6])[faceIndex];
    }
}
