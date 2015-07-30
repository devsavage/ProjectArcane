package tv.savageboy74.projectarcane.items;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import tv.savageboy74.projectarcane.util.Reference;
import net.minecraft.item.Item;

public class PAMaterial extends Item {

    public PAMaterial() {
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
    }
}
