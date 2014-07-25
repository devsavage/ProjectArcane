package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemPickaxe;

public class ToolDarkCrystalPickaxe extends ItemPickaxe{
	
	public ToolDarkCrystalPickaxe(ToolMaterial darkCrystal) {
		super(darkCrystal);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}

}
