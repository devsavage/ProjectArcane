package tv.savageboy74.projectarcane.handler;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

import java.util.Iterator;
import java.util.List;

/**
 * Created by woody104 on 5/18/2014.
 */

public class RecipeRemover {

    public static void removeCraftingRecipe() {
        List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();

        Iterator<IRecipe> remover = recipes.iterator();

        while (remover.hasNext()) {
            ItemStack itemstack = remover.next().getRecipeOutput();
            if (itemstack != null && itemstack.getItem() == Items.chainmail_helmet) {
                remover.remove();
            } else if (itemstack != null && itemstack.getItem() == Items.chainmail_chestplate) {
                remover.remove();
        }else if (itemstack != null && itemstack.getItem() == Items.chainmail_leggings) {
                remover.remove();
            }else if (itemstack != null && itemstack.getItem() == Items.chainmail_boots) {
                remover.remove();
            }
        }
    }
}
