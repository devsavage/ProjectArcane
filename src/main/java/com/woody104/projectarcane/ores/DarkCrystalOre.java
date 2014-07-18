package com.woody104.projectarcane.ores;

import java.util.Random;

import com.woody104.projectarcane.core.Arcane;
import com.woody104.projectarcane.registry.CreativeTabRegistry;
import com.woody104.projectarcane.registry.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class DarkCrystalOre extends Block {

	public DarkCrystalOre(Material rock) {
		super(Material.rock);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab_blocks);
		this.setHardness(4F);
		this.setResistance(4F);
		this.setLightLevel(0.0F);
		this.setHarvestLevel("pickaxe", 2);

	}
	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3) {
		return ItemRegistry.itemDarkCrystal;

}
}