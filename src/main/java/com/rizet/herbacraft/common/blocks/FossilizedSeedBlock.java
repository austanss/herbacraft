package com.rizet.herbacraft.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class FossilizedSeedBlock extends Block {
    public static Properties PROPERTIES = Block.Properties.copy(Blocks.IRON_ORE);

    public FossilizedSeedBlock() {
        super(PROPERTIES);
    }
    
}
