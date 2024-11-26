package net.blade.varietyenhancedmod.block;

import net.blade.varietyenhancedmod.VarietyEnhancedMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModBlocks {
    public static final Block BLOCK_OF_RAW_MYCELIUM = registerBlock("block_of_raw_mycelium",
            new Block(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));



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
    }
}
