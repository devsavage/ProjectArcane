package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemHoe;

public class arcaneHoe extends ItemHoe {

	public arcaneHoe(ToolMaterial arcane) {
		super(arcane);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}

}
