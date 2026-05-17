package com.m4rm0tt.drugcraft.registry;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import com.m4rm0tt.drugcraft.DrugCraftMod;
import com.m4rm0tt.drugcraft.block.CannabisCropBlock;
import com.m4rm0tt.drugcraft.block.CocaCropBlock;

public class ModBlocks {
	public static final RegistryKey<Block> CANNABIS_CROP_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DrugCraftMod.MOD_ID, "cannabis_crop"));
	public static final RegistryKey<Block> COCA_CROP_KEY = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(DrugCraftMod.MOD_ID, "coca_crop"));

	public static final Block CANNABIS_CROP = new CannabisCropBlock(
		AbstractBlock.Settings.create()
			.registryKey(CANNABIS_CROP_KEY)
			.noCollision()
			.ticksRandomly()
			.breakInstantly()
			.sounds(BlockSoundGroup.CROP)
			.pistonBehavior(PistonBehavior.DESTROY)
	);

	public static final Block COCA_CROP = new CocaCropBlock(
		AbstractBlock.Settings.create()
			.registryKey(COCA_CROP_KEY)
			.noCollision()
			.ticksRandomly()
			.breakInstantly()
			.sounds(BlockSoundGroup.CROP)
			.pistonBehavior(PistonBehavior.DESTROY)
	);

	public static void init() {
		Registry.register(Registries.BLOCK, CANNABIS_CROP_KEY, CANNABIS_CROP);
		Registry.register(Registries.BLOCK, COCA_CROP_KEY, COCA_CROP);
	}
}
