package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import net.minecraft.item.ItemAxe;

public class DirtAxe extends ItemAxe {

	public DirtAxe(ToolMaterial dirt) {
		super(dirt);
        this.setCreativeTab(Arcane.arcaneTab_tools);
	}
	

}
