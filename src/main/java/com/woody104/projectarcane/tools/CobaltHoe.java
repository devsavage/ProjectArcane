package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import net.minecraft.item.ItemHoe;

public class CobaltHoe extends ItemHoe {

	public CobaltHoe(ToolMaterial toolmaterial) {
		super(Arcane.cobalt);
		this.setCreativeTab(Arcane.arcaneTab_tools);
	}

}
