package com.rizet.herbacraft.common.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;

public class CannabisPlant extends CropBlock {
    public CannabisPlant() {
        super(FabricBlockSettings.copy(Blocks.CARROTS).nonOpaque());
    }
}
