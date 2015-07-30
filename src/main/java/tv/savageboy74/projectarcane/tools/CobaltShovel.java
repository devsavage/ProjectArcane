package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import tv.savageboy74.projectarcane.registry.MaterialRegistry;
import net.minecraft.item.ItemSpade;

public class CobaltShovel extends ItemSpade {

	public CobaltShovel(ToolMaterial toolmaterial) {
		super(MaterialRegistry.Tools.cobalt);
		this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}

}
