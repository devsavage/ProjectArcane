package tv.savageboy74.projectarcane.registry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTabRegistry
{
    public static CreativeTabs arcaneTab = new CreativeTabs("arcaneTab") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Items.emerald;
        }
    };
}
