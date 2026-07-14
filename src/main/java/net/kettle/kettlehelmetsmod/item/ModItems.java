package net.kettle.kettlehelmetsmod.item;

import net.kettle.kettlehelmetsmod.KettleMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KettleMod.MODID);

    //Basic item from basic item tutorial
    public static final RegistryObject<Item> GUN = ITEMS.register("gun",
    () -> new Item(new Item.Properties())); //Register item with default item base and default properties.
    //Other bases exist (ex: bows) but this is just the default... Flintcore will give this thing some life!!

    //Register bullets
    public static final RegistryObject<Item> BULLET = ITEMS.register("bullet",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}