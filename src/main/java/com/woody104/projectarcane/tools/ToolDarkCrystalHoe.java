package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemHoe;

public class ToolDarkCrystalHoe extends ItemHoe{
	
	public ToolDarkCrystalHoe(ToolMaterial darkCrystal) {
		super(darkCrystal);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}

}
