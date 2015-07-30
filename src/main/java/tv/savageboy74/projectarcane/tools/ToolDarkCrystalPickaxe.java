package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemPickaxe;

public class ToolDarkCrystalPickaxe extends ItemPickaxe{
	
	public ToolDarkCrystalPickaxe(ToolMaterial darkCrystal) {
		super(darkCrystal);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}

}
