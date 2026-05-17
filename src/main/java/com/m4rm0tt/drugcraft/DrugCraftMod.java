package com.m4rm0tt.drugcraft;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.m4rm0tt.drugcraft.registry.ModBlocks;
import com.m4rm0tt.drugcraft.registry.ModItems;
import com.m4rm0tt.drugcraft.registry.ModEffects;
import com.m4rm0tt.drugcraft.registry.ModBlockEntities;

public class DrugCraftMod implements ModInitializer {
	public static final String MOD_ID = "drugcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing DrugCraft...");

		ModBlocks.init();
		ModItems.init();
		ModEffects.init();
		ModBlockEntities.init();

		LOGGER.info("DrugCraft initialized!");
	}
}
