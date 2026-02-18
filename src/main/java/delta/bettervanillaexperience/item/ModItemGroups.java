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
    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(BetterVanillaExperience.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.bettervanillaexperience.mod_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModItems.ENDISITE_INGOT);
                        entries.add(ModItems.RAW_ENDISITE);
                    })
                    .build()
    );

    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(BetterVanillaExperience.MOD_ID, "pink_garnet_blocks"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.bettervanillaexperience.mod_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.ENDISITE_ORE_BLOCK);
                        entries.add(ModBlocks.ENDISITE_BLOCK);
                        entries.add(ModBlocks.RAW_ENDISITE_BLOCK);
                    })
                    .build()
    );

    public static void registerItemGroups(){
        BetterVanillaExperience.LOGGER.info("Registering Item Groups for " + BetterVanillaExperience.MOD_ID);
    }
}