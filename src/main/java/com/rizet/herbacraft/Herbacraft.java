package com.rizet.herbacraft;

import com.rizet.herbacraft.registries.BlockRegistry;
import com.rizet.herbacraft.registries.RegistryManager;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class Herbacraft implements ModInitializer, ClientModInitializer {

	public static final String MOD_ID = "herbacraft";

	@Override
	public void onInitialize() {
		RegistryManager.registerAll();
	}

	public static Identifier newId(String id) {
		return new Identifier(MOD_ID, id);
	}

	@Override
	public void onInitializeClient() {
		System.out.println("[Herbacraft]: SETTING RENDER LAYER MAP");
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.CANNABIS_PLANT, RenderLayer.getCutout());
	}

}
