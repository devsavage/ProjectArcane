package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import com.woody104.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemPickaxe;

public class arcanePickaxe extends ItemPickaxe {

	public arcanePickaxe(ToolMaterial arcane) {
		super(arcane);
		this.setCreativeTab(CreativeTabRegistry.arcaneTab_tools);
	}

}
