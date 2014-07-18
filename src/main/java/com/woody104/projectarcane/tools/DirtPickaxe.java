package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import com.woody104.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemPickaxe;

public class DirtPickaxe extends ItemPickaxe {
	
	public DirtPickaxe(ToolMaterial dirt) {
		super(dirt);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab_tools);
	}

	{
	}

}
