package com.rizet.herbacraft.registries;

import com.rizet.herbacraft.Herbacraft;
import com.rizet.herbacraft.common.blocks.CannabisPlant;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {
    
    public static final Block CANNABIS_PLANT = new CannabisPlant();
    public static final Block FOSSILIZED_CANNABIS_SEEDS = new Block(FabricBlockSettings.copy(Blocks.IRON_ORE));

    public static void register() {
        Registry.register(Registry.BLOCK, Herbacraft.newId("cannabis_plant"), CANNABIS_PLANT);
        Registry.register(Registry.BLOCK, Herbacraft.newId("fossilized_cannabis_seeds"), FOSSILIZED_CANNABIS_SEEDS);
    }

}
