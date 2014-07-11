package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import net.minecraft.item.ItemHoe;

public class ToolDarkCrystalHoe extends ItemHoe{
	
	public ToolDarkCrystalHoe(ToolMaterial darkCrystal) {
		super(darkCrystal);
        this.setCreativeTab(Arcane.arcaneTab_tools);
	}

}
