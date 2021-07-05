package com.rizet.herbacraft.registries;

import com.rizet.herbacraft.Herbacraft;

import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
 
    public static final Item CANNABIS_SEEDS = new AliasedBlockItem(BlockRegistry.CANNABIS_PLANT, new Item.Settings().group(ItemGroup.MISC));
    public static final Item CANNABIS_FLOWER = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item DRIED_CANNABIS = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item CANNABIS_DOUGH = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item CANNABIS_BREAD = new Item(new Item.Settings().group(ItemGroup.FOOD).food(FoodRegistry.CANNABIS_INFUSED));

    public static void register() {
        Registry.register(Registry.ITEM, Herbacraft.newId("cannabis_seeds"), CANNABIS_SEEDS);
        Registry.register(Registry.ITEM, Herbacraft.newId("cannabis_flower"), CANNABIS_FLOWER);
        Registry.register(Registry.ITEM, Herbacraft.newId("dried_cannabis"), DRIED_CANNABIS);
        Registry.register(Registry.ITEM, Herbacraft.newId("cannabis_dough"), CANNABIS_DOUGH);
        Registry.register(Registry.ITEM, Herbacraft.newId("cannabis_bread"), CANNABIS_BREAD);
    }

}
