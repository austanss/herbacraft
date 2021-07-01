package com.rizet.herbacraft.world;

import com.rizet.herbacraft.core.init.BlockManager;

import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class FossilGenerator {
    
    public static void generateFossils(final BiomeLoadingEvent ctx) {
        if (!ctx.getCategory().equals(Category.PLAINS))
            return;

        ctx.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
            .withConfiguration(new OreFeatureConfig(FillerBlockType.BASE_STONE_OVERWORLD, BlockManager.FOSSILIZED_CANNABIS_SEEDS.get().getDefaultState(), 4))
            .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(50, 0, 80)))
            .square()
            .count(2));
    }
}
