package net.blade.varietyenhancedmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent GLOW_SHROOM = new FoodComponent.Builder().nutrition(4).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 600), 1.0f).build();
    public static final FoodComponent GLOOM_SHROOM = new FoodComponent.Builder().nutrition(2).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 600), 1.0f).build();

}
