package tv.savageboy74.projectarcane.handler;

import net.minecraftforge.fml.common.network.IGuiHandler;
import tv.savageboy74.projectarcane.container.ContainerArcaneFurnace;
import tv.savageboy74.projectarcane.container.ContainerDualFurnace;
import tv.savageboy74.projectarcane.container.ContainerArcaneTable;
import tv.savageboy74.projectarcane.gui.GuiArcaneFurnace;
import tv.savageboy74.projectarcane.gui.GuiDualFurnace;
import tv.savageboy74.projectarcane.gui.GuiArcaneTable;
import tv.savageboy74.projectarcane.registry.BlockRegistry;
import tv.savageboy74.projectarcane.tileentity.TileEntityArcaneFurnace;
import tv.savageboy74.projectarcane.tileentity.TileEntityDualFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler
{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
//		TileEntity entity = world.getTileEntity(x, y, z);
//
//		if(entity != null) {
//			switch(ID) {
//			case BlockRegistry.guiIDArcaneFurnace:
//				if (entity instanceof TileEntityArcaneFurnace) {
//					return new ContainerArcaneFurnace(player.inventory, (TileEntityArcaneFurnace) entity);
//				}
//				return null;
//
//                case BlockRegistry.guiIDDualFurnace:
//                    if (entity instanceof TileEntityDualFurnace) {
//                        return new ContainerDualFurnace(player.inventory, (TileEntityDualFurnace) entity);
//                    }
//                    return null;
//            }
//		}
//
//		if(ID == BlockRegistry.guiIDArcaneTable) {
//			return ID == BlockRegistry.guiIDArcaneTable && world.getBlock(x, y, z) == BlockRegistry.blockArcaneTable ? new ContainerArcaneTable(player.inventory, world, x, y, z) : null;
//		}

		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
//		TileEntity entity = world.getTileEntity(x, y, z);
//
//		if(entity != null) {
//			switch(ID) {
//			case BlockRegistry.guiIDArcaneFurnace:
//				if (entity instanceof TileEntityArcaneFurnace) {
//					return new GuiArcaneFurnace(player.inventory, (TileEntityArcaneFurnace) entity);
//				}
//				return null;
//
//                case BlockRegistry.guiIDDualFurnace:
//                    if (entity instanceof TileEntityDualFurnace) {
//                        return new GuiDualFurnace(player.inventory, (TileEntityDualFurnace) entity);
//                    }
//                    return null;
//			}
//		}
//
//		if(ID == BlockRegistry.guiIDArcaneTable) {
//			return ID == BlockRegistry.guiIDArcaneTable && world.getBlock(x, y, z) == BlockRegistry.blockArcaneTable ? new GuiArcaneTable(player.inventory, world, x, y, z) : null;
//		}

		return null;
	}

}
