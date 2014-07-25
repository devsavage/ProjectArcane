package com.woody104.projectarcane.armor;

import com.woody104.projectarcane.registry.CreativeTabRegistry;
import com.woody104.projectarcane.registry.ItemRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class darkCrystalArmor extends ItemArmor {

	public darkCrystalArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(stack.getItem() == ItemRegistry.DarkCrystalHelmet || stack.getItem() == ItemRegistry.DarkCrystalChestplate || stack.getItem() == ItemRegistry.DarkCrystalBoots) {
			return "ProjectArcane:textures/models/armor/darkcrystalarmor_1.png";
		}
		if (stack.getItem() == ItemRegistry.DarkCrystalLeggings) {
			return "ProjectArcane:textures/models/armor/darkcrystalarmor_2.png";
		}
		else return null;
		
		
	};
	
	
	
	
	
	
	

}
