package dev.shadowsoffire.apothic_attributes.mob_effect;

import dev.shadowsoffire.apothic_attributes.ApothicAttributes;
import dev.shadowsoffire.apothic_attributes.api.ALObjects;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation;

public class VitalityEffect extends MobEffect {

    public VitalityEffect() {
        super(MobEffectCategory.BENEFICIAL, TextColor.RED.getValue());
        this.addAttributeModifier(ALObjects.Attributes.HEALING_RECEIVED, ApothicAttributes.loc("bursting_vitality"), 0.2, Operation.ADD_VALUE);
    }

}
