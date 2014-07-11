package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import net.minecraft.item.Item;

public class ToolArcaneHammer extends Item {
	
	public ToolArcaneHammer() {
		super();
		this.setNoRepair();
		this.maxStackSize = 1;
		this.setMaxDamage(150);
		this.setUnlocalizedName("toolAH");
		this.setTextureName(Arcane.MODID + ":" + "toolArcaneHammer" );
		this.setCreativeTab(Arcane.arcaneTab);
	}

}
