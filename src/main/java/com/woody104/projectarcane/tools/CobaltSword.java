package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import net.minecraft.item.ItemSword;

public class CobaltSword extends ItemSword {

	public CobaltSword(ToolMaterial toolmaterial) {
		super(Arcane.cobalt);
		this.setCreativeTab(Arcane.arcaneTab_combat);
	}
}