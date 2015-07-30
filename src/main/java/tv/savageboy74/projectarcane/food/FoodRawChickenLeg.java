package tv.savageboy74.projectarcane.food;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemFood;

public class FoodRawChickenLeg extends ItemFood{

	public FoodRawChickenLeg(int j, boolean b) {
		super(j, b);
		this.setUnlocalizedName("foodRawChickenLeg");
		this.setPotionEffect(17, 60, 1, 1f);
		this.setMaxStackSize(16);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}
	

}
