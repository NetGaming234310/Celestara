package com.celestara.world;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Blocks;
import java.util.Random;

public class AlienCityGenerator {
    private static final Random random = new Random();

    public static void generateCity(ServerLevel world, BlockPos center, String faction) {
        int size = random.nextInt(5) + 5; // City size variation
        for (int x = -size; x <= size; x++) {
            for (int z = -size; z <= size; z++) {
                BlockPos buildingPos = center.offset(x * 10, 0, z * 10);
                placeBuilding(world, buildingPos, faction);
            }
        }
        System.out.println("[Celestara]: Generated " + faction + " city at " + center);
    }

    private static void placeBuilding(ServerLevel world, BlockPos pos, String faction) {
        switch (faction) {
            case "Xylox":
                world.setBlock(pos, Blocks.IRON_BLOCK.defaultBlockState(), 3);
                world.setBlock(pos.above(), Blocks.BLUE_STAINED_GLASS.defaultBlockState(), 3);
                break;
            case "Vel’Thar":
                world.setBlock(pos, Blocks.SANDSTONE.defaultBlockState(), 3);
                world.setBlock(pos.above(), Blocks.RED_SAND.defaultBlockState(), 3);
                break;
            case "Zypherian":
                world.setBlock(pos, Blocks.END_STONE.defaultBlockState(), 3);
                world.setBlock(pos.above(), Blocks.PURPLE_CONCRETE.defaultBlockState(), 3);
                break;
            default:
                world.setBlock(pos, Blocks.STONE.defaultBlockState(), 3);
                break;
        }
    }
}
