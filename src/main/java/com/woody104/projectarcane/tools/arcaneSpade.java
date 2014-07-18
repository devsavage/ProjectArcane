package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import com.woody104.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemSpade;

public class arcaneSpade extends ItemSpade {

	public arcaneSpade(ToolMaterial arcane) {
		super(arcane);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab_tools);
	}

}
