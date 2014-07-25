package com.woody104.projectarcane.blocks;

import com.woody104.projectarcane.registry.CreativeTabRegistry;
import com.woody104.projectarcane.util.Reference;
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
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
    }

   @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
       this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
   }
}
