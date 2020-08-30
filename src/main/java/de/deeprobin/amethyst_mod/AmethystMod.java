package de.deeprobin.amethyst_mod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

/**
 * The mod initializer of the amethyst mod
 * @author Robin Lindner
 * @see net.fabricmc.api.ModInitializer
 */
public final class AmethystMod implements ModInitializer {

	public static final ToolMaterial TOOL_MATERIAL = new AmethystMaterial();
	public static final ArmorMaterial ARMOR_MATERIAL = new AmethystArmorMaterial();
	public static final Item AMETHYST_SWORD = new SwordItem(TOOL_MATERIAL, 4, -1.8F, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item AMETHYST_PICKAXE = new AmethystPickaxe(TOOL_MATERIAL, 2, -2.2F, (new Item.Settings()).group(ItemGroup.TOOLS));
	public static final Item AMETHYST_AXE = new AmethystAxe(TOOL_MATERIAL, 6.0F, -2.8F, (new Item.Settings()).group(ItemGroup.TOOLS));
	public static final Item AMETHYST_SHOVEL = new ShovelItem(TOOL_MATERIAL, 2.5F, -2.8F, (new Item.Settings()).group(ItemGroup.TOOLS));
	public static final Item AMETHYST_HOE = new AmethystHoe(TOOL_MATERIAL, 0, -2.8F, (new Item.Settings()).group(ItemGroup.TOOLS));

	public static final Item AMETHYST_HELMET = new ArmorItem(ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item AMETHYST_CHESTPLATE = new ArmorItem(ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item AMETHYST_LEGGINGS = new ArmorItem(ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item AMETHYST_BOOTS = new ArmorItem(ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT)));

	public static final Item AMETHYST_HORSE_ARMOR = new HorseArmorItem(14, "amethyst", (new Item.Settings()).maxCount(1).group(ItemGroup.MISC));

	public static final Item AMETHYST = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	public static final Block AMETHYST_BLOCK = new Block(Block.Settings.of(Material.METAL, MaterialColor.RED).strength(5.0F, 5.0F));
	public static final Block AMETHYST_ORE = new OreBlock(Block.Settings.of(Material.STONE).strength(3.0F, 3.0F));
	public static final Block THE_END_AMETHYST_ORE = new OreBlock(Block.Settings.of(Material.STONE).strength(3.0F, 3.0F));
	public static final ConfiguredFeature<?,?> AMETHYST_ORE_FEATURE = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, AMETHYST_ORE.getDefaultState(), 6)).method_30377(128).spreadHorizontally().repeat(20);
	public static final ConfiguredFeature<?,?> THE_END_AMETHYST_ORE_FEATURE = Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), THE_END_AMETHYST_ORE.getDefaultState(), 24)).method_30377(16).spreadHorizontally().repeatRandomly(24);

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("amethyst_mod", "amethyst"), AMETHYST);
		Registry.register(Registry.ITEM, new Identifier("amethyst_mod", "amethyst_sword"), AMETHYST_SWORD);
		Registry.register(Registry.ITEM, new Identifier("amethyst_mod", "amethyst_pickaxe"), AMETHYST_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("amethyst_mod", "amethyst_axe"), AMETHYST_AXE);
		Registry.register(Registry.ITEM, new Identifier("amethyst_mod", "amethyst_shovel"), AMETHYST_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("amethyst_mod", "amethyst_hoe"), AMETHYST_HOE);
		Registry.register(Registry.ITEM, new Identifier("amethyst_mod", "amethyst_helmet"), AMETHYST_HELMET);
		Registry.register(Registry.ITEM, new Identifier("amethyst_mod", "amethyst_chestplate"), AMETHYST_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier("amethyst_mod", "amethyst_leggings"), AMETHYST_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier("amethyst_mod", "amethyst_boots"), AMETHYST_BOOTS);
		Registry.register(Registry.ITEM, new Identifier("amethyst_mod", "amethyst_horse_armor"), AMETHYST_HORSE_ARMOR);
		Registry.register(Registry.BLOCK, new Identifier("amethyst_mod", "amethyst_block"), AMETHYST_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("amethyst_mod", "amethyst_ore"), AMETHYST_ORE);
		Registry.register(Registry.BLOCK, new Identifier("amethyst_mod", "end_amethyst_ore"), THE_END_AMETHYST_ORE);
		Registry.register(Registry.ITEM, new Identifier("amethyst_mod", "amethyst_block"), new BlockItem(AMETHYST_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("amethyst_mod", "amethyst_ore"), new BlockItem(AMETHYST_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("amethyst_mod", "end_amethyst_ore"), new BlockItem(THE_END_AMETHYST_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("amethyst_mod", "ore_amethyst"), AMETHYST_ORE_FEATURE);
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("amethyst_mod", "ore_amethyst_end"), THE_END_AMETHYST_ORE_FEATURE);
	}

}
