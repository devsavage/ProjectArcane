package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;

import com.woody104.projectarcane.registry.CreativeTabRegistry;
import com.woody104.projectarcane.registry.MaterialRegistry;
import net.minecraft.item.ItemSword;

public class CobaltSword extends ItemSword {

	public CobaltSword(ToolMaterial toolmaterial) {
		super(MaterialRegistry.Tools.cobalt);
		this.setCreativeTab(CreativeTabRegistry.arcaneTab_combat);
	}
}
