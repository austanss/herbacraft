package com.rizet.herbacraft.core.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;

public class FoodManager {
    public static final Food MEDICATED_BREAD = new Food.Builder()
    .hunger(-10)
    .effect(() -> new EffectInstance(EffectManager.STIMULATING_HIGH.get(), 6000, 1), 0.9f)
    .saturation(10.5f)
    .setAlwaysEdible()
    .build();
}
