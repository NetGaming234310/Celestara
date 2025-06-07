package com.celestara.ship;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import java.util.HashMap;
import java.util.Map;

public class ShipRetexturingSystem {
    private static final Map<BlockPos, BlockState[]> retexturedBlocks = new HashMap<>();

    public static void applyTexture(Level world, BlockPos pos, BlockState newTexture, int faceIndex) {
        if (!retexturedBlocks.containsKey(pos)) {
            retexturedBlocks.put(pos, new BlockState[6]); // One texture per face
        }
        retexturedBlocks.get(pos)[faceIndex] = newTexture;
        System.out.println("[Ship]: Face " + faceIndex + " of block at " + pos + " retextured.");
    }

    public static BlockState getTexture(Level world, BlockPos pos, int faceIndex) {
        return retexturedBlocks.getOrDefault(pos, new BlockState[6])[faceIndex];
    }
}
