package com.celestara.ship;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;

public class AtmosphericEntryHandler {
    public static void handleEntry(ServerLevel world, BlockPos entryPoint) {
        System.out.println("[Ship AI]: Entering atmosphere... Brace for turbulence.");
        for (int i = 0; i < 5; i++) {
            System.out.println("[Ship AI]: Heat levels rising... " + (i * 20) + "%");
        }
        System.out.println("[Ship AI]: Atmospheric entry successful. Preparing for landing.");
    }
}
