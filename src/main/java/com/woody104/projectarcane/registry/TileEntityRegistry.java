package com.woody104.projectarcane.registry;

import com.woody104.projectarcane.tileentity.TileEntityArcaneChest;
import com.woody104.projectarcane.tileentity.TileEntityArcaneFurnace;
import com.woody104.projectarcane.tileentity.TileEntityDualFurnace;
import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntityRegistry
{
    public static void init()
    {
        GameRegistry.registerTileEntity(TileEntityArcaneFurnace.class, "ArcaneFurnace");
        GameRegistry.registerTileEntity(TileEntityDualFurnace.class, "dualFurnace");
        GameRegistry.registerTileEntity(TileEntityArcaneChest.class, "arcaneChest");
    }
}
