package tv.savageboy74.projectarcane.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialRegistry
{
    public static final class Tools
    {
        public static Item.ToolMaterial darkCrystal = EnumHelper.addToolMaterial("Dark Crystal", 3, 1000, 6.0F, 7, 20);
        public static Item.ToolMaterial arcane = EnumHelper.addToolMaterial("Arcane", 5, 2000, 8.0F, 9, 22);
        public static Item.ToolMaterial dirt = EnumHelper.addToolMaterial("Dirt", 0, 25, 1.0F, 0.0F, 0);
        public static Item.ToolMaterial cobalt = EnumHelper.addToolMaterial("Cobalt", 3, 1561, 8.0F, 3.0F, 10);
        //thuderfury material
        public static Item.ToolMaterial agem = EnumHelper.addToolMaterial("AGem", 11, 1000, 16.0F, 16, 22);

    }

    public static final class Armor
    {
//        public static ItemArmor.ArmorMaterial arcaneArmor = EnumHelper.addArmorMaterial("arcaneArmor", 66, new int[]{6, 16, 12, 6}, 10);
//        public static ItemArmor.ArmorMaterial darkcrystalArmor = EnumHelper.addArmorMaterial("darkCrystalArmor", 55, new int[]{3, 8, 6, 3}, 10);
//        public static ItemArmor.ArmorMaterial boneArmor = EnumHelper.addArmorMaterial("boneArmor", 44, new int[]{2, 7, 5, 2}, 10);
    }
}
