package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import tv.savageboy74.projectarcane.util.Reference;
import net.minecraft.item.Item;

public class ToolArcaneHammer extends Item {
	
	public ToolArcaneHammer() {
		super();
		this.setNoRepair();
		this.maxStackSize = 1;
		this.setMaxDamage(150);
		this.setUnlocalizedName("toolAH");
		//this.setTextureName(Reference.MOD_ID + ":" + "toolArcaneHammer" );
		this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}

}
