package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import net.minecraft.item.ItemHoe;

public class DirtHoe extends ItemHoe {

	public DirtHoe(ToolMaterial dirt) {
		super(dirt);
        this.setCreativeTab(Arcane.arcaneTab_tools);
	}

}
