package com.woody104.projectarcane.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemLogBlocks extends ItemBlock {

    public static final String[] logs = new String[] {"Maple", "GreenApple"};

    public ItemLogBlocks(Block block) {
        super(block);
        this.setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack itemStack) {
        int i = itemStack.getItemDamage();
        if (i < 0 || i >= logs.length) {
            i = 0;
        }

        return super.getUnlocalizedName() + "." + logs[i];
    }

    public int getMetadata(int metaData) {
        return metaData;
    }
}
