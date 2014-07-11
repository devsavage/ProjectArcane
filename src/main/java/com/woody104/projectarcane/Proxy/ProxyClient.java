package com.woody104.projectarcane.Proxy;

import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.woody104.projectarcane.core.Arcane;
import com.woody104.projectarcane.render.ArcaneChestRenderer;
import com.woody104.projectarcane.render.ItemRendererArcaneChest;
import com.woody104.projectarcane.tileentity.TileEntityArcaneChest;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ProxyClient extends ProxyCommon {
	
	public void registerRenderThings() {
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityArcaneChest.class, new ArcaneChestRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(Arcane.arcaneChest), new ItemRendererArcaneChest());
		
		
	}

	@Override
	public void registerRenderers(){
		
	}

}
