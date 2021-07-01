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

        ctx.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
            .configured(new OreFeatureConfig(FillerBlockType.NATURAL_STONE, BlockManager.FOSSILIZED_CANNABIS_SEEDS.get().defaultBlockState(), 4))
            .decorated(Placement.RANGE.configured(new TopSolidRangeConfig(50, 0, 80)))
            .squared()
            .count(2));
    }
}
