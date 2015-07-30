package tv.savageboy74.projectarcane;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tv.savageboy74.projectarcane.handler.*;
import tv.savageboy74.projectarcane.registry.*;
import tv.savageboy74.projectarcane.util.LogHelper;
import tv.savageboy74.projectarcane.util.Reference;
import tv.savageboy74.projectarcane.util.UpdateChecker;
import net.minecraft.item.*;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.common.MinecraftForge;

import tv.savageboy74.projectarcane.Proxy.ProxyCommon;
import tv.savageboy74.projectarcane.block.worldgeneration.ArcaneWorldGen;

import java.io.IOException;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY)
public class Arcane {
    
    @Mod.Instance(Reference.MOD_ID)
    public static Arcane instance;
//    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
//	public static ProxyCommon proxy;

    ArcaneWorldGen eventWorldGen = new ArcaneWorldGen();

	@Mod.EventHandler
	public void PreInit(FMLPreInitializationEvent e) {
        //proxy.registerRenderThings();
        BlockRegistry.init();
        ItemRegistry.init();

        //proxy.preInit();
        //GameRegistry.registerWorldGenerator(eventWorldGen, 0);
//        MinecraftForge.addGrassSeed(new ItemStack(ItemRegistry.cropStrawberrySeeds), 10);
//        MinecraftForge.addGrassSeed(new ItemStack(ItemRegistry.cropCantalopeSeeds), 10);

        FMLCommonHandler.instance().bus().register(this);
        MinecraftForge.EVENT_BUS.register(this);

        if (ConfigHandler.checkForUpdates == true) {

            try {
                LogHelper.info("Checking for updates.. You can disable this in the config.");
                UpdateChecker.checkForUpdates();
            }
            catch (IOException event) {
                event.printStackTrace();
            }
        }

        LogHelper.info("Pre Initialization Complete.");
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent event) {
        RecipeRegistry.init();
        SmeltingRegistry.init();
        TileEntityRegistry.init();
        FMLCommonHandler.instance().bus().register(new CraftingHandler());
        //NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
        RecipeRemover.removeCraftingRecipe();
        //GameRegistry.registerFuelHandler(new FuelHandler());
        LogHelper.info("Initialization Complete.");
	}

    @SubscribeEvent
    public void checkUpdate(PlayerEvent.PlayerLoggedInEvent event) {
        if (Reference.UpdateCheck.OUTDATED) {
            event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "Project: Arcane " +  EnumChatFormatting.WHITE + "is " + EnumChatFormatting.DARK_RED + "outdated!"));
            event.player.addChatComponentMessage(new ChatComponentText("Current Version: " + EnumChatFormatting.DARK_RED + Reference.UpdateCheck.CURRENT_VERSION + EnumChatFormatting.WHITE +  " Newest Version: " + EnumChatFormatting.DARK_GREEN + Reference.UpdateCheck.NEWEST_VERSION));
        }
    }
}