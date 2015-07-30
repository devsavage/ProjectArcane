package tv.savageboy74.projectarcane.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemLeafBlocks extends ItemBlock {

    public static final String[] leaves = new String[] {"Maple", "GreenApple"};

    public ItemLeafBlocks(Block block) {
        super(block);
        this.setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack itemStack) {
        int i = itemStack.getItemDamage();
        if (i < 0 || i >= leaves.length) {
            i = 0;
        }

        return super.getUnlocalizedName() + "." + leaves[i];
    }

    public int getMetadata(int metaData) {
        return metaData;
    }
}