package tv.savageboy74.projectarcane.blocks;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import tv.savageboy74.projectarcane.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Ore extends Block {

    public Ore(Material material) {
        super(material);

        this.setHardness(3.0f);
        this.setResistance(200.0F);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
    }

//   @SideOnly(Side.CLIENT)
//    public void registerBlockIcons(IIconRegister iconRegister) {
//       this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
//   }
}
