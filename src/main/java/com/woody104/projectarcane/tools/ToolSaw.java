package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.core.Arcane;
import net.minecraft.item.Item;

/**
 * Created by woody104 on 5/19/2014.
 */

public class ToolSaw extends Item {

    public ToolSaw() {
        this.setNoRepair();
        this.setMaxStackSize(1);
        this.setMaxDamage(150);
        this.setUnlocalizedName("toolSaw");
        this.setTextureName(Arcane.MODID + ":" + "itemSaw" );
        this.setCreativeTab(Arcane.arcaneTab);
    }
}
