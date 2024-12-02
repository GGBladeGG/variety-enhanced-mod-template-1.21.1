package net.blade.varietyenhancedmod.block;

import net.blade.varietyenhancedmod.VarietyEnhancedMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
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

    public static final Block MYCELIUM_STAIRS = registerBlock("mycelium_stairs",
            new StairsBlock(ModBlocks.MYCELIUM_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MYCELIUM_SLAB = registerBlock("mycelium_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block MYCELIUM_BUTTON = registerBlock("mycelium_button",
            new ButtonBlock(BlockSetType.IRON, 20, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));
    public static final Block MYCELIUM_PRESSURE_PLATE = registerBlock("mycelium_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block MYCELIUM_FENCE = registerBlock("mycelium_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MYCELIUM_FENCE_GATE = registerBlock("mycelium_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block MYCELIUM_WALL = registerBlock("mycelium_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block MYCELIUM_DOOR = registerBlock("mycelium_door",
            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));
    public static final Block MYCELIUM_TRAPDOOR = registerBlock("mycelium_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));



    public static final Block MYCELIUM_ORE = registerBlock("mycelium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),AbstractBlock.Settings.copy(Blocks.STONE).strength(2.5f)));
    public static final Block DEEPSLATE_MYCELIUM_ORE = registerBlock("deepslate_mycelium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),AbstractBlock.Settings.copy(Blocks.DEEPSLATE).strength(4.5f)));
    
    private static void addItemsToNaturalItemGroup(FabricItemGroupEntries entries) {
        entries.add(BLOCK_OF_RAW_MYCELIUM);

        entries.add(MYCELIUM_ORE);
        entries.add(DEEPSLATE_MYCELIUM_ORE);

    }
    private static void addItemsToBuildingBlocksItemGroup(FabricItemGroupEntries entries) {
        entries.add(MYCELIUM_BLOCK);
        entries.add(MYCELIUM_STAIRS);
        entries.add(MYCELIUM_SLAB);
        entries.add(MYCELIUM_FENCE);
        entries.add(MYCELIUM_FENCE_GATE);
        entries.add(MYCELIUM_WALL);
        entries.add(MYCELIUM_DOOR);
        entries.add(MYCELIUM_TRAPDOOR);
    }
    private static void addItemsToRedstoneItemGroup(FabricItemGroupEntries entries) {
        entries.add(MYCELIUM_BUTTON);
        entries.add(MYCELIUM_PRESSURE_PLATE);
        entries.add(MYCELIUM_DOOR);
        entries.add(MYCELIUM_TRAPDOOR);
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

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addItemsToBuildingBlocksItemGroup);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(ModBlocks::addItemsToRedstoneItemGroup);
    }
}
