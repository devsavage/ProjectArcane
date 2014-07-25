package com.woody104.projectarcane.crafting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import com.woody104.projectarcane.registry.BlockRegistry;
import com.woody104.projectarcane.registry.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.RecipeBookCloning;
import net.minecraft.item.crafting.RecipeFireworks;
import net.minecraft.item.crafting.RecipesArmorDyes;
import net.minecraft.item.crafting.RecipesMapCloning;
import net.minecraft.item.crafting.RecipesMapExtending;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class ArcaneTableCraftingManager
{
    /** The static instance of this class */
    private static final ArcaneTableCraftingManager instance = new ArcaneTableCraftingManager();
    /** A list of all the recipes added */
    private List recipes = new ArrayList();
    private static final String __OBFID = "CL_00000090";

    /**
     * Returns the static instance of this class
     */
    public static final ArcaneTableCraftingManager getInstance()
    {
        /** The static instance of this class */
        return instance;
    }

    private ArcaneTableCraftingManager() {
    	
      recipes = new ArrayList();
      //MY RECIPES
      this.addRecipe(new ItemStack(ItemRegistry.foodGreenApple, 1), new Object[] {"NNN ", "NAN ", "NNN ", "    ", 'N', ItemRegistry.emeraldNugget, 'A', Items.apple });
      this.addRecipe(new ItemStack(ItemRegistry.foodGreenApple, 1), new Object[] {" NNN", " NAN", " NNN", "    ", 'N', ItemRegistry.emeraldNugget, 'A', Items.apple });
      this.addRecipe(new ItemStack(ItemRegistry.foodGreenApple, 1), new Object[] {"    ", "NNN ", "NAN ", "NNN ", 'N', ItemRegistry.emeraldNugget, 'A', Items.apple });
      this.addRecipe(new ItemStack(ItemRegistry.foodGreenApple, 1), new Object[] {"    ", " NNN", " NAN", " NNN", 'N', ItemRegistry.emeraldNugget, 'A', Items.apple });
      this.addRecipe(new ItemStack(ItemRegistry.toolSaw, 1), new Object[] {"PPPS", "P  S", "IIIS", "    ", 'P', Blocks.planks, 'S', Items.stick, 'I', Items.iron_ingot});
		//Crafting (itemArcane is High Red Cell)
		//this.addRecipe(new ItemStack(Arcane.blockEnergyRed), "XXX", "YYY", "XXX", 'X', Arcane.itemHGCell, 'Y', Arcane.itemHGCell );
		//this.addRecipe(new ItemStack(Arcane.blockEnergyGreen), "XXX", "YYY", "XXX", 'X', Arcane.itemHBCell, 'Y', Arcane.itemHBCell );
		//this.addRecipe(new ItemStack(Arcane.itemLBCell), "X X", "X X", "XYX", 'X', Arcane.itemArcaneCell , 'Y', Arcane.itemBorium);
		//this.addRecipe(new ItemStack(Arcane.itemHBCell), "XYX", "XYX", "XYX", 'X', Arcane.itemArcaneCell , 'Y', Arcane.itemBorium);
		//this.addRecipe(new ItemStack(Arcane.itemLGCell), "X X", "X X", "XYX", 'X', Arcane.itemArcaneCell , 'Y', Arcane.itemGlorium);
		//this.addRecipe(new ItemStack(Arcane.itemHGCell), "XYX", "XYX", "XYX", 'X', Arcane.itemArcaneCell , 'Y', Arcane.itemGlorium);
		this.addRecipe(new ItemStack(ItemRegistry.itemArcaneGem), " Y ", "XZX", " Y ", 'X', Items.diamond , 'Y', Items.emerald, 'Z',(new ItemStack(Items.dye, 1, 14)));
		this.addRecipe(new ItemStack(BlockRegistry.blockArcaneGem), "XXX", "XXX", "XXX", 'X', ItemRegistry.itemArcaneGem);
      this.addRecipe(new ItemStack(BlockRegistry.blockMachineCore), "XXX ", "X  X", "XXX ", "    ", 'X', ItemRegistry.itemArcaneMetal);
      this.addRecipe(new ItemStack(BlockRegistry.blockArcaneFurnaceIdle), "XXX", "XMX", "XXX", 'X', ItemRegistry.ArcanePlate, 'M', BlockRegistry.blockMachineCore);
      this.addRecipe(new ItemStack(ItemRegistry.itemChainIngot), "LLL", "LLL", "   ", 'L', ItemRegistry.itemChainLink);
      this.addRecipe(new ItemStack(ItemRegistry.itemChainIngot), "   ", "LLL", "LLL", 'L', ItemRegistry.itemChainLink);
      this.addRecipe(new ItemStack(Blocks.double_plant, 1, 0), " X ", "XXX", " X ", 'X', Blocks.yellow_flower);
      this.addShapelessRecipe(new ItemStack(ItemRegistry.itemChainLink, 1), ItemRegistry.itemArcaneMetal, new ItemStack(ItemRegistry.toolArcaneChisel, 1, OreDictionary.WILDCARD_VALUE));
		this.addShapelessRecipe(new ItemStack(ItemRegistry.itemArcaneGem, 9), new ItemStack(BlockRegistry.blockArcaneGem));
      this.addShapelessRecipe(new ItemStack(ItemRegistry.itemArcaneMetal, 1), Blocks.stone, Items.iron_ingot, new ItemStack(ItemRegistry.toolArcaneHammer, 1, OreDictionary.WILDCARD_VALUE));
      this.addShapelessRecipe(new ItemStack(ItemRegistry.foodSunflowerSeeds, 4), Items.wheat_seeds, new ItemStack(Blocks.double_plant, 1, 0));
		this.addRecipe(new ItemStack(Items.string, 4), new Object[]{"IH", 'I', Blocks.wool, 'H', new ItemStack(ItemRegistry.itemCutter, 1, OreDictionary.WILDCARD_VALUE)});
		this.addRecipe(new ItemStack(ItemRegistry.itemArcaneMetalPlate), new Object[]{"IH", 'I', ItemRegistry.itemArcaneMetal, 'H', new ItemStack(ItemRegistry.toolArcaneHammer, 1, OreDictionary.WILDCARD_VALUE)});
      this.addRecipe(new ItemStack(ItemRegistry.emeraldNugget, 9), new Object[]{"CB", 'B', Blocks.emerald_block, 'C', new ItemStack(ItemRegistry.toolArcaneChisel, 1, OreDictionary.WILDCARD_VALUE)});
      this.addRecipe(new ItemStack(ItemRegistry.ArcanePlate, 1), new Object[]{"CB", 'B', ItemRegistry.itemArcaneGem, 'C', new ItemStack(ItemRegistry.toolArcaneHammer, 1, OreDictionary.WILDCARD_VALUE)});
      this.addShapelessRecipe(new ItemStack(ItemRegistry.itemWoodChips, 4), Blocks.planks, new ItemStack(ItemRegistry.toolSaw, 1, OreDictionary.WILDCARD_VALUE));
		this.addRecipe(new ItemStack(ItemRegistry.arcaneAxe), " XX", " YX", " Y ", 'X', ItemRegistry.itemArcaneGem, 'Y', Items.stick);
		this.addRecipe(new ItemStack(ItemRegistry.arcaneAxe), "XX ", "XY ", " Y ", 'X', ItemRegistry.itemArcaneGem, 'Y', Items.stick);
		this.addRecipe(new ItemStack(ItemRegistry.arcaneSword), " X ", " X ", " Y ", 'X', ItemRegistry.itemArcaneGem, 'Y', Items.stick);
		this.addRecipe(new ItemStack(ItemRegistry.arcanePickaxe), "XXX", " Y ", " Y ", 'X', ItemRegistry.itemArcaneGem, 'Y', Items.stick);
		this.addRecipe(new ItemStack(ItemRegistry.arcaneSpade), " X ", " Y ", " Y ", 'X', ItemRegistry.itemArcaneGem, 'Y', Items.stick);
		this.addRecipe(new ItemStack(ItemRegistry.arcaneHoe), " XX", " Y ", " Y ", 'X', ItemRegistry.itemArcaneGem, 'Y', Items.stick);
		this.addRecipe(new ItemStack(ItemRegistry.arcaneHoe), "XX ", " Y ", " Y ", 'X', ItemRegistry.itemArcaneGem, 'Y', Items.stick);
		this.addRecipe(new ItemStack(ItemRegistry.ToolDarkCrystalAxe), " XX", " YX", " Y ", 'X', ItemRegistry.itemDarkCrystal, 'Y', Items.stick);
		this.addRecipe(new ItemStack(ItemRegistry.ToolDarkCrystalAxe), "XX ", "XY ", " Y ", 'X', ItemRegistry.itemDarkCrystal, 'Y', Items.stick);
		this.addRecipe(new ItemStack(ItemRegistry.ToolDarkCrystalSword), " X ", " X ", " Y ", 'X', ItemRegistry.itemDarkCrystal, 'Y', Items.stick);
		this.addRecipe(new ItemStack(ItemRegistry.ToolDarkCrystalPickaxe), "XXX", " Y ", " Y ", 'X', ItemRegistry.itemDarkCrystal, 'Y', Items.stick);
		this.addRecipe(new ItemStack(ItemRegistry.ToolDarkCrystalSpade), " X ", " Y ", " Y ", 'X', ItemRegistry.itemDarkCrystal, 'Y', Items.stick);
		this.addRecipe(new ItemStack(ItemRegistry.ToolDarkCrystalHoe), " XX", " Y ", " Y ", 'X', ItemRegistry.itemDarkCrystal, 'Y', Items.stick);
		this.addRecipe(new ItemStack(ItemRegistry.ToolDarkCrystalHoe), "XX ", " Y ", " Y ", 'X', ItemRegistry.itemDarkCrystal, 'Y', Items.stick);
		this.addRecipe(new ItemStack(ItemRegistry.DirtAxe), " XX", " YX", " Y ", 'X', Blocks.dirt, 'Y', ItemRegistry.DirtStick);
		this.addRecipe(new ItemStack(ItemRegistry.DirtAxe), "XX ", "XY ", " Y ", 'X', Blocks.dirt, 'Y', ItemRegistry.DirtStick);
		this.addRecipe(new ItemStack(ItemRegistry.DirtSword), " X ", " X ", " Y ", 'X', Blocks.dirt, 'Y', ItemRegistry.DirtStick);
		this.addRecipe(new ItemStack(ItemRegistry.DirtPickaxe), "XXX", " Y ", " Y ", 'X', Blocks.dirt, 'Y', ItemRegistry.DirtStick);
		this.addRecipe(new ItemStack(ItemRegistry.DirtSpade), " X ", " Y ", " Y ", 'X', Blocks.dirt, 'Y', ItemRegistry.DirtStick);
		this.addRecipe(new ItemStack(ItemRegistry.DirtHoe), " XX", " Y ", " Y ", 'X', Blocks.dirt, 'Y', ItemRegistry.DirtStick);
		this.addRecipe(new ItemStack(ItemRegistry.DirtHoe), "XX ", " Y ", " Y ", 'X', Blocks.dirt, 'Y', ItemRegistry.DirtStick);
		this.addRecipe(new ItemStack(ItemRegistry.itemThunderfury), " XX", "ZYX", "ZZ ", 'X',(new ItemStack(Items.dye, 1, 4)), 'Y', Items.emerald, 'Z', ItemRegistry.itemArcaneGem);
		this.addRecipe(new ItemStack(ItemRegistry.arcaneHelmet), "XXX", "X X", "   ", 'X', ItemRegistry.itemArcaneGem);
		this.addRecipe(new ItemStack(ItemRegistry.arcaneChestplate), "X X", "XXX", "XXX", 'X', ItemRegistry.itemArcaneGem);
		this.addRecipe(new ItemStack(ItemRegistry.arcaneLeggings), "XXX", "X X", "X X", 'X', ItemRegistry.itemArcaneGem);
		this.addRecipe(new ItemStack(ItemRegistry.arcaneBoots), "   ", "X X", "X X", 'X', ItemRegistry.itemArcaneGem);
		this.addRecipe(new ItemStack(ItemRegistry.BoneHelmet), "XXX", "X X", "   ", 'X', Items.bone);
		this.addRecipe(new ItemStack(ItemRegistry.BoneChestplate), "X X", "XXX", "XXX", 'X', Items.bone);
		this.addRecipe(new ItemStack(ItemRegistry.BoneLeggings), "XXX", "X X", "X X", 'X', Items.bone);
		this.addRecipe(new ItemStack(ItemRegistry.BoneBoots), "   ", "X X", "X X", 'X', Items.bone);
		this.addRecipe(new ItemStack(ItemRegistry.DarkCrystalHelmet), "XXX", "X X", "   ", 'X', ItemRegistry.itemDarkCrystal);
      this.addRecipe(new ItemStack(ItemRegistry.DarkCrystalChestplate), "X X", "XXX", "XXX", 'X', ItemRegistry.itemDarkCrystal);
      this.addRecipe(new ItemStack(ItemRegistry.DarkCrystalLeggings), "XXX", "X X", "X X", 'X', ItemRegistry.itemDarkCrystal);
      this.addRecipe(new ItemStack(ItemRegistry.DarkCrystalBoots), "   ", "X X", "X X", 'X', ItemRegistry.itemDarkCrystal);
      this.addRecipe(new ItemStack(Items.chainmail_helmet), "XXX", "X X", "   ", 'X', ItemRegistry.itemChainIngot);
      this.addRecipe(new ItemStack(Items.chainmail_chestplate), "X X", "XXX", "XXX", 'X', ItemRegistry.itemChainIngot);
      this.addRecipe(new ItemStack(Items.chainmail_leggings), "XXX", "X X", "X X", 'X', ItemRegistry.itemChainIngot);
      this.addRecipe(new ItemStack(Items.chainmail_boots), "   ", "X X", "X X", 'X', ItemRegistry.itemChainIngot);
      this.addRecipe(new ItemStack(BlockRegistry.arcaneChest), "XXX", "X X", "XXX", 'X', ItemRegistry.itemArcaneGem);
		this.addRecipe(new ItemStack(ItemRegistry.toolArcaneHammer), new Object[]{"XXX", "XSX", " S ", 'X', ItemRegistry.itemArcaneGem, 'S', Items.stick});
      this.addRecipe(new ItemStack(ItemRegistry.toolArcaneChisel), new Object[]{"  X", "GX ", "GG ", 'X', ItemRegistry.itemArcaneRod, 'G', ItemRegistry.itemArcaneGem});
		this.addShapelessRecipe(new ItemStack(Items.string, 4), new ItemStack(ItemRegistry.itemCutter), new ItemStack(Blocks.wool));
		this.addRecipe(new ItemStack(ItemRegistry.itemMetalBender), "XXX", "YYY", "XXX", 'X', ItemRegistry.itemArcaneMetalPlate, 'Y', ItemRegistry.itemArcaneGem);
		this.addShapelessRecipe(new ItemStack(ItemRegistry.itemHandle, 1), new ItemStack(ItemRegistry.itemMetalBender), new ItemStack(ItemRegistry.itemArcaneMetalPlate));
		this.addShapelessRecipe(new ItemStack(ItemRegistry.itemCutter, 1), new ItemStack(ItemRegistry.itemHandle), new ItemStack(ItemRegistry.itemBlades));
		this.addRecipe(new ItemStack(ItemRegistry.itemEnhancedArcaneMetal), " XX", " XX", "   ", 'X', ItemRegistry.itemArcaneMetalPlate);
		this.addRecipe(new ItemStack(ItemRegistry.itemEnhancedArcaneMetal), "XX ", "XX ", "   ", 'X', ItemRegistry.itemArcaneMetalPlate);
		this.addRecipe(new ItemStack(ItemRegistry.itemEnhancedArcaneMetal), " XX", " XX", "   ", 'X', ItemRegistry.itemArcaneMetalPlate);
		this.addRecipe(new ItemStack(ItemRegistry.itemEnhancedArcaneMetal), "   ", "XX ", "XX ", 'X', ItemRegistry.itemArcaneMetalPlate);
		this.addRecipe(new ItemStack(ItemRegistry.DirtStick), "   ", " X ", " X ", 'X', Blocks.dirt);
		this.addRecipe(new ItemStack(ItemRegistry.DirtStick), " X ", " X ", "   ", 'X', Blocks.dirt);
		this.addRecipe(new ItemStack(Items.emerald), "XXX", "XXX", "XXX", 'X', ItemRegistry.emeraldNugget);
		this.addRecipe(new ItemStack(ItemRegistry.foodGreenApple), "XXX", "XYX", "XXX", 'X', Items.emerald, 'Y', Items.apple);
		this.addRecipe(new ItemStack(ItemRegistry.itemCoalChunk), new Object[]{"XX ", "XX ",'X', Items.coal});
		this.addRecipe(new ItemStack(ItemRegistry.itemCoalChunk), new Object[]{" XX", " XX",'X', Items.coal});
		this.addRecipe(new ItemStack(ItemRegistry.itemCoalChunk), new Object[]{"XX ", "XX", 'X', Items.coal});
		this.addRecipe(new ItemStack(ItemRegistry.itemCoalChunk), new Object[]{" XX", " XX", 'X', Items.coal});
		this.addShapelessRecipe(new ItemStack(ItemRegistry.itemCoalChunk), Blocks.coal_block, new ItemStack(ItemRegistry.toolArcaneChisel, 1, OreDictionary.WILDCARD_VALUE));
		this.addShapelessRecipe(new ItemStack(ItemRegistry.itemCobaltPlate), ItemRegistry.itemCobaltIngot, new ItemStack(ItemRegistry.toolGoldHammer, 1, OreDictionary.WILDCARD_VALUE));
      //MINECRAFT RECIPES
        this.recipes.add(new RecipesArmorDyes());
        this.recipes.add(new RecipeBookCloning());
        this.recipes.add(new RecipesMapCloning());
        this.recipes.add(new RecipesMapExtending());
        this.recipes.add(new RecipeFireworks());
      this.addRecipe(new ItemStack(Items.paper, 3), new Object[] {"###", '#', Items.reeds});
      this.addShapelessRecipe(new ItemStack(Items.book, 1), new Object[] {Items.paper, Items.paper, Items.paper, Items.leather});
      this.addShapelessRecipe(new ItemStack(Items.writable_book, 1), new Object[] {Items.book, new ItemStack(Items.dye, 1, 0), Items.feather});
      this.addRecipe(new ItemStack(Blocks.fence, 2), new Object[] {"###", "###", '#', Items.stick});
      this.addRecipe(new ItemStack(Blocks.cobblestone_wall, 6, 0), new Object[] {"###", "###", '#', Blocks.cobblestone});
      this.addRecipe(new ItemStack(Blocks.cobblestone_wall, 6, 1), new Object[] {"###", "###", '#', Blocks.mossy_cobblestone});
      this.addRecipe(new ItemStack(Blocks.nether_brick_fence, 6), new Object[] {"###", "###", '#', Blocks.nether_brick});
      this.addRecipe(new ItemStack(Blocks.fence_gate, 1), new Object[] {"#W#", "#W#", '#', Items.stick, 'W', Blocks.planks});
      this.addRecipe(new ItemStack(Blocks.jukebox, 1), new Object[] {"###", "#X#", "###", '#', Blocks.planks, 'X', Items.diamond});
      this.addRecipe(new ItemStack(Items.lead, 2), new Object[] {"~~ ", "~O ", "  ~", '~', Items.string, 'O', Items.slime_ball});
      this.addRecipe(new ItemStack(Blocks.noteblock, 1), new Object[] {"###", "#X#", "###", '#', Blocks.planks, 'X', Items.redstone});
      this.addRecipe(new ItemStack(Blocks.bookshelf, 1), new Object[] {"###", "XXX", "###", '#', Blocks.planks, 'X', Items.book});
      this.addRecipe(new ItemStack(Blocks.snow, 1), new Object[] {"##", "##", '#', Items.snowball});
      this.addRecipe(new ItemStack(Blocks.snow_layer, 6), new Object[] {"###", '#', Blocks.snow});
      this.addRecipe(new ItemStack(Blocks.clay, 1), new Object[] {"##", "##", '#', Items.clay_ball});
      this.addRecipe(new ItemStack(Blocks.brick_block, 1), new Object[] {"##", "##", '#', Items.brick});
      this.addRecipe(new ItemStack(Blocks.glowstone, 1), new Object[] {"##", "##", '#', Items.glowstone_dust});
      this.addRecipe(new ItemStack(Blocks.quartz_block, 1), new Object[] {"##", "##", '#', Items.quartz});
      this.addRecipe(new ItemStack(Blocks.wool, 1), new Object[] {"##", "##", '#', Items.string});
      this.addRecipe(new ItemStack(Blocks.tnt, 1), new Object[] {"X#X", "#X#", "X#X", 'X', Items.gunpowder, '#', Blocks.sand});
      this.addRecipe(new ItemStack(Blocks.stone_slab, 6, 3), new Object[] {"###", '#', Blocks.cobblestone});
      this.addRecipe(new ItemStack(Blocks.stone_slab, 6, 0), new Object[] {"###", '#', Blocks.stone});
      this.addRecipe(new ItemStack(Blocks.stone_slab, 6, 1), new Object[] {"###", '#', Blocks.sandstone});
      this.addRecipe(new ItemStack(Blocks.stone_slab, 6, 4), new Object[] {"###", '#', Blocks.brick_block});
      this.addRecipe(new ItemStack(Blocks.stone_slab, 6, 5), new Object[] {"###", '#', Blocks.stonebrick});
      this.addRecipe(new ItemStack(Blocks.stone_slab, 6, 6), new Object[] {"###", '#', Blocks.nether_brick});
      this.addRecipe(new ItemStack(Blocks.stone_slab, 6, 7), new Object[] {"###", '#', Blocks.quartz_block});
      this.addRecipe(new ItemStack(Blocks.wooden_slab, 6, 0), new Object[] {"###", '#', new ItemStack(Blocks.planks, 1, 0)});
      this.addRecipe(new ItemStack(Blocks.wooden_slab, 6, 2), new Object[] {"###", '#', new ItemStack(Blocks.planks, 1, 2)});
      this.addRecipe(new ItemStack(Blocks.wooden_slab, 6, 1), new Object[] {"###", '#', new ItemStack(Blocks.planks, 1, 1)});
      this.addRecipe(new ItemStack(Blocks.wooden_slab, 6, 3), new Object[] {"###", '#', new ItemStack(Blocks.planks, 1, 3)});
      this.addRecipe(new ItemStack(Blocks.wooden_slab, 6, 4), new Object[] {"###", '#', new ItemStack(Blocks.planks, 1, 4)});
      this.addRecipe(new ItemStack(Blocks.wooden_slab, 6, 5), new Object[] {"###", '#', new ItemStack(Blocks.planks, 1, 5)});
      this.addRecipe(new ItemStack(Blocks.ladder, 3), new Object[] {"# #", "###", "# #", '#', Items.stick});
      this.addRecipe(new ItemStack(Items.wooden_door, 1), new Object[] {"##", "##", "##", '#', Blocks.planks});
      this.addRecipe(new ItemStack(Blocks.trapdoor, 2), new Object[] {"###", "###", '#', Blocks.planks});
      this.addRecipe(new ItemStack(Items.iron_door, 1), new Object[] {"##", "##", "##", '#', Items.iron_ingot});
      this.addRecipe(new ItemStack(Items.sign, 3), new Object[] {"###", "###", " X ", '#', Blocks.planks, 'X', Items.stick});
      this.addRecipe(new ItemStack(Items.cake, 1), new Object[] {"AAA", "BEB", "CCC", 'A', Items.milk_bucket, 'B', Items.sugar, 'C', Items.wheat, 'E', Items.egg});
      this.addRecipe(new ItemStack(Items.sugar, 1), new Object[] {"#", '#', Items.reeds});
      this.addRecipe(new ItemStack(Blocks.planks, 4, 0), new Object[] {"#", '#', new ItemStack(Blocks.log, 1, 0)});
      this.addRecipe(new ItemStack(Blocks.planks, 4, 1), new Object[] {"#", '#', new ItemStack(Blocks.log, 1, 1)});
      this.addRecipe(new ItemStack(Blocks.planks, 4, 2), new Object[] {"#", '#', new ItemStack(Blocks.log, 1, 2)});
      this.addRecipe(new ItemStack(Blocks.planks, 4, 3), new Object[] {"#", '#', new ItemStack(Blocks.log, 1, 3)});
      this.addRecipe(new ItemStack(Blocks.planks, 4, 4), new Object[] {"#", '#', new ItemStack(Blocks.log2, 1, 0)});
      this.addRecipe(new ItemStack(Blocks.planks, 4, 5), new Object[] {"#", '#', new ItemStack(Blocks.log2, 1, 1)});
      this.addRecipe(new ItemStack(Items.stick, 4), new Object[] {"#", "#", '#', Blocks.planks});
      this.addRecipe(new ItemStack(Blocks.torch, 4), new Object[] {"X", "#", 'X', Items.coal, '#', Items.stick});
      this.addRecipe(new ItemStack(Blocks.torch, 4), new Object[] {"X", "#", 'X', new ItemStack(Items.coal, 1, 1), '#', Items.stick});
      this.addRecipe(new ItemStack(Items.bowl, 4), new Object[] {"# #", " # ", '#', Blocks.planks});
      this.addRecipe(new ItemStack(Items.glass_bottle, 3), new Object[] {"# #", " # ", '#', Blocks.glass});
      this.addRecipe(new ItemStack(Blocks.rail, 16), new Object[] {"X X", "X#X", "X X", 'X', Items.iron_ingot, '#', Items.stick});
      this.addRecipe(new ItemStack(Blocks.golden_rail, 6), new Object[] {"X X", "X#X", "XRX", 'X', Items.gold_ingot, 'R', Items.redstone, '#', Items.stick});
      this.addRecipe(new ItemStack(Blocks.activator_rail, 6), new Object[] {"XSX", "X#X", "XSX", 'X', Items.iron_ingot, '#', Blocks.redstone_torch, 'S', Items.stick});
      this.addRecipe(new ItemStack(Blocks.detector_rail, 6), new Object[] {"X X", "X#X", "XRX", 'X', Items.iron_ingot, 'R', Items.redstone, '#', Blocks.stone_pressure_plate});
      this.addRecipe(new ItemStack(Items.minecart, 1), new Object[] {"# #", "###", '#', Items.iron_ingot});
      this.addRecipe(new ItemStack(Items.cauldron, 1), new Object[] {"# #", "# #", "###", '#', Items.iron_ingot});
      this.addRecipe(new ItemStack(Items.brewing_stand, 1), new Object[] {" B ", "###", '#', Blocks.cobblestone, 'B', Items.blaze_rod});
      this.addRecipe(new ItemStack(Blocks.lit_pumpkin, 1), new Object[] {"A", "B", 'A', Blocks.pumpkin, 'B', Blocks.torch});
      this.addRecipe(new ItemStack(Items.chest_minecart, 1), new Object[] {"A", "B", 'A', Blocks.chest, 'B', Items.minecart});
      this.addRecipe(new ItemStack(Items.furnace_minecart, 1), new Object[] {"A", "B", 'A', Blocks.furnace, 'B', Items.minecart});
      this.addRecipe(new ItemStack(Items.tnt_minecart, 1), new Object[] {"A", "B", 'A', Blocks.tnt, 'B', Items.minecart});
      this.addRecipe(new ItemStack(Items.hopper_minecart, 1), new Object[] {"A", "B", 'A', Blocks.hopper, 'B', Items.minecart});
      this.addRecipe(new ItemStack(Items.boat, 1), new Object[] {"# #", "###", '#', Blocks.planks});
      this.addRecipe(new ItemStack(Items.bucket, 1), new Object[] {"# #", " # ", '#', Items.iron_ingot});
      this.addRecipe(new ItemStack(Items.flower_pot, 1), new Object[] {"# #", " # ", '#', Items.brick});
      this.addShapelessRecipe(new ItemStack(Items.flint_and_steel, 1), new Object[] {new ItemStack(Items.iron_ingot, 1), new ItemStack(Items.flint, 1)});
      this.addRecipe(new ItemStack(Items.bread, 1), new Object[] {"###", '#', Items.wheat});
      this.addRecipe(new ItemStack(Blocks.oak_stairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 0)});
      this.addRecipe(new ItemStack(Blocks.birch_stairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 2)});
      this.addRecipe(new ItemStack(Blocks.spruce_stairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 1)});
      this.addRecipe(new ItemStack(Blocks.jungle_stairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 3)});
      this.addRecipe(new ItemStack(Blocks.acacia_stairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 4)});
      this.addRecipe(new ItemStack(Blocks.dark_oak_stairs, 4), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 5)});
      this.addRecipe(new ItemStack(Items.fishing_rod, 1), new Object[] {"  #", " #X", "# X", '#', Items.stick, 'X', Items.string});
      this.addRecipe(new ItemStack(Items.carrot_on_a_stick, 1), new Object[] {"# ", " X", '#', Items.fishing_rod, 'X', Items.carrot}).func_92100_c();
      this.addRecipe(new ItemStack(Blocks.stone_stairs, 4), new Object[] {"#  ", "## ", "###", '#', Blocks.cobblestone});
      this.addRecipe(new ItemStack(Blocks.brick_stairs, 4), new Object[] {"#  ", "## ", "###", '#', Blocks.brick_block});
      this.addRecipe(new ItemStack(Blocks.stone_brick_stairs, 4), new Object[] {"#  ", "## ", "###", '#', Blocks.stonebrick});
      this.addRecipe(new ItemStack(Blocks.nether_brick_stairs, 4), new Object[] {"#  ", "## ", "###", '#', Blocks.nether_brick});
      this.addRecipe(new ItemStack(Blocks.sandstone_stairs, 4), new Object[] {"#  ", "## ", "###", '#', Blocks.sandstone});
      this.addRecipe(new ItemStack(Blocks.quartz_stairs, 4), new Object[] {"#  ", "## ", "###", '#', Blocks.quartz_block});
      this.addRecipe(new ItemStack(Items.painting, 1), new Object[] {"###", "#X#", "###", '#', Items.stick, 'X', Blocks.wool});
      this.addRecipe(new ItemStack(Items.item_frame, 1), new Object[] {"###", "#X#", "###", '#', Items.stick, 'X', Items.leather});
      this.addRecipe(new ItemStack(Items.golden_apple, 1, 0), new Object[] {"###", "#X#", "###", '#', Items.gold_ingot, 'X', Items.apple});
      this.addRecipe(new ItemStack(Items.golden_apple, 1, 1), new Object[] {"###", "#X#", "###", '#', Blocks.gold_block, 'X', Items.apple});
      this.addRecipe(new ItemStack(Items.golden_carrot, 1, 0), new Object[] {"###", "#X#", "###", '#', Items.gold_nugget, 'X', Items.carrot});
      this.addRecipe(new ItemStack(Items.speckled_melon, 1), new Object[] {"###", "#X#", "###", '#', Items.gold_nugget, 'X', Items.melon});
      this.addRecipe(new ItemStack(Blocks.lever, 1), new Object[] {"X", "#", '#', Blocks.cobblestone, 'X', Items.stick});
      this.addRecipe(new ItemStack(Blocks.tripwire_hook, 2), new Object[] {"I", "S", "#", '#', Blocks.planks, 'S', Items.stick, 'I', Items.iron_ingot});
      this.addRecipe(new ItemStack(Blocks.redstone_torch, 1), new Object[] {"X", "#", '#', Items.stick, 'X', Items.redstone});
      this.addRecipe(new ItemStack(Items.repeater, 1), new Object[] {"#X#", "III", '#', Blocks.redstone_torch, 'X', Items.redstone, 'I', Blocks.stone});
      this.addRecipe(new ItemStack(Items.comparator, 1), new Object[] {" # ", "#X#", "III", '#', Blocks.redstone_torch, 'X', Items.quartz, 'I', Blocks.stone});
      this.addRecipe(new ItemStack(Items.clock, 1), new Object[] {" # ", "#X#", " # ", '#', Items.gold_ingot, 'X', Items.redstone});
      this.addRecipe(new ItemStack(Items.compass, 1), new Object[] {" # ", "#X#", " # ", '#', Items.iron_ingot, 'X', Items.redstone});
      this.addRecipe(new ItemStack(Items.map, 1), new Object[] {"###", "#X#", "###", '#', Items.paper, 'X', Items.compass});
      this.addRecipe(new ItemStack(Blocks.stone_button, 1), new Object[] {"#", '#', Blocks.stone});
      this.addRecipe(new ItemStack(Blocks.wooden_button, 1), new Object[] {"#", '#', Blocks.planks});
      this.addRecipe(new ItemStack(Blocks.stone_pressure_plate, 1), new Object[] {"##", '#', Blocks.stone});
      this.addRecipe(new ItemStack(Blocks.wooden_pressure_plate, 1), new Object[] {"##", '#', Blocks.planks});
      this.addRecipe(new ItemStack(Blocks.heavy_weighted_pressure_plate, 1), new Object[] {"##", '#', Items.iron_ingot});
      this.addRecipe(new ItemStack(Blocks.light_weighted_pressure_plate, 1), new Object[] {"##", '#', Items.gold_ingot});
      this.addRecipe(new ItemStack(Blocks.dispenser, 1), new Object[] {"###", "#X#", "#R#", '#', Blocks.cobblestone, 'X', Items.bow, 'R', Items.redstone});
      this.addRecipe(new ItemStack(Blocks.dropper, 1), new Object[] {"###", "# #", "#R#", '#', Blocks.cobblestone, 'R', Items.redstone});
      this.addRecipe(new ItemStack(Blocks.piston, 1), new Object[] {"TTT", "#X#", "#R#", '#', Blocks.cobblestone, 'X', Items.iron_ingot, 'R', Items.redstone, 'T', Blocks.planks});
      this.addRecipe(new ItemStack(Blocks.sticky_piston, 1), new Object[] {"S", "P", 'S', Items.slime_ball, 'P', Blocks.piston});
      this.addRecipe(new ItemStack(Items.bed, 1), new Object[] {"###", "XXX", '#', Blocks.wool, 'X', Blocks.planks});
      this.addRecipe(new ItemStack(Blocks.enchanting_table, 1), new Object[] {" B ", "D#D", "###", '#', Blocks.obsidian, 'B', Items.book, 'D', Items.diamond});
      this.addRecipe(new ItemStack(Blocks.anvil, 1), new Object[] {"III", " i ", "iii", 'I', Blocks.iron_block, 'i', Items.iron_ingot});
      this.addShapelessRecipe(new ItemStack(Items.ender_eye, 1), new Object[] {Items.ender_pearl, Items.blaze_powder});
      this.addShapelessRecipe(new ItemStack(Items.fire_charge, 3), new Object[] {Items.gunpowder, Items.blaze_powder, Items.coal});
      this.addShapelessRecipe(new ItemStack(Items.fire_charge, 3), new Object[] {Items.gunpowder, Items.blaze_powder, new ItemStack(Items.coal, 1, 1)});
      this.addRecipe(new ItemStack(Blocks.daylight_detector), new Object[] {"GGG", "QQQ", "WWW", 'G', Blocks.glass, 'Q', Items.quartz, 'W', Blocks.wooden_slab});
      this.addRecipe(new ItemStack(Blocks.hopper), new Object[] {"I I", "ICI", " I ", 'I', Items.iron_ingot, 'C', Blocks.chest});
      Collections.sort(this.recipes, new ArcaneTableRecipeSorter(this));
    }

    public ArcaneTableShapedRecipes addRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
    {
        String s = "";
        int i = 0;
        int j = 0;
        int k = 0;

        if (par2ArrayOfObj[i] instanceof String[])
        {
            String[] astring = (String[])((String[])par2ArrayOfObj[i++]);

            for (int l = 0; l < astring.length; ++l)
            {
                String s1 = astring[l];
                ++k;
                j = s1.length();
                s = s + s1;
            }
        }
        else
        {
            while (par2ArrayOfObj[i] instanceof String)
            {
                String s2 = (String)par2ArrayOfObj[i++];
                ++k;
                j = s2.length();
                s = s + s2;
            }
        }

        HashMap hashmap;

        for (hashmap = new HashMap(); i < par2ArrayOfObj.length; i += 2)
        {
            Character character = (Character)par2ArrayOfObj[i];
            ItemStack itemstack1 = null;

            if (par2ArrayOfObj[i + 1] instanceof Item)
            {
                itemstack1 = new ItemStack((Item)par2ArrayOfObj[i + 1]);
            }
            else if (par2ArrayOfObj[i + 1] instanceof Block)
            {
                itemstack1 = new ItemStack((Block)par2ArrayOfObj[i + 1], 1, 32767);
            }
            else if (par2ArrayOfObj[i + 1] instanceof ItemStack)
            {
                itemstack1 = (ItemStack)par2ArrayOfObj[i + 1];
            }

            hashmap.put(character, itemstack1);
        }

        ItemStack[] aitemstack = new ItemStack[j * k];

        for (int i1 = 0; i1 < j * k; ++i1)
        {
            char c0 = s.charAt(i1);

            if (hashmap.containsKey(Character.valueOf(c0)))
            {
                aitemstack[i1] = ((ItemStack)hashmap.get(Character.valueOf(c0))).copy();
            }
            else
            {
                aitemstack[i1] = null;
            }
        }

        ArcaneTableShapedRecipes shapedrecipes = new ArcaneTableShapedRecipes(j, k, aitemstack, par1ItemStack);
        this.recipes.add(shapedrecipes);
        return shapedrecipes;
    }

    public void addShapelessRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
    {
        ArrayList arraylist = new ArrayList();
        Object[] aobject = par2ArrayOfObj;
        int i = par2ArrayOfObj.length;

        for (int j = 0; j < i; ++j)
        {
            Object object1 = aobject[j];

            if (object1 instanceof ItemStack)
            {
                arraylist.add(((ItemStack)object1).copy());
            }
            else if (object1 instanceof Item)
            {
                arraylist.add(new ItemStack((Item)object1));
            }
            else
            {
                if (!(object1 instanceof Block))
                {
                    throw new RuntimeException("Invalid shapeless recipe!");
                }

                arraylist.add(new ItemStack((Block)object1));
            }
        }

        this.recipes.add(new ShapelessRecipes(par1ItemStack, arraylist));
    }

    public ItemStack findMatchingRecipe(InventoryCrafting par1InventoryCrafting, World par2World)
    {
        int i = 0;
        ItemStack itemstack = null;
        ItemStack itemstack1 = null;
        int j;

        for (j = 0; j < par1InventoryCrafting.getSizeInventory(); ++j)
        {
            ItemStack itemstack2 = par1InventoryCrafting.getStackInSlot(j);

            if (itemstack2 != null)
            {
                if (i == 0)
                {
                    itemstack = itemstack2;
                }

                if (i == 1)
                {
                    itemstack1 = itemstack2;
                }

                ++i;
            }
        }

        if (i == 2 && itemstack.getItem() == itemstack1.getItem() && itemstack.stackSize == 1 && itemstack1.stackSize == 1 && itemstack.getItem().isRepairable())
        {
            Item item = itemstack.getItem();
            int j1 = item.getMaxDamage() - itemstack.getItemDamageForDisplay();
            int k = item.getMaxDamage() - itemstack1.getItemDamageForDisplay();
            int l = j1 + k + item.getMaxDamage() * 5 / 100;
            int i1 = item.getMaxDamage() - l;

            if (i1 < 0)
            {
                i1 = 0;
            }

            return new ItemStack(itemstack.getItem(), 1, i1);
        }
        else
        {
            for (j = 0; j < this.recipes.size(); ++j)
            {
                IRecipe irecipe = (IRecipe)this.recipes.get(j);

                if (irecipe.matches(par1InventoryCrafting, par2World))
                {
                    return irecipe.getCraftingResult(par1InventoryCrafting);
                }
            }

            return null;
        }
    }

    /**
     * returns the List<> of all recipes
     */
    public List getRecipeList()
    {
        return this.recipes;
    }
}