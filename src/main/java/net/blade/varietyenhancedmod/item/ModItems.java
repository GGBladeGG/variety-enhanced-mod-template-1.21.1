package net.blade.varietyenhancedmod.item;

import net.blade.varietyenhancedmod.VarietyEnhancedMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SPORE_EMPEROR_HEART = registerItem("spore_emperor_heart", new Item(new Item.Settings ()));
    public static final Item RAW_MYCELIUM = registerItem("raw_mycelium", new Item(new Item.Settings ())) ;
    public static final Item MYCELIUM_INGOT = registerItem("mycelium_ingot" , new Item(new Item.Settings()));

    public static final Item GLOW_SHROOM = registerItem("glow_shroom" , new Item(new Item.Settings().food(ModFoodComponents.GLOW_SHROOM)));
    public static final Item GLOOM_SHROOM = registerItem("gloom_shroom" , new Item(new Item.Settings().food(ModFoodComponents.GLOOM_SHROOM)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(VarietyEnhancedMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
         VarietyEnhancedMod.LOGGER.info("Registering Mod Items for " + VarietyEnhancedMod.MOD_ID);


         ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
             entries.add(SPORE_EMPEROR_HEART);
             entries.add(RAW_MYCELIUM);
             entries.add(MYCELIUM_INGOT);
                 });

         ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
             entries.add(GLOW_SHROOM);
             entries.add(GLOOM_SHROOM);

         });
    }

}