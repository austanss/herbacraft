package com.rizet.herbacraft.registries;

import com.rizet.herbacraft.Herbacraft;

import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
 
    public static final Item CANNABIS_SEEDS = new AliasedBlockItem(BlockRegistry.CANNABIS_PLANT, new Item.Settings().group(ItemGroup.MISC));

    public static void register() {
        Registry.register(Registry.ITEM, Herbacraft.newId("cannabis_seeds"), CANNABIS_SEEDS);
    }

}
