package com.woody104.projectarcane.blocks;

import com.woody104.projectarcane.core.Arcane;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class Cantalope extends Block
{
    @SideOnly(Side.CLIENT)
    private IIcon field_150201_a;
    private static final String __OBFID = "CL_00000267";

    public Cantalope()
    {
        super(Material.gourd);
        this.setCreativeTab(Arcane.arcaneTab_food);
        this.setHardness(2.0F);
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_1_ != 1 && p_149691_1_ != 0 ? this.blockIcon : this.field_150201_a;
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Arcane.cropCantalopeSlices;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random random)
    {
        return 3 + random.nextInt(7);
    }

    /**
     * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
     */
    public int quantityDroppedWithBonus(int p_149679_1_, Random p_149679_2_)
    {
        int j = this.quantityDropped(p_149679_2_) + p_149679_2_.nextInt(1 + p_149679_1_);

        if (j > 9)
        {
            j = 9;
        }

        return j;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(this.getTextureName() + "Side");
        this.field_150201_a = p_149651_1_.registerIcon(this.getTextureName() + "Top");
    }
}