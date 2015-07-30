package tv.savageboy74.projectarcane.registry;

import net.minecraftforge.fml.common.registry.GameRegistry;
import tv.savageboy74.projectarcane.tileentity.TileEntityArcaneChest;
import tv.savageboy74.projectarcane.tileentity.TileEntityArcaneFurnace;
import tv.savageboy74.projectarcane.tileentity.TileEntityDualFurnace;

public class TileEntityRegistry
{
    public static void init()
    {
        GameRegistry.registerTileEntity(TileEntityArcaneFurnace.class, "ArcaneFurnace");
        GameRegistry.registerTileEntity(TileEntityDualFurnace.class, "dualFurnace");
        GameRegistry.registerTileEntity(TileEntityArcaneChest.class, "arcaneChest");
    }
}
