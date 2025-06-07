package com.celestara.wildlife;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class AlienCreature extends Entity {
    private boolean isHostile;

    public AlienCreature(EntityType<?> entityType, Level level, boolean isHostile) {
        super(entityType, level);
        this.isHostile = isHostile;
    }

    @Override
    public void tick() {
        super.tick();
        if (isHostile) {
            System.out.println("[Wildlife]: A hostile alien is nearby!");
        }
    }

    @Override
    protected void defineSynchedData() {}
}
