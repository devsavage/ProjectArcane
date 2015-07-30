package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemSpade;

public class DirtSpade extends ItemSpade {

	public DirtSpade(ToolMaterial dirt) {
		super(dirt);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}
	

}
