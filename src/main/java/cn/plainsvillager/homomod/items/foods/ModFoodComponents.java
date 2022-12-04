package cn.plainsvillager.homomod.items.foods;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    /*
        homoの初级食物：
        吃了会减少3点饥饿值，0.7点饱食度（不吃也罢
        任何时候都能吃
     */
    public static final FoodComponent HOMO_BASE_FOOD = new FoodComponent.Builder().hunger(-3).saturationModifier(-0.7f).alwaysEdible().meat().build();
}
