package tv.savageboy74.projectarcane.blocks;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import tv.savageboy74.projectarcane.Arcane;

import tv.savageboy74.projectarcane.registry.BlockRegistry;
import tv.savageboy74.projectarcane.registry.CreativeTabRegistry;
import tv.savageboy74.projectarcane.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ArcaneTable extends Block {

	public ArcaneTable() {
		super(Material.wood);
		
		
		this.setHardness(3.5F);
		this.setResistance(5.0F);
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);	}
	
//	@SideOnly(Side.CLIENT)
//	public IIcon getIcon (int side, int metadata) {
//		return side == 1 ? this.arcaneTableTop : this.blockIcon;
//	}
	
//	@SideOnly(Side.CLIENT)
//	public void registerBlockIcons (IIconRegister iconRegister) {
//		this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + "ArcaneTableSide");
//		this.arcaneTableTop = iconRegister.registerIcon(Reference.MOD_ID + ":" + "ArcaneTableTop");
//	}
	
	public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int q, float a, float b, float c) {
		if (!player.isSneaking()) {
			//player.openGui(Arcane.instance, BlockRegistry.guiIDArcaneTable, world, x, y, z);
			return true;
		}else{
			return false;
		}
	}

}
