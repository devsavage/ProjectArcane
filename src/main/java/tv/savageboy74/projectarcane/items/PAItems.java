package tv.savageboy74.projectarcane.items;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import tv.savageboy74.projectarcane.util.Reference;
import net.minecraft.item.Item;


public class PAItems extends Item {

    public PAItems() {
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
    }

//    @SideOnly(Side.CLIENT)
//    public void registerIcons(IIconRegister iconRegister) {
//        this.itemIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
//    }
}
