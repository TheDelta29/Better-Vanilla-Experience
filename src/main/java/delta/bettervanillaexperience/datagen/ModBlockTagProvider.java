package delta.bettervanillaexperience.datagen;

import delta.bettervanillaexperience.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PINK_GARNET_BLOCK)
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK)
                .add(ModBlocks.PINK_GARNET_ORE)
                .add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE)
                .add(ModBlocks.MAGIC_BLOCK)
                .add(ModBlocks.ENDISITE_ORE_BLOCK)
                .add(ModBlocks.ENDISITE_BLOCK)
                .add(ModBlocks.RAW_ENDISITE_BLOCK)
                .add(ModBlocks.END_JADE_BLOCK)
                .add(ModBlocks.END_JADE_ORE_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.PINK_GARNET_BLOCK)
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK)
                .add(ModBlocks.PINK_GARNET_ORE)

                .add(ModBlocks.RAW_ENDISITE_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE)

                .add(ModBlocks.ENDISITE_BLOCK)
                .add(ModBlocks.ENDISITE_ORE_BLOCK)

                .add(ModBlocks.END_JADE_BLOCK)
                .add(ModBlocks.ENDISITE_ORE_BLOCK);

    }
}
