package com.woody104.projectarcane.registry;

import com.woody104.projectarcane.tileentity.TileEntityArcaneChest;
import com.woody104.projectarcane.tileentity.TileEntityArcaneFurnace;
import com.woody104.projectarcane.tileentity.TileEntityDualFurnace;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class RecipeRegistry
{
    public static void init()
    {
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.itemArcaneGem), " Y ", "XZX", " Y ", 'X', Items.diamond, 'Y', Items.emerald, 'Z', (new ItemStack(Items.dye, 1, 14)));
        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.blockArcaneGem), "XXX", "XXX", "XXX", 'X', ItemRegistry.itemArcaneGem);
        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.blockMachineCore), "XXX", "X X", "XXX", 'X', ItemRegistry.itemArcaneMetal);
        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.blockArcaneFurnaceIdle), "XXX", "XMX", "XXX", 'X', ItemRegistry.ArcanePlate, 'M', BlockRegistry.blockMachineCore);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.itemChainIngot), "LLL", "LLL", "   ", 'L', ItemRegistry.itemChainLink);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.itemChainIngot), "   ", "LLL", "LLL", 'L', ItemRegistry.itemChainLink);
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.double_plant, 1, 0), " X ", "XXX", " X ", 'X', Blocks.yellow_flower);
        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.itemChainLink, 1), ItemRegistry.itemArcaneMetal, new ItemStack(ItemRegistry.toolArcaneChisel, 1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.itemArcaneGem, 9), new ItemStack(BlockRegistry.blockArcaneGem));
        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.itemArcaneMetal, 1), Blocks.stone, Items.iron_ingot, new ItemStack(ItemRegistry.toolArcaneHammer, 1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.foodSunflowerSeeds, 4), Items.wheat_seeds, new ItemStack(Blocks.double_plant, 1, 0));
        GameRegistry.addRecipe(new ItemStack(Items.string, 4), new Object[]{"IH", 'I', Blocks.wool, 'H', new ItemStack(ItemRegistry.itemCutter, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addRecipe(new ItemStack(ItemRegistry.itemArcaneMetalPlate), new Object[]{"IH", 'I', ItemRegistry.itemArcaneMetal, 'H', new ItemStack(ItemRegistry.toolArcaneHammer, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addRecipe(new ItemStack(ItemRegistry.emeraldNugget, 9), new Object[]{"CB", 'B', Blocks.emerald_block, 'C', new ItemStack(ItemRegistry.toolArcaneChisel, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addRecipe(new ItemStack(ItemRegistry.ArcanePlate, 1), new Object[]{"CB", 'B', ItemRegistry.itemArcaneGem, 'C', new ItemStack(ItemRegistry.toolArcaneHammer, 1, OreDictionary.WILDCARD_VALUE)});
        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.itemWoodChips, 4), Blocks.planks, new ItemStack(ItemRegistry.toolSaw, 1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.arcaneAxe), " XX", " YX", " Y ", 'X', ItemRegistry.itemArcaneGem, 'Y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.arcaneAxe), "XX ", "XY ", " Y ", 'X', ItemRegistry.itemArcaneGem, 'Y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.arcaneSword), " X ", " X ", " Y ", 'X', ItemRegistry.itemArcaneGem, 'Y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.arcanePickaxe), "XXX", " Y ", " Y ", 'X', ItemRegistry.itemArcaneGem, 'Y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.arcaneSpade), " X ", " Y ", " Y ", 'X', ItemRegistry.itemArcaneGem, 'Y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.arcaneHoe), " XX", " Y ", " Y ", 'X', ItemRegistry.itemArcaneGem, 'Y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.arcaneHoe), "XX ", " Y ", " Y ", 'X', ItemRegistry.itemArcaneGem, 'Y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.ToolDarkCrystalAxe), " XX", " YX", " Y ", 'X', ItemRegistry.itemDarkCrystal, 'Y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.ToolDarkCrystalAxe), "XX ", "XY ", " Y ", 'X', ItemRegistry.itemDarkCrystal, 'Y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.ToolDarkCrystalSword), " X ", " X ", " Y ", 'X', ItemRegistry.itemDarkCrystal, 'Y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.ToolDarkCrystalPickaxe), "XXX", " Y ", " Y ", 'X', ItemRegistry.itemDarkCrystal, 'Y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.ToolDarkCrystalSpade), " X ", " Y ", " Y ", 'X', ItemRegistry.itemDarkCrystal, 'Y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.ToolDarkCrystalHoe), " XX", " Y ", " Y ", 'X', ItemRegistry.itemDarkCrystal, 'Y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.ToolDarkCrystalHoe), "XX ", " Y ", " Y ", 'X', ItemRegistry.itemDarkCrystal, 'Y', Items.stick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.DirtAxe), " XX", " YX", " Y ", 'X', Blocks.dirt, 'Y', ItemRegistry.DirtStick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.DirtAxe), "XX ", "XY ", " Y ", 'X', Blocks.dirt, 'Y', ItemRegistry.DirtStick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.DirtSword), " X ", " X ", " Y ", 'X', Blocks.dirt, 'Y', ItemRegistry.DirtStick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.DirtPickaxe), "XXX", " Y ", " Y ", 'X', Blocks.dirt, 'Y', ItemRegistry.DirtStick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.DirtSpade), " X ", " Y ", " Y ", 'X', Blocks.dirt, 'Y', ItemRegistry.DirtStick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.DirtHoe), " XX", " Y ", " Y ", 'X', Blocks.dirt, 'Y', ItemRegistry.DirtStick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.DirtHoe), "XX ", " Y ", " Y ", 'X', Blocks.dirt, 'Y', ItemRegistry.DirtStick);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.itemThunderfury), " XX", "ZYX", "ZZ ", 'X',(new ItemStack(Items.dye, 1, 4)), 'Y', Items.emerald, 'Z', ItemRegistry.itemArcaneGem);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.arcaneHelmet), "XXX", "X X", "   ", 'X', ItemRegistry.itemArcaneGem);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.arcaneChestplate), "X X", "XXX", "XXX", 'X', ItemRegistry.itemArcaneGem);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.arcaneLeggings), "XXX", "X X", "X X", 'X', ItemRegistry.itemArcaneGem);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.arcaneBoots), "   ", "X X", "X X", 'X', ItemRegistry.itemArcaneGem);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.BoneHelmet), "XXX", "X X", "   ", 'X', Items.bone);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.BoneChestplate), "X X", "XXX", "XXX", 'X', Items.bone);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.BoneLeggings), "XXX", "X X", "X X", 'X', Items.bone);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.BoneBoots), "   ", "X X", "X X", 'X', Items.bone);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.DarkCrystalHelmet), "XXX", "X X", "   ", 'X', ItemRegistry.itemDarkCrystal);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.DarkCrystalChestplate), "X X", "XXX", "XXX", 'X', ItemRegistry.itemDarkCrystal);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.DarkCrystalLeggings), "XXX", "X X", "X X", 'X', ItemRegistry.itemDarkCrystal);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.DarkCrystalBoots), "   ", "X X", "X X", 'X', ItemRegistry.itemDarkCrystal);
        GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_helmet), "XXX", "X X", "   ", 'X', ItemRegistry.itemChainIngot);
        GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_chestplate), "X X", "XXX", "XXX", 'X', ItemRegistry.itemChainIngot);
        GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_leggings), "XXX", "X X", "X X", 'X', ItemRegistry.itemChainIngot);
        GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_boots), "   ", "X X", "X X", 'X', ItemRegistry.itemChainIngot);
        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.arcaneChest), "XXX", "X X", "XXX", 'X', ItemRegistry.itemArcaneGem);
        GameRegistry.addRecipe(new ItemStack(ItemRegistry.toolArcaneHammer), new Object[]{"XXX", "XSX", " S ", 'X', ItemRegistry.itemArcaneGem, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(ItemRegistry.toolArcaneChisel), new Object[]{"  X", "GX ", "GG ", 'X', ItemRegistry.itemArcaneRod, 'G', ItemRegistry.itemArcaneGem});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 4), new ItemStack(ItemRegistry.itemCutter), new ItemStack(Blocks.wool));
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.itemMetalBender), "XXX", "YYY", "XXX", 'X', ItemRegistry.itemArcaneMetalPlate, 'Y', ItemRegistry.itemArcaneGem);
        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.itemHandle, 1), new ItemStack(ItemRegistry.itemMetalBender), new ItemStack(ItemRegistry.itemArcaneMetalPlate));
        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.itemCutter, 1), new ItemStack(ItemRegistry.itemHandle), new ItemStack(ItemRegistry.itemBlades));
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.itemEnhancedArcaneMetal), " XX", " XX", "   ", 'X', ItemRegistry.itemArcaneMetalPlate);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.itemEnhancedArcaneMetal), "XX ", "XX ", "   ", 'X', ItemRegistry.itemArcaneMetalPlate);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.itemEnhancedArcaneMetal), " XX", " XX", "   ", 'X', ItemRegistry.itemArcaneMetalPlate);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.itemEnhancedArcaneMetal), "   ", "XX ", "XX ", 'X', ItemRegistry.itemArcaneMetalPlate);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.DirtStick), "   ", " X ", " X ", 'X', Blocks.dirt);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.DirtStick), " X ", " X ", "   ", 'X', Blocks.dirt);
        GameRegistry.addShapedRecipe(new ItemStack(Items.emerald), "XXX", "XXX", "XXX", 'X', ItemRegistry.emeraldNugget);
        GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.foodGreenApple), "XXX", "XYX", "XXX", 'X', ItemRegistry.emeraldNugget, 'Y', Items.apple);
        GameRegistry.addRecipe(new ItemStack(ItemRegistry.itemCoalChunk), new Object[]{"XX ", "XX ",'X', Items.coal});
        GameRegistry.addRecipe(new ItemStack(ItemRegistry.itemCoalChunk), new Object[]{" XX", " XX",'X', Items.coal});
        GameRegistry.addRecipe(new ItemStack(ItemRegistry.itemCoalChunk), new Object[]{"XX ", "XX", 'X', Items.coal});
        GameRegistry.addRecipe(new ItemStack(ItemRegistry.itemCoalChunk), new Object[]{" XX", " XX", 'X', Items.coal});
        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.itemCoalChunk), Blocks.coal_block, new ItemStack(ItemRegistry.toolArcaneChisel, 1, OreDictionary.WILDCARD_VALUE));
        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.cropCantalope), "XXX", "XXX", "XXX", 'X', ItemRegistry.cropCantalopeSlices);
        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.cropStrawberrySeeds), new ItemStack(ItemRegistry.cropStrawberry));
        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.cropCantalopeSeeds), new ItemStack(BlockRegistry.cropCantalope));




    }
}
