package net.gabel.kngmod.item;

import net.gabel.kngmod.KngMod;
import net.gabel.kngmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KngMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GAMBLING_TAB = CREATIVE_MODE_TABS.register("gambling_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHIPS.get()))
                    .title(Component.translatable("creativetab.gambling_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CHIPS.get()); // Duplicate this line to add extra items
                        pOutput.accept(ModBlocks.BIG_BASS_MONEY_BLOCK.get());
                        pOutput.accept(ModBlocks.SLOT_BASE_BLOCK.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> SHOPPING_TAB = CREATIVE_MODE_TABS.register("shopping_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COINS.get()))
                    .title(Component.translatable("creativetab.shopping_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.COINS.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> RUST_TAB = CREATIVE_MODE_TABS.register("rust_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.DEEPSLATE_SULFUR_ORE.get()))
                    .title(Component.translatable("creativetab.rust_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RAW_HQM.get());
                        pOutput.accept(ModItems.HQM_INGOT.get());
                        pOutput.accept(ModItems.RAW_SULFUR.get());
                        pOutput.accept(ModItems.COOKED_SULFUR.get());
                        pOutput.accept(ModBlocks.HQM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_HQM_ORE.get());
                        pOutput.accept(ModBlocks.SULFUR_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SULFUR_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
