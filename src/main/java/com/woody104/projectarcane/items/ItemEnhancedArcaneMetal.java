package com.woody104.projectarcane.items;

import com.woody104.projectarcane.core.Arcane;

import com.woody104.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.Item;

public class ItemEnhancedArcaneMetal extends Item {
	
	public ItemEnhancedArcaneMetal() {
		super();
		this.setUnlocalizedName("itemEnhancedArcaneMetal");
		this.setCreativeTab(CreativeTabRegistry.arcaneTab_material);
	}

}
