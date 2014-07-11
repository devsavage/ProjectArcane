package com.woody104.projectarcane.core;

import com.woody104.projectarcane.biome.features.PALeaves;
import com.woody104.projectarcane.biome.features.PALog;
import com.woody104.projectarcane.biome.features.PASapling;
import com.woody104.projectarcane.handler.FuelHandler;
import com.woody104.projectarcane.items.*;
import com.woody104.projectarcane.tileentity.TileEntityDualFurnace;
import com.woody104.projectarcane.tools.*;

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

import com.woody104.projectarcane.Proxy.ProxyCommon;
import com.woody104.projectarcane.armor.arcaneArmor;
import com.woody104.projectarcane.armor.boneArmor;
import com.woody104.projectarcane.armor.darkCrystalArmor;
import com.woody104.projectarcane.block.worldgeneration.ArcaneWorldGen;
import com.woody104.projectarcane.blocks.*;
import com.woody104.projectarcane.food.*;
import com.woody104.projectarcane.handler.CraftingHandler;
import com.woody104.projectarcane.handler.GuiHandler;
import com.woody104.projectarcane.handler.RecipeRemover;
import com.woody104.projectarcane.items.PAItems;
import com.woody104.projectarcane.ores.*;
import com.woody104.projectarcane.tileentity.TileEntityArcane;
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

@Mod(modid = Arcane.MODID, version = Arcane.VERSION)
public class Arcane {

    public static final int MODVERSION = 5;
    public static String updates = "";
    public static boolean outdated = false;
	
    public static final String MODID = "ProjectArcane";
    public static final String VERSION = "1.7.2-2.0.0";
    
    @Instance(MODID)
    public static Arcane instance;
    @SidedProxy(clientSide = "com.woody104.projectarcane.Proxy.ProxyClient", serverSide = "com.woody104.projectarcane.Proxy.ProxyCommon")
	public static ProxyCommon proxy;
    

    
    
    ArcaneWorldGen eventWorldGen = new ArcaneWorldGen();
    //public static Block blockEnergyRed;
    //public static Block blockEnergyGreen;
    public static Block blockArcaneGem;
    public static Block blockMachineCore;
    public static Block blockSandBlock;
    public static Block cropStrawberryPlant;
    public static Block cropCantalope;
    public static Block cropCantalopeStem;
    //Machines
    public static Block blockArcaneFurnaceIdle;
    public static Block blockArcaneFurnaceActive;    
    public static final int guiIDArcaneFurnace = 0;
    public static Block blockDualFurnaceIdle;
    public static Block blockDualFurnaceActive;
    public static final int guiIDDualFurnace = 1;
    //ores
    public static Block ArcaneGemOre;
    public static Block DarkCrystalOre;
    public static Block EmeraldNuggetOre;
    public static Block VanadiumOre;
    public static Block ManganeseOre;
    public static Block CobaltOre;
    public static Block NickelOre;
    //other blocks
    public static Block arcaneChest;
    public static Block blockArcaneLampOn;
    public static Block blockArcaneLampOff;
    //crafting
    public static Block blockArcaneTable;
    public static final int guiIDArcaneTable = 1;

    //Trees
    public static Block blockLog;
    public static Block blockLeaf;
    public static Block blockSapling;

	private static int DA1;
	private static int DA2;
	private static int DA3;
	private static int DA4;
	//EmeraldArmorIDs
	private static int EA1;
	private static int EA2;
	private static int EA3;
	private static int EA4;
	//BoneArmorIDs
	private static int FA1;
	private static int FA2;
	private static int FA3;
	private static int FA4;

