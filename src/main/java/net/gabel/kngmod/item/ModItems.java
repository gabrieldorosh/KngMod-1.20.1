package net.gabel.kngmod.item;

import net.gabel.kngmod.KngMod;
import net.gabel.kngmod.item.custom.CoinsItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =                             // Add items here
            DeferredRegister.create(ForgeRegistries.ITEMS, KngMod.MOD_ID);

    public static final RegistryObject<Item> CHIPS = ITEMS.register("chips", // Added items look like this
            () -> new Item(new Item.Properties()));                                // Just adding it here does not add
    public static final RegistryObject<Item> COINS = ITEMS.register("coins", // textures or a name. It won't even
            () -> new CoinsItem(new Item.Properties()));                                // show up in creative.
    public static final RegistryObject<Item> RAW_KEBAB_MEAT = ITEMS.register("raw_kebab_meat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BROWNIE = ITEMS.register("brownie",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_HQM = ITEMS.register("raw_hqm",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HQM_INGOT = ITEMS.register("hqm_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SULFUR = ITEMS.register("raw_sulfur",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COOKED_SULFUR = ITEMS.register("cooked_sulfur",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) { // This registers the register
        ITEMS.register(eventBus);
    }
}
