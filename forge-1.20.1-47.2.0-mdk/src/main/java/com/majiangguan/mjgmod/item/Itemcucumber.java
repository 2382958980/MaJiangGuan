package com.majiangguan.mjgmod.item;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.damagesource.DamageSource;

public class Itemcucumber extends Item {
    public Itemcucumber()
    {
        super(new Properties()
                .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.4f).build())
                .stacksTo(64));
    }
}
