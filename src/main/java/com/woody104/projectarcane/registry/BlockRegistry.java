package com.woody104.projectarcane.registry;

import com.woody104.projectarcane.biome.features.PALeaves;
import com.woody104.projectarcane.biome.features.PALog;
import com.woody104.projectarcane.biome.features.PASapling;
import com.woody104.projectarcane.blocks.*;
import com.woody104.projectarcane.ores.*;
import com.woody104.projectarcane.items.ItemBlockSandBlock;
import com.woody104.projectarcane.items.ItemLeafBlocks;
import com.woody104.projectarcane.items.ItemLogBlocks;
import com.woody104.projectarcane.items.ItemSaplingBlocks;
import com.woody104.projectarcane.ores.VanadiumOre;
import com.woody104.projectarcane.util.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRegistry
{
    public static Block blockArcaneGem = new BlockArcaneGem().setBlockName("blockArcaneGem").setCreativeTab(CreativeTabRegistry.arcaneTab_blocks).setBlockTextureName(Reference.MOD_ID + ":" + "blockArcaneGem");
    public static Block blockMachineCore = new BlockMachineCore();
    public static Block blockSandBlock = new BlockSandBlock();
    public static Block cropStrawberryPlant = new PACrop().setBlockName("strawberryPlant");
    public static Block cropCantalope = new Cantalope().setBlockName("cantalope").setBlockTextureName(Reference.MOD_ID + ":" + "cantalope");
    public static Block cropCantalopeStem = new BlockPAStem(cropCantalope).setBlockName("cantalopeStem").setBlockTextureName(Reference.MOD_ID + ":" + "cantalopeStem");
    //Machines
    public static Block blockArcaneFurnaceIdle = new ArcaneFurnace(false).setBlockName("ArcaneFurnaceIdle").setCreativeTab(CreativeTabRegistry.arcaneTab_blocks).setHardness(3.5F);
    public static Block blockArcaneFurnaceActive = new ArcaneFurnace(true).setBlockName("ArcaneFurnaceActive").setLightLevel(0.625F).setHardness(3.5F);
    public static final int guiIDArcaneFurnace = 0;

    public static Block blockDualFurnaceIdle = new DualFurnace(false).setBlockName("DualFurnaceIdle").setCreativeTab(CreativeTabRegistry.arcaneTab_blocks).setHardness(3.5F);
    public static Block blockDualFurnaceActive = new DualFurnace(true).setBlockName("DualFurnaceActive").setHardness(3.5F);
    public static final int guiIDDualFurnace = 1;
    //ores
    public static Block ArcaneGemOre = new ArcaneGemOre(Material.anvil).setBlockName("ArcaneGemOre").setBlockTextureName(Reference.MOD_ID + ":" + "blockArcaneGemOre");
    public static Block DarkCrystalOre = new DarkCrystalOre(Material.rock).setBlockName("DarkCrystalOre").setBlockTextureName(Reference.MOD_ID + ":" + "blockDarkCrystalOre");
    public static Block EmeraldNuggetOre = new EmeraldNuggetOre(Material.rock).setBlockName("EmeraldNuggetOre").setBlockTextureName(Reference.MOD_ID + ":" + "blockEmeraldNuggetOre");
    public static Block VanadiumOre = new VanadiumOre(Material.rock).setBlockName("vanadiumOre").setBlockTextureName(Reference.MOD_ID + ":" + "vanadiumOre");
    public static Block ManganeseOre = new ManganeseOre(Material.rock).setBlockName("manganeseOre").setBlockTextureName(Reference.MOD_ID + ":" + "manganeseOre");
    public static Block CobaltOre = new CobaltOre(Material.rock).setBlockName("cobaltOre").setBlockTextureName(Reference.MOD_ID + ":" + "cobaltOre");
    public static Block NickelOre = new NickelOre(Material.rock).setBlockName("nickelOre").setBlockTextureName(Reference.MOD_ID + ":" + "nickelOre");
    //other blocks
    public static Block arcaneChest = new arcaneChest(0).setBlockName("arcaneChest").setCreativeTab(CreativeTabRegistry.arcaneTab_blocks);
    public static Block blockArcaneLampOn = new ArcaneLamp(true).setBlockName("arcaneLampOn");
    public static Block blockArcaneLampOff = new ArcaneLamp(false).setBlockName("arcaneLampOff").setCreativeTab(CreativeTabRegistry.arcaneTab_blocks);
    //crafting
    public static Block blockArcaneTable = new ArcaneTable().setBlockName("ArcaneTable");
    public static final int guiIDArcaneTable = 1;
    //Trees
    public static Block blockLog = new PALog().setBlockName("Log").setCreativeTab(CreativeTabRegistry.arcaneTab_blocks);
    public static Block blockLeaf = new PALeaves().setBlockName("Leaf").setCreativeTab(CreativeTabRegistry.arcaneTab_blocks);
    public static Block blockSapling = new PASapling().setBlockName("Sapling").setCreativeTab(CreativeTabRegistry.arcaneTab_material);

    public static void init()
    {
        GameRegistry.registerBlock(cropCantalope, "cantalope");
        GameRegistry.registerBlock(cropCantalopeStem, "cantalopeStem");
        GameRegistry.registerBlock(cropStrawberryPlant, "strawberryPlant");
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
        GameRegistry.registerBlock(blockDualFurnaceIdle, "DualFurnaceIdle");
        GameRegistry.registerBlock(blockDualFurnaceActive, "DualFurnaceActive");
        GameRegistry.registerBlock(blockLog, ItemLogBlocks.class, blockLog.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockLeaf, ItemLeafBlocks.class, blockLeaf.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockSapling, ItemSaplingBlocks.class, blockSapling.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(blockSandBlock, ItemBlockSandBlock.class, "blockSandBlock");
    }
}
