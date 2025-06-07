package com.celestara.ship;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.item.ItemEntity;
import java.util.List;

public class RestraintFieldGenerator {
    public static void activate(ServerLevel world, BlockPos pos) {
        List<ItemEntity> items = world.getEntitiesOfClass(ItemEntity.class, new net.minecraft.world.phys.AABB(pos.offset(-3, -3, -3), pos.offset(3, 3, 3)));
        for (ItemEntity item : items) {
            item.setDeltaMovement(0, 0, 0);
        }
        System.out.println("[Ship AI]: Restraint field active. Objects stabilized.");
    }
}
