package com.woody104.projectarcane.handler;

import com.woody104.projectarcane.core.Arcane;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;

public class FuelHandler implements IFuelHandler {

    @Override
    public int getBurnTime(ItemStack fuel) {

        if(fuel.getItem() == Arcane.itemWoodChips) return 100;
        if(fuel.getItem() == Arcane.itemCoalChunk) return 250;
        
        
		return 0;
    }
}
