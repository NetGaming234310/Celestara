package com.celestara.world;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Blocks;
import java.util.Random;

public class BiomeRegistry {
    private static final Random random = new Random();

    public static void generateBiomeFeatures(ServerLevel world, BlockPos planetCenter, String biome) {
        for (int i = 0; i < 10; i++) {
            BlockPos featurePos = planetCenter.offset(random.nextInt(20) - 10, 0, random.nextInt(20) - 10);
            placeBiomeFeature(world, featurePos, biome);
        }
    }

    private static void placeBiomeFeature(ServerLevel world, BlockPos pos, String biome) {
        switch (biome) {
            case "lush_forest":
                world.setBlock(pos, Blocks.OAK_LOG.defaultBlockState(), 3);
                world.setBlock(pos.above(), Blocks.OAK_LEAVES.defaultBlockState(), 3);
                break;
            case "crystal_fields":
                world.setBlock(pos, Blocks.AMETHYST_BLOCK.defaultBlockState(), 3);
                break;
            case "lava_plains":
                world.setBlock(pos, Blocks.MAGMA_BLOCK.defaultBlockState(), 3);
                break;
            default:
                world.setBlock(pos, Blocks.STONE.defaultBlockState(), 3);
                break;
        }
    }
}
