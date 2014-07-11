package com.woody104.projectarcane.food;

import com.woody104.projectarcane.core.Arcane;
import net.minecraft.item.ItemFood;

public class FoodSunflowerSeeds extends ItemFood {

    public FoodSunflowerSeeds (int heal, float saturation, boolean wolfmeat) {
        super(heal, saturation, wolfmeat);

        this.setUnlocalizedName("foodSunflowerSeeds");
        this.setTextureName(Arcane.MODID + ":" + "foodSunflowerSeeds");
        this.setCreativeTab(Arcane.arcaneTab_food);
    }
}
