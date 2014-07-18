package com.woody104.projectarcane.block.worldgeneration;

import java.util.Random;

import com.woody104.projectarcane.core.Arcane;

import com.woody104.projectarcane.registry.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class ArcaneWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {	
		switch(world.provider.dimensionId) {
		case 0: 
			//GenerateSurface
			generateSurface(world, random, chunkX*16, chunkZ*16);
			
		case -1: 
			generateNether(world, random, chunkX*16, chunkZ*16);
		
		case 1: 
			generateSurface(world, random, chunkX*16, chunkZ*16);
		}
	}

	private void generateSurface(World world, Random random, int x, int z) {
		//this.addOreSpawn(Arcane.'', world, random, x=blockX, z=blockZ, maxX, maxZ, maxVein, chancetospawn, minY, maxY); 
		this.addOreSpawn(BlockRegistry.ArcaneGemOre, world, random, x, z, 16, 16, 4+random.nextInt(2), 1, 10, 18);
		this.addOreSpawn(BlockRegistry.DarkCrystalOre, world, random, x, z, 16, 16, 4+random.nextInt(3), 2, 28, 38);
		this.addOreSpawn(BlockRegistry.EmeraldNuggetOre, world,random, x, z, 16, 16, 4+random.nextInt(4), 2, 38, 100);
        this.addOreSpawn(BlockRegistry.VanadiumOre, world, random, x, z, 16, 16, 4+random.nextInt(3), 2, 38, 48);
        this.addOreSpawn(BlockRegistry.CobaltOre, world, random, x, z, 16, 16, 4+random.nextInt(3), 2, 28, 38);
        this.addOreSpawn(BlockRegistry.ManganeseOre, world, random, x, z, 16, 16, 4+random.nextInt(3), 2, 38, 48);
        this.addOreSpawn(BlockRegistry.NickelOre, world, random, x, z, 16, 16, 4+random.nextInt(3), 2, 18, 38);
	}

	

	private void generateNether(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private void generateEnd(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		
	}
	
private void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
	for(int i = 0; i < chanceToSpawn; i++) {
		int posX = blockXPos + random.nextInt(maxX);
		int posY = minY + random.nextInt(maxY - minY);
		int posZ = blockZPos + random.nextInt(maxZ);
		(new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
	}
	}
}
