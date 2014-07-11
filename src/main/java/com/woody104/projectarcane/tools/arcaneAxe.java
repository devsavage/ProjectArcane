package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import net.minecraft.item.ItemAxe;

public class arcaneAxe extends ItemAxe {

	public arcaneAxe(ToolMaterial arcane) {
		super(arcane);
        this.setCreativeTab(Arcane.arcaneTab_tools);
	}

}
