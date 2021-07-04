package com.rizet.herbacraft.registries;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;

public class FoodRegistry {

    public static final FoodComponent CANNABIS_INFUSED = new FoodComponent.Builder()
        .alwaysEdible()
        .snack()
        .meat()
        .hunger(-10)
        .statusEffect(new StatusEffectInstance(EffectRegistry.STIMULATED, 6000), 0.9f)
        .build();

}
