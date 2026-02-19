package delta.bettervanillaexperience.block;

import delta.bettervanillaexperience.BetterVanillaExperience;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
            new Block(AbstractBlock.Settings.create().strength(4f,5f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block",
            new Block(AbstractBlock.Settings.create().strength(3f,4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block PINK_GARNET_ORE = registerBlock("pink_garnet_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool()));

    public static final Block PINK_GARNET_DEEPSLATE_ORE = registerBlock("pink_garnet_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));




    public static final Block ENDISITE_ORE_BLOCK = registerBlock("endisite_ore_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(4,8),
                    AbstractBlock.Settings.create().strength(4f,3f).requiresTool()));

    public static final Block RAW_ENDISITE_BLOCK = registerBlock("raw_endisite_block",
            new Block(AbstractBlock.Settings.create().strength(3f,3f)
                    .requiresTool()));

    public static final Block ENDISITE_BLOCK = registerBlock("endisite_block",
            new Block(AbstractBlock.Settings.create().strength(3f,3f)
                    .requiresTool()));



    public static final Block END_JADE_ORE_BLOCK = registerBlock("end_jade_ore_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(5,10),
                    AbstractBlock.Settings.create().strength(4f,3f).requiresTool()));

    public static final Block END_JADE_BLOCK = registerBlock("end_jade_block",
            new Block(AbstractBlock.Settings.create().strength(4f,3f)
                    .requiresTool()));



    private static Block registerBlock(String name, Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, Identifier.of(BetterVanillaExperience.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(BetterVanillaExperience.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        BetterVanillaExperience.LOGGER.info("Registering Mod Blocks for " + BetterVanillaExperience.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries ->{
            fabricItemGroupEntries.add(ModBlocks.PINK_GARNET_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.ENDISITE_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.RAW_ENDISITE_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.ENDISITE_ORE_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.END_JADE_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.END_JADE_ORE_BLOCK);
        });
    }

}