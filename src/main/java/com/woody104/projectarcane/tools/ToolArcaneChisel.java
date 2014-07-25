package com.woody104.projectarcane.tools;

import com.woody104.projectarcane.registry.CreativeTabRegistry;
import com.woody104.projectarcane.util.Reference;
import net.minecraft.item.Item;

/**
 * Created by woody104 on 5/17/2014.
 */
public class ToolArcaneChisel extends Item {

    public ToolArcaneChisel() {
        super();
        this.setNoRepair();
        this.maxStackSize = 1;
        this.setMaxDamage(100);
        this.setUnlocalizedName("toolAC");
        this.setTextureName(Reference.MOD_ID + ":" + "toolArcaneChisel" );
        this.setCreativeTab(CreativeTabRegistry.arcaneTab);
    }

}
