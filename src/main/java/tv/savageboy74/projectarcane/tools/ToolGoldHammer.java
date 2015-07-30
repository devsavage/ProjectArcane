package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import tv.savageboy74.projectarcane.util.Reference;
import net.minecraft.item.Item;

public class ToolGoldHammer extends Item {
	
	public ToolGoldHammer() {
		super();
		this.setNoRepair();
		this.maxStackSize = 1;
		this.setMaxDamage(75);
		this.setUnlocalizedName("goldHammer");
		//this.setTextureName(Reference.MOD_ID + ":" + "goldHammer" );
		this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}

}
