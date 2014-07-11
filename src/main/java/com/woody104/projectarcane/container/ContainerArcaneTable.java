package com.woody104.projectarcane.container;

import com.woody104.projectarcane.core.Arcane;
import com.woody104.projectarcane.crafting.ArcaneTableCraftingManager;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ContainerArcaneTable extends Container {
	
	public InventoryCrafting craftMatrix;
	public IInventory craftResult;
	private World worldObj;
	private int posX;
	private int posY;
	private int posZ;
	
	public ContainerArcaneTable(InventoryPlayer invPlayer, World world, int x, int y, int z) {
		craftMatrix = new InventoryCrafting(this, 4, 4);
		craftResult = new InventoryCraftResult();
		worldObj = world;
		posX = x;
		posY = y;
		posZ = z;

        //+ 5 in from left to output slot 5 in to output from top (output slot)
		this.addSlotToContainer(new SlotCrafting(invPlayer.player, craftMatrix, craftResult, 0, 127, 38));
		//crafting slots
		for (int i = 0; i < 4; i++) {
			for(int k = 0; k < 4; k++) {
				this.addSlotToContainer(new Slot(craftMatrix, k + i * 4, 15 + k * 18, 13 + i * 18));
			}
		}
		//inventory slots
		for (int i = 0; i < 3; i++) {
			for(int k = 0; k < 9; k++) {
				this.addSlotToContainer(new Slot(invPlayer, k + i * 9 + 9, 8 + k * 18, 102 + i * 18));
			}
		}
		//bottom inventory slots
		for (int i = 0; i < 9; i++) {
			this.addSlotToContainer(new Slot(invPlayer, i, 8 + i * 18, 160));
		}
		
		onCraftMatrixChanged(craftMatrix);
	}
	
	public void onCraftMatrixChanged(IInventory iinventory) {
		craftResult.setInventorySlotContents(0, ArcaneTableCraftingManager.getInstance().findMatchingRecipe(craftMatrix, worldObj));

	}
	
    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2) {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(par2);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (par2 == 0)
            {
                if (!this.mergeItemStack(itemstack1, 10, 46, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (par2 >= 10 && par2 < 37)
            {
                if (!this.mergeItemStack(itemstack1, 37, 46, false))
                {
                    return null;
                }
            }
            else if (par2 >= 37 && par2 < 46)
            {
                if (!this.mergeItemStack(itemstack1, 10, 37, false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 10, 46, false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize)
            {
                return null;
            }

            slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
        }

        return itemstack;
    }
	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		if(worldObj.getBlock(posX, posY, posZ) != Arcane.blockArcaneTable) {
			return false;
		}else{
			return player.getDistanceSq(posX, posY, posZ) <= 64.0D;
		}
	}
	
	public void onContainerClosed(EntityPlayer par1EntityPlayer) {
        super.onContainerClosed(par1EntityPlayer);

        if (!this.worldObj.isRemote)
        {
            for (int i = 0; i < 9; ++i)
            {
                ItemStack itemstack = this.craftMatrix.getStackInSlotOnClosing(i);

                if (itemstack != null)
                {
                    par1EntityPlayer.dropPlayerItemWithRandomChoice(itemstack, false);
                }
            }
        }
    }
}
