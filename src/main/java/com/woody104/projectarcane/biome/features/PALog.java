package com.woody104.projectarcane.biome.features;

import com.woody104.projectarcane.core.Arcane;
import com.woody104.projectarcane.util.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public class PALog extends BlockLog
{
    public static final String[] logs = new String[] {"Maple", "GreenApple"};

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list) {
        for (int i = 0; i < logs.length; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.field_150167_a = new IIcon[logs.length];
        this.field_150166_b = new IIcon[logs.length];

        for (int i = 0; i < this.field_150167_a.length; i++) {
            this.field_150167_a[i] = iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5) + logs[i]);
            this.field_150166_b[i] = iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5) + logs[i] + "Top");
        }
    }
}
