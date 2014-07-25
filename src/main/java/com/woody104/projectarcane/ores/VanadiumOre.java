package com.woody104.projectarcane.ores;

import com.woody104.projectarcane.blocks.Ore;
import com.woody104.projectarcane.registry.CreativeTabRegistry;
import com.woody104.projectarcane.registry.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class VanadiumOre extends Ore
{

    public VanadiumOre(Material rock) {

        super(Material.rock);
        this.setHarvestLevel("pickaxe", 2);
    }
}

