package com.rizet.herbacraft.registries;

import com.rizet.herbacraft.Herbacraft;

import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
 
    public static final Item CANNABIS_SEEDS = new AliasedBlockItem(BlockRegistry.CANNABIS_PLANT, new Item.Settings().group(ItemGroup.MISC));
    public static final Item CANNABIS_FLOWER = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item FOSSILIZED_CANNABIS_SEEDS = new BlockItem(BlockRegistry.FOSSILIZED_CANNABIS_SEEDS, new Item.Settings().group(ItemGroup.DECORATIONS));

    public static void register() {
        Registry.register(Registry.ITEM, Herbacraft.newId("cannabis_seeds"), CANNABIS_SEEDS);
        Registry.register(Registry.ITEM, Herbacraft.newId("fossilized_cannabis_seeds"), FOSSILIZED_CANNABIS_SEEDS);
        Registry.register(Registry.ITEM, Herbacraft.newId("cannabis_flower"), CANNABIS_FLOWER);
    }

}
