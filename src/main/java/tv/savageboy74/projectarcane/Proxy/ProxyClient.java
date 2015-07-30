package tv.savageboy74.projectarcane.Proxy;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import tv.savageboy74.projectarcane.registry.BlockRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import tv.savageboy74.projectarcane.render.ArcaneChestRenderer;
import tv.savageboy74.projectarcane.render.ItemRendererArcaneChest;
import tv.savageboy74.projectarcane.tileentity.TileEntityArcaneChest;

public class ProxyClient extends ProxyCommon {
	
	public void registerRenderThings() {
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityArcaneChest.class, new ArcaneChestRenderer());
		//MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockRegistry.arcaneChest), new ItemRendererArcaneChest());
		
		
	}

	@Override
	public void registerRenderers(){
		
	}

}
