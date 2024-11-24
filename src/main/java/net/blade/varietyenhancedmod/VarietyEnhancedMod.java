package net.blade.varietyenhancedmod;

import net.blade.varietyenhancedmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VarietyEnhancedMod implements ModInitializer {
	public static final String MOD_ID = "varietyenhancedmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}