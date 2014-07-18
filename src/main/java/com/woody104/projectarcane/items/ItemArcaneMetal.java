package com.woody104.projectarcane.items;

import com.woody104.projectarcane.core.Arcane;

import com.woody104.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.Item;

public class ItemArcaneMetal extends Item {
	
	public ItemArcaneMetal() {
		super();
		this.setCreativeTab(CreativeTabRegistry.arcaneTab_material);
		this.setUnlocalizedName("itemArcaneMetal");
		
	}

}
