package net.blade.varietyenhancedmod.datagen;

import net.blade.varietyenhancedmod.block.ModBlocks;
import net.blade.varietyenhancedmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.MYCELIUM_BLOCK);
        addDrop(ModBlocks.BLOCK_OF_RAW_MYCELIUM);

        addDrop(ModBlocks.MYCELIUM_STAIRS);
        addDrop(ModBlocks.MYCELIUM_SLAB, slabDrops(ModBlocks.MYCELIUM_SLAB));

        addDrop(ModBlocks.MYCELIUM_BUTTON);
        addDrop(ModBlocks.MYCELIUM_PRESSURE_PLATE);

        addDrop(ModBlocks.MYCELIUM_FENCE);
        addDrop(ModBlocks.MYCELIUM_FENCE_GATE);
        addDrop(ModBlocks.MYCELIUM_WALL);

        addDrop(ModBlocks.MYCELIUM_DOOR, doorDrops(ModBlocks.MYCELIUM_DOOR));
        addDrop(ModBlocks.MYCELIUM_TRAPDOOR);

        addDrop(ModBlocks.MYCELIUM_ORE, oreDrops(ModBlocks.MYCELIUM_ORE, ModItems.RAW_MYCELIUM));
        addDrop(ModBlocks.DEEPSLATE_MYCELIUM_ORE, oreDrops(ModBlocks.DEEPSLATE_MYCELIUM_ORE, ModItems.RAW_MYCELIUM));

    }
}
