package cn.plainsvillager.homomod.items;

import cn.plainsvillager.homomod.items.foods.ModFoodComponents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static cn.plainsvillager.homomod.Main.MOD_ID;

public class ModItems {
    public static class ModBaseItems {

    }
    public static class ModFoodItems {
        public static final Item HOMO_BASE_FOOD = new Item(new FabricItemSettings().food(ModFoodComponents.HOMO_BASE_FOOD_COMPONENT).fireproof().maxCount(45).rarity(Rarity.UNCOMMON));
    }




    public static void registerItems() {
        register(new Identifier(MOD_ID,"homo_base_food"), ModFoodItems.HOMO_BASE_FOOD);

    }

    public static Item register(Identifier id, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return Registry.register(Registry.ITEM, id, item);
    }
}
