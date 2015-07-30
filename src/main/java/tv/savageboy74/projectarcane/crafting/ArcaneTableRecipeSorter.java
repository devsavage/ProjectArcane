package tv.savageboy74.projectarcane.crafting;

import java.util.Comparator;

import net.minecraft.item.crafting.IRecipe;

public class ArcaneTableRecipeSorter implements Comparator {
	
	final ArcaneTableCraftingManager arcaneTable;
	
	public ArcaneTableRecipeSorter(ArcaneTableCraftingManager arcaneTableCraftingManager) {
		this.arcaneTable = arcaneTableCraftingManager;
	}
	
	public int compareRecipes(IRecipe irecipe1, IRecipe irecipe2) {
		return irecipe1 instanceof ArcaneTableShapelessRecipes && irecipe2 instanceof ArcaneTableShapedRecipes ? 1: (irecipe2 instanceof ArcaneTableShapelessRecipes && irecipe1 instanceof ArcaneTableShapedRecipes ? -1 : (irecipe2.getRecipeSize() < irecipe1.getRecipeSize() ? -1 : (irecipe2.getRecipeSize() > irecipe1.getRecipeSize() ? 1 : 0)));
	}

	@Override
	public int compare(Object o1, Object o2) {
		return this.compareRecipes((IRecipe)o1, (IRecipe)o2);
	}

}
