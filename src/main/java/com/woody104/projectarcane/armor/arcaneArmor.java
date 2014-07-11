package com.woody104.projectarcane.armor;

import com.woody104.projectarcane.core.Arcane;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class arcaneArmor extends ItemArmor {

	public arcaneArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setCreativeTab(Arcane.arcaneTab_combat);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(stack.getItem() == Arcane.arcaneHelmet || stack.getItem() == Arcane.arcaneChestplate || stack.getItem() == Arcane.arcaneBoots) {
			return "ProjectArcane:textures/models/armor/arcanearmor_1.png";
		}
		if (stack.getItem() == Arcane.arcaneLeggings) {
			return "ProjectArcane:textures/models/armor/arcanearmor_2.png";
		}
		else return null;
		
		
	};
	
	
	
	
	
	
	

}
