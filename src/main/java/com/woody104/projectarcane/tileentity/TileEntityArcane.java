package com.woody104.projectarcane.tileentity;

import com.woody104.projectarcane.core.Arcane;

import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntityArcane {
	
	public static void Arcane() {
		registerTileEntities();
	}
	
	private static void registerTileEntities() {
		GameRegistry.registerTileEntity(TileEntityArcaneChest.class, Arcane.MODID);
	}

}
