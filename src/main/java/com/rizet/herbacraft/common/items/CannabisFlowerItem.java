package com.rizet.herbacraft.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CannabisFlowerItem extends Item {
	public static Properties PROPERTIES = new Item.Properties().group(ItemGroup.MISC);

    public CannabisFlowerItem() {
        super(PROPERTIES);
    }
}
