package com.celestara.combat;

import java.util.Random;

public class AIThreatHandler {
    private static final Random random = new Random();

    public static void detectThreat() {
        if (random.nextFloat() < 0.4) {
            System.out.println("[Ship AI]: Enemy vessel detected! Prepare for combat.");
        }
    }
}
