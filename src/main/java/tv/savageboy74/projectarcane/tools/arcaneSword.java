package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemSword;

public class arcaneSword extends ItemSword {

	public arcaneSword(ToolMaterial arcane) {
		super(arcane);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}

}
