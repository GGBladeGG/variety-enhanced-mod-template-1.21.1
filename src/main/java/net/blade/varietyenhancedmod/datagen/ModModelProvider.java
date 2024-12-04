package net.blade.varietyenhancedmod.datagen;

import net.blade.varietyenhancedmod.block.ModBlocks;
import net.blade.varietyenhancedmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MYCELIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_MYCELIUM_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_OF_RAW_MYCELIUM);
        BlockStateModelGenerator.BlockTexturePool MyceliumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MYCELIUM_BLOCK);

        MyceliumPool.stairs(ModBlocks.MYCELIUM_STAIRS);
        MyceliumPool.slab(ModBlocks.MYCELIUM_SLAB);

        MyceliumPool.button(ModBlocks.MYCELIUM_BUTTON);
        MyceliumPool.pressurePlate(ModBlocks.MYCELIUM_PRESSURE_PLATE);

        MyceliumPool.fence(ModBlocks.MYCELIUM_FENCE);
        MyceliumPool.fenceGate(ModBlocks.MYCELIUM_FENCE_GATE);
        MyceliumPool.wall(ModBlocks.MYCELIUM_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.MYCELIUM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.MYCELIUM_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_MYCELIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYCELIUM_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.GLOW_SHROOM, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOOM_SHROOM, Models.GENERATED);

        itemModelGenerator.register(ModItems.SPORE_EMPEROR_HEART, Models.GENERATED);

        itemModelGenerator.register(ModItems.MYCELIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYCELIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYCELIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYCELIUM_HOE, Models.HANDHELD);
        
        itemModelGenerator.register(ModItems.MYCELIUM_DRILL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_DRILL, Models.HANDHELD);
    }
}
