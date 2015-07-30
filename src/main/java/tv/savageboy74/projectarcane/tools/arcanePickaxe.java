package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemPickaxe;

public class arcanePickaxe extends ItemPickaxe {

	public arcanePickaxe(ToolMaterial arcane) {
		super(arcane);
		this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}

}
