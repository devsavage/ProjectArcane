package tv.savageboy74.projectarcane.items;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.Item;

public class ItemArcaneMetal extends Item {
	
	public ItemArcaneMetal() {
		super();
		this.setCreativeTab(CreativeTabRegistry.arcaneTab);
		this.setUnlocalizedName("itemArcaneMetal");
		
	}

}
