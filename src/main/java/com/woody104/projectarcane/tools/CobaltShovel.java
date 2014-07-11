package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import net.minecraft.item.ItemSpade;

public class CobaltShovel extends ItemSpade {

	public CobaltShovel(ToolMaterial toolmaterial) {
		super(Arcane.cobalt);
		this.setCreativeTab(Arcane.arcaneTab_tools);
	}

}
