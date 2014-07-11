package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import net.minecraft.item.ItemPickaxe;

public class ToolDarkCrystalPickaxe extends ItemPickaxe{
	
	public ToolDarkCrystalPickaxe(ToolMaterial darkCrystal) {
		super(darkCrystal);
        this.setCreativeTab(Arcane.arcaneTab_tools);
	}

}
