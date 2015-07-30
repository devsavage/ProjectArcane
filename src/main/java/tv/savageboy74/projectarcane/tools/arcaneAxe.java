package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemAxe;

public class arcaneAxe extends ItemAxe {

	public arcaneAxe(ToolMaterial arcane) {
		super(arcane);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}

}
