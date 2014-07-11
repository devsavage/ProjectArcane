package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import net.minecraft.item.ItemSpade;

public class arcaneSpade extends ItemSpade {

	public arcaneSpade(ToolMaterial arcane) {
		super(arcane);
        this.setCreativeTab(Arcane.arcaneTab_tools);
	}

}
