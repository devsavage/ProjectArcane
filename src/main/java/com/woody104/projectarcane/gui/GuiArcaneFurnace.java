package com.woody104.projectarcane.gui;

import com.woody104.projectarcane.util.Reference;
import org.lwjgl.opengl.GL11;

import com.woody104.projectarcane.container.ContainerArcaneFurnace;
import com.woody104.projectarcane.tileentity.TileEntityArcaneFurnace;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiArcaneFurnace extends GuiContainer {
	
	public static final ResourceLocation bground = new ResourceLocation(Reference.MOD_ID + ":" +  "textures/gui/GuiArcaneFurnace.png");
	
	public TileEntityArcaneFurnace arcaneFurnace;

	public GuiArcaneFurnace(InventoryPlayer inventoryPlayer, TileEntityArcaneFurnace entity) {
		super(new ContainerArcaneFurnace(inventoryPlayer, entity));
		
		this.arcaneFurnace = entity;
		
		this.xSize = 176;
		this.ySize = 166;
	}
	
	public void drawGuiContainerForegroundLayer(int par1, int par2) {
		String name = "Arcane Furnace";
		
		this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 119, this.ySize - 96 + 2, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		GL11.glColor4f(1F, 1F, 1F, 1F);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(bground);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
		if(this.arcaneFurnace.isBurning()) {
			int k = this.arcaneFurnace.getBurnTimeRemainingScale(40);
			int j = 40 - k;
			drawTexturedModalRect(guiLeft + 29, guiTop + 65, 176, 0, 40 - j, 10);
		}
		
		int k = this.arcaneFurnace.getCookProgressScaled(24);
		drawTexturedModalRect(guiLeft + 79, guiTop + 34, 176, 10, k + 1, 16);
	}

}