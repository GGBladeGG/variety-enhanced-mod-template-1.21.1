package net.blade.varietyenhancedmod.datagen;

import net.blade.varietyenhancedmod.item.ModItems;
import net.blade.varietyenhancedmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.MYCELIUM_INGOT)
                .add(ModItems.RAW_MYCELIUM)
                .add(ModItems.SPORE_EMPEROR_HEART)
                .add(ModItems.GLOW_SHROOM)
                .add(ModItems.GLOOM_SHROOM);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.MYCELIUM_SWORD);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.MYCELIUM_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.MYCELIUM_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.MYCELIUM_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.MYCELIUM_HELMET)
                .add(ModItems.MYCELIUM_CHESTPLATE)
                .add(ModItems.MYCELIUM_LEGGINGS)
                .add(ModItems.MYCELIUM_BOOTS)
                .add(ModItems.EMERALD_HELMET)
                .add(ModItems.EMERALD_CHESTPLATE)
                .add(ModItems.EMERALD_LEGGINGS)
                .add(ModItems.EMERALD_BOOTS);
    }
}