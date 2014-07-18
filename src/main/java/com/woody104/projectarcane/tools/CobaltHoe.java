package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import com.woody104.projectarcane.registry.CreativeTabRegistry;
import com.woody104.projectarcane.registry.MaterialRegistry;
import net.minecraft.item.ItemHoe;

public class CobaltHoe extends ItemHoe {

	public CobaltHoe(ToolMaterial toolmaterial) {
		super(MaterialRegistry.Tools.cobalt);
		this.setCreativeTab(CreativeTabRegistry.arcaneTab_tools);
	}

}
