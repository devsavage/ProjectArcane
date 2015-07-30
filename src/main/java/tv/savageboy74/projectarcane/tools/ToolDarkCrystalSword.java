package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemSword;

public class ToolDarkCrystalSword extends ItemSword{
	
	public ToolDarkCrystalSword(ToolMaterial darkCrystal) {
		super(darkCrystal);
		this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}

}
