package com.woody104.projectarcane.gui;

import com.woody104.projectarcane.util.Reference;
import org.lwjgl.opengl.GL11;

import com.woody104.projectarcane.core.Arcane;
import com.woody104.projectarcane.container.ContainerArcaneTable;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class GuiArcaneTable extends GuiContainer {
	
	private ResourceLocation texture = new ResourceLocation(Reference.MOD_ID + ":" + "textures/gui/NewArcaneTable.png");

	public GuiArcaneTable(InventoryPlayer invPlayer, World world, int x, int y, int z) {
		super(new ContainerArcaneTable(invPlayer, world, x, y, z));
		
		this.xSize = 176;
		this.ySize = 184;
	}
	
	public void onGuiClosed() {
		super.onGuiClosed();
	}
	
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		
		this.fontRendererObj.drawString(StatCollector.translateToLocal("Arcane Table"), 100, 5, 0x000000);
		
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		
		GL11.glColor4f(1F, 1F, 1F, 1F);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
	}

}
