package com.woody104.projectarcane.blocks;

import com.woody104.projectarcane.core.Arcane;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class Ore extends Block {

    public Ore(Material material) {
        super(material);

        this.setHardness(3.0f);
        this.setResistance(200.0F);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(Arcane.arcaneTab);
    }

   @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
       this.blockIcon = iconRegister.registerIcon(Arcane.MODID + ":" + this.getUnlocalizedName().substring(5));
   }
}
