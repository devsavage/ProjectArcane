package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemSword;

public class DirtSword extends ItemSword {
	public DirtSword(ToolMaterial dirt) {
		super(dirt);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
		
	}

}
