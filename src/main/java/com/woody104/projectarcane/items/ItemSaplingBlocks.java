package com.woody104.projectarcane.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemSaplingBlocks extends ItemBlockWithMetadata {

    public static final String[] saplings = new String[] {"Maple", "GreenApple"};

    public ItemSaplingBlocks(Block block) {
        super(block, block);
        this.setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack itemStack) {
        int i = itemStack.getItemDamage();
        if (i < 0 || i >= saplings.length) {
            i = 0;
        }

        return super.getUnlocalizedName() + "." + saplings[i];
    }

    public int getMetadata(int metaData) {
        return metaData;
    }
}