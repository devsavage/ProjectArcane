package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.registry.CreativeTabRegistry;
import com.woody104.projectarcane.util.Reference;
import net.minecraft.item.Item;

import com.woody104.projectarcane.core.Arcane;

public class ToolGoldHammer extends Item {
	
	public ToolGoldHammer() {
		super();
		this.setNoRepair();
		this.maxStackSize = 1;
		this.setMaxDamage(75);
		this.setUnlocalizedName("goldHammer");
		this.setTextureName(Reference.MOD_ID + ":" + "goldHammer" );
		this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}

}
