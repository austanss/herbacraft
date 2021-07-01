package com.rizet.herbacraft.core.init;

import com.rizet.herbacraft.Herbacraft;
import com.rizet.herbacraft.common.effects.StimulatingHighEffect;

import net.minecraft.potion.Effect;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EffectManager {

	public static final DeferredRegister<Effect> EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, Herbacraft.MOD_ID);

    public static final RegistryObject<Effect> STIMULATING_HIGH = EFFECTS.register("stimulating_high", () -> new StimulatingHighEffect());
}
