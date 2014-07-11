package com.woody104.projectarcane.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.EnumChatFormatting;
import org.lwjgl.input.Keyboard;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemBlockSandBlock extends ItemBlock
{

    public ItemBlockSandBlock(Block block)
    {
        super(block);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean flag)
    {
        if (!Keyboard.isKeyDown(Keyboard.KEY_LSHIFT))
        {
            list.add("Hold " + EnumChatFormatting.AQUA + "shift" + EnumChatFormatting.GRAY + " for details.");
        }
        else {
            list.add("This is a block of sand that won't fall.");
            list.add("Mainly for decorations.");
        }
    }
}
