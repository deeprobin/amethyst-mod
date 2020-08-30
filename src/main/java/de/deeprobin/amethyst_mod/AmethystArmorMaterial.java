package de.deeprobin.amethyst_mod;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

final class AmethystArmorMaterial implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[]{12, 14, 15, 10};
    private static final int[] PROTECTION_AMOUNT = new int[]{2, 5, 7, 2};

    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 35;
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_AMOUNT[slot.getEntitySlotId()];
    }

    public int getEnchantability() {
        return 10;
    }

    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(AmethystMod.AMETHYST);
    }

    @Environment(EnvType.CLIENT)
    public String getName() {
        return "amethyst";
    }

    public float getToughness() {
        return 2.5F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0F;
    }
}