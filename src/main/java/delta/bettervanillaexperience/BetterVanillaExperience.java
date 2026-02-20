package delta.bettervanillaexperience;

import delta.bettervanillaexperience.block.ModBlocks;
import delta.bettervanillaexperience.component.ModDataComponentTypes;
import delta.bettervanillaexperience.item.ModItemGroups;
import delta.bettervanillaexperience.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterVanillaExperience implements ModInitializer {
	public static final String MOD_ID = "bettervanillaexperience";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModDataComponentTypes.registerDataComponentTypes();

		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 18000);
	}
}