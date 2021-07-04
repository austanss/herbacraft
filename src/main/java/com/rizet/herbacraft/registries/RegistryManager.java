package com.rizet.herbacraft.registries;

public class RegistryManager {
    public static void registerAll() {
        ItemRegistry.register();
        BlockRegistry.register();
        EffectRegistry.register();
    }
}
