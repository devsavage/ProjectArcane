package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import tv.savageboy74.projectarcane.registry.MaterialRegistry;
import net.minecraft.item.ItemPickaxe;

public class CobaltPickaxe extends ItemPickaxe {

	public CobaltPickaxe(ToolMaterial toolmaterial) {
		super(MaterialRegistry.Tools.cobalt);
		this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}

}
