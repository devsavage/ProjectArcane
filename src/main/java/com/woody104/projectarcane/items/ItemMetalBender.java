package com.woody104.projectarcane.items;

import com.woody104.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.Item;

public class ItemMetalBender extends Item {
	
	public ItemMetalBender() {
		super();
		this.setMaxDamage(64);
		this.setCreativeTab(CreativeTabRegistry.arcaneTab);
		this.setMaxStackSize(1);
		this.setNoRepair();
	}
}
