package com.celestara.entities;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

import java.util.Random;

public class ShipAI extends Entity {
    private static final Random random = new Random();
    private boolean gravityEnabled = true;

    public ShipAI(EntityType<?> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public void tick() {
        super.tick();
        if (random.nextFloat() < 0.01F) {
            sendStatusUpdate();
        }
    }

    public void toggleGravity() {
        gravityEnabled = !gravityEnabled;
        System.out.println("[Ship AI]: Gravity " + (gravityEnabled ? "enabled" : "disabled") + ".");
    }

    private void sendStatusUpdate() {
        int warningType = random.nextInt(5);
        switch (warningType) {
            case 0:
                System.out.println("[Ship AI]: Warning – Unstable atmosphere detected. Oxygen required.");
                break;
            case 1:
                System.out.println("[Ship AI]: Caution – Gravity fluctuations ahead.");
                break;
            case 2:
                System.out.println("[Ship AI]: Entering planetary orbit.");
                break;
            case 3:
                System.out.println("[Ship AI]: Landing sequence initiated.");
                break;
            case 4:
                System.out.println("[Ship AI]: No immediate threats detected.");
                break;
        }
    }

    @Override
    protected void defineSynchedData() {}
}
