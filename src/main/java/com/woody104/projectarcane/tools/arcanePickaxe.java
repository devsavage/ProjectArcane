package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import net.minecraft.item.ItemPickaxe;

public class arcanePickaxe extends ItemPickaxe {

	public arcanePickaxe(ToolMaterial arcane) {
		super(arcane);
		this.setCreativeTab(Arcane.arcaneTab_tools);
	}

}
