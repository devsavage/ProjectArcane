package com.woody104.projectarcane.blocks;

import com.woody104.projectarcane.core.Arcane;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by woody104 on 5/19/2014.
 */

public class ArcaneLamp extends Block {

    private final boolean isOn;

    public ArcaneLamp(boolean isOn) {
        super(Material.redstoneLight);

        this.isOn = isOn;

        if (isOn) {
            this.setLightLevel(1.0F);
        }
    }

    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(Arcane.MODID + ":" + (this.isOn ? "arcaneLampOn" : "arcaneLampOff"));
    }

    public void onBlockAdded(World world, int x, int y, int z) {
        if (!world.isRemote) {
            if (this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
                world.scheduleBlockUpdate(x, y, z, this, 4);
            } else if (!this.isOn && world.isBlockIndirectlyGettingPowered(x, y, z)) {
                world.setBlock(x, y, z, Arcane.blockArcaneLampOn, 0, 2);
            }
        }
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
        if (!world.isRemote) {
            if (this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
                world.scheduleBlockUpdate(x, y, z, this, 4);
            } else if (!this.isOn && world.isBlockIndirectlyGettingPowered(x, y, z)) {
                world.setBlock(x, y, z, Arcane.blockArcaneLampOn, 0, 2);
            }
        }
    }

    public void updateTick(World world, int x, int y, int z, Random random) {
        if (!world.isRemote && this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
            world.setBlock(x, y, z, Arcane.blockArcaneLampOff, 0, 2);
        }
    }

    public Item getItemDropped(int i, Random random, int j) {
        return Item.getItemFromBlock(Arcane.blockArcaneLampOff);
    }

    protected ItemStack createStackedBlock(int i) {
        return new ItemStack(Arcane.blockArcaneLampOff);
    }
}