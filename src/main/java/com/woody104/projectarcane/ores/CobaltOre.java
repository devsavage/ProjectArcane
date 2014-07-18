package com.woody104.projectarcane.ores;

import com.woody104.projectarcane.core.Arcane;
import com.woody104.projectarcane.registry.CreativeTabRegistry;
import com.woody104.projectarcane.registry.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class CobaltOre extends Block {

    public CobaltOre(Material material) {
        super(material);
        this.setHardness(4.0F);
        this.setResistance(5.0F);
        this.setLightLevel(0.1F);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel("pickaxe", 3);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab_blocks);    }

    @Override
    public Item getItemDropped(int par1, Random par2Random, int par3) {
        return ItemRegistry.itemCobaltDust;
    }
}



