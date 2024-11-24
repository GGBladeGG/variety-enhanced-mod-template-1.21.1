package net.blade.varietyenhancedmod.item;

import net.blade.varietyenhancedmod.VarietyEnhancedMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SPORE_EMPEROR_HEART = registerItem("spore_emperor_heart", new Item(new Item.Settings ()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(SPORE_EMPEROR_HEART);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(VarietyEnhancedMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
         VarietyEnhancedMod.LOGGER.info("Registering Mod Items for " + VarietyEnhancedMod.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
