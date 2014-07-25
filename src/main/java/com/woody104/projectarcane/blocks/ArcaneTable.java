package com.woody104.projectarcane.blocks;

import com.woody104.projectarcane.Arcane;

import com.woody104.projectarcane.registry.BlockRegistry;
import com.woody104.projectarcane.registry.CreativeTabRegistry;
import com.woody104.projectarcane.util.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ArcaneTable extends Block {
	
	@SideOnly(Side.CLIENT)
	private IIcon arcaneTableTop;
	
	@SideOnly(Side.CLIENT)
	private IIcon arcaneTableSide;

	public ArcaneTable() {
		super(Material.wood);
		
		
		this.setHardness(3.5F);
		this.setResistance(5.0F);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon (int side, int metadata) {
		return side == 1 ? this.arcaneTableTop : this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons (IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + "ArcaneTableSide");
		this.arcaneTableTop = iconRegister.registerIcon(Reference.MOD_ID + ":" + "ArcaneTableTop");
	}
	
	public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int q, float a, float b, float c) {
		if (!player.isSneaking()) {
			player.openGui(Arcane.instance, BlockRegistry.guiIDArcaneTable, world, x, y, z);
			return true;
		}else{
			return false;
		}
	}

}
