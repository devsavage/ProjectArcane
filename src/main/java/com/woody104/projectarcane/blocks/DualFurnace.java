package com.woody104.projectarcane.blocks;

import com.woody104.projectarcane.core.Arcane;
import com.woody104.projectarcane.tileentity.TileEntityDualFurnace;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

public class DualFurnace extends BlockContainer {

    private Random rand;
    private final boolean isActive;
    private static boolean keepInventory = true;

    @SideOnly(Side.CLIENT)
    private IIcon iconFront;

    public DualFurnace(boolean blockState) {
        super(Material.anvil);
        rand = new Random();
        isActive = blockState;

    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(Arcane.MODID + ":" + (this.isActive ? "DualFurnaceSideOn" : "DualFurnaceSideOff"));
        this.iconFront = iconRegister.registerIcon(Arcane.MODID + ":" + (this.isActive ? "DualFurnaceFrontOn" : "DualFurnaceFrontOff"));
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata) {
        return metadata == 0 && side == 3 ? this.iconFront : (side == metadata ? this.iconFront : this.blockIcon);
    }

    public void onBlockAdded(World world, int x, int y, int z) {
        super.onBlockAdded(world, x, y, z);
        this.setDefaultDirection(world, x, y, z);
    }

    private void setDefaultDirection(World world, int x, int y, int z) {

        if (!world.isRemote) {
            Block block1 = world.getBlock(x, y, z - 1);
            Block block2 = world.getBlock(x, y, z + 1);
            Block block3 = world.getBlock(x - 1, y, z);
            Block block4 = world.getBlock(x + 1, y, z);

            byte b0 = 3;

            if (block1.func_149730_j() && !block2.func_149730_j()) {
                b0 = 3;
            }

            if (block2.func_149730_j() && !block2.func_149730_j()) {
                b0 = 2;
            }

            if (block3.func_149730_j() && !block2.func_149730_j()) {
                b0 = 5;
            }

            if (block4.func_149730_j() && !block2.func_149730_j()) {
                b0 = 4;
            }

            world.setBlockMetadataWithNotify(x, y, z, b0, 2);
        }
    }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityPlayer, ItemStack itemStack) {
        int l = MathHelper.floor_double((double) (entityPlayer.rotationYaw * 4.0F / 360.F) + 0.5D) & 3;

        if(l == 0) {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }
        if(l == 1) {
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }
        if(l == 2) {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }
        if(l == 3) {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }

        if(itemStack.hasDisplayName()) {
            //((TileEntityDualFurnace)world.getTileEntity(x, y, z)).setCustomName(itemStack.getDisplayName());
        }
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        if (world.isRemote) {
            return true;
        }

        else if (!player.isSneaking()) {
            TileEntityDualFurnace entity = (TileEntityDualFurnace) world.getTileEntity(x, y, z);
            if (entity != null) {
                FMLNetworkHandler.openGui(player, Arcane.instance, Arcane.guiIDDualFurnace, world, x, y, z);
            }

            return true;
        }

        else {
            return false;
        }
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2) {

        return new TileEntityDualFurnace();
    }

    public static void updateBlockState(boolean isSmelting, World world, int xCoord, int yCoord, int zCoord) {

        int i = world.getBlockMetadata(xCoord, yCoord, zCoord);
        TileEntity tileEntity = world.getTileEntity(xCoord, yCoord, zCoord);
        keepInventory = true;

        if (isSmelting) {
            world.setBlock(xCoord, yCoord, zCoord, Arcane.blockDualFurnaceActive);
        }else {
            world.setBlock(xCoord, yCoord, zCoord, Arcane.blockDualFurnaceIdle);
        }

        keepInventory = false;
        world.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, i, 2);

        if (tileEntity != null) {
            tileEntity.validate();
            world.setTileEntity(xCoord, yCoord, zCoord, tileEntity);
        }
    }
}
