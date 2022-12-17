package cn.plainsvillager.homomod.items.base;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class HomoBaseFoodItem extends Item {
    public HomoBaseFoodItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.playSound(SoundEvents.BLOCK_ANVIL_PLACE,100,1.0f);
        return super.use(world, user, hand);
    }
}
