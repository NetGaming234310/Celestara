package com.celestara.world;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Blocks;
import java.util.Random;

public class OreGenerationHandler {
    private static final Random random = new Random();

    public static void generateOres(ServerLevel world, BlockPos planetCenter, PlanetData planet) {
        for (int i = 0; i < 20; i++) {
            BlockPos orePos = planetCenter.offset(random.nextInt(planet.getSize()), -random.nextInt(15), random.nextInt(planet.getSize()));
            world.setBlock(orePos, Blocks.DIAMOND_ORE.defaultBlockState(), 3);
        }
    }
}
