package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemSpade;

public class arcaneSpade extends ItemSpade {

	public arcaneSpade(ToolMaterial arcane) {
		super(arcane);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}

}
