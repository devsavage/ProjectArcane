package com.woody104.projectarcane.registry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabRegistry
{
    public static CreativeTabs arcaneTab = new CreativeTabs("arcaneTab") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return ItemRegistry.itemArcaneGem;
        }
    };
}
