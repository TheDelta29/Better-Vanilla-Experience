package delta.bettervanillaexperience.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 200), 0.15f).build();

    public static final FoodComponent SODA = new FoodComponent.Builder().nutrition(2).saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200), 1.0f).build();
}
