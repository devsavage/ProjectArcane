package com.woody104.projectarcane.handler;

import com.woody104.projectarcane.container.ContainerArcaneFurnace;
import com.woody104.projectarcane.container.ContainerDualFurnace;
import com.woody104.projectarcane.container.ContainerArcaneTable;
import com.woody104.projectarcane.gui.GuiArcaneFurnace;
import com.woody104.projectarcane.gui.GuiDualFurnace;
import com.woody104.projectarcane.gui.GuiArcaneTable;
import com.woody104.projectarcane.registry.BlockRegistry;
import com.woody104.projectarcane.tileentity.TileEntityArcaneFurnace;
import com.woody104.projectarcane.tileentity.TileEntityDualFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);

		if(entity != null) {
			switch(ID) {
			case BlockRegistry.guiIDArcaneFurnace:
				if (entity instanceof TileEntityArcaneFurnace) {
					return new ContainerArcaneFurnace(player.inventory, (TileEntityArcaneFurnace) entity);
				}
				return null;

                case BlockRegistry.guiIDDualFurnace:
                    if (entity instanceof TileEntityDualFurnace) {
                        return new ContainerDualFurnace(player.inventory, (TileEntityDualFurnace) entity);
                    }
                    return null;
            }
		}

		if(ID == BlockRegistry.guiIDArcaneTable) {
			return ID == BlockRegistry.guiIDArcaneTable && world.getBlock(x, y, z) == BlockRegistry.blockArcaneTable ? new ContainerArcaneTable(player.inventory, world, x, y, z) : null;
		}

		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);

		if(entity != null) {
			switch(ID) {
			case BlockRegistry.guiIDArcaneFurnace:
				if (entity instanceof TileEntityArcaneFurnace) {
					return new GuiArcaneFurnace(player.inventory, (TileEntityArcaneFurnace) entity);
				}
				return null;

                case BlockRegistry.guiIDDualFurnace:
                    if (entity instanceof TileEntityDualFurnace) {
                        return new GuiDualFurnace(player.inventory, (TileEntityDualFurnace) entity);
                    }
                    return null;
			}
		}

		if(ID == BlockRegistry.guiIDArcaneTable) {
			return ID == BlockRegistry.guiIDArcaneTable && world.getBlock(x, y, z) == BlockRegistry.blockArcaneTable ? new GuiArcaneTable(player.inventory, world, x, y, z) : null;
		}

		return null;
	}

}
