package com.rizet.herbacraft;

import com.rizet.herbacraft.registries.RegistryManager;

import net.fabricmc.api.ModInitializer;

public class Herbacraft implements ModInitializer {

	public static final String MOD_ID = "herbacraft";

	@Override
	public void onInitialize() {
		RegistryManager.registerAll();
	}

}
