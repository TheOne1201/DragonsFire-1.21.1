package com.theOne1201.dragonsFire.item;

import com.theOne1201.dragonsFire.DragonsFire;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DragonsFire.MODID);

    public static final DeferredItem<Item> DRAGONSCALE = ITEMS.register("dragonscale",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FATECUTTER = ITEMS.register("fatecutter",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }

}
