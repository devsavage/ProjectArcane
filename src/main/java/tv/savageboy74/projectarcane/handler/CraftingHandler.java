package tv.savageboy74.projectarcane.handler;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import tv.savageboy74.projectarcane.registry.ItemRegistry;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public class CraftingHandler {
	
//	@SubscribeEvent
//	public void onCrafting(PlayerEvent.ItemCraftedEvent event) {
//		final IInventory craftMatrix = null;
//            for(int i = 0; i < event.craftMatrix.getSizeInventory(); i++) {
//                if (event.craftMatrix.getStackInSlot(i) != null) {
//
//                    ItemStack item0 = event.craftMatrix.getStackInSlot(i);
//                    if (item0 != null && item0.getItem() == ItemRegistry.itemCutter) {
//                        ItemStack k = new ItemStack(ItemRegistry.itemCutter, 2, (item0.getItemDamage() + 1));
//
//                        if (k.getItemDamage() >= k.getMaxDamage()) {
//                            k.stackSize--;
//                        }
//                        event.craftMatrix.setInventorySlotContents(i, k);
//
//                    }
//
//                    ItemStack item1 = event.craftMatrix.getStackInSlot(i);
//                    if (item1 != null && item1.getItem() == ItemRegistry.itemMetalBender) {
//                        ItemStack k = new ItemStack(ItemRegistry.itemMetalBender, 2, (item1.getItemDamage() + 1));
//
//                        if (k.getItemDamage() >= k.getMaxDamage()) {
//                            k.stackSize--;
//                        }
//                        event.craftMatrix.setInventorySlotContents(i, k);
//                    }
//
//                    ItemStack item2 = event.craftMatrix.getStackInSlot(i);
//                    if (item2 != null && item2.getItem() == ItemRegistry.toolArcaneHammer) {
//                        ItemStack k = new ItemStack(ItemRegistry.toolArcaneHammer, 2, (item2.getItemDamage() + 1));
//
//                        if (k.getItemDamage() >= k.getMaxDamage()) {
//                            k.stackSize--;
//                        }
//                        event.craftMatrix.setInventorySlotContents(i, k);
//                    }
//
//                    ItemStack item3 = event.craftMatrix.getStackInSlot(i);
//                    if (item3 != null && item3.getItem() == ItemRegistry.toolArcaneChisel) {
//                        ItemStack k = new ItemStack(ItemRegistry.toolArcaneChisel, 2, (item3.getItemDamage() + 1));
//
//                        if (k.getItemDamage() >= k.getMaxDamage()) {
//                            k.stackSize--;
//                        }
//                        event.craftMatrix.setInventorySlotContents(i, k);
//                    }
//                }
//
//                ItemStack item4 = event.craftMatrix.getStackInSlot(i);
//                if (item4 != null && item4.getItem() == ItemRegistry.toolSaw) {
//                    ItemStack k = new ItemStack(ItemRegistry.toolSaw, 2, (item4.getItemDamage() + 1));
//
//                    if (k.getItemDamage() >= k.getMaxDamage()) {
//                        k.stackSize--;
//                    }
//                    event.craftMatrix.setInventorySlotContents(i, k);
//                }
//
//                ItemStack goldHammer = event.craftMatrix.getStackInSlot(i);
//                if (goldHammer != null && goldHammer.getItem() == ItemRegistry.toolGoldHammer) {
//                    ItemStack k = new ItemStack(ItemRegistry.toolGoldHammer, 2, (goldHammer.getItemDamage() + 1));
//
//                    if (k.getItemDamage() >= k.getMaxDamage()) {
//                        k.stackSize--;
//                    }
//                    event.craftMatrix.setInventorySlotContents(i, k);
//                }
//
//        }
//    }
}
