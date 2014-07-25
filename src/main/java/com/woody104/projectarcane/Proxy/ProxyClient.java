package com.woody104.projectarcane.proxy;

import com.woody104.projectarcane.registry.BlockRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.woody104.projectarcane.render.ArcaneChestRenderer;
import com.woody104.projectarcane.render.ItemRendererArcaneChest;
import com.woody104.projectarcane.tileentity.TileEntityArcaneChest;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ProxyClient extends ProxyCommon {
	
	public void registerRenderThings() {
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityArcaneChest.class, new ArcaneChestRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockRegistry.arcaneChest), new ItemRendererArcaneChest());
		
		
	}

	@Override
	public void registerRenderers(){
		
	}

}
