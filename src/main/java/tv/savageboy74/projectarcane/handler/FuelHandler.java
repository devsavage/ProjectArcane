package tv.savageboy74.projectarcane.handler;

import net.minecraftforge.fml.common.IFuelHandler;
import tv.savageboy74.projectarcane.registry.ItemRegistry;
import net.minecraft.item.ItemStack;

public class FuelHandler implements IFuelHandler
{

    @Override
    public int getBurnTime(ItemStack fuel) {

//        if(fuel.getItem() == ItemRegistry.itemWoodChips) return 100;
//        if(fuel.getItem() == ItemRegistry.itemCoalChunk) return 250;
        
        
		return 0;
    }
}
