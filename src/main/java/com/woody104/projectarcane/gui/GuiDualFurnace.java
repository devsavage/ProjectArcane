package com.woody104.projectarcane.gui;

import com.woody104.projectarcane.core.Arcane;
import com.woody104.projectarcane.tileentity.TileEntityDualFurnace;
import com.woody104.projectarcane.container.ContainerDualFurnace;
import com.woody104.projectarcane.util.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiDualFurnace extends GuiContainer {

    private ResourceLocation texture = new ResourceLocation(Reference.MOD_ID + ":" + "/textures/gui/GuiDualFurnace.png");
    private TileEntityDualFurnace dualFurnace;

    public GuiDualFurnace(InventoryPlayer inventoryPlayer, TileEntityDualFurnace tileEntityDualFurnace) {
        super(new ContainerDualFurnace(inventoryPlayer, tileEntityDualFurnace));
        dualFurnace = tileEntityDualFurnace;

        this.xSize = 176;
        this.ySize = 166;
    }

    protected void drawGuiContainerForegroundLayer(int i, int j) {
        String name = "Dual Furnace";

        this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 4, 4210752);
        this.fontRendererObj.drawString(I18n.format("container.inventory"), 119, this.ySize - 97 + 5, 4210752);

    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

        if (dualFurnace.hasPower()) {
            int k = dualFurnace.getPowerRemainingScaled(45);
            int j = 40 - k;
            drawTexturedModalRect(guiLeft + 29, guiTop + 65, 176, 0, 40 - j, 10);
        }

        //progress

    }
}
