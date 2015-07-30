package tv.savageboy74.projectarcane.blocks;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import tv.savageboy74.projectarcane.registry.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockSandBlock extends Block {

    public BlockSandBlock () {
        super(Material.sand);
        this.setResistance(0.5F);
        this.setHardness(0.5F);
        this.setLightLevel(Blocks.sand.getLightValue());
        //this.setBlockName("blockSandBlock");
        this.setStepSound(soundTypeSand);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
        //this.setBlockTextureName("sand");

    }

    @Override
    public int quantityDropped(Random random)
    {
        return 1 + random.nextInt(3);
    }

//    @Override
//    public Item getItemDropped(int par1, Random par2Random, int par3) {
//        return ItemRegistry.itemSandDust;
//    }

}