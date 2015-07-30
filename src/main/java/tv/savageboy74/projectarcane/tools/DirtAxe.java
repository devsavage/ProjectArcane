package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import net.minecraft.item.ItemAxe;

public class DirtAxe extends ItemAxe {

	public DirtAxe(ToolMaterial dirt) {
		super(dirt);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
	}
	

}
