package com.woody104.projectarcane.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class SmeltingRegistry
{
    public static void init()
    {
        GameRegistry.addSmelting(BlockRegistry.ArcaneGemOre, new ItemStack(ItemRegistry.itemArcaneGem), 0);
        GameRegistry.addSmelting(BlockRegistry.DarkCrystalOre, new ItemStack(ItemRegistry.itemDarkCrystal), 0);
        GameRegistry.addSmelting(ItemRegistry.foodRawChickenLeg, new ItemStack(ItemRegistry.foodCookedChickenLeg), 5f);
        GameRegistry.addSmelting(ItemRegistry.itemCobaltDust, new ItemStack(ItemRegistry.itemCobaltIngot), 4f);
    }
}
