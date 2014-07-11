package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import net.minecraft.item.ItemHoe;

public class arcaneHoe extends ItemHoe {

	public arcaneHoe(ToolMaterial arcane) {
		super(arcane);
        this.setCreativeTab(Arcane.arcaneTab_tools);
	}

}
