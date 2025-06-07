package com.celestara.automation;

import net.minecraft.world.item.ItemStack;
import java.util.HashMap;
import java.util.Map;

public class ResourceProcessor {
    private static final Map<ItemStack, ItemStack> refiningRecipes = new HashMap<>();

    static {
        refiningRecipes.put(new ItemStack(net.minecraft.world.item.Items.RAW_IRON), new ItemStack(net.minecraft.world.item.Items.IRON_INGOT));
        refiningRecipes.put(new ItemStack(net.minecraft.world.item.Items.RAW_GOLD), new ItemStack(net.minecraft.world.item.Items.GOLD_INGOT));
    }

    public static ItemStack refine(ItemStack input) {
        return refiningRecipes.getOrDefault(input, input);
    }
}
