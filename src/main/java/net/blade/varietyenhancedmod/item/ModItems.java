package net.blade.varietyenhancedmod.item;

import net.blade.varietyenhancedmod.VarietyEnhancedMod;
import net.blade.varietyenhancedmod.item.custom.DrillItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SPORE_EMPEROR_HEART = registerItem("spore_emperor_heart", new Item(new Item.Settings()));
    public static final Item RAW_MYCELIUM = registerItem("raw_mycelium", new Item(new Item.Settings()));
    public static final Item MYCELIUM_INGOT = registerItem("mycelium_ingot", new Item(new Item.Settings()));

    public static final Item GLOW_SHROOM = registerItem("glow_shroom", new Item(new Item.Settings().food(ModFoodComponents.GLOW_SHROOM)));
    public static final Item GLOOM_SHROOM = registerItem("gloom_shroom", new Item(new Item.Settings().food(ModFoodComponents.GLOOM_SHROOM)));







    public static final Item MYCELIUM_SWORD = registerItem("mycelium_sword",
            new SwordItem(ModToolMaterials.MYCELIUM_INGOT, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.MYCELIUM_INGOT, 3, -2.4f))));
    public static final Item MYCELIUM_SHOVEL = registerItem("mycelium_shovel",
            new ShovelItem(ModToolMaterials.MYCELIUM_INGOT, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.MYCELIUM_INGOT, 1, -2.4f))));
    public static final Item MYCELIUM_AXE = registerItem("mycelium_axe",
            new AxeItem(ModToolMaterials.MYCELIUM_INGOT, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.MYCELIUM_INGOT, 6, -3.2f))));
    public static final Item MYCELIUM_HOE = registerItem("mycelium_hoe",
            new HoeItem(ModToolMaterials.MYCELIUM_INGOT, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.MYCELIUM_INGOT, 6, -3f))));

    public static final Item MYCELIUM_DRILL = registerItem("mycelium_drill",
            new DrillItem(ModToolMaterials.MYCELIUM_INGOT, new Item.Settings()
                    .attributeModifiers(DrillItem.createAttributeModifiers(ModToolMaterials.MYCELIUM_INGOT, 1, -1.8f))));
    public static final Item DIAMOND_DRILL = registerItem("diamond_drill",
            new DrillItem(ToolMaterials.DIAMOND, new Item.Settings()
                    .attributeModifiers(DrillItem.createAttributeModifiers(ToolMaterials.DIAMOND, 1, -1.8f))));

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

         ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
             entries.add(MYCELIUM_DRILL);
             entries.add(DIAMOND_DRILL);
             entries.add(MYCELIUM_SHOVEL);
             entries.add(MYCELIUM_AXE);
             entries.add(MYCELIUM_HOE);
                 });

         ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
             entries.add(MYCELIUM_SWORD);
             entries.add(MYCELIUM_AXE);
                 });
    }

}

