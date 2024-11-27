package net.blade.varietyenhancedmod.block;

import net.blade.varietyenhancedmod.VarietyEnhancedMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;


public class ModBlocks {
    public static final Block BLOCK_OF_RAW_MYCELIUM = registerBlock("block_of_raw_mycelium",
            new Block(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));
    public static final Block MYCELIUM_BLOCK = registerBlock("mycelium_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));



    public static final Block MYCELIUM_ORE = registerBlock("mycelium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),AbstractBlock.Settings.copy(Blocks.STONE).strength(2.5f)));
    public static final Block DEEPSLATE_MYCELIUM_ORE = registerBlock("deepslate_mycelium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),AbstractBlock.Settings.copy(Blocks.DEEPSLATE).strength(4.5f)));


    private static void addItemsToNaturalItemGroup(FabricItemGroupEntries entries) {
        entries.add(BLOCK_OF_RAW_MYCELIUM);
        entries.add(MYCELIUM_BLOCK);

        entries.add(MYCELIUM_ORE);
        entries.add(DEEPSLATE_MYCELIUM_ORE);

    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(VarietyEnhancedMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(VarietyEnhancedMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        VarietyEnhancedMod.LOGGER.info("Registering ModBlocks for " + VarietyEnhancedMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModBlocks::addItemsToNaturalItemGroup);
    }
}
