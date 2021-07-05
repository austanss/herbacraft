package com.rizet.herbacraft.registries;

import com.rizet.herbacraft.Herbacraft;
import com.rizet.herbacraft.common.blocks.CannabisPlant;

import net.minecraft.block.Block;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {
    
    public static final Block CANNABIS_PLANT = new CannabisPlant();

    public static void register() {
        Registry.register(Registry.BLOCK, Herbacraft.newId("cannabis_plant"), CANNABIS_PLANT);
    }

}
