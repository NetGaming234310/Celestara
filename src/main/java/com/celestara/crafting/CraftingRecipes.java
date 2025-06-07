package com.celestara.crafting;

import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.item.ItemStack;
import com.celestara.items.ResourceItems;

import java.util.HashMap;
import java.util.Map;

public class CraftingRecipes {
    public static final Map<String, Recipe<?>> recipes = new HashMap<>();

    static {
        recipes.put("fuel_processor", new ShapedRecipe(null, "fuel_processor", 3, 3,
                new ItemStack[]{ ResourceItems.IRON_PLATE, ResourceItems.IRON_PLATE, ResourceItems.IRON_PLATE,
                        ResourceItems.CIRCUIT_BOARD, ResourceItems.FUEL_CELL, ResourceItems.CIRCUIT_BOARD,
                        ResourceItems.IRON_PLATE, ResourceItems.IRON_PLATE, ResourceItems.IRON_PLATE },
                new ItemStack(ResourceItems.FUEL_PROCESSOR))
        );
    }
}
