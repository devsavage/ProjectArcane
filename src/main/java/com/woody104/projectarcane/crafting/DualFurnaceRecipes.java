package com.woody104.projectarcane.crafting;

import com.woody104.projectarcane.core.Arcane;
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
        if (item == Arcane.itemCobaltIngot && item1 == Items.iron_ingot || item == Items.iron_ingot && item1 == Arcane.itemCobaltIngot) {
            return new ItemStack(Arcane.itemArcaneMetalPlate, 2);
        }

        return null;
    }
}
