package com.woody104.projectarcane.armor;

import com.woody104.projectarcane.core.Arcane;

import com.woody104.projectarcane.registry.CreativeTabRegistry;
import com.woody104.projectarcane.registry.ItemRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class boneArmor extends ItemArmor {

	public boneArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab_combat);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(stack.getItem() == ItemRegistry.BoneHelmet || stack.getItem() == ItemRegistry.BoneChestplate || stack.getItem() == ItemRegistry.BoneBoots) {
			return "ProjectArcane:textures/models/armor/bonearmor_1.png";
		}
		if (stack.getItem() == ItemRegistry.BoneLeggings) {
			return "ProjectArcane:textures/models/armor/bonearmor_2.png";
		}
		else return null;
		
		
	};
	

}
