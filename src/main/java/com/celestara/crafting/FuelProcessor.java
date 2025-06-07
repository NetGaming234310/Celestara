package com.celestara.crafting;

import net.minecraft.world.item.ItemStack;
import com.celestara.items.ResourceItems;

public class FuelProcessor {
    public static int refineFuel(ItemStack input) {
        if (input.getItem() == ResourceItems.RAW_FUEL_CRYSTAL) {
            return 100; // 100 fuel units per crystal
        } else if (input.getItem() == ResourceItems.COMPRESSED_FUEL_CORE) {
            return 500; // High-efficiency fuel
        }
        return 0;
    }
}
