package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import tv.savageboy74.projectarcane.registry.MaterialRegistry;
import net.minecraft.item.ItemSword;

public class CobaltSword extends ItemSword {

	public CobaltSword(ToolMaterial toolmaterial) {
		super(MaterialRegistry.Tools.cobalt);
		this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}
}
