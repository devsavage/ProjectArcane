package com.woody104.projectarcane.registry;

import com.woody104.projectarcane.core.Arcane;
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
    public static CreativeTabs arcaneTab_combat = new CreativeTabs("arcaneTab_combat") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return ItemRegistry.arcaneSword;
        }
    };
    public static CreativeTabs arcaneTab_tools = new CreativeTabs("arcaneTab_tools") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return ItemRegistry.arcaneAxe;
        }
    };
    public static CreativeTabs arcaneTab_food = new CreativeTabs("arcaneTab_food") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return ItemRegistry.foodGreenApple;
        }
    };
    public static CreativeTabs arcaneTab_material = new CreativeTabs("arcaneTab_material") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return ItemRegistry.emeraldNugget;
        }
    };
    public static CreativeTabs arcaneTab_blocks = new CreativeTabs("arcaneTab_blocks") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Arcane.blockArcaneLampOff);
        }
    };
}
