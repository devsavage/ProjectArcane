package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemPickaxe;

public class DirtPickaxe extends ItemPickaxe {
	
	public DirtPickaxe(ToolMaterial dirt) {
		super(dirt);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}

	{
	}

}
