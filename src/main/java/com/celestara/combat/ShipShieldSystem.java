package com.celestara.combat;

public class ShipShieldSystem {
    private static int shieldStrength = 100;

    public static void absorbDamage(int damage) {
        shieldStrength -= damage;
        System.out.println("[Ship Defense]: Shields at " + shieldStrength + "% capacity.");
        if (shieldStrength <= 0) {
            System.out.println("[Ship Defense]: Shields down! Hull integrity compromised.");
        }
    }

    public static void rechargeShields() {
        shieldStrength = 100;
        System.out.println("[Ship Defense]: Shields fully recharged.");
    }
}
