package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import net.minecraft.item.ItemSword;

public class arcaneSword extends ItemSword {

	public arcaneSword(ToolMaterial arcane) {
		super(arcane);
        this.setCreativeTab(Arcane.arcaneTab_combat);
	}

}
