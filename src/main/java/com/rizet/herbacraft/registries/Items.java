package com.rizet.herbacraft.registries;

import com.rizet.herbacraft.Herbacraft;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {
 
    public static final Item CANNABIS_SEEDS = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(Herbacraft.MOD_ID, "cannabis_seeds"), CANNABIS_SEEDS);
    }
    
}
