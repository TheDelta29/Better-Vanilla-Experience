package delta.bettervanillaexperience.datagen;

import delta.bettervanillaexperience.block.ModBlocks;
import delta.bettervanillaexperience.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.DataOutput;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        // Pink Garnet Crafting Recipes

        List<ItemConvertible> PINK_GARNET_SMELTABLES = List.of(ModItems.RAW_PINK_GARNET, ModBlocks.PINK_GARNET_ORE,
                ModBlocks.PINK_GARNET_DEEPSLATE_ORE);

        offerSmelting(exporter,PINK_GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_GARNET, 0.25f, 200, "pink_garnet");
        offerBlasting(exporter,PINK_GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_GARNET, 0.25f, 100, "pink_garnet");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PINK_GARNET, RecipeCategory.DECORATIONS, ModBlocks.PINK_GARNET_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_PINK_GARNET_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.RAW_PINK_GARNET)
                .criterion(hasItem(ModItems.RAW_PINK_GARNET), conditionsFromItem(ModItems.RAW_PINK_GARNET))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_PINK_GARNET, 9)
                .input(ModBlocks.RAW_PINK_GARNET_BLOCK)
                .criterion(hasItem(ModBlocks.RAW_PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.RAW_PINK_GARNET_BLOCK))
                .offerTo(exporter);

        createStairsRecipe(ModBlocks.PINK_GARNET_STAIRS, Ingredient.ofItems(ModItems.PINK_GARNET))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter);

        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.PINK_GARNET_SLAB, Ingredient.ofItems(ModItems.PINK_GARNET))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GARNET_BUTTON, 1)
                .input(ModItems.PINK_GARNET)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter);

        createPressurePlateRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.PINK_GARNET_PRESSURE_PLATE, Ingredient.ofItems(ModItems.PINK_GARNET))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter);

        createFenceRecipe(ModBlocks.PINK_GARNET_FENCE, Ingredient.ofItems(ModItems.PINK_GARNET))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter);

        createFenceGateRecipe(ModBlocks.PINK_GARNET_FENCE_GATE, Ingredient.ofItems(ModItems.PINK_GARNET))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter);

        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GARNET_WALL, ModItems.PINK_GARNET);

        createDoorRecipe(ModBlocks.PINK_GARNET_DOOR, Ingredient.ofItems(ModItems.PINK_GARNET))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter);

        createTrapdoorRecipe(ModBlocks.PINK_GARNET_TRAPDOOR, Ingredient.ofItems(ModItems.PINK_GARNET))
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter);

        // Pink Garnet Tools Crafting Recipes

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PINK_GARNET_SWORD)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" S ")
                .input('R', ModItems.PINK_GARNET)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PINK_GARNET_PICKAXE)
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', ModItems.PINK_GARNET)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PINK_GARNET_AXE)
                .pattern(" RR")
                .pattern(" SR")
                .pattern(" S ")
                .input('R', ModItems.PINK_GARNET)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PINK_GARNET_SHOVEL)
                .pattern(" R ")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', ModItems.PINK_GARNET)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PINK_GARNET_HOE)
                .pattern(" RR")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', ModItems.PINK_GARNET)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.PINK_GARNET), conditionsFromItem(ModItems.PINK_GARNET))
                .offerTo(exporter);




        // Endisite Crafting Recipes

        List<ItemConvertible> ENDISITE_INGOT_SMELTABLES = List.of(ModItems.RAW_ENDISITE, ModBlocks.ENDISITE_ORE_BLOCK);

        offerSmelting(exporter,ENDISITE_INGOT_SMELTABLES, RecipeCategory.MISC, ModItems.ENDISITE_INGOT, 0.4f, 200, "endisite");
        offerBlasting(exporter,ENDISITE_INGOT_SMELTABLES, RecipeCategory.MISC, ModItems.ENDISITE_INGOT, 0.4f, 100, "endisite");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ENDISITE_INGOT, RecipeCategory.DECORATIONS, ModBlocks.ENDISITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_ENDISITE, RecipeCategory.DECORATIONS, ModBlocks.RAW_ENDISITE_BLOCK);

        // End Jade Crafting Recipes

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.END_JADE, RecipeCategory.DECORATIONS, ModBlocks.END_JADE_BLOCK);




    }

}
