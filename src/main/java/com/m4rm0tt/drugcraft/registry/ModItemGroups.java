package com.m4rm0tt.drugcraft.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import com.m4rm0tt.drugcraft.DrugCraftMod;

public class ModItemGroups {
	public static final RegistryKey<ItemGroup> DRUGCRAFT_GROUP_KEY = RegistryKey.of(
		RegistryKeys.ITEM_GROUP,
		Identifier.of(DrugCraftMod.MOD_ID, "drugcraft")
	);

	public static final ItemGroup DRUGCRAFT_GROUP = FabricItemGroup.builder()
		.icon(() -> new ItemStack(ModItems.CANNABIS_SEEDS))
		.displayName(Text.translatable("itemGroup.drugcraft.drugcraft"))
		.entries((context, entries) -> {
			entries.add(ModItems.CANNABIS_SEEDS);
			entries.add(ModItems.FRESH_CANNABIS);
			entries.add(ModItems.COCA_SEEDS);
			entries.add(ModItems.FRESH_COCA_LEAVES);
		})
		.build();

	public static void init() {
		Registry.register(Registries.ITEM_GROUP, DRUGCRAFT_GROUP_KEY, DRUGCRAFT_GROUP);
	}
}
