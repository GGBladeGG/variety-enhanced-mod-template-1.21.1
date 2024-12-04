package net.blade.varietyenhancedmod.item;

import com.google.common.base.Suppliers;
import net.blade.varietyenhancedmod.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    MYCELIUM_INGOT(
            ModTags.Blocks.INCORRECT_FOR_MYCELIUM_TOOL,
            1800,
            9.0F,
            5.0F,
            22,
            () -> Ingredient.ofItems(ModItems.MYCELIUM_INGOT)
    ),

    MYCELIUM_DRILL(
            ModTags.Blocks.INCORRECT_FOR_MYCELIUM_DRILL,
            1800,
            11.0F,
            5.0F,
            22,
            () -> Ingredient.ofItems(ModItems.MYCELIUM_INGOT)
    ),

    DIAMOND_DRILL(
            ModTags.Blocks.INCORRECT_FOR_DIAMOND_DRILL,
            1561,
            9.0F,
            5.0F,
            15,
            () -> Ingredient.ofItems(Items.DIAMOND)
    );

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability, final float miningSpeed,
                             final float attackDamage, final int enchantability, final Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }





}

