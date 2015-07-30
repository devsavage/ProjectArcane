package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemHoe;

public class DirtHoe extends ItemHoe {

	public DirtHoe(ToolMaterial dirt) {
		super(dirt);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}

}
