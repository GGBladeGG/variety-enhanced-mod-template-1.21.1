package net.blade.varietyenhancedmod.item;

import net.blade.varietyenhancedmod.VarietyEnhancedMod;
import net.blade.varietyenhancedmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup VARIETY_ENHANCED_MOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(VarietyEnhancedMod.MOD_ID, "variety_enhanced_mod"),
            FabricItemGroup.builder().displayName(Text.translatable("Variety Enhanced Mod"))
                    .icon(() -> new ItemStack(ModItems.SPORE_EMPEROR_HEART)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_MYCELIUM);
                        entries.add(ModItems.MYCELIUM_INGOT);
                        entries.add(ModItems.SPORE_EMPEROR_HEART);

                        entries.add(ModItems.GLOW_SHROOM);
                        entries.add(ModItems.GLOOM_SHROOM);


                        entries.add(ModBlocks.BLOCK_OF_RAW_MYCELIUM);
                        entries.add(ModBlocks.MYCELIUM_BLOCK);

                        entries.add(ModBlocks.MYCELIUM_STAIRS);
                        entries.add(ModBlocks.MYCELIUM_SLAB);

                        entries.add(ModBlocks.MYCELIUM_BUTTON);
                        entries.add(ModBlocks.MYCELIUM_PRESSURE_PLATE);

                        entries.add(ModBlocks.MYCELIUM_FENCE);
                        entries.add(ModBlocks.MYCELIUM_FENCE_GATE);
                        entries.add(ModBlocks.MYCELIUM_WALL);

                        entries.add(ModBlocks.MYCELIUM_DOOR);
                        entries.add(ModBlocks.MYCELIUM_TRAPDOOR);

                        entries.add(ModBlocks.MYCELIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_MYCELIUM_ORE);

                        entries.add(ModItems.MYCELIUM_SWORD);
                        entries.add(ModItems.MYCELIUM_SHOVEL);
                        entries.add(ModItems.MYCELIUM_AXE);
                        entries.add(ModItems.MYCELIUM_HOE);

                        entries.add(ModItems.DIAMOND_DRILL);
                        entries.add(ModItems.MYCELIUM_DRILL);

                        entries.add(ModItems.MYCELIUM_HELMET);
                        entries.add(ModItems.MYCELIUM_CHESTPLATE);
                        entries.add(ModItems.MYCELIUM_LEGGINGS);
                        entries.add(ModItems.MYCELIUM_BOOTS);

                        entries.add(ModItems.EMERALD_HELMET);
                        entries.add(ModItems.EMERALD_CHESTPLATE);
                        entries.add(ModItems.EMERALD_LEGGINGS);
                        entries.add(ModItems.EMERALD_BOOTS);


                    }).build());


    public static void registerItemGroups() {
        VarietyEnhancedMod.LOGGER.info("Registering Item Groups for " + VarietyEnhancedMod.MOD_ID);
    }
}
