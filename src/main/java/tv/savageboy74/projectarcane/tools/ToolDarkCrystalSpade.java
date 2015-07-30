package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemSpade;

public class ToolDarkCrystalSpade extends ItemSpade{
	
	public ToolDarkCrystalSpade(ToolMaterial darkCrystal) {
		super(darkCrystal);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}

}
