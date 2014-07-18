package com.woody104.projectarcane.core;

import com.woody104.projectarcane.biome.features.PALeaves;
import com.woody104.projectarcane.biome.features.PALog;
import com.woody104.projectarcane.biome.features.PASapling;
import com.woody104.projectarcane.handler.*;
import com.woody104.projectarcane.items.*;
import com.woody104.projectarcane.registry.*;
import com.woody104.projectarcane.tileentity.TileEntityArcaneChest;
import com.woody104.projectarcane.tileentity.TileEntityDualFurnace;
import com.woody104.projectarcane.tools.*;

import com.woody104.projectarcane.util.LogHelper;
import com.woody104.projectarcane.util.Reference;
import com.woody104.projectarcane.util.UpdateChecker;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.*;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.stats.Achievement;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

import com.woody104.projectarcane.proxy.ProxyCommon;
import com.woody104.projectarcane.armor.arcaneArmor;
import com.woody104.projectarcane.armor.boneArmor;
import com.woody104.projectarcane.armor.darkCrystalArmor;
import com.woody104.projectarcane.block.worldgeneration.ArcaneWorldGen;
import com.woody104.projectarcane.blocks.*;
import com.woody104.projectarcane.food.*;
import com.woody104.projectarcane.items.PAItems;
import com.woody104.projectarcane.ores.*;
import com.woody104.projectarcane.tileentity.TileEntityArcaneFurnace;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

import java.io.IOException;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY)
public class Arcane {
    
    @Instance(Reference.MOD_ID)
    public static Arcane instance;
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static ProxyCommon proxy;

    ArcaneWorldGen eventWorldGen = new ArcaneWorldGen();

	@EventHandler
	public void PreInit(FMLPreInitializationEvent e) {
        proxy.registerRenderThings();
        BlockRegistry.init();
        ItemRegistry.init();

        proxy.preInit();
        GameRegistry.registerWorldGenerator(eventWorldGen, 0);
        MinecraftForge.addGrassSeed(new ItemStack(ItemRegistry.cropStrawberrySeeds), 10);
        MinecraftForge.addGrassSeed(new ItemStack(ItemRegistry.cropCantalopeSeeds), 10);

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

	@EventHandler
	public void Init(FMLInitializationEvent event) {
        RecipeRegistry.init();
        SmeltingRegistry.init();
        TileEntityRegistry.init();
        FMLCommonHandler.instance().bus().register(new CraftingHandler());
        NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
        RecipeRemover.removeCraftingRecipe();
        GameRegistry.registerFuelHandler(new FuelHandler());
        LogHelper.info("Initialization Complete.");
	}

    @SubscribeEvent
    public void checkUpdate(PlayerEvent.PlayerLoggedInEvent event) {
        if (Reference.UpdateCheck.OUTDATED) {
            event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.AQUA + "Project: Arcane " +  EnumChatFormatting.WHITE + "is " + EnumChatFormatting.DARK_RED + "outdated!"));
            event.player.addChatComponentMessage(new ChatComponentText("Current Version: " + EnumChatFormatting.DARK_RED + Reference.UpdateCheck.CURRENT_VERSION + EnumChatFormatting.WHITE +  " Newest Version: " + EnumChatFormatting.DARK_GREEN + Reference.UpdateCheck.NEWEST_VERSION));
        }
    }
}