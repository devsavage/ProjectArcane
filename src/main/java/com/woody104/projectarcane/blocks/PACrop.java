package com.woody104.projectarcane.blocks;

import com.woody104.projectarcane.core.Arcane;
import com.woody104.projectarcane.registry.BlockRegistry;
import com.woody104.projectarcane.registry.ItemRegistry;
import com.woody104.projectarcane.util.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import java.util.Random;

public class PACrop extends BlockCrops {

    @SideOnly(Side.CLIENT)
    private IIcon[] iconArray;

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.iconArray = new IIcon[4];

        for (int i = 0; i < this.iconArray.length; i++) {
            this.iconArray[i] = iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5) + (i + 1));
        }
    }

    public IIcon getIcon(int side, int metadata) {
        if (metadata < 7){
            if (metadata == 6) {
                metadata = 5;
            }

            return this.iconArray[metadata >> 1];
        }

        return this.iconArray[3];
    }

    public int quantityDropped (Random random) {
        return 1 + random.nextInt(4);
    }

    protected Item func_149866_i() {
        return ItemRegistry.cropStrawberrySeeds;
    }

    protected Item func_149865_P() {
        return ItemRegistry.cropStrawberry;
    }
}
