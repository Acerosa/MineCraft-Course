package com.rr.mccourse.item;

import com.rr.mccourse.RRMCCourseMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CopperedApple extends Item {

    public CopperedApple()
    {
        super(new Properties()
                .tab(RRMCCourseMod.RRMcCOURSE_TAB)
                .food(new Food.Builder()
                        .effect(() -> new EffectInstance(Effects.GLOWING, 300, 1), 0.5f)
                        .build()));
    }
}
