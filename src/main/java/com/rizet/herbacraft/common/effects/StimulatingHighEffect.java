package com.rizet.herbacraft.common.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

public class StimulatingHighEffect extends Effect {

    public StimulatingHighEffect() {
        super(EffectType.BENEFICIAL, 0xFF1111);
        addAttributeModifier(Attributes.ARMOR, "2d64c956-4f37-41d6-a24f-af255b786c7a", 0.75D, AttributeModifier.Operation.MULTIPLY_TOTAL);
        addAttributeModifier(Attributes.ATTACK_DAMAGE, "353937ca-5f53-4bf7-bf36-c3f6ca90dbc5", 0.5D, AttributeModifier.Operation.MULTIPLY_TOTAL);
        addAttributeModifier(Attributes.MOVEMENT_SPEED, "cc93f2a3-8881-4824-a05e-6336a07e3a12", 0.35D, AttributeModifier.Operation.MULTIPLY_TOTAL);
        addAttributeModifier(Attributes.ATTACK_SPEED, "c02149bd-0d2f-4228-b94f-7686d6aa2f4d", 0.3D, AttributeModifier.Operation.ADDITION);
        addAttributeModifier(Attributes.MAX_HEALTH, "0570cd3c-aefa-4c7c-8416-e334be01ac20", 0.1D, AttributeModifier.Operation.MULTIPLY_TOTAL);
    }
    
    @Override
    public void applyEffectTick(LivingEntity entity, int strength) {
    }

    
}
