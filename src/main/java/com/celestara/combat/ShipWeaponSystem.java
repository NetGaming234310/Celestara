package com.celestara.combat;

public class ShipWeaponSystem {
    private static int weaponPower = 1;

    public static void upgradeWeapons() {
        weaponPower++;
        System.out.println("[Ship Combat]: Weapon power increased to level " + weaponPower);
    }

    public static void fireWeapon() {
        System.out.println("[Ship Combat]: Firing weapons at power level " + weaponPower);
    }
}
