package com.m4rm0tt.drugcraft.registry;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import com.m4rm0tt.drugcraft.DrugCraftMod;
import com.m4rm0tt.drugcraft.item.CannabisSeedItem;
import com.m4rm0tt.drugcraft.item.CocaSeedItem;

public class ModItems {
	public static final RegistryKey<Item> CANNABIS_SEEDS_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DrugCraftMod.MOD_ID, "cannabis_seeds"));
	public static final RegistryKey<Item> FRESH_CANNABIS_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DrugCraftMod.MOD_ID, "fresh_cannabis"));
	public static final RegistryKey<Item> COCA_SEEDS_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DrugCraftMod.MOD_ID, "coca_seeds"));
	public static final RegistryKey<Item> FRESH_COCA_LEAVES_KEY = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DrugCraftMod.MOD_ID, "fresh_coca_leaves"));

	public static final Item CANNABIS_SEEDS = new CannabisSeedItem(
		ModBlocks.CANNABIS_CROP,
		new Item.Settings().registryKey(CANNABIS_SEEDS_KEY)
	);

	public static final Item FRESH_CANNABIS = new Item(
		new Item.Settings().registryKey(FRESH_CANNABIS_KEY)
	);

	public static final Item COCA_SEEDS = new CocaSeedItem(
		ModBlocks.COCA_CROP,
		new Item.Settings().registryKey(COCA_SEEDS_KEY)
	);

	public static final Item FRESH_COCA_LEAVES = new Item(
		new Item.Settings().registryKey(FRESH_COCA_LEAVES_KEY)
	);

	public static void init() {
		Registry.register(Registries.ITEM, CANNABIS_SEEDS_KEY, CANNABIS_SEEDS);
		Registry.register(Registries.ITEM, FRESH_CANNABIS_KEY, FRESH_CANNABIS);
		Registry.register(Registries.ITEM, COCA_SEEDS_KEY, COCA_SEEDS);
		Registry.register(Registries.ITEM, FRESH_COCA_LEAVES_KEY, FRESH_COCA_LEAVES);
	}
}
