package tv.savageboy74.projectarcane.blocks;

import java.util.Random;

import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import tv.savageboy74.projectarcane.registry.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ArcaneGemOre extends Block {

	public ArcaneGemOre(Material rock) {
		super(Material.rock);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
		this.setHardness(5F);
		this.setResistance(5F);
		this.setLightLevel(0.0F);
		this.setHarvestLevel("pickaxe", 3);

	}

    @Override
    public int quantityDropped(Random random)
    {
        return 1 + random.nextInt(3);
    }

//	@Override
//	public Item getItemDropped(int par1, Random par2Random, int par3) {
//		return ItemRegistry.itemArcaneGem;
//    }
}