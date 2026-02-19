package delta.bettervanillaexperience.item;

import delta.bettervanillaexperience.BetterVanillaExperience;
import delta.bettervanillaexperience.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BVE_ITEMS_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(BetterVanillaExperience.MOD_ID, "bve_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.bettervanillaexperience.mod_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModItems.ENDISITE_INGOT);
                        entries.add(ModItems.RAW_ENDISITE);
                        entries.add(ModItems.END_JADE);
                        entries.add(ModItems.STARLIGHT_ASHES);
                    })
                    .build()
    );

    public static final ItemGroup BVE_BLOCKS_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(BetterVanillaExperience.MOD_ID, "bve_blocks"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.bettervanillaexperience.mod_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.MAGIC_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
                        entries.add(ModBlocks.ENDISITE_ORE_BLOCK);
                        entries.add(ModBlocks.ENDISITE_BLOCK);
                        entries.add(ModBlocks.RAW_ENDISITE_BLOCK);
                        entries.add(ModBlocks.END_JADE_BLOCK);
                        entries.add(ModBlocks.END_JADE_ORE_BLOCK);

                    })
                    .build()
    );

    public static final ItemGroup BVE_EQUIPMENT_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(BetterVanillaExperience.MOD_ID, "bve_equipment"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.CHISEL))
                    .displayName(Text.translatable("itemgroup.bettervanillaexperience.mod_equipment"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CHISEL);
                    })
                    .build()
    );

    public static final ItemGroup BVE_CONSUMABLES_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(BetterVanillaExperience.MOD_ID, "bve_consumables"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.CAULIFLOWER))
                    .displayName(Text.translatable("itemgroup.bettervanillaexperience.mod_consumables"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CAULIFLOWER);
                        entries.add(ModItems.SODA);
                    })
                    .build()
    );

    public static void registerItemGroups(){
        BetterVanillaExperience.LOGGER.info("Registering Item Groups for " + BetterVanillaExperience.MOD_ID);
    }
}