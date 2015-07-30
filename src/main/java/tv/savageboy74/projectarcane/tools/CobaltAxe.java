package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import tv.savageboy74.projectarcane.registry.MaterialRegistry;
import net.minecraft.item.ItemAxe;

public class CobaltAxe extends ItemAxe {

	public CobaltAxe(ToolMaterial toolmaterial) {
		super(MaterialRegistry.Tools.cobalt);
		this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}

}
