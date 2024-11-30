package net.blade.varietyenhancedmod.datagen;

import net.blade.varietyenhancedmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.MYCELIUM_ORE)
                .add(ModBlocks.DEEPSLATE_MYCELIUM_ORE)
                .add(ModBlocks.BLOCK_OF_RAW_MYCELIUM)
                .add(ModBlocks.MYCELIUM_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL) ;

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL) ;

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.MYCELIUM_ORE)
                .add(ModBlocks.DEEPSLATE_MYCELIUM_ORE)
                .add(ModBlocks.BLOCK_OF_RAW_MYCELIUM)
                .add(ModBlocks.MYCELIUM_BLOCK) ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, Identifier.of("fabric", "needs_tool_level_4"))) ;

        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.MYCELIUM_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.MYCELIUM_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.MYCELIUM_WALL);


    }
}
