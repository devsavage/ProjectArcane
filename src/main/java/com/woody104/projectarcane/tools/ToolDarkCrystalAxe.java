package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import com.woody104.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemAxe;

public class ToolDarkCrystalAxe extends ItemAxe{
	
	public ToolDarkCrystalAxe(ToolMaterial darkCrystal) {
		super(darkCrystal);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab_tools);
	}

}
