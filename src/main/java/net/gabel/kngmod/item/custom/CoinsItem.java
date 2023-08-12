package net.gabel.kngmod.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Random;

public class CoinsItem extends Item {
    public CoinsItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        if(!pLevel.isClientSide()) {
            enum Coin {Heads, Tails}

            Random randomNum = new Random();
            int result = randomNum.nextInt(2);
            Coin coinFlip;

            if (result == 0) {
                coinFlip = Coin.Heads;
                pPlayer.sendSystemMessage(Component.literal("You flipped heads!"));
            } else {
                coinFlip = Coin.Tails;
                pPlayer.sendSystemMessage(Component.literal("You flipped tails!"));
            }
        }

        // Return the original Item Stack
        return InteractionResultHolder.pass(pPlayer.getItemInHand(pUsedHand));
    }
}
