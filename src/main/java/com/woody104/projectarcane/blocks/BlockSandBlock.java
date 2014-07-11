package com.woody104.projectarcane.blocks;

import com.woody104.projectarcane.core.Arcane;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class BlockSandBlock extends Block {

    public BlockSandBlock () {
        super(Material.sand);
        this.setResistance(0.5F);
        this.setHardness(0.5F);
        this.setLightLevel(0.5F);
        this.setBlockName("blockSandBlock");
        this.setStepSound(soundTypeSand);
        this.setCreativeTab(Arcane.arcaneTab_blocks);
        this.setBlockTextureName(Arcane.MODID + ":" + "blockSandBlock");

    }

    @Override
    public int quantityDropped(Random random)
    {
        return 1 + random.nextInt(3);
    }

    @Override
    public Item getItemDropped(int par1, Random par2Random, int par3) {
        return Arcane.itemSandDust;
    }

}