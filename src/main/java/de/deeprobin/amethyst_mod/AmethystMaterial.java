package de.deeprobin.amethyst_mod;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

final class AmethystMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 512;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 9.0F;
    }

    @Override
    public float getAttackDamage() {
        return 3.0F;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 9;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(AmethystMod.AMETHYST);
    }
}
