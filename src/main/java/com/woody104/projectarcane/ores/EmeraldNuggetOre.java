package com.woody104.projectarcane.ores;

import java.util.Random;

import com.woody104.projectarcane.core.Arcane;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class EmeraldNuggetOre extends Block {

	public EmeraldNuggetOre(Material rock) {
		super(Material.rock);
        this.setCreativeTab(Arcane.arcaneTab_blocks);
        this.setHardness(4.0F);
		this.setResistance(5.0F);
		this.setLightLevel(0.0F);
		this.setHarvestLevel("pickaxe", 3);
	}
	
	@Override
	public Item getItemDropped (int par1, Random par2Random, int par3) {
		return Arcane.emeraldNugget;
	}

}
