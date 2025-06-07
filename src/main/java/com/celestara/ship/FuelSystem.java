package com.celestara.ship;

import com.celestara.items.ResourceItems;
import net.minecraft.world.item.ItemStack;

public class FuelSystem {
    private static int fuelLevel = 0;

    public static void addFuel(ItemStack fuelItem) {
        int fuelValue = 0;
        if (fuelItem.getItem() == ResourceItems.RAW_FUEL_CRYSTAL) fuelValue = 100;
        else if (fuelItem.getItem() == ResourceItems.COMPRESSED_FUEL_CORE) fuelValue = 500;

        fuelLevel += fuelValue;
        System.out.println("[Ship AI]: Added " + fuelValue + " fuel. Current level: " + fuelLevel);
    }

    public static boolean hasEnoughFuel(int requiredFuel) {
        return fuelLevel >= requiredFuel;
    }

    public static void consumeFuel(int amount) {
        if (hasEnoughFuel(amount)) {
            fuelLevel -= amount;
            System.out.println("[Ship AI]: Consumed " + amount + " fuel. Remaining: " + fuelLevel);
        } else {
            System.out.println("[Ship AI]: Warning – Not enough fuel for this journey!");
        }
    }
}
