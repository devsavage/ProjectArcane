package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import tv.savageboy74.projectarcane.registry.MaterialRegistry;
import net.minecraft.item.ItemHoe;

public class CobaltHoe extends ItemHoe {

	public CobaltHoe(ToolMaterial toolmaterial) {
		super(MaterialRegistry.Tools.cobalt);
		this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}

}
