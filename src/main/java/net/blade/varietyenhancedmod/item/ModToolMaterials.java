package net.blade.varietyenhancedmod.item;

import net.blade.varietyenhancedmod.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;


public enum ModToolMaterials implements ToolMaterial {

    MYCELIUM_TOOL(
            1850,
            10.0F,
            5.0F,
            ModTags.Blocks.INCORRECT_FOR_MYCELIUM_TOOL,
            22,
            Ingredient.ofItems(ModItems.MYCELIUM_INGOT)


    ),



    MYCELIUM_DRILL(
            1850,
           10.0F,
            5.0F,
                  ModTags.Blocks.INCORRECT_FOR_MYCELIUM_DRILL,
          22,
                  Ingredient.ofItems(ModItems.MYCELIUM_INGOT)


    ),


    DIAMOND_DRILL(
            1850,
            10.0F,
            5.0F,
            ModTags.Blocks.INCORRECT_FOR_DIAMOND_DRILL,
            22,
                 Ingredient.ofItems(ModItems.DIAMOND_DRILL)

    );

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed, attackDamage;
    private final int enchantability;
    private final Ingredient repairIngredient;

    ModToolMaterials(int itemDurability, float miningSpeed, float attackDamage, final TagKey<Block> inverseTag, int enchantability, final Ingredient repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
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
        return this.repairIngredient;
    }





}