    public static Item itemArcaneGem;
    public static Item emeraldNugget;
    public static Item itemNickel;
    public static Item itemVanadium;
    public static Item itemCobaltDust;
    public static Item itemManganese;
    public static Item DirtPickaxe;
    public static Item DirtHoe;
    public static Item DirtSword;
    public static Item DirtAxe;
    public static Item DirtSpade;
    public static Item arcanePickaxe; 
    public static Item arcaneAxe;
    public static Item arcaneSword;
    public static Item arcaneHoe;
    public static Item arcaneSpade;
    public static Item ToolDarkCrystalPickaxe;
    public static Item ToolDarkCrystalSword;
    public static Item ToolDarkCrystalSpade;
    public static Item ToolDarkCrystalAxe;
    public static Item ToolDarkCrystalHoe;
    public static Item CobaltPickaxe;
    public static Item CobaltSword;
    public static Item CobaltAxe;
    public static Item CobaltShovel;
    public static Item CobaltHoe;
    public static Item itemThunderfury;
    public static Item arcaneHelmet;
    public static Item arcaneChestplate;
    public static Item arcaneLeggings;
    public static Item arcaneBoots;
    public static Item DarkCrystalHelmet;
    public static Item DarkCrystalChestplate;
    public static Item DarkCrystalLeggings;
    public static Item DarkCrystalBoots;
    public static Item BoneHelmet;
    public static Item BoneChestplate;
    public static Item BoneLeggings;
    public static Item BoneBoots;
    public static Item foodGreenApple;
    public static Item foodRawChickenLeg;
    public static Item foodCookedChickenLeg;
    public static Item foodSunflowerSeeds;
    public static Item cropStrawberry;
    public static Item cropStrawberrySeeds;
    public static Item cropCantalopeSeeds;
    public static Item cropCantalopeSlices;
    public static Item toolSaw;
    public static Item toolArcaneChisel;
    public static Item toolArcaneHammer;
    public static Item itemCutter;
    public static Item itemBlades;
    public static Item itemHandle;
    public static Item itemMetalBender;
    public static Item itemArcaneMetalPlate;
    public static Item itemArcaneMetal;
    public static Item itemEnhancedArcaneMetal;
    public static Item itemDarkCrystal;
    public static Item DirtStick;
    public static Item ArcanePlate;
    public static Item itemChainIngot;
    public static Item itemChainLink;
    public static Item itemChainLink_2;
    public static Item itemWoodChips;
    public static Item itemCobaltIngot;
    public static Item itemArcaneRod;
    public static Item itemCoalChunk;
    public static Item toolGoldHammer;
    public static Item itemCobaltPlate;
    public static Item itemSandDust;
    public static Achievement achievementArcane;
    public static Achievement achievementBonemeal;
    public static CreativeTabs arcaneTab = new CreativeTabs("arcaneTab") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Arcane.itemArcaneGem;
        }
    };
    public static CreativeTabs arcaneTab_combat = new CreativeTabs("arcaneTab_combat") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Arcane.arcaneSword;
        }
    };
    public static CreativeTabs arcaneTab_tools = new CreativeTabs("arcaneTab_tools") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Arcane.arcaneAxe;
        }
    };
    public static CreativeTabs arcaneTab_food = new CreativeTabs("arcaneTab_food") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Arcane.foodGreenApple;
        }
    };
    public static CreativeTabs arcaneTab_material = new CreativeTabs("arcaneTab_material") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Arcane.emeraldNugget;
        }
    };
    public static CreativeTabs arcaneTab_blocks = new CreativeTabs("arcaneTab_blocks") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Arcane.blockArcaneLampOff);
        }
    };
    
    public static ToolMaterial darkCrystal = EnumHelper.addToolMaterial("Dark Crystal", 3, 1000, 6.0F, 7, 20);
	public static ToolMaterial arcane = EnumHelper.addToolMaterial("Arcane", 5, 2000, 8.0F, 9, 22);
	public static ToolMaterial dirt = EnumHelper.addToolMaterial("Dirt", 0, 25, 1.0F, 0.0F, 0);
    public static ToolMaterial cobalt = EnumHelper.addToolMaterial("Cobalt", 3, 1561, 8.0F, 3.0F, 10);
	//thuderfury material
	public static ToolMaterial agem = EnumHelper.addToolMaterial("AGem", 11, 1000, 16.0F, 16, 22);

	//armor material
	public static ArmorMaterial arcaneArmor = EnumHelper.addArmorMaterial("arcaneArmor", 66, new int[]{6, 16, 12, 6}, 10);
	public static ArmorMaterial darkcrystalArmor = EnumHelper.addArmorMaterial("darkCrystalArmor", 55, new int[]{3, 8, 6, 3}, 10);
	public static ArmorMaterial boneArmor = EnumHelper.addArmorMaterial("boneArmor", 44, new int[]{2, 7, 5, 2}, 10);

    @EventHandler
    public void PreLoad(FMLPreInitializationEvent PreEvent)
    {
    	TileEntityArcane.Arcane();
    	
    	proxy.registerRenderThings();
    }
	
    @EventHandler
	public void preInit(FMLPreInitializationEvent e){
    	proxy.preInit();
    	GameRegistry.registerWorldGenerator(eventWorldGen, 0);
        MinecraftForge.addGrassSeed(new ItemStack(Arcane.cropStrawberrySeeds), 10);
        MinecraftForge.addGrassSeed(new ItemStack(Arcane.cropCantalopeSeeds), 10);

        FMLCommonHandler.instance().bus().register(this);
        MinecraftForge.EVENT_BUS.register(this);

        System.out.println("[Project: Arcane] Update Checker enabled! Now checking for updates...");

        try {
            UpdateChecker.checkForUpdates();
        }
        catch (IOException event) {
            event.printStackTrace();
        }
	}

  	
	@EventHandler
	public void init(FMLInitializationEvent e){
		FMLCommonHandler.instance().bus().register(new CraftingHandler());
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		RecipeRemover.removeCraftingRecipe();
        GameRegistry.registerFuelHandler(new FuelHandler());
	}

	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent event) {
		arcaneChest = new arcaneChest(0).setBlockName("arcaneChest").setCreativeTab(arcaneTab_blocks);
		blockArcaneTable = new ArcaneTable().setBlockName("ArcaneTable");
		blockArcaneGem = new BlockArcaneGem().setBlockName("blockArcaneGem").setCreativeTab(arcaneTab_blocks).setBlockTextureName(MODID + ":" + "blockArcaneGem");
        blockSandBlock = new BlockSandBlock();

        //Machines
		blockArcaneFurnaceIdle = new ArcaneFurnace(false).setBlockName("ArcaneFurnaceIdle").setCreativeTab(arcaneTab_blocks).setHardness(3.5F);
		blockArcaneFurnaceActive = new ArcaneFurnace(true).setBlockName("ArcaneFurnaceActive").setLightLevel(0.625F).setHardness(3.5F);
        blockDualFurnaceIdle = new DualFurnace(false).setBlockName("DualFurnaceIdle").setCreativeTab(arcaneTab_blocks).setHardness(3.5F);
        blockDualFurnaceActive = new DualFurnace(true).setBlockName("DualFurnaceActive").setHardness(3.5F);
        //Blocks
        blockMachineCore = new BlockMachineCore();
        blockArcaneLampOn = new ArcaneLamp(true).setBlockName("arcaneLampOn");
        blockArcaneLampOff = new ArcaneLamp(false).setBlockName("arcaneLampOff").setCreativeTab(arcaneTab_blocks);
		ArcaneGemOre = new com.woody104.projectarcane.blocks.ArcaneGemOre(Material.anvil).setBlockName("ArcaneGemOre").setBlockTextureName(MODID + ":" + "blockArcaneGemOre");
		DarkCrystalOre = new com.woody104.projectarcane.ores.DarkCrystalOre(Material.rock).setBlockName("DarkCrystalOre").setBlockTextureName(MODID + ":" + "blockDarkCrystalOre");
		EmeraldNuggetOre = new com.woody104.projectarcane.ores.EmeraldNuggetOre(Material.rock).setBlockName("EmeraldNuggetOre").setBlockTextureName(MODID + ":" + "blockEmeraldNuggetOre");
        VanadiumOre = new VanadiumOre(Material.rock).setBlockName("vanadiumOre").setBlockTextureName(MODID + ":" + "vanadiumOre");
        ManganeseOre = new ManganeseOre(Material.rock).setBlockName("manganeseOre").setBlockTextureName(MODID + ":" + "manganeseOre");
        CobaltOre = new CobaltOre(Material.rock).setBlockName("cobaltOre").setBlockTextureName(MODID + ":" + "cobaltOre");
        NickelOre = new NickelOre(Material.rock).setBlockName("nickelOre").setBlockTextureName(MODID + ":" + "nickelOre");
        //Trees
        blockLog = new PALog().setBlockName("Log").setCreativeTab(Arcane.arcaneTab_blocks);
        blockLeaf = new PALeaves().setBlockName("Leaf").setCreativeTab(Arcane.arcaneTab_blocks);
        blockSapling = new PASapling().setBlockName("Sapling").setCreativeTab(Arcane.arcaneTab_material);

        
        GameRegistry.registerBlock(blockArcaneTable, "ArcaneTable");
        GameRegistry.registerBlock(EmeraldNuggetOre, "EmeraldNuggetOre");
        GameRegistry.registerBlock(DarkCrystalOre, "DarkCrystalOre");
        GameRegistry.registerBlock(ArcaneGemOre, "ArcaneGemOre");
        GameRegistry.registerBlock(blockArcaneFurnaceActive, "ArcaneFurnaceActive");
        GameRegistry.registerBlock(blockArcaneFurnaceIdle, "ArcaneFurnaceIdle");
        GameRegistry.registerBlock(blockArcaneGem, "blockArcaneGem");
        GameRegistry.registerBlock(blockMachineCore, "blockMC");
        GameRegistry.registerBlock(blockArcaneLampOn, "arcaneLampOn");
        GameRegistry.registerBlock(blockArcaneLampOff, "arcaneLampOff");
        GameRegistry.registerBlock(NickelOre, "nickelOre");
        GameRegistry.registerBlock(CobaltOre, "cobaltOre");
        GameRegistry.registerBlock(ManganeseOre, "manganeseOre");
        GameRegistry.registerBlock(VanadiumOre, "vanadiumOre");
        GameRegistry.registerBlock(arcaneChest, "arcaneChest");
        //GameRegistry.registerBlock(blockDualFurnaceIdle, "DualFurnaceIdle");
        //GameRegistry.registerBlock(blockDualFurnaceActive, "DualFurnaceActive");
        GameRegistry.registerBlock(blockLog, ItemLogBlocks.class, blockLog.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockLeaf, ItemLeafBlocks.class, blockLeaf.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockSapling, ItemSaplingBlocks.class, blockSapling.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockSandBlock, ItemBlockSandBlock.class, "blockSandBlock");

		cropStrawberryPlant = new PACrop().setBlockName("strawberryPlant");
        cropCantalope = new Cantalope().setBlockName("cantalope").setBlockTextureName(MODID + ":" + "cantalope");
        cropCantalopeStem = new BlockPAStem(cropCantalope).setBlockName("cantalopeStem").setBlockTextureName(MODID + ":" + "cantalopeStem");
        cropCantalopeSeeds = new ItemSeeds(cropCantalopeStem, Blocks.farmland).setUnlocalizedName("cantalopeSeeds").setTextureName(MODID + ":" + "cantalopeSeeds").setCreativeTab(arcaneTab_material);
        cropCantalopeSlices = new ItemFood(6, 0.6F, false).setUnlocalizedName("cantalope").setTextureName(MODID + ":" + "cantalopeSlice").setCreativeTab(arcaneTab_food);
        cropStrawberry = new ItemFood(4, 0.5F, false).setUnlocalizedName("strawberry").setTextureName(MODID + ":" + "foodStrawberry").setCreativeTab(arcaneTab_food);
        cropStrawberrySeeds = new ItemSeeds(cropStrawberryPlant, Blocks.farmland).setUnlocalizedName("strawberrySeeds").setTextureName(MODID + ":" + "seeds_strawberry").setCreativeTab(arcaneTab_material);
        itemArcaneGem = new Item().setUnlocalizedName("itemArcaneGem").setCreativeTab(arcaneTab_material).setTextureName(MODID + ":" + "itemArcaneGem");
		emeraldNugget = new Item().setUnlocalizedName("EmeraldNugget").setCreativeTab(arcaneTab_material).setTextureName(MODID + ":" + "emerald_nugget");
        itemCobaltDust = new PAItems().setUnlocalizedName("itemCobaltDust");
        DirtPickaxe = new DirtPickaxe(dirt).setUnlocalizedName("dirtPickaxe").setTextureName(MODID + ":" + "dirt_pickaxe");
    	DirtSword = new DirtSword(dirt).setUnlocalizedName("dirtSword").setTextureName(MODID + ":" + "dirt_sword");
    	DirtAxe = new DirtAxe(dirt).setUnlocalizedName("dirtAxe").setTextureName(MODID + ":" + "dirt_axe");
    	DirtHoe = new DirtHoe(dirt).setUnlocalizedName("dirtHoe").setTextureName(MODID + ":" + "dirt_hoe");
    	DirtSpade = new DirtSpade(dirt).setUnlocalizedName("dirtSpade").setTextureName(MODID + ":" + "dirt_shovel");
        arcanePickaxe = new arcanePickaxe(arcane).setUnlocalizedName("arcanePickaxe").setTextureName(MODID + ":" + "arcane_pickaxe");
        arcaneAxe = new arcaneAxe(arcane).setUnlocalizedName("arcaneAxe").setTextureName(MODID + ":" + "arcane_axe");
        arcaneSword = new arcaneSword(arcane).setUnlocalizedName("arcaneSword").setTextureName(MODID + ":" + "arcane_sword");
        arcaneHoe = new arcaneHoe(arcane).setUnlocalizedName("arcaneHoe").setTextureName(MODID + ":" + "arcane_hoe");
        arcaneSpade = new arcaneSpade(arcane).setUnlocalizedName("arcaneSpade").setTextureName(MODID + ":" + "arcane_shovel");
        ToolDarkCrystalPickaxe = new ToolDarkCrystalPickaxe(darkCrystal).setUnlocalizedName("darkCrystalPickaxe").setTextureName(MODID + ":" + "darkcrystal_pickaxe");
        ToolDarkCrystalSword = new ToolDarkCrystalSword(darkCrystal).setUnlocalizedName("darkCrystalSword").setTextureName(MODID + ":" + "darkcrystal_sword");
        ToolDarkCrystalSpade = new ToolDarkCrystalSpade(darkCrystal).setUnlocalizedName("darkCrystalShovel").setTextureName(MODID + ":" + "darkcrystal_shovel");
        ToolDarkCrystalAxe = new ToolDarkCrystalAxe(darkCrystal).setUnlocalizedName("darkCrystalAxe").setTextureName(MODID + ":" + "darkcrystal_axe");
        ToolDarkCrystalHoe = new ToolDarkCrystalHoe(darkCrystal).setUnlocalizedName("darkCrystalHoe").setTextureName(MODID + ":" + "darkcrystal_hoe");
        CobaltPickaxe = new CobaltPickaxe(cobalt).setUnlocalizedName("cobaltPickaxe").setTextureName(MODID + ":" + "cobalt_pickaxe");
        CobaltSword = new CobaltSword(cobalt).setUnlocalizedName("cobaltSword").setTextureName(MODID + ":" + "cobalt_sword");
        CobaltAxe = new CobaltAxe(cobalt).setUnlocalizedName("cobaltAxe").setTextureName(MODID + ":" + "cobalt_axe");
        CobaltShovel = new CobaltShovel(cobalt).setUnlocalizedName("cobaltShovel").setTextureName(MODID + ":" + "cobalt_shovel");
        CobaltHoe = new CobaltHoe(cobalt).setUnlocalizedName("cobaltHoe").setTextureName(MODID + ":" + "cobalt_hoe");
        itemThunderfury = new ItemThunderfury(agem, null).setUnlocalizedName("itemThunderfury").setTextureName(MODID + ":" + "itemThunderfury");
        arcaneHelmet = new arcaneArmor(arcaneArmor, DA1, 0).setUnlocalizedName("arcaneHelmet").setTextureName(MODID + ":" + "arcane_helmet");
        arcaneChestplate = new arcaneArmor(arcaneArmor, DA2, 1).setUnlocalizedName("arcaneChestplate").setTextureName(MODID + ":" + "arcane_chestplate");
        arcaneLeggings = new arcaneArmor(arcaneArmor, DA3, 2).setUnlocalizedName("arcaneLeggings").setTextureName(MODID + ":" + "arcane_leggings");
        arcaneBoots = new arcaneArmor(arcaneArmor, DA4, 3).setUnlocalizedName("arcaneBoots").setTextureName(MODID + ":" + "arcane_boots");
        DarkCrystalHelmet = new darkCrystalArmor(darkcrystalArmor, EA1, 0).setUnlocalizedName("darkCrystalHelmet").setTextureName(MODID + ":" + "darkcrystal_helmet");
        DarkCrystalChestplate = new darkCrystalArmor(darkcrystalArmor, EA2, 1).setUnlocalizedName("darkCrystalChestplate").setTextureName(MODID + ":" + "darkcrystal_chestplate");
        DarkCrystalLeggings = new darkCrystalArmor(darkcrystalArmor, EA3, 2).setUnlocalizedName("darkCrystalLeggings").setTextureName(MODID + ":" + "darkcrystal_leggings");
        DarkCrystalBoots = new darkCrystalArmor(darkcrystalArmor, EA4, 3).setUnlocalizedName("darkCrystalBoots").setTextureName(MODID + ":" + "darkcrystal_boots");
        BoneHelmet = new boneArmor(boneArmor, FA1, 0).setUnlocalizedName("boneHelmet").setTextureName(MODID + ":" + "bone_helmet");
        BoneChestplate = new boneArmor(boneArmor, FA2, 1).setUnlocalizedName("boneChestplate").setTextureName(MODID + ":" + "bone_chestplate");
        BoneLeggings = new boneArmor(boneArmor, FA3, 2).setUnlocalizedName("boneLeggings").setTextureName(MODID + ":" + "bone_leggings");
        BoneBoots = new boneArmor(boneArmor, FA4, 3).setUnlocalizedName("boneBoots").setTextureName(MODID + ":" + "bone_boots");
        itemCutter = new ItemCutter().setUnlocalizedName("itemCutter").setTextureName(MODID + ":" + "itemCutter");
        itemBlades = new ItemBlades().setUnlocalizedName("itemBlades").setTextureName(MODID + ":" + "itemBlades");
        itemHandle = new ItemHandle().setUnlocalizedName("itemHandle").setTextureName(MODID + ":" + "itemHandle");
        itemMetalBender = new ItemMetalBender().setUnlocalizedName("itemMetalBender").setTextureName(MODID + ":" + "itemMetalBender");
        itemArcaneMetalPlate = new ItemArcaneMetalPlate().setUnlocalizedName("itemArcaneMetalPlate").setTextureName(MODID + ":" + "itemArcaneMetalPlate");
        itemArcaneMetal = new ItemArcaneMetal().setTextureName(MODID + ":" + "itemArcaneMetal");
        itemEnhancedArcaneMetal = new ItemEnhancedArcaneMetal().setTextureName(MODID + ":" + "itemEnhancedArcaneMetal");
        itemDarkCrystal = new ItemDarkCrystal().setTextureName(MODID + ":" + "itemDarkCrystal");
        DirtStick = new ItemDirtStick().setTextureName(MODID + ":" + "dirt_stick");
        ArcanePlate = new PAMaterial().setUnlocalizedName("arcanePlate");
        itemChainIngot = new PAMaterial().setUnlocalizedName("itemChainIngot");
        itemChainLink = new PAMaterial().setUnlocalizedName("itemChainLink");
        itemChainLink_2 = new PAMaterial().setUnlocalizedName("itemChainLink_2");
        itemWoodChips = new PAMaterial().setUnlocalizedName("itemWoodChips");
        itemCobaltIngot = new PAMaterial().setUnlocalizedName("itemCobaltIngot");
        itemArcaneRod = new PAMaterial().setUnlocalizedName("itemArcaneRod");
        itemCobaltPlate = new PAMaterial().setUnlocalizedName("cobaltPlate"); 
        toolArcaneHammer = new ToolArcaneHammer();
        toolArcaneChisel = new ToolArcaneChisel();
        toolSaw = new ToolSaw();
        toolGoldHammer = new ToolGoldHammer();
        foodGreenApple = new FoodGreenApple(10, true).setTextureName(MODID + ":" + "foodGreenApple");
        foodRawChickenLeg = new FoodRawChickenLeg(4, false).setTextureName(MODID + ":" + "foodRawChickenLeg");
        foodCookedChickenLeg = new FoodCookedChickenLeg(8, false).setTextureName(MODID + ":" + "foodCookedChickenLeg");
        foodSunflowerSeeds = new FoodSunflowerSeeds(2, 0.3F, false);
        itemCoalChunk = new PAMaterial().setUnlocalizedName("coalChunk");
        itemSandDust = new PAItems().setUnlocalizedName("sandDust");

        
        GameRegistry.registerItem(cropCantalopeSeeds, "cantalopeSeeds");
        GameRegistry.registerItem(cropStrawberrySeeds, "strawberrySeeds");
        GameRegistry.registerItem(cropStrawberry, "strawberry");
        GameRegistry.registerBlock(cropCantalope, "cantalope");
        GameRegistry.registerBlock(cropCantalopeStem, "cantalopeStem");
        GameRegistry.registerBlock(cropStrawberryPlant, "strawberryPlant");
        GameRegistry.registerItem(cropCantalopeSlices, "cantalopeSlice");
		GameRegistry.registerItem(itemArcaneGem, "itemArcaneGem");
        GameRegistry.registerItem(emeraldNugget, "emeraldNugget");
        GameRegistry.registerItem(itemCobaltDust, "itemCobaltDust");
    	GameRegistry.registerItem(arcanePickaxe, "arcanePickaxe");
    	GameRegistry.registerItem(arcaneAxe, "arcaneAxe");
    	GameRegistry.registerItem(arcaneSword, "arcaneSword");
    	GameRegistry.registerItem(arcaneHoe, "arcaneHoe");
    	GameRegistry.registerItem(arcaneSpade, "arcaneSpade");
    	GameRegistry.registerItem(ToolDarkCrystalPickaxe, "emeraldPickaxe");
    	GameRegistry.registerItem(ToolDarkCrystalAxe, "emeraldAxe");
    	GameRegistry.registerItem(ToolDarkCrystalSword, "emeraldSword");
    	GameRegistry.registerItem(ToolDarkCrystalHoe, "emeraldHoe");
    	GameRegistry.registerItem(ToolDarkCrystalSpade, "emeraldSpade");
    	GameRegistry.registerItem(DirtPickaxe, "dirtPickaxe");
    	GameRegistry.registerItem(DirtSword, "dirtSword");
    	GameRegistry.registerItem(DirtSpade, "dirtShovel");
    	GameRegistry.registerItem(DirtHoe, "dirtHoe");
    	GameRegistry.registerItem(DirtAxe, "dirtAxe");
        GameRegistry.registerItem(CobaltPickaxe, "cobaltPickaxe");
        GameRegistry.registerItem(CobaltAxe, "cobaltAxe");
        GameRegistry.registerItem(CobaltSword, "cobaltSword");
        GameRegistry.registerItem(CobaltHoe, "cobaltHoe");
        GameRegistry.registerItem(CobaltShovel, "cobaltShovel");
    	GameRegistry.registerItem(arcaneHelmet, "arcaneHelmet");
    	GameRegistry.registerItem(arcaneChestplate, "arcaneChestplate");
    	GameRegistry.registerItem(arcaneLeggings, "arcaneLeggings");
    	GameRegistry.registerItem(arcaneBoots, "arcaneBoots");
    	GameRegistry.registerItem(DarkCrystalHelmet, "darkCrystalHelmet");
    	GameRegistry.registerItem(DarkCrystalChestplate, "darkCrystalChestplate");
    	GameRegistry.registerItem(DarkCrystalLeggings, "darkCrystalLeggings");
    	GameRegistry.registerItem(DarkCrystalBoots, "darkCrystalBoots");
    	GameRegistry.registerItem(BoneHelmet, "boneHelmet");
    	GameRegistry.registerItem(BoneChestplate, "boneChestplate");
    	GameRegistry.registerItem(BoneLeggings, "boneLeggings");
    	GameRegistry.registerItem(BoneBoots, "boneBoots");
    	GameRegistry.registerItem(itemCutter, "itemCutter");
    	GameRegistry.registerItem(itemBlades, "itemBlades");
    	GameRegistry.registerItem(itemHandle, "itemHandle");
    	GameRegistry.registerItem(itemMetalBender, "itemMetalBender");
    	GameRegistry.registerItem(itemArcaneMetalPlate, "itemMetalPlate");
    	GameRegistry.registerItem(itemArcaneMetal, "itemArcaneMetal");
    	GameRegistry.registerItem(itemEnhancedArcaneMetal, "itemEnhancedArcaneMetal");
    	GameRegistry.registerItem(itemDarkCrystal, "itemDarkCrystal");
    	GameRegistry.registerItem(DirtStick, "dirtStick");
    	GameRegistry.registerItem(toolArcaneHammer, "toolAH");
        GameRegistry.registerItem(toolArcaneChisel, "toolArcaneChisel");
        GameRegistry.registerItem(ArcanePlate, "arcanePlate");
        GameRegistry.registerItem(itemChainIngot, "itemChainIngot");
        GameRegistry.registerItem(itemChainLink, "itemChainLink");
        GameRegistry.registerItem(itemChainLink_2, "itemChainLink_2");
        GameRegistry.registerItem(itemWoodChips, "itemWoodChips");
        GameRegistry.registerItem(toolSaw, "toolSaw");
        GameRegistry.registerItem(itemCobaltIngot, "itemCobaltIngot");
        GameRegistry.registerItem(itemArcaneRod, "itemArcaneRod");
        GameRegistry.registerItem(foodGreenApple, "foodHeartHealer");
    	GameRegistry.registerItem(foodRawChickenLeg, "foodRawChickenLeg");
    	GameRegistry.registerItem(foodCookedChickenLeg, "foodCookedChickenLeg");
    	GameRegistry.registerItem(foodSunflowerSeeds, "foodSunflowerSeeds");
    	GameRegistry.registerItem(itemCoalChunk, "coalChunk");
    	GameRegistry.registerItem(toolGoldHammer, "goldHammer");
    	GameRegistry.registerItem(itemCobaltPlate, "cobaltPlate");
        GameRegistry.registerItem(itemSandDust, "sandDust");
	}


	@EventHandler
	public void Init(FMLInitializationEvent event) {
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.itemArcaneGem), " Y ", "XZX", " Y ", 'X', Items.diamond , 'Y', Items.emerald, 'Z',(new ItemStack(Items.dye, 1, 14)));
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.blockArcaneGem), "XXX", "XXX", "XXX", 'X', Arcane.itemArcaneGem);
        GameRegistry.addShapedRecipe(new ItemStack(Arcane.blockMachineCore), "XXX", "X X", "XXX", 'X', Arcane.itemArcaneMetal);
        GameRegistry.addShapedRecipe(new ItemStack(Arcane.blockArcaneFurnaceIdle), "XXX", "XMX", "XXX", 'X', Arcane.ArcanePlate, 'M', Arcane.blockMachineCore);
        GameRegistry.addShapedRecipe(new ItemStack(Arcane.itemChainIngot), "LLL", "LLL", "   ", 'L', Arcane.itemChainLink);
        GameRegistry.addShapedRecipe(new ItemStack(Arcane.itemChainIngot), "   ", "LLL", "LLL", 'L', Arcane.itemChainLink);
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.double_plant, 1, 0), " X ", "XXX", " X ", 'X', Blocks.yellow_flower);
        GameRegistry.addShapelessRecipe(new ItemStack(Arcane.itemChainLink, 1), itemArcaneMetal, new ItemStack(Arcane.toolArcaneChisel, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapelessRecipe(new ItemStack(Arcane.itemArcaneGem, 9), new ItemStack(Arcane.blockArcaneGem));
        GameRegistry.addShapelessRecipe(new ItemStack(Arcane.itemArcaneMetal, 1), Blocks.stone, Items.iron_ingot, new ItemStack(Arcane.toolArcaneHammer, 1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(Arcane.foodSunflowerSeeds, 4), Items.wheat_seeds, new ItemStack(Blocks.double_plant, 1, 0));
		GameRegistry.addRecipe(new ItemStack(Items.string, 4), new Object[]{"IH", 'I', Blocks.wool, 'H', new ItemStack(Arcane.itemCutter, 1, OreDictionary.WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(Arcane.itemArcaneMetalPlate), new Object[]{"IH", 'I', Arcane.itemArcaneMetal, 'H', new ItemStack(Arcane.toolArcaneHammer, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addRecipe(new ItemStack(Arcane.emeraldNugget, 9), new Object[]{"CB", 'B', Blocks.emerald_block, 'C', new ItemStack(toolArcaneChisel, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addRecipe(new ItemStack(ArcanePlate, 1), new Object[]{"CB", 'B', itemArcaneGem, 'C', new ItemStack(toolArcaneHammer, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addShapelessRecipe(new ItemStack(Arcane.itemWoodChips, 4), Blocks.planks, new ItemStack(Arcane.toolSaw, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.arcaneAxe), " XX", " YX", " Y ", 'X', Arcane.itemArcaneGem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.arcaneAxe), "XX ", "XY ", " Y ", 'X', Arcane.itemArcaneGem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.arcaneSword), " X ", " X ", " Y ", 'X', Arcane.itemArcaneGem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.arcanePickaxe), "XXX", " Y ", " Y ", 'X', Arcane.itemArcaneGem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.arcaneSpade), " X ", " Y ", " Y ", 'X', Arcane.itemArcaneGem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.arcaneHoe), " XX", " Y ", " Y ", 'X', Arcane.itemArcaneGem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.arcaneHoe), "XX ", " Y ", " Y ", 'X', Arcane.itemArcaneGem, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.ToolDarkCrystalAxe), " XX", " YX", " Y ", 'X', Arcane.itemDarkCrystal, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.ToolDarkCrystalAxe), "XX ", "XY ", " Y ", 'X', Arcane.itemDarkCrystal, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.ToolDarkCrystalSword), " X ", " X ", " Y ", 'X', Arcane.itemDarkCrystal, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.ToolDarkCrystalPickaxe), "XXX", " Y ", " Y ", 'X', Arcane.itemDarkCrystal, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.ToolDarkCrystalSpade), " X ", " Y ", " Y ", 'X', Arcane.itemDarkCrystal, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.ToolDarkCrystalHoe), " XX", " Y ", " Y ", 'X', Arcane.itemDarkCrystal, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.ToolDarkCrystalHoe), "XX ", " Y ", " Y ", 'X', Arcane.itemDarkCrystal, 'Y', Items.stick);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.DirtAxe), " XX", " YX", " Y ", 'X', Blocks.dirt, 'Y', Arcane.DirtStick);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.DirtAxe), "XX ", "XY ", " Y ", 'X', Blocks.dirt, 'Y', Arcane.DirtStick);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.DirtSword), " X ", " X ", " Y ", 'X', Blocks.dirt, 'Y', Arcane.DirtStick);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.DirtPickaxe), "XXX", " Y ", " Y ", 'X', Blocks.dirt, 'Y', Arcane.DirtStick);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.DirtSpade), " X ", " Y ", " Y ", 'X', Blocks.dirt, 'Y', Arcane.DirtStick);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.DirtHoe), " XX", " Y ", " Y ", 'X', Blocks.dirt, 'Y', Arcane.DirtStick);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.DirtHoe), "XX ", " Y ", " Y ", 'X', Blocks.dirt, 'Y', Arcane.DirtStick);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.itemThunderfury), " XX", "ZYX", "ZZ ", 'X',(new ItemStack(Items.dye, 1, 4)), 'Y', Items.emerald, 'Z', Arcane.itemArcaneGem);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.arcaneHelmet), "XXX", "X X", "   ", 'X', Arcane.itemArcaneGem);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.arcaneChestplate), "X X", "XXX", "XXX", 'X', Arcane.itemArcaneGem);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.arcaneLeggings), "XXX", "X X", "X X", 'X', Arcane.itemArcaneGem);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.arcaneBoots), "   ", "X X", "X X", 'X', Arcane.itemArcaneGem);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.BoneHelmet), "XXX", "X X", "   ", 'X', Items.bone);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.BoneChestplate), "X X", "XXX", "XXX", 'X', Items.bone);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.BoneLeggings), "XXX", "X X", "X X", 'X', Items.bone);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.BoneBoots), "   ", "X X", "X X", 'X', Items.bone);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.DarkCrystalHelmet), "XXX", "X X", "   ", 'X', Arcane.itemDarkCrystal);
        GameRegistry.addShapedRecipe(new ItemStack(Arcane.DarkCrystalChestplate), "X X", "XXX", "XXX", 'X', Arcane.itemDarkCrystal);
        GameRegistry.addShapedRecipe(new ItemStack(Arcane.DarkCrystalLeggings), "XXX", "X X", "X X", 'X', Arcane.itemDarkCrystal);
        GameRegistry.addShapedRecipe(new ItemStack(Arcane.DarkCrystalBoots), "   ", "X X", "X X", 'X', Arcane.itemDarkCrystal);
        GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_helmet), "XXX", "X X", "   ", 'X', Arcane.itemChainIngot);
        GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_chestplate), "X X", "XXX", "XXX", 'X', Arcane.itemChainIngot);
        GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_leggings), "XXX", "X X", "X X", 'X', Arcane.itemChainIngot);
        GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_boots), "   ", "X X", "X X", 'X', Arcane.itemChainIngot);
        GameRegistry.addShapedRecipe(new ItemStack(Arcane.arcaneChest), "XXX", "X X", "XXX", 'X', Arcane.itemArcaneGem);
		GameRegistry.addRecipe(new ItemStack(Arcane.toolArcaneHammer), new Object[]{"XXX", "XSX", " S ", 'X', Arcane.itemArcaneGem, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(Arcane.toolArcaneChisel), new Object[]{"  X", "GX ", "GG ", 'X', Arcane.itemArcaneRod, 'G', Arcane.itemArcaneGem});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 4), new ItemStack(Arcane.itemCutter), new ItemStack(Blocks.wool));
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.itemMetalBender), "XXX", "YYY", "XXX", 'X', Arcane.itemArcaneMetalPlate, 'Y', Arcane.itemArcaneGem);
		GameRegistry.addShapelessRecipe(new ItemStack(Arcane.itemHandle, 1), new ItemStack(Arcane.itemMetalBender), new ItemStack(Arcane.itemArcaneMetalPlate));
		GameRegistry.addShapelessRecipe(new ItemStack(Arcane.itemCutter, 1), new ItemStack(Arcane.itemHandle), new ItemStack(Arcane.itemBlades));
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.itemEnhancedArcaneMetal), " XX", " XX", "   ", 'X', Arcane.itemArcaneMetalPlate);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.itemEnhancedArcaneMetal), "XX ", "XX ", "   ", 'X', Arcane.itemArcaneMetalPlate);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.itemEnhancedArcaneMetal), " XX", " XX", "   ", 'X', Arcane.itemArcaneMetalPlate);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.itemEnhancedArcaneMetal), "   ", "XX ", "XX ", 'X', Arcane.itemArcaneMetalPlate);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.DirtStick), "   ", " X ", " X ", 'X', Blocks.dirt);
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.DirtStick), " X ", " X ", "   ", 'X', Blocks.dirt);
		GameRegistry.addShapedRecipe(new ItemStack(Items.emerald), "XXX", "XXX", "XXX", 'X', Arcane.emeraldNugget); 
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.foodGreenApple), "XXX", "XYX", "XXX", 'X', Items.emerald, 'Y', Items.apple);
		GameRegistry.addRecipe(new ItemStack(Arcane.itemCoalChunk), new Object[]{"XX ", "XX ",'X', Items.coal});
		GameRegistry.addRecipe(new ItemStack(Arcane.itemCoalChunk), new Object[]{" XX", " XX",'X', Items.coal});
		GameRegistry.addRecipe(new ItemStack(Arcane.itemCoalChunk), new Object[]{"XX ", "XX", 'X', Items.coal});
		GameRegistry.addRecipe(new ItemStack(Arcane.itemCoalChunk), new Object[]{" XX", " XX", 'X', Items.coal});
		GameRegistry.addShapelessRecipe(new ItemStack(Arcane.itemCoalChunk), Blocks.coal_block, new ItemStack(Arcane.toolArcaneChisel, 1, OreDictionary.WILDCARD_VALUE));
		GameRegistry.addShapedRecipe(new ItemStack(Arcane.cropCantalope), "XXX", "XXX", "XXX", 'X', Arcane.cropCantalopeSlices);
        GameRegistry.addShapelessRecipe(new ItemStack(Arcane.cropStrawberrySeeds), new ItemStack(Arcane.cropStrawberry));
        GameRegistry.addShapelessRecipe(new ItemStack(Arcane.cropCantalopeSeeds), new ItemStack(Arcane.cropCantalope));

        GameRegistry.addSmelting(ArcaneGemOre, new ItemStack(Arcane.itemArcaneGem), 0);
        GameRegistry.addSmelting(DarkCrystalOre, new ItemStack(Arcane.itemDarkCrystal), 0);
        GameRegistry.addSmelting(Arcane.foodRawChickenLeg, new ItemStack(Arcane.foodCookedChickenLeg), 5f);
        GameRegistry.addSmelting(Arcane.itemCobaltDust, new ItemStack(Arcane.itemCobaltIngot), 4f);

		GameRegistry.registerTileEntity(TileEntityArcaneFurnace.class, "ArcaneFurnace");
        GameRegistry.registerTileEntity(TileEntityDualFurnace.class, "dualFurnace");
	}

    @SubscribeEvent
    public void checkUpdate(PlayerEvent.PlayerLoggedInEvent event) {
        if(outdated) {
            event.player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + "Project: Arcane " + EnumChatFormatting.WHITE + "is " + EnumChatFormatting.DARK_RED + "outdated! " + EnumChatFormatting.WHITE + "Go to: " + EnumChatFormatting.DARK_GREEN + "http://goo.gl/nDyNO3 " + EnumChatFormatting.WHITE + "for the newest version!"));
            event.player.addChatComponentMessage(new ChatComponentText(" "));
            event.player.addChatComponentMessage(new ChatComponentText("Changelog: "));
            event.player.addChatComponentMessage(new ChatComponentText(updates));
        }
    }
}