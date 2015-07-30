package tv.savageboy74.projectarcane.armor;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import tv.savageboy74.projectarcane.registry.ItemRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class arcaneArmor extends ItemArmor {

	public arcaneArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}
	
//	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
//		if(stack.getItem() == ItemRegistry.arcaneHelmet || stack.getItem() == ItemRegistry.arcaneChestplate || stack.getItem() == ItemRegistry.arcaneBoots) {
//			return "ProjectArcane:textures/models/armor/arcanearmor_1.png";
//		}
//		if (stack.getItem() == ItemRegistry.arcaneLeggings) {
//			return "ProjectArcane:textures/models/armor/arcanearmor_2.png";
//		}
//		else return null;
//
//
//	}
}
