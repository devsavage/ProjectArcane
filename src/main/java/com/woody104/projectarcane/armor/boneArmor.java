package com.woody104.projectarcane.armor;

import com.woody104.projectarcane.core.Arcane;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class boneArmor extends ItemArmor {

	public boneArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
        this.setCreativeTab(Arcane.arcaneTab_combat);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(stack.getItem() == Arcane.BoneHelmet || stack.getItem() == Arcane.BoneChestplate || stack.getItem() == Arcane.BoneBoots) {
			return "ProjectArcane:textures/models/armor/bonearmor_1.png";
		}
		if (stack.getItem() == Arcane.BoneLeggings) {
			return "ProjectArcane:textures/models/armor/bonearmor_2.png";
		}
		else return null;
		
		
	};
	

}
