package tv.savageboy74.projectarcane.items;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemCutter extends Item {
	
	private ItemStack emptyItem = null;
	
	public ItemCutter() {
		super();
		this.setMaxStackSize(1);
        this.setMaxDamage(64);
        this.setNoRepair();
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}

}