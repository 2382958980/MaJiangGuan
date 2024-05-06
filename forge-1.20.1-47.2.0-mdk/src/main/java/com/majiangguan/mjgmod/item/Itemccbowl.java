package com.majiangguan.mjgmod.item;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.level.Level;

public class Itemccbowl extends Item {
    public Itemccbowl()
    {
        super(new Properties()
                .food(new FoodProperties.Builder().nutrition(8).saturationMod(0.6f).build())
                .stacksTo(1));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack p_41409_, Level p_41410_, LivingEntity p_41411_) {

        super.finishUsingItem(p_41409_, p_41410_, p_41411_);
        if (!p_41410_.isClientSide) {  // 确保只在服务器端执行，防止客户端的重复效果
            p_41411_.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 120, 1)); // 1200 tick, 1分钟，等级2的生命恢复效果
        }
        return new ItemStack(Items.BOWL);
    }
}
