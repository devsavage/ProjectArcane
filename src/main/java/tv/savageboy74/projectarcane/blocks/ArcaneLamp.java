package tv.savageboy74.projectarcane.blocks;

import tv.savageboy74.projectarcane.registry.BlockRegistry;
import tv.savageboy74.projectarcane.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;


public class ArcaneLamp extends Block {

    private final boolean isOn;

    public ArcaneLamp(boolean isOn) {
        super(Material.redstoneLight);

        this.isOn = isOn;

        if (isOn) {
            this.setLightLevel(1.0F);
        }
    }

//    public void registerBlockIcons(IIconRegister iconRegister) {
//        this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + (this.isOn ? "arcaneLampOn" : "arcaneLampOff"));
//    }
//
//    public void onBlockAdded(World world, int x, int y, int z) {
//        if (!world.isRemote) {
//            if (this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
//                world.scheduleBlockUpdate(x, y, z, this, 4);
//            } else if (!this.isOn && world.isBlockIndirectlyGettingPowered(x, y, z)) {
//                world.setBlock(x, y, z, BlockRegistry.blockArcaneLampOn, 0, 2);
//            }
//        }
//    }
//
//    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
//        if (!world.isRemote) {
//            if (this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
//                world.scheduleBlockUpdate(x, y, z, this, 4);
//            } else if (!this.isOn && world.isBlockIndirectlyGettingPowered(x, y, z)) {
//                world.setBlock(x, y, z, BlockRegistry.blockArcaneLampOn, 0, 2);
//            }
//        }
//    }
//
//    public void updateTick(World world, int x, int y, int z, Random random) {
//        if (!world.isRemote && this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
//            world.setBlock(x, y, z, BlockRegistry.blockArcaneLampOff, 0, 2);
//        }
//    }
//
//    public Item getItemDropped(int i, Random random, int j) {
//        return Item.getItemFromBlock(BlockRegistry.blockArcaneLampOff);
//    }
//
//    protected ItemStack createStackedBlock(int i) {
//        return new ItemStack(BlockRegistry.blockArcaneLampOff);
//    }
}