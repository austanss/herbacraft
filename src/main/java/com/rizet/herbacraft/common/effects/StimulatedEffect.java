package com.rizet.herbacraft.common.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;

public class StimulatedEffect extends StatusEffect {

    public StimulatedEffect() {
        super(StatusEffectType.BENEFICIAL, 0xFF1111);
        addAttributeModifier(EntityAttributes.GENERIC_ARMOR, "2d64c956-4f37-41d6-a24f-af255b786c7a", 0.75D, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
        addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, "353937ca-5f53-4bf7-bf36-c3f6ca90dbc5", 0.5D, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
        addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "cc93f2a3-8881-4824-a05e-6336a07e3a12", 0.35D, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
        addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED, "c02149bd-0d2f-4228-b94f-7686d6aa2f4d", 0.3D, EntityAttributeModifier.Operation.ADDITION);
        addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, "0570cd3c-aefa-4c7c-8416-e334be01ac20", 0.1D, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.heal(0.01f * amplifier);
    }
}
