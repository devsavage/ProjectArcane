package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemSword;

public class ToolDarkCrystalSword extends ItemSword{
	
	public ToolDarkCrystalSword(ToolMaterial darkCrystal) {
		super(darkCrystal);
		this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}

}
