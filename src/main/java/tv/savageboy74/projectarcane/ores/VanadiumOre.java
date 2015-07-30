package tv.savageboy74.projectarcane.ores;

import tv.savageboy74.projectarcane.blocks.Ore;
import net.minecraft.block.material.Material;

public class VanadiumOre extends Ore
{

    public VanadiumOre(Material rock) {

        super(Material.rock);
        this.setHarvestLevel("pickaxe", 2);
    }
}

