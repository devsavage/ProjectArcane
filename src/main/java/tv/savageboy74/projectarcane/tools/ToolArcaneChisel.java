package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import tv.savageboy74.projectarcane.util.Reference;
import net.minecraft.item.Item;

public class ToolArcaneChisel extends Item {

    public ToolArcaneChisel() {
        super();
        this.setNoRepair();
        this.maxStackSize = 1;
        this.setMaxDamage(100);
        this.setUnlocalizedName("toolAC");
        //this.setTextureName(Reference.MOD_ID + ":" + "toolArcaneChisel" );
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
    }

}
