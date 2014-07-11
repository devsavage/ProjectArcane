package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import net.minecraft.item.ItemSpade;

public class DirtSpade extends ItemSpade {

	public DirtSpade(ToolMaterial dirt) {
		super(dirt);
        this.setCreativeTab(Arcane.arcaneTab_tools);
	}
	

}
