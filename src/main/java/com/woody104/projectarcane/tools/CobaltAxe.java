package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import net.minecraft.item.ItemAxe;

public class CobaltAxe extends ItemAxe {

	public CobaltAxe(ToolMaterial toolmaterial) {
		super(Arcane.cobalt);
		this.setCreativeTab(Arcane.arcaneTab_tools);
	}

}
