package com.woody104.projectarcane.food;

import com.woody104.projectarcane.core.Arcane;

import net.minecraft.item.ItemFood;

public class FoodCookedChickenLeg extends ItemFood{

	public FoodCookedChickenLeg(int j, boolean b) {
		super(j, b);
		this.setUnlocalizedName("foodCookedChickenLeg");
		this.setPotionEffect(23, 10, 0, 1f);
		this.setMaxStackSize(16);
        this.setCreativeTab(Arcane.arcaneTab_food);
	}
	

}
