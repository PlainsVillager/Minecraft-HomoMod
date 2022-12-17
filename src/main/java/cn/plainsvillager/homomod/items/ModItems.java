package cn.plainsvillager.homomod.items;

import cn.plainsvillager.homomod.items.base.HomoBaseFoodItem;
import cn.plainsvillager.homomod.items.foods.ModFoodComponents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static cn.plainsvillager.homomod.Main.MOD_ID;
/**
    @ClassName: ModItems
    @role: reg mod items
*/
public class ModItems {
    public static class ModBaseItems {

    }

    /* 静态内部类：ModFoodItems
        作用：再次声明食物item实例（对象）
        包括：HOMO_BASE_FOOD（homoの初级食物）
     */
    public static class ModFoodItems {
        public static final Item HOMO_BASE_FOOD = new HomoBaseFoodItem(new FabricItemSettings().food(ModFoodComponents.HOMO_BASE_FOOD_COMPONENT).fireproof().maxCount(45).rarity(Rarity.UNCOMMON));
    }


    /*
        registerItems：注册表面类（main的onInitialize里调用）
        单独写的作用：1.一劳永逸  2.是Main类代码更加简洁
        请在此处添加需要注册的物品
        底层：本类的register方法
     */
    public static void registerItems() {
        /*
            参照下面的格式
         */
        register(new Identifier(MOD_ID,"homo_base_food"), ModFoodItems.HOMO_BASE_FOOD);
    }

    /*
        注册的底层逻辑
     */
    public static Item register(Identifier id, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return Registry.register(Registry.ITEM, id, item);
    }
}
