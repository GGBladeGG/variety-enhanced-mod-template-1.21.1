package net.blade.varietyenhancedmod.util;

import net.blade.varietyenhancedmod.VarietyEnhancedMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_MYCELIUM_TOOL = createTag("needs_mycelium_tool");
        public static final TagKey<Block> INCORRECT_FOR_MYCELIUM_TOOL = createTag("incorrect_for_mycelium_tool");

        public static final TagKey<Block> NEEDS_MYCELIUM_DRILL = createTag("needs_mycelium_drill");
        public static final TagKey<Block> INCORRECT_FOR_MYCELIUM_DRILL = createTag("incorrect_for_mycelium_drill");

        public static final TagKey<Block> NEEDS_DIAMOND_DRILL = createTag("needs_diamond_drill");
        public static final TagKey<Block> INCORRECT_FOR_DIAMOND_DRILL = createTag("incorrect_for_diamond_drill");

        public static final TagKey<Block> DRILL_MINEABLE =  createTag("mineable/drill");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(VarietyEnhancedMod.MOD_ID, name));
        }

    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(VarietyEnhancedMod.MOD_ID, name));
        }

    }
}
