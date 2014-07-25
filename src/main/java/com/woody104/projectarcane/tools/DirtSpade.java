package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemSpade;

public class DirtSpade extends ItemSpade {

	public DirtSpade(ToolMaterial dirt) {
		super(dirt);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}
	

}
