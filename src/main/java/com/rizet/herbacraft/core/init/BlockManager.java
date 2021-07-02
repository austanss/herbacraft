package com.rizet.herbacraft.core.init;

import com.rizet.herbacraft.Herbacraft;
import com.rizet.herbacraft.common.blocks.CannabisCropBlock;
import com.rizet.herbacraft.common.blocks.FossilizedSeedBlock;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockManager {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Herbacraft.MOD_ID);
	
	public static final RegistryObject<Block> CANNABIS_CROP = 
			BLOCKS.register("cannabis_crop", () -> new CannabisCropBlock());
	
	public static final RegistryObject<Block> FOSSILIZED_CANNABIS_SEEDS = 
			BLOCKS.register("fossilized_cannabis_seeds", () -> new FossilizedSeedBlock());
}
