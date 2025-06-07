package com.celestara.ship;

import net.minecraft.world.entity.Entity;

public class ShipPhysics {
    public static void applyPhysics(Entity ship) {
        // Ensures smooth movement while players walk inside
        if (ship.isVehicle()) {
            ship.setDeltaMovement(ship.getDeltaMovement().scale(0.98));
        }
    }
}
