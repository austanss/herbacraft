package com.rizet.herbacraft.common.items;

import com.rizet.herbacraft.core.init.BlockManager;

import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CannabisSeedsItem extends BlockNamedItem {

	public static Properties PROPERTIES = new Item.Properties().group(ItemGroup.MISC);
	
	public CannabisSeedsItem() {
		super(BlockManager.CANNABIS_CROP.get(), PROPERTIES);
	}
}
