package tv.savageboy74.projectarcane.blocks;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import tv.savageboy74.projectarcane.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class BlockMachineCore extends Block {

    public BlockMachineCore() {
        super(Material.anvil);
        this.setHardness(5.0F);
        this.setResistance(4.0F);
        this.setLightLevel(0.5F);
        this.setHarvestLevel("arcanePickaxe", 4);
//        this.setBlockName("blockMC");
//        this.setBlockTextureName(Reference.MOD_ID + ":" + "blockMachineCore");
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);    }
}
