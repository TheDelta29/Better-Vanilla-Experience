package delta.bettervanillaexperience.item;

import delta.bettervanillaexperience.BetterVanillaExperience;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));

    public static final Item RAW_ENDISITE = registerItem("raw_endisite", new Item(new Item.Settings()));
    public static final Item ENDISITE_INGOT = registerItem("endisite_ingot", new Item(new Item.Settings()));

    public static final Item END_JADE = registerItem("end_jade", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BetterVanillaExperience.MOD_ID, name), item);
    }

    public static void registerModItems(){
        BetterVanillaExperience.LOGGER.info("Registering Mod Items for " + BetterVanillaExperience.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PINK_GARNET);
            fabricItemGroupEntries.add(RAW_PINK_GARNET);
            fabricItemGroupEntries.add(ENDISITE_INGOT);
            fabricItemGroupEntries.add(RAW_ENDISITE);
            fabricItemGroupEntries.add(END_JADE);
        });
    }
}
