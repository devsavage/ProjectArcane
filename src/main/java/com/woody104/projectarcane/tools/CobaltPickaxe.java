package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import net.minecraft.item.ItemPickaxe;

public class CobaltPickaxe extends ItemPickaxe {

	public CobaltPickaxe(ToolMaterial toolmaterial) {
		super(Arcane.cobalt);
		this.setCreativeTab(Arcane.arcaneTab_tools);
	}

}
