package com.woody104.projectarcane.blocks;

import com.woody104.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockArcaneGem extends Block{

	public BlockArcaneGem() {
		super(Material.anvil);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
		this.setHardness(6F);
		this.setResistance(6F);
		this.setLightLevel(0.2F);
		this.setHarvestLevel("pickaxe", 3);

	}
	

}
