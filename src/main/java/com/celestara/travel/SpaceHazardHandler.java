package com.celestara.travel;

import java.util.Random;

public class SpaceHazardHandler {
    private static final Random random = new Random();

    public static boolean detectHazard() {
        return random.nextFloat() < 0.3;
    }

    public static void triggerHazard() {
        if (detectHazard()) {
            System.out.println("[Ship AI]: Warning – Asteroid field ahead!");
        }
    }
}
