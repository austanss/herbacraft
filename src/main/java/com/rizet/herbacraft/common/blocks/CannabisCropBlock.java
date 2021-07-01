package com.rizet.herbacraft.common.blocks;
 
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropsBlock;
import net.minecraftforge.common.ToolType;

public class CannabisCropBlock extends CropsBlock {

	public static Properties PROPERTIES = AbstractBlock.Properties.from(Blocks.CARROTS)
			.harvestTool(ToolType.HOE)
			.harvestLevel(-1);
	
	public CannabisCropBlock() {
		super(PROPERTIES);
	}

	
}
