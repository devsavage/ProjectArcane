package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemAxe;

public class ToolDarkCrystalAxe extends ItemAxe{
	
	public ToolDarkCrystalAxe(ToolMaterial darkCrystal) {
		super(darkCrystal);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}

}
