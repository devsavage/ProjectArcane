package com.woody104.projectarcane.blocks;

import com.woody104.projectarcane.core.Arcane;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by woody104 on 5/17/2014.
 */
public class BlockMachineCore extends Block {

    public BlockMachineCore() {
        super(Material.anvil);
        this.setHardness(5.0F);
        this.setResistance(4.0F);
        this.setLightLevel(0.5F);
        this.setHarvestLevel("arcanePickaxe", 4);
        this.setBlockName("blockMC");
        this.setBlockTextureName(Arcane.MODID + ":" + "blockMachineCore");
        this.setCreativeTab(Arcane.arcaneTab_blocks);    }
}
