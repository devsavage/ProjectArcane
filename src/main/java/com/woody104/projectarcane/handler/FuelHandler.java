package com.woody104.projectarcane.handler;

import com.woody104.projectarcane.core.Arcane;
import com.woody104.projectarcane.registry.ItemRegistry;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;

public class FuelHandler implements IFuelHandler {

    @Override
    public int getBurnTime(ItemStack fuel) {

        if(fuel.getItem() == ItemRegistry.itemWoodChips) return 100;
        if(fuel.getItem() == ItemRegistry.itemCoalChunk) return 250;
        
        
		return 0;
    }
}
