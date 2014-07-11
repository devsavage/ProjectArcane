package com.woody104.projectarcane.handler;

import com.woody104.projectarcane.core.Arcane;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;

public class CraftingHandler {
	
	@SubscribeEvent
	public void onCrafting(ItemCraftedEvent event) {
		final IInventory craftMatrix = null;
		for(int i = 0; i < event.craftMatrix.getSizeInventory(); i++) {
			if (event.craftMatrix.getStackInSlot(i) != null) {

                ItemStack item0 = event.craftMatrix.getStackInSlot(i);
                if (item0 != null && item0.getItem() == Arcane.itemCutter) {
                    ItemStack k = new ItemStack(Arcane.itemCutter, 2, (item0.getItemDamage() + 1));

                    if (k.getItemDamage() >= k.getMaxDamage()) {
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);

                }

                ItemStack item1 = event.craftMatrix.getStackInSlot(i);
                if (item1 != null && item1.getItem() == Arcane.itemMetalBender) {
                    ItemStack k = new ItemStack(Arcane.itemMetalBender, 2, (item1.getItemDamage() + 1));

                    if (k.getItemDamage() >= k.getMaxDamage()) {
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack item2 = event.craftMatrix.getStackInSlot(i);
                if (item2 != null && item2.getItem() == Arcane.toolArcaneHammer) {
                    ItemStack k = new ItemStack(Arcane.toolArcaneHammer, 2, (item2.getItemDamage() + 1));

                    if (k.getItemDamage() >= k.getMaxDamage()) {
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }

                ItemStack item3 = event.craftMatrix.getStackInSlot(i);
                if (item3 != null && item3.getItem() == Arcane.toolArcaneChisel) {
                    ItemStack k = new ItemStack(Arcane.toolArcaneChisel, 2, (item3.getItemDamage() + 1));

                    if (k.getItemDamage() >= k.getMaxDamage()) {
                        k.stackSize--;
                    }
                    event.craftMatrix.setInventorySlotContents(i, k);
                }
            }

            ItemStack item4 = event.craftMatrix.getStackInSlot(i);
            if (item4 != null && item4.getItem() == Arcane.toolSaw) {
                ItemStack k = new ItemStack(Arcane.toolSaw, 2, (item4.getItemDamage() + 1));

                if (k.getItemDamage() >= k.getMaxDamage()) {
                    k.stackSize--;
                }
                event.craftMatrix.setInventorySlotContents(i, k);
            }
            
            ItemStack goldHammer = event.craftMatrix.getStackInSlot(i);
            if (goldHammer != null && goldHammer.getItem() == Arcane.toolGoldHammer) {
                ItemStack k = new ItemStack(Arcane.toolGoldHammer, 2, (goldHammer.getItemDamage() + 1));

                if (k.getItemDamage() >= k.getMaxDamage()) {
                    k.stackSize--;
                }
                event.craftMatrix.setInventorySlotContents(i, k);
            }
		
	}

}
}
