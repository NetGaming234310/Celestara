package com.celestara.ship;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class ShipEntity extends Entity {
    private Vec3 velocity = new Vec3(0, 0, 0);
    private boolean isPiloted = false;

    public ShipEntity(EntityType<?> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public void tick() {
        super.tick();

        if (isPiloted) {
            moveShip();
        }
    }

    public void setPiloted(boolean piloted) {
        this.isPiloted = piloted;
    }

    private void moveShip() {
        if (level instanceof ServerLevel serverLevel) {
            BlockPos shipPos = this.blockPosition();
            serverLevel.getChunk(shipPos).setUnsaved(true); // Ensures structure stays intact

            setPos(getX() + velocity.x, getY() + velocity.y, getZ() + velocity.z);
        }
    }

    public void setVelocity(Vec3 newVelocity) {
        this.velocity = newVelocity;
    }

    @Override
    protected void defineSynchedData() {}
}
