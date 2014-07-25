package com.woody104.projectarcane.tileentity;

import com.woody104.projectarcane.blocks.DualFurnace;
import com.woody104.projectarcane.crafting.DualFurnaceRecipes;
import com.woody104.projectarcane.registry.ItemRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityDualFurnace extends TileEntity implements ISidedInventory {

    private ItemStack slots[];

    public int dualPower;
    public int dualCookTime;
    public static final int maxPower = 10000;
    public static final int dualFurnaceSpeed = 75;

    private static final int[] slots_top = new int[] {0, 1};
    private static final int[] slots_bottom = new int[] {3};
    private static final int[] slots_side = new int[] {2};

    private String customName;

    public TileEntityDualFurnace() {
        slots = new ItemStack[4];
    }

    @Override
    public int getSizeInventory() {

        return slots.length;
    }

    @Override
    public ItemStack getStackInSlot(int i) {
        return slots[i];
    }

    @Override
    public ItemStack decrStackSize(int i, int j) {
        if(this.slots[i] != null) {
            ItemStack itemStack;

            if(this.slots[i].stackSize <= j ) {
                itemStack = this.slots[i];
                this.slots[i] = null;
                return itemStack;
            }else{

                ItemStack itemStack1 = this.slots[i].splitStack(j);

                if(this.slots[i].stackSize == 0) {
                    this.slots[i] = null;
                }

                return itemStack1;
            }

        }else {}
        return null;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int i) {
       if (slots[i] != null) {
           ItemStack itemStack = slots[i];
           slots[i] = null;
           return itemStack;
       }else{
           return null;
       }
    }

    @Override
    public void setInventorySlotContents(int i, ItemStack itemStack) {
        slots[i] = itemStack;
        if(itemStack != null && itemStack.stackSize > getInventoryStackLimit()) {
            itemStack.stackSize = getInventoryStackLimit();
        }
    }

    @Override
    public String getInventoryName() {
        return this.hasCustomInventoryName() ? this.customName : "container.dualFurnace";
    }

    @Override
    public boolean hasCustomInventoryName() {
        return this.customName != null && this.customName.length() > 0;
    }

    @Override
    public int getInventoryStackLimit() {

        return 64;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer entityPlayer) {
        if (worldObj.getTileEntity(xCoord, yCoord, zCoord) != this) {
            return false;
        } else {

            return entityPlayer.getDistance((double) xCoord + 0.5D, (double) yCoord + 0.5D, (double) zCoord + 0.5D) <= 64;
        }
    }

        public void openInventory () {}
        public void closeInventory () {}

        @Override
        public boolean isItemValidForSlot ( int i, ItemStack itemStack){
            return i == 2 ? false : (i == 1 ? hasItemPower(itemStack) : true);
        }

    public static boolean hasItemPower (ItemStack itemStack) {
        return getItemPower(itemStack) > 0;
    }

    private static int getItemPower(ItemStack itemstack) {
        if (itemstack == null) {
            return 0;
        } else {
            Item item = itemstack.getItem();

            if (item == ItemRegistry.itemWoodChips) return 50;

            return 0;

            //if(item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air) {
            // Block block = Block.getBlockFromItem(item);

            //if(block == Blocks.sapling) return 100;
            // if(block == Blocks.coal_block) return 14400;

            //}
            // if(item == Arcane.itemWoodChips) return 800;
            // if(item == Items.coal) return 1600;
            // if(item == Items.lava_bucket) return 20000;
            //if(item == Items.stick) return 100;
            //if(item == Items.blaze_rod) return 2400;
            //}

            //return GameRegistry.getFuelValue(itemstack);
            //}
        }
    }


    public void readFromNBT(NBTTagCompound tagCompound) {
        super.readFromNBT(tagCompound);
        NBTTagList list = tagCompound.getTagList("Items", 10);
        slots = new ItemStack[getSizeInventory()];

        for (int i = 0; i < list.tagCount(); i++) {
            NBTTagCompound tagCompound1 = (NBTTagCompound)list.getCompoundTagAt(i);
            byte b0 = tagCompound1.getByte("Slot");

            if (b0 >= 0 && b0 < slots.length) {
                slots[b0] = ItemStack.loadItemStackFromNBT(tagCompound1);
            }
        }

        dualPower = tagCompound.getShort("PowerTime");
        dualCookTime = tagCompound.getShort("CookTime");

        if (tagCompound.hasKey("CustomName")) {
            this.customName = tagCompound.getString("CustomName");
        }
    }

    public void writeToNBT(NBTTagCompound tagCompound) {
        super.writeToNBT(tagCompound);
        tagCompound.setShort("PowerTime", (short)dualPower);
        tagCompound.setShort("CookTime", (short)dualCookTime);
        NBTTagList list = new NBTTagList();

        for (int i = 0; i < slots.length; i++) {
            if (slots[i] != null) {
                NBTTagCompound tagCompound1 = new NBTTagCompound();
                tagCompound1.setByte("Slot", (byte)i);
                slots[i].writeToNBT(tagCompound1);
                list.appendTag(tagCompound1);
            }
        }

        tagCompound.setTag("Items", list);

        if (this.hasCustomInventoryName()) {
            tagCompound.setString("CustomName", this.customName);
        }
    }

    @Override
    public int[] getAccessibleSlotsFromSide(int i) {
        return i == 0 ? slots_bottom : (i == 1 ? slots_top : slots_side);
    }

    @Override
    public boolean canInsertItem(int i, ItemStack itemStack, int j) {
        return this.isItemValidForSlot(i, itemStack);
    }

    @Override
    public boolean canExtractItem(int i, ItemStack itemStack, int j) {
        return j != 0 || i != 1 || itemStack.getItem() == Items.bucket;
    }

    public int getFurnaceProgressScaled(int i) {
        return (dualCookTime * i / this.dualFurnaceSpeed);
    }

    public int getPowerRemainingScaled(int i) {
        return (dualCookTime * i / maxPower);
    }

    private boolean canSmelt() {
        if (slots[0] == null || slots[1] == null) {
            return false;
        }

        ItemStack itemStack = DualFurnaceRecipes.getFurnaceResult(slots[0].getItem(), slots[1].getItem());

        if (itemStack == null) {
            return false;
        }

        if (slots[3] == null) {
            return true;
        }

        if (!slots[3].isItemEqual(itemStack)) {
            return false;
        }

        if (slots[3].stackSize < getInventoryStackLimit() && slots[3].stackSize < slots[3].getMaxStackSize()) {
            return true;
        }else {
            return slots[3].stackSize < itemStack.getMaxStackSize();
        }
    }

    private void smeltItem() {
        if (canSmelt()) {
            ItemStack itemStack = DualFurnaceRecipes.getFurnaceResult(slots[0].getItem(), slots[1].getItem());

            if (slots[3] == null) {
                slots[3] = itemStack.copy();
            }

            else if (slots[3].isItemEqual(itemStack)) {
                slots[3].stackSize += itemStack.stackSize;
            }

            for (int i = 0; i < 2; i++) {
               if (slots[i].stackSize <= 0 ) {
                   slots[i] = new ItemStack(slots[i].getItem().setFull3D());
               }else{
                   slots[i].stackSize--;
               }

                if (slots[i].stackSize <= 0) {
                    slots[i] = null;
                }
            }
        }
    }

    public boolean hasPower() {
        return dualPower > 0;
    }

    public boolean isSmelting() {
        return this.dualCookTime > 0;
    }

    public void updateEntity() {
        boolean flag = this.hasPower();
        boolean flag1 = false;

        if(hasPower()  && this.isSmelting()) {
            this.dualPower--;
        }

        if (!worldObj.isRemote) {
            if (this.hasItemPower(this.slots[2]) && this.dualPower < (this.maxPower - this.getItemPower(this.slots[2]))) {
                this.dualPower += getItemPower(this.slots[2]);

                if (this.slots[2] != null) {
                    flag1 = true;

                    this.slots[2].stackSize--;

                    if(this.slots[2].stackSize == 0) {
                        this.slots[2] = this.slots[2].getItem().getContainerItem(this.slots[2]);
                    }
                }
            }

            if (hasPower() && canSmelt()) {
                dualCookTime++;

                if (this.dualCookTime == this.dualFurnaceSpeed) {
                    this.dualCookTime = 0;
                    this.smeltItem();
                    flag1 = true;
                }
            }else{
                dualCookTime = 0;
            }

            if (flag != this.isSmelting()) {
                flag1 = true;
                DualFurnace.updateBlockState(this.isSmelting(), this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }

        if (flag1) {
            this.markDirty();
        }
    }
}
