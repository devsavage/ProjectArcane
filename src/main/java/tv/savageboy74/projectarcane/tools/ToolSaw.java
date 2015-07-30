package tv.savageboy74.projectarcane.tools;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import tv.savageboy74.projectarcane.util.Reference;
import net.minecraft.item.Item;

public class ToolSaw extends Item {

    public ToolSaw() {
        this.setNoRepair();
        this.setMaxStackSize(1);
        this.setMaxDamage(150);
        this.setUnlocalizedName("toolSaw");
        //this.setTextureName(Reference.MOD_ID + ":" + "itemSaw" );
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
    }
}
