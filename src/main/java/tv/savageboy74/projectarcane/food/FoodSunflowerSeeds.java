package tv.savageboy74.projectarcane.food;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import tv.savageboy74.projectarcane.util.Reference;
import net.minecraft.item.ItemFood;

public class FoodSunflowerSeeds extends ItemFood {

    public FoodSunflowerSeeds (int heal, float saturation, boolean wolfmeat) {
        super(heal, saturation, wolfmeat);

        this.setUnlocalizedName("foodSunflowerSeeds");
        //this.setTextureName(Reference.MOD_ID + ":" + "foodSunflowerSeeds");
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
    }
}
