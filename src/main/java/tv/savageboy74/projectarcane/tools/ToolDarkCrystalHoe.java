package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemHoe;

public class ToolDarkCrystalHoe extends ItemHoe{
	
	public ToolDarkCrystalHoe(ToolMaterial darkCrystal) {
		super(darkCrystal);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}

}
