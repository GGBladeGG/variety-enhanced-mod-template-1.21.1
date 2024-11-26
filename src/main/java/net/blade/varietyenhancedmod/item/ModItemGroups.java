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
                        entries.add(ModItems.MYCELIUM_PLATE);
                        entries.add(ModItems.SPORE_EMPEROR_HEART);


                        entries.add(ModBlocks.BLOCK_OF_RAW_MYCELIUM);

                    }).build());


    public static void registerItemGroups() {
        VarietyEnhancedMod.LOGGER.info("Registering Item Groups for " + VarietyEnhancedMod.MOD_ID);
    }
}
