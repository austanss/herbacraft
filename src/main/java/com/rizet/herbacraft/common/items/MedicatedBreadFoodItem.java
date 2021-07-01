package com.rizet.herbacraft.common.items;

import com.rizet.herbacraft.core.init.FoodManager;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class MedicatedBreadFoodItem extends Item {

    public static Properties PROPERTIES = new Item.Properties().food(FoodManager.MEDICATED_BREAD).group(ItemGroup.FOOD);

    public MedicatedBreadFoodItem() {
        super(PROPERTIES);
    }
}
