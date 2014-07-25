package com.woody104.projectarcane.crafting;

import com.woody104.projectarcane.registry.ItemRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DualFurnaceRecipes {

    public DualFurnaceRecipes() {

    }

    public static ItemStack getFurnaceResult(Item item, Item item1) {
        return getOutput(item, item1);

    }

    public static ItemStack getOutput(Item item, Item item1) {
        if (item == ItemRegistry.itemCobaltIngot && item1 == Items.iron_ingot || item == Items.iron_ingot && item1 == ItemRegistry.itemCobaltIngot) {
            return new ItemStack(ItemRegistry.itemArcaneMetalPlate, 2);
        }

        return null;
    }
}
