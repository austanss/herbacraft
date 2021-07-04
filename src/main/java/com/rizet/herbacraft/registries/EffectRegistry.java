package com.rizet.herbacraft.registries;

import com.rizet.herbacraft.Herbacraft;
import com.rizet.herbacraft.common.effects.StimulatedEffect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.registry.Registry;

public class EffectRegistry {

    public static final StatusEffect STIMULATED = new StimulatedEffect();
    
    public static void register() {
        Registry.register(Registry.STATUS_EFFECT, Herbacraft.newId("stimulated"), STIMULATED);
    }
}
