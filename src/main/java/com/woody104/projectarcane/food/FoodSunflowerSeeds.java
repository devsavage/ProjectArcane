package com.woody104.projectarcane.food;

import com.woody104.projectarcane.core.Arcane;
import com.woody104.projectarcane.registry.CreativeTabRegistry;
import com.woody104.projectarcane.util.Reference;
import net.minecraft.item.ItemFood;

public class FoodSunflowerSeeds extends ItemFood {

    public FoodSunflowerSeeds (int heal, float saturation, boolean wolfmeat) {
        super(heal, saturation, wolfmeat);

        this.setUnlocalizedName("foodSunflowerSeeds");
        this.setTextureName(Reference.MOD_ID + ":" + "foodSunflowerSeeds");
        this.setCreativeTab(CreativeTabRegistry.arcaneTab_food);
    }
}
