package com.woody104.projectarcane.food;

import com.woody104.projectarcane.core.Arcane;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class FoodGreenApple extends ItemFood {

    public FoodGreenApple(int j, boolean b) {
        super(j, b);
        this.setUnlocalizedName("foodGreenApple");
        this.setMaxStackSize(16);
        this.setCreativeTab(Arcane.arcaneTab_food);
    }

    protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
        player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 600, 0));
        player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 600, 0));
        player.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 300, 2));
    }
}

