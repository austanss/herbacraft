package com.rizet.herbacraft.core.init;

import com.rizet.herbacraft.Herbacraft;
import com.rizet.herbacraft.common.items.CannabisFlowerItem;
import com.rizet.herbacraft.common.items.CannabisSeedsItem;
import com.rizet.herbacraft.common.items.MedicatedBreadFoodItem;

import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemManager {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Herbacraft.MOD_ID);
	
	public static final RegistryObject<BlockNamedItem> CANNABIS_SEEDS = ITEMS.register("cannabis_seeds", () -> new CannabisSeedsItem());
	
	public static final RegistryObject<Item> CANNABIS_FLOWER = ITEMS.register("cannabis_flower", () -> new CannabisFlowerItem());

	public static final RegistryObject<Item> DRIED_CANNABIS_FLOWER = ITEMS.register("dried_cannabis_flower", () -> new CannabisFlowerItem());

	public static final RegistryObject<Item> CANNABIS_DOUGH = ITEMS.register("cannabis_dough", () -> new Item(new Item.Properties().group(ItemGroup.FOOD)));

	public static final RegistryObject<Item> MEDICATED_BREAD = ITEMS.register("medicated_bread", () -> new MedicatedBreadFoodItem());

	public static final RegistryObject<BlockItem> FOSSILIZED_CANNABIS_SEEDS = ITEMS.register("fossilized_cannabis_seeds", 
		() -> new BlockItem(BlockManager.FOSSILIZED_CANNABIS_SEEDS.get(), 
		new Item.Properties().group(ItemGroup.DECORATIONS)));
}
