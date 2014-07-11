package com.woody104.projectarcane.slot;

import com.woody104.projectarcane.tileentity.TileEntityDualFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class SlotDualFurnace extends Slot {

    public SlotDualFurnace(EntityPlayer player, IInventory iInventory, int i, int j, int k) {
        super(iInventory, i, j, k);
    }

}
