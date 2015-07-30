package tv.savageboy74.projectarcane.container;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import tv.savageboy74.projectarcane.slot.SlotDualFurnace;
import tv.savageboy74.projectarcane.tileentity.TileEntityDualFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntityFurnace;

public class ContainerDualFurnace extends Container {

    private TileEntityDualFurnace dualFurnace;
    private int dualCookTime;
    private int dualPowerTime;
    private int lastItemBurnTime;

    public ContainerDualFurnace(InventoryPlayer inventoryPlayer, TileEntityDualFurnace tileEntityDualFurnace) {
        dualCookTime = 0;
        dualPowerTime = 0;
        lastItemBurnTime = 0;

        dualFurnace = tileEntityDualFurnace;

        this.addSlotToContainer(new Slot(tileEntityDualFurnace, 0, 48, 15 ));
        this.addSlotToContainer(new Slot(tileEntityDualFurnace, 1, 48, 35 ));
        this.addSlotToContainer(new Slot(tileEntityDualFurnace, 2, 8, 62 ));
        this.addSlotToContainer(new SlotDualFurnace(inventoryPlayer.player, tileEntityDualFurnace, 3, 105, 24 ));

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 9; j++) {
                this.addSlotToContainer(new Slot(inventoryPlayer, j + i*9 + 9, 8 + j*18, 84 + i*18));
            }
        }

        for(int i = 0; i < 9; i++) {
            this.addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
        }
    }

    public void addCraftingToCrafters (ICrafting iCrafting) {
        super.addCraftingToCrafters(iCrafting);
        iCrafting.sendProgressBarUpdate(this, 0, this.dualFurnace.dualCookTime);
        iCrafting.sendProgressBarUpdate(this, 1, this.dualFurnace.dualPower);
    }

    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2) {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(par2);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (par2 == 2)
            {
                if (!this.mergeItemStack(itemstack1, 3, 39, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (par2 != 1 && par2 != 0)
            {
                if (FurnaceRecipes.instance().getSmeltingResult(itemstack1) != null)
                {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false))
                    {
                        return null;
                    }
                }
                else if (TileEntityFurnace.isItemFuel(itemstack1))
                {
                    if (!this.mergeItemStack(itemstack1, 1, 2, false))
                    {
                        return null;
                    }
                }
                else if (par2 >= 3 && par2 < 30)
                {
                    if (!this.mergeItemStack(itemstack1, 30, 39, false))
                    {
                        return null;
                    }
                }
                else if (par2 >= 30 && par2 < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 3, 39, false))
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

        return dualFurnace.isUseableByPlayer(player);
    }

    public void detectAndSendChanges() {
        super.detectAndSendChanges();

        for (int i = 0; i < this.crafters.size(); i++) {
            ICrafting par1 = (ICrafting) this.crafters.get(i);

            if (this.dualCookTime != this.dualFurnace.dualCookTime) {
                par1.sendProgressBarUpdate(this, 0, this.dualFurnace.dualCookTime);
            }

            if (this.dualPowerTime != this.dualFurnace.dualPower) {
                par1.sendProgressBarUpdate(this, 1, this.dualFurnace.dualPower);
            }
        }

        this.dualCookTime = this.dualFurnace.dualCookTime;
        this.dualPowerTime = this.dualFurnace.dualPower;
    }

    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int i, int j) {
        if (i == 0) {
            dualFurnace.dualCookTime = j;
        }

        if (i == 1) {
            dualFurnace.dualPower = j;
        }
    }
}
