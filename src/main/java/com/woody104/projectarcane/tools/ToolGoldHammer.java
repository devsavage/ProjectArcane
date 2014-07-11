package com.woody104.projectarcane.tools;

import net.minecraft.item.Item;

import com.woody104.projectarcane.core.Arcane;

public class ToolGoldHammer extends Item {
	
	public ToolGoldHammer() {
		super();
		this.setNoRepair();
		this.maxStackSize = 1;
		this.setMaxDamage(75);
		this.setUnlocalizedName("goldHammer");
		this.setTextureName(Arcane.MODID + ":" + "goldHammer" );
		this.setCreativeTab(Arcane.arcaneTab);
	}

}
