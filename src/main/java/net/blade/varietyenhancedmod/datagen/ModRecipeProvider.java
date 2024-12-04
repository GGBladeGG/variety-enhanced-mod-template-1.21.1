package net.blade.varietyenhancedmod.datagen;


import net.blade.varietyenhancedmod.block.ModBlocks;
import net.blade.varietyenhancedmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> MYCELIUM_INGOT_SMELTABLES = List.of(ModItems.RAW_MYCELIUM, ModBlocks.MYCELIUM_ORE,
                ModBlocks.DEEPSLATE_MYCELIUM_ORE);

        offerSmelting(exporter, MYCELIUM_INGOT_SMELTABLES, RecipeCategory.MISC, ModItems.MYCELIUM_INGOT, 0.25f, 200, "mycelium_ingot");
        offerBlasting(exporter, MYCELIUM_INGOT_SMELTABLES, RecipeCategory.MISC, ModItems.MYCELIUM_INGOT, 0.25f, 100, "mycelium_ingot");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MYCELIUM_INGOT, RecipeCategory.DECORATIONS, ModBlocks.MYCELIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_MYCELIUM, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_RAW_MYCELIUM);
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MYCELIUM_SLAB, ModItems.MYCELIUM_INGOT);
        createStairsRecipe(ModBlocks.MYCELIUM_STAIRS, Ingredient.ofItems(ModItems.MYCELIUM_INGOT))
                .criterion(hasItem(ModItems.MYCELIUM_INGOT), conditionsFromItem(ModItems.MYCELIUM_INGOT))
                .offerTo(exporter);

        offerPressurePlateRecipe(exporter, ModBlocks.MYCELIUM_PRESSURE_PLATE, ModItems.MYCELIUM_INGOT);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MYCELIUM_BUTTON, 1)
                .pattern("   ")
                .pattern(" M ")
                .pattern("   ")
                .input('M', ModItems.MYCELIUM_INGOT)
                .criterion(hasItem(ModItems.MYCELIUM_INGOT), conditionsFromItem(ModItems.MYCELIUM_INGOT))
                .offerTo(exporter);

        createDoorRecipe(ModBlocks.MYCELIUM_DOOR, Ingredient.ofItems(ModItems.MYCELIUM_INGOT))
                .criterion(hasItem(ModItems.MYCELIUM_INGOT), conditionsFromItem(ModItems.MYCELIUM_INGOT))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.MYCELIUM_TRAPDOOR, Ingredient.ofItems(ModItems.MYCELIUM_INGOT))
                .criterion(hasItem(ModItems.MYCELIUM_INGOT), conditionsFromItem(ModItems.MYCELIUM_INGOT))
                .offerTo(exporter);

        createFenceRecipe(ModBlocks.MYCELIUM_FENCE, Ingredient.ofItems(ModItems.MYCELIUM_INGOT))
                .criterion(hasItem(ModItems.MYCELIUM_INGOT), conditionsFromItem(ModItems.MYCELIUM_INGOT))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.MYCELIUM_FENCE_GATE, Ingredient.ofItems(ModItems.MYCELIUM_INGOT))
                .criterion(hasItem(ModItems.MYCELIUM_INGOT), conditionsFromItem(ModItems.MYCELIUM_INGOT))
                .offerTo(exporter);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.MYCELIUM_WALL, ModItems.MYCELIUM_INGOT);




        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYCELIUM_SWORD, 1)
                .pattern(" M ")
                .pattern(" M ")
                .pattern(" / ")
                .input('M', ModItems.MYCELIUM_INGOT)
                .input('/', Items.STICK)
                .criterion(hasItem(ModItems.MYCELIUM_INGOT), conditionsFromItem(ModItems.MYCELIUM_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYCELIUM_SHOVEL, 1)
                .pattern(" M ")
                .pattern(" / ")
                .pattern(" / ")
                .input('M', ModItems.MYCELIUM_INGOT)
                .input('/', Items.STICK)
                .criterion(hasItem(ModItems.MYCELIUM_INGOT), conditionsFromItem(ModItems.MYCELIUM_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYCELIUM_AXE, 1)
                .pattern("MM ")
                .pattern("M/ ")
                .pattern(" / ")
                .input('M', ModItems.MYCELIUM_INGOT)
                .input('/', Items.STICK)
                .criterion(hasItem(ModItems.MYCELIUM_INGOT), conditionsFromItem(ModItems.MYCELIUM_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYCELIUM_HOE, 1)
                .pattern("MM ")
                .pattern(" / ")
                .pattern(" / ")
                .input('M', ModItems.MYCELIUM_INGOT)
                .input('/', Items.STICK)
                .criterion(hasItem(ModItems.MYCELIUM_INGOT), conditionsFromItem(ModItems.MYCELIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYCELIUM_DRILL, 1)
                .pattern(" A ")
                .pattern("MDM")
                .pattern("R/R")
                .input('M', ModItems.MYCELIUM_INGOT)
                .input('/', Items.BLAZE_ROD)
                .input('D', Items.DRAGON_BREATH)
                .input('R', Items.REDSTONE)
                .input('A', Items.AMETHYST_SHARD)
                .criterion(hasItem(ModItems.MYCELIUM_INGOT), conditionsFromItem(ModItems.MYCELIUM_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.DIAMOND_DRILL, 1)
                .pattern(" A ")
                .pattern("MDM")
                .pattern("R/R")
                .input('M', Items.DIAMOND)
                .input('/', Items.BLAZE_ROD)
                .input('D', Items.DRAGON_BREATH)
                .input('R', Items.REDSTONE)
                .input('A', Items.AMETHYST_SHARD)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);




    }
}

