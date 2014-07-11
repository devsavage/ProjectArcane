package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import net.minecraft.item.ItemSword;

public class DirtSword extends ItemSword {
	public DirtSword(ToolMaterial dirt) {
		super(dirt);
        this.setCreativeTab(Arcane.arcaneTab_tools);
		
	}

}
