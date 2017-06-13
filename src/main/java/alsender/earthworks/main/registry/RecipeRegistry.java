package alsender.earthworks.main.registry;

import alsender.earthworks.main.Config;
import alsender.earthworks.main.crafting.ModCraftingManager;
import alsender.earthworks.main.crafting.ShapelessReturnRecipes;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.RecipeSorter;

import static alsender.earthworks.main.registry.BlockRegistry.*;
import static alsender.earthworks.main.registry.CompatRegistry.*;
import static alsender.earthworks.main.registry.ItemRegistry.*;

/**
 * Created by alsender on 6/11/17.
 */
public class RecipeRegistry {

    public static void init() {

        /**
         * BLOCK RECIPES
         */

        ModCraftingManager.addShapedRecipe("block_adobe", new ItemStack(block_adobe), 2, 2,
                item_adobe, item_adobe,
                item_adobe, item_adobe);

        ModCraftingManager.addShapedRecipe("block_chalk", new ItemStack(block_chalk), 2, 2,
                item_chalk, item_chalk,
                item_chalk, item_chalk);

        ModCraftingManager.addShapedRecipe("block_cinder", new ItemStack(block_cinder, 4), 2, 2,
                block_concrete, block_concrete,
                block_concrete, block_concrete);

        ModCraftingManager.addShapedRecipe("block_cob", new ItemStack(block_cob), 2, 2,
                item_cob, item_cob,
                item_cob, item_cob);

        ModCraftingManager.addShapelessRecipe("block_concrete", new ItemStack(block_concrete, 2),
                Blocks.GRAVEL, item_lime_plaster, Blocks.SAND);

        ModCraftingManager.addShapedRecipe("block_cordwood", new ItemStack(block_cordwood, 5), 3, 3,
                Blocks.LOG, item_lime_plaster, Blocks.LOG,
                item_lime_plaster, Blocks.LOG, item_lime_plaster,
                Blocks.LOG, item_lime_plaster, Blocks.LOG);

        ModCraftingManager.addShapedRecipe("block_dry_stone", new ItemStack(block_dry_stone, 8), 3, 3,
                new ItemStack(Blocks.STONE,1,0), new ItemStack(Blocks.STONE,1,0), new ItemStack(Blocks.STONE,1,0),
                new ItemStack(Blocks.STONE,1,0), ItemStack.EMPTY, new ItemStack(Blocks.STONE, 1, 0),
                new ItemStack(Blocks.STONE,1,0), new ItemStack(Blocks.STONE,1,0), new ItemStack(Blocks.STONE,1,0));

        ModCraftingManager.addShapedRecipe("block_gabion0", new ItemStack(block_gabion0, 2), 3, 3,
                Items.STICK, Items.WHEAT, Items.STICK,
                Items.WHEAT, Blocks.GRAVEL, Items.WHEAT,
                Items.STICK, Items.WHEAT, Items.STICK);

        ModCraftingManager.addShapedRecipe("block_gabion1", new ItemStack(block_gabion1, 2), 3,3,
                Items.STICK, Items.WHEAT, Items.STICK,
                Items.WHEAT, new ItemStack(Blocks.SAND, 1, 0), Items.WHEAT,
                Items.STICK, Items.WHEAT, Items.STICK);

        ModCraftingManager.addShapedRecipe("block_gabion2", new ItemStack(block_gabion2, 2), 3,3,
                Items.STICK, Items.WHEAT, Items.STICK,
                Items.WHEAT, Blocks.DIRT, Items.WHEAT,
                Items.STICK, Items.WHEAT, Items.STICK);

        ModCraftingManager.addShapelessRecipe("block_mud", new ItemStack(block_mud, 8),
                Blocks.DIRT, Blocks.DIRT, Blocks.DIRT,
                Blocks.DIRT, Items.WATER_BUCKET, Blocks.DIRT,
                Blocks.DIRT, Blocks.DIRT, Blocks.DIRT);

        ModCraftingManager.addShapedRecipe("block_mud_alt", new ItemStack(block_mud),2,2,
                item_mud, item_mud,
                item_mud, item_mud);

        Block woodPlankVert;

        if (!Loader.isModLoaded("quark") || Config.persistantplanks == true) {
            woodPlankVert = block_planks_vert;
        } else {
            woodPlankVert = Block.REGISTRY.getObject(new ResourceLocation("quark", "vertical_planks"));
        }

        ModCraftingManager.addShapelessRecipe("block_vertical_planks_oak", new ItemStack(woodPlankVert, 4, 0),
                block_timber_oak);

        ModCraftingManager.addShapelessRecipe("block_vertical_planks_spruce", new ItemStack(woodPlankVert, 4, 1),
                block_timber_spruce);

        ModCraftingManager.addShapelessRecipe("block_vertical_planks_birch", new ItemStack(woodPlankVert, 4, 2),
                block_timber_birch);

        ModCraftingManager.addShapelessRecipe("block_vertical_planks_jungle", new ItemStack(woodPlankVert, 4, 3),
                block_timber_jungle);

        ModCraftingManager.addShapelessRecipe("block_vertical_planks_acacia", new ItemStack(woodPlankVert, 4, 4),
                block_timber_acacia);

        ModCraftingManager.addShapelessRecipe("block_vertical_planks_dark_oak", new ItemStack(woodPlankVert, 4, 5),
                block_timber_dark_oak);

        ModCraftingManager.addShapedRecipe("block_plaster", new ItemStack(block_plaster),3,3,
                ItemStack.EMPTY, item_lime_plaster, ItemStack.EMPTY,
                item_lime_plaster, Blocks.PLANKS, item_lime_plaster,
                ItemStack.EMPTY, item_lime_plaster, ItemStack.EMPTY);

        ModCraftingManager.addShapedRecipe("block_rammed_earth", new ItemStack(block_rammed_earth, 3),3,2,
                Blocks.DIRT, Blocks.DIRT, Blocks.DIRT,
                Blocks.DIRT, Blocks.DIRT, Blocks.DIRT);

        ModCraftingManager.addShapedRecipe("block_slate_slab", new ItemStack(block_slate_slab,8),3,3,
                block_slate, block_slate, block_slate,
                block_slate, ItemStack.EMPTY, block_slate,
                block_slate, block_slate, block_slate);

        ModCraftingManager.addShapedRecipe("block_slate_slab_green", new ItemStack(block_slate_slab_green,8), 3,3,
                block_slate_green, block_slate_green, block_slate_green,
                block_slate_green, ItemStack.EMPTY, block_slate_green,
                block_slate_green, block_slate_green, block_slate_green);

        ModCraftingManager.addShapedRecipe("block_slate_slab_purple", new ItemStack(block_slate_slab_purple,8),3,3,
                block_slate_purple, block_slate_purple, block_slate_purple,
                block_slate_purple, ItemStack.EMPTY, block_slate_purple,
                block_slate_purple, block_slate_purple, block_slate_purple);

        ModCraftingManager.addShapedRecipe("block_slate_shingle", new ItemStack(block_slate_shingle,4),2,2,
                block_slate, block_slate,
                block_slate, block_slate);

        ModCraftingManager.addShapedRecipe("block_slate_shingle_verte",new ItemStack(block_slate_shingle_verte,4),2,2,
                block_slate_green, block_slate_green,
                block_slate_green, block_slate_green);

        ModCraftingManager.addShapedRecipe("block_slate_shingle_purple", new ItemStack(block_slate_shingle_purple,4),2,2,
                block_slate_purple, block_slate_purple,
                block_slate_purple, block_slate_purple);

        ModCraftingManager.addShapedRecipe("block_slate_tile", new ItemStack(block_slate_tile,4),2,2,
                block_slate_slab, block_slate_slab,
                block_slate_slab, block_slate_slab);

        ModCraftingManager.addShapedRecipe("block_slate_tile_verte", new ItemStack(block_slate_tile_verte,4),2,2,
                block_slate_slab_green, block_slate_slab_green,
                block_slate_slab_green, block_slate_slab_green);

        ModCraftingManager.addShapedRecipe("block_slate_tile_purple", new ItemStack(block_slate_tile_purple,4),2,2,
                block_slate_slab_purple, block_slate_slab_purple,
                block_slate_slab_purple, block_slate_slab_purple);

        ModCraftingManager.addShapedRecipe("block_wattle", new ItemStack(block_wattle, 8),3,3,
                block_cob, block_cob, block_cob,
                block_cob, block_wicker, block_cob,
                block_cob, block_cob, block_cob);

        ModCraftingManager.addShapedRecipe("block_wattle_alt", new ItemStack(block_wattle, 2),3,3,
                item_cob, item_cob, item_cob,
                item_cob, block_wicker, item_cob,
                item_cob, item_cob, item_cob);

        ModCraftingManager.addShapedRecipe("block_wicker", new ItemStack(block_wicker, 2),3,3,
                Items.STICK, Items.WHEAT,Items.STICK,
                Items.WHEAT, ItemStack.EMPTY, Items.WHEAT,
                Items.STICK, Items.WHEAT, Items.STICK);

        RecipeSorter.register("earthworks:shapelessReturn", ShapelessReturnRecipes.class, RecipeSorter.Category.SHAPELESS, "");
        for (int i = 0; i < 4; i++) {
            ModCraftingManager.addShapelessReturnRecipe("block_wood_shingle" + i, new ItemStack(block_wood_shingle, 6, i),
                    new ItemStack(Blocks.LOG, 1, i), Items.FLINT);
        }

        for (int i = 0; i < 2; i++) {
            ModCraftingManager.addShapelessReturnRecipe("block_wood_shingle2" + i, new ItemStack(block_wood_shingle, 6, (i+4)),
                    new ItemStack(Blocks.LOG2, 1, i), Items.FLINT);
        }

        ModCraftingManager.addShapelessReturnRecipe("block_wood_shingle0_alt", new ItemStack(block_wood_shingle, 6, 0),
                block_timber_oak, Items.FLINT);

        ModCraftingManager.addShapelessReturnRecipe("block_wood_shingle1_alt", new ItemStack(block_wood_shingle, 6, 1),
                block_timber_spruce, Items.FLINT);

        ModCraftingManager.addShapelessReturnRecipe("block_wood_shingle2_alt", new ItemStack(block_wood_shingle, 6, 2),
                block_timber_birch, Items.FLINT);

        ModCraftingManager.addShapelessReturnRecipe("block_wood_shingle3_alt", new ItemStack(block_wood_shingle, 6, 3),
                block_timber_jungle, Items.FLINT);

        ModCraftingManager.addShapelessReturnRecipe("block_wood_shingle4_alt", new ItemStack(block_wood_shingle, 6, 4),
                block_timber_acacia, Items.FLINT);

        ModCraftingManager.addShapelessReturnRecipe("block_wood_shingle5_alt", new ItemStack(block_wood_shingle, 6, 5),
                block_timber_dark_oak, Items.FLINT);

//Slabs

        ModCraftingManager.addShapedRecipe("slab_wood_shingle_oak", new ItemStack(slab_wood_shingle_oak, 6),3,1,
                new ItemStack(block_wood_shingle, 1, 0), new ItemStack(block_wood_shingle, 1, 0), new ItemStack(block_wood_shingle, 1, 0));

        ModCraftingManager.addShapedRecipe("slab_wood_shingle_spruce",new ItemStack(slab_wood_shingle_spruce, 6),3,1,
                new ItemStack(block_wood_shingle, 1, 1), new ItemStack(block_wood_shingle, 1, 0), new ItemStack(block_wood_shingle, 1, 0));

        ModCraftingManager.addShapedRecipe("slab_wood_shingle_birch", new ItemStack(slab_wood_shingle_birch, 6),3,1,
                new ItemStack(block_wood_shingle, 1, 2), new ItemStack(block_wood_shingle, 1, 0), new ItemStack(block_wood_shingle, 1, 0));

        ModCraftingManager.addShapedRecipe("slab_wood_shingle_jungle", new ItemStack(slab_wood_shingle_jungle, 6),3,1,
                new ItemStack(block_wood_shingle, 1, 3), new ItemStack(block_wood_shingle, 1, 0), new ItemStack(block_wood_shingle, 1, 0));

        ModCraftingManager.addShapedRecipe("slab_wood_shingle_acacia", new ItemStack(slab_wood_shingle_acacia, 6),3,1,
                new ItemStack(block_wood_shingle, 1, 4), new ItemStack(block_wood_shingle, 1, 0), new ItemStack(block_wood_shingle, 1, 0));

        ModCraftingManager.addShapedRecipe("slab_wood_shingle_dark_oak", new ItemStack(slab_wood_shingle_dark_oak, 6),3,1,
                new ItemStack(block_wood_shingle, 1, 5), new ItemStack(block_wood_shingle, 1, 0), new ItemStack(block_wood_shingle, 1, 0));

//Stairs

        ModCraftingManager.addShapedRecipe("stair_wood_shingle_oak", new ItemStack(stair_wood_shingle_oak, 4),3,3,
                new ItemStack(block_wood_shingle, 1, 0), ItemStack.EMPTY, ItemStack.EMPTY,
                new ItemStack(block_wood_shingle, 1, 0), new ItemStack(block_wood_shingle, 1, 0),ItemStack.EMPTY,
                new ItemStack(block_wood_shingle, 1, 0), new ItemStack(block_wood_shingle, 1, 0), new ItemStack(block_wood_shingle, 1, 0));

        ModCraftingManager.addShapedRecipe("stair_wood_shingle_spruce", new ItemStack(stair_wood_shingle_spruce, 4),3,3,
                new ItemStack(block_wood_shingle, 1, 1), ItemStack.EMPTY, ItemStack.EMPTY,
                new ItemStack(block_wood_shingle, 1, 1), new ItemStack(block_wood_shingle, 1, 1),ItemStack.EMPTY,
                new ItemStack(block_wood_shingle, 1, 1), new ItemStack(block_wood_shingle, 1, 1), new ItemStack(block_wood_shingle, 1, 1));

        ModCraftingManager.addShapedRecipe("stair_wood_shingle_birch", new ItemStack(stair_wood_shingle_birch, 4),3,3,
                new ItemStack(block_wood_shingle, 1, 2), ItemStack.EMPTY, ItemStack.EMPTY,
                new ItemStack(block_wood_shingle, 1, 2), new ItemStack(block_wood_shingle, 1, 2),ItemStack.EMPTY,
                new ItemStack(block_wood_shingle, 1, 2), new ItemStack(block_wood_shingle, 1, 2), new ItemStack(block_wood_shingle, 1, 2));

        ModCraftingManager.addShapedRecipe("stair_wood_shingle_jungle", new ItemStack(stair_wood_shingle_jungle, 4),3,3,
                new ItemStack(block_wood_shingle, 1, 3), ItemStack.EMPTY, ItemStack.EMPTY,
                new ItemStack(block_wood_shingle, 1, 3), new ItemStack(block_wood_shingle, 1, 3),ItemStack.EMPTY,
                new ItemStack(block_wood_shingle, 1, 3), new ItemStack(block_wood_shingle, 1, 3), new ItemStack(block_wood_shingle, 1, 3));

        ModCraftingManager.addShapedRecipe("stair_wood_shingle_acacia", new ItemStack(stair_wood_shingle_acacia, 4),3,3,
                new ItemStack(block_wood_shingle, 1, 4), ItemStack.EMPTY, ItemStack.EMPTY,
                new ItemStack(block_wood_shingle, 1, 4), new ItemStack(block_wood_shingle, 1, 4),ItemStack.EMPTY,
                new ItemStack(block_wood_shingle, 1, 4), new ItemStack(block_wood_shingle, 1, 4), new ItemStack(block_wood_shingle, 1, 4));

        ModCraftingManager.addShapedRecipe("stair_wood_shingle_dark_oak", new ItemStack(stair_wood_shingle_dark_oak, 4),3,3,
                new ItemStack(block_wood_shingle, 1, 5), ItemStack.EMPTY, ItemStack.EMPTY,
                new ItemStack(block_wood_shingle, 1, 5), new ItemStack(block_wood_shingle, 1, 5),ItemStack.EMPTY,
                new ItemStack(block_wood_shingle, 1, 5), new ItemStack(block_wood_shingle, 1, 5), new ItemStack(block_wood_shingle, 1, 5));

//Walls

        ModCraftingManager.addShapedRecipe("wall_wood_shingle_oak", new ItemStack(wall_wood_shingle_oak, 6),3,2,
                new ItemStack(block_wood_shingle, 1, 0), new ItemStack(block_wood_shingle, 1, 0), new ItemStack(block_wood_shingle, 1, 0),
                new ItemStack(block_wood_shingle, 1, 0), new ItemStack(block_wood_shingle, 1, 0), new ItemStack(block_wood_shingle, 1, 0));

        ModCraftingManager.addShapedRecipe("wall_wood_shingle_spruce", new ItemStack(wall_wood_shingle_spruce, 6),3,2,
                new ItemStack(block_wood_shingle, 1, 1), new ItemStack(block_wood_shingle, 1, 1), new ItemStack(block_wood_shingle, 1, 1),
                new ItemStack(block_wood_shingle, 1, 1), new ItemStack(block_wood_shingle, 1, 1), new ItemStack(block_wood_shingle, 1, 1));

        ModCraftingManager.addShapedRecipe("wall_wood_shingle_birch", new ItemStack(wall_wood_shingle_birch, 6),3,2,
                new ItemStack(block_wood_shingle, 1, 2), new ItemStack(block_wood_shingle, 1, 2), new ItemStack(block_wood_shingle, 1, 2),
                new ItemStack(block_wood_shingle, 1, 2), new ItemStack(block_wood_shingle, 1, 2), new ItemStack(block_wood_shingle, 1, 2));

        ModCraftingManager.addShapedRecipe("wall_wood_shingle_jungle", new ItemStack(wall_wood_shingle_jungle, 6),3,2,
                new ItemStack(block_wood_shingle, 1, 3), new ItemStack(block_wood_shingle, 1, 3), new ItemStack(block_wood_shingle, 1, 3),
                new ItemStack(block_wood_shingle, 1, 3), new ItemStack(block_wood_shingle, 1, 3), new ItemStack(block_wood_shingle, 1, 3));

        ModCraftingManager.addShapedRecipe("wall_wood_shingle_acacia", new ItemStack(wall_wood_shingle_acacia, 6),3,2,
                new ItemStack(block_wood_shingle, 1, 4), new ItemStack(block_wood_shingle, 1, 4), new ItemStack(block_wood_shingle, 1, 4),
                new ItemStack(block_wood_shingle, 1, 4), new ItemStack(block_wood_shingle, 1, 4), new ItemStack(block_wood_shingle, 1, 4));

        ModCraftingManager.addShapedRecipe("wall_wood_shingle_dark_oak", new ItemStack(wall_wood_shingle_dark_oak, 6),3,2,
                new ItemStack(block_wood_shingle, 1, 5), new ItemStack(block_wood_shingle, 1, 5), new ItemStack(block_wood_shingle, 1, 5),
                new ItemStack(block_wood_shingle, 1, 5), new ItemStack(block_wood_shingle, 1, 5), new ItemStack(block_wood_shingle, 1, 5));

//Item Recipes

        ModCraftingManager.addShapedRecipe("item_cob", new ItemStack(item_cob, 8),3,3,
                Items.CLAY_BALL, Items.CLAY_BALL, Items.CLAY_BALL,
                Items.CLAY_BALL, Items.WHEAT, item_mud,
                item_mud, item_mud, item_mud);

        ModCraftingManager.addShapelessRecipe("item_slaked_lime", new ItemStack(item_slaked_lime, 8),
                item_quicklime, item_quicklime, item_quicklime,
                item_quicklime, Items.WATER_BUCKET, item_quicklime,
                item_quicklime, item_quicklime, item_quicklime);

//Tool Recipes

        ModCraftingManager.addShapedRecipe("tool_square", new ItemStack(tool_square), 3,3,
                Blocks.PLANKS, ItemStack.EMPTY, ItemStack.EMPTY,
                Blocks.PLANKS, ItemStack.EMPTY, ItemStack.EMPTY,
                Blocks.PLANKS, Blocks.PLANKS, Blocks.PLANKS);

        ModCraftingManager.addShapelessRecipe("tool_Acheulean", new ItemStack(tool_Acheulean),
                Blocks.COBBLESTONE, Items.FLINT);
        ModCraftingManager.addShapelessRecipe("tool_Acheulean_alt", new ItemStack(tool_Acheulean),
                Blocks.STONE, Items.FLINT);

        ModCraftingManager.addShapedRecipe("tool_adz", new ItemStack(tool_adz),3,3,
                Items.IRON_INGOT, Items.STICK, ItemStack.EMPTY,
                ItemStack.EMPTY, Items.STICK, ItemStack.EMPTY,
                ItemStack.EMPTY, Items.STICK, ItemStack.EMPTY);

        ModCraftingManager.addShapelessRecipe("tool_compass", new ItemStack(tool_compass),
                Items.COMPASS);

        ModCraftingManager.addShapedRecipe("tool_froe", new ItemStack(tool_froe),3,2,
                Items.IRON_INGOT, Items.IRON_INGOT, ItemStack.EMPTY,
                ItemStack.EMPTY, Items.STICK, ItemStack.EMPTY);

        ModCraftingManager.addShapedRecipe("tool_planer", new ItemStack(tool_planer),3,2,
                Blocks.PLANKS, ItemStack.EMPTY, Blocks.PLANKS,
                Blocks.PLANKS, Items.IRON_INGOT, Blocks.PLANKS);

        ModCraftingManager.addShapedRecipe("tool_level", new ItemStack(tool_level),3,1,
                Items.GOLD_INGOT, Items.GOLD_INGOT, Items.GOLD_INGOT);

        ModCraftingManager.addShapedRecipe("tool_saw", new ItemStack(tool_saw),3,2,
                Items.IRON_INGOT, Items.IRON_INGOT, Items.STICK,
                Items.DIAMOND, Items.DIAMOND, Items.STICK);

        ModCraftingManager.addShapedRecipe("tool_wood_hammer", new ItemStack(tool_wood_hammer),3,3,
                Blocks.PLANKS, Blocks.PLANKS, Blocks.PLANKS,
                ItemStack.EMPTY, Items.STICK, ItemStack.EMPTY,
                ItemStack.EMPTY, Items.STICK, ItemStack.EMPTY);

        ModCraftingManager.addShapedRecipe("tool_stone_hammer", new ItemStack(tool_stone_hammer),3,3,
                Blocks.COBBLESTONE, Blocks.COBBLESTONE, Blocks.COBBLESTONE,
                ItemStack.EMPTY, Items.STICK, ItemStack.EMPTY,
                ItemStack.EMPTY, Items.STICK, ItemStack.EMPTY);

        ModCraftingManager.addShapedRecipe("tool_iron_hammer", new ItemStack(tool_iron_hammer),3,3,
                Items.IRON_INGOT, Items.IRON_INGOT, Items.IRON_INGOT,
                ItemStack.EMPTY, Items.STICK, ItemStack.EMPTY,
                ItemStack.EMPTY, Items.STICK, ItemStack.EMPTY);

        ModCraftingManager.addShapedRecipe("tool_gold_hammer", new ItemStack(tool_gold_hammer),3,3,
                Items.GOLD_INGOT, Items.GOLD_INGOT, Items.GOLD_INGOT,
                ItemStack.EMPTY, Items.STICK, ItemStack.EMPTY,
                ItemStack.EMPTY, Items.STICK, ItemStack.EMPTY);

        ModCraftingManager.addShapedRecipe("tool_diamond_hammer", new ItemStack(tool_diamond_hammer),3,3,
                Items.DIAMOND, Items.DIAMOND, Items.DIAMOND,
                ItemStack.EMPTY, Items.STICK, ItemStack.EMPTY,
                ItemStack.EMPTY, Items.STICK, ItemStack.EMPTY);

//Compat Recipes

        if (Loader.isModLoaded("quark")) {
            if (Config.quark == true) {
                Block thatch = Block.REGISTRY.getObject(new ResourceLocation("quark", "thatch"));
                ModCraftingManager.addShapelessRecipe("quark_thatch", new ItemStack(thatch), block_thatch);
            }
        }

        if (Loader.isModLoaded("betterwithmods")) {
            Item dirt = Item.REGISTRY.getObject(new ResourceLocation("betterwithmods", "dirt_pile"));
            Item sand = Item.REGISTRY.getObject(new ResourceLocation("betterwithmods", "sand_pile"));

            ModCraftingManager.addShapedRecipe("dirt", new ItemStack(Blocks.DIRT),2,2,
                    dirt, dirt,
                    dirt, dirt);
            ModCraftingManager.addShapedRecipe("sand", new ItemStack(Blocks.SAND),2,2,
                    sand, sand,
                    sand, sand);
            ModCraftingManager.addShapelessRecipe("item_adobe_BWM", new ItemStack(item_adobe, 8),
                    Items.CLAY_BALL, Items.CLAY_BALL, Items.CLAY_BALL,
                    Items.CLAY_BALL, Items.WHEAT, Items.CLAY_BALL,
                    Items.CLAY_BALL, sand, sand);
            ModCraftingManager.addShapelessRecipe("item_lime_plaster_BWM", new ItemStack(item_lime_plaster, 2),
                    item_slaked_lime, sand);
            ModCraftingManager.addShapelessRecipe("item_lime_plaster_BWM", new ItemStack(item_lime_plaster, 8),
                    item_quicklime, item_quicklime, item_quicklime,
                    item_quicklime, Items.WATER_BUCKET, sand,
                    sand, sand, sand);
            ModCraftingManager.addShapelessRecipe("item_mud_BWM", new ItemStack(item_mud, 8),
                    dirt, dirt, dirt,
                    dirt, Items.WATER_BUCKET, dirt,
                    dirt, dirt, dirt);
        }

//Furnace Recipes

        GameRegistry.addSmelting(item_chalk, new ItemStack(item_quicklime), 0.1F);
        GameRegistry.addSmelting(block_chalk, new ItemStack(item_quicklime, 4), 0.1F);

//Extraneous

        stair_slab_fence(new ItemStack(woodPlankVert, 1, 0), stair_planks_vert0, slab_planks_vert0, fence_planks_vert0);
        stair_slab_fence(new ItemStack(woodPlankVert, 1, 1), stair_planks_vert1, slab_planks_vert1, fence_planks_vert1);
        stair_slab_fence(new ItemStack(woodPlankVert, 1, 2), stair_planks_vert2, slab_planks_vert2, fence_planks_vert2);
        stair_slab_fence(new ItemStack(woodPlankVert, 1, 3), stair_planks_vert3, slab_planks_vert3, fence_planks_vert3);
        stair_slab_fence(new ItemStack(woodPlankVert, 1, 4), stair_planks_vert4, slab_planks_vert4, fence_planks_vert4);
        stair_slab_fence(new ItemStack(woodPlankVert, 1, 5), stair_planks_vert5, slab_planks_vert5, fence_planks_vert5);

        stair_slab_wall(block_adobe, stair_adobe, BlockRegistry.slab_adobe, wall_adobe);
        stair_slab_wall(block_cob, stair_cob, slab_cob, wall_cob);
        stair_slab_wall(block_cinder, stair_cinder, slab_cinder, wall_cinder);
        stair_slab_wall(block_chalk,stair_chalk,slab_chalk,wall_chalk);
        stair_slab_wall(block_concrete, stair_concrete, slab_concrete, wall_concrete);
        stair_slab_wall(block_cordwood, stair_cordwood,slab_cordwood,wall_cordwood);
        stair_slab_wall(block_dry_stone, stair_dry_stone, slab_dry_stone, wall_dry_stone);
        stair_slab_wall(block_gabion0, stair_gabion0, slab_gabion0, wall_gabion0);
        stair_slab_wall(block_gabion1, stair_gabion1, slab_gabion1, wall_gabion1);
        stair_slab_wall(block_gabion2, stair_gabion2, slab_gabion2, wall_gabion2);
        stair_slab_wall(block_mud, stair_mud, slab_mud, wall_mud);
        stair_slab_wall(block_plaster, stair_plaster, slab_plaster, wall_plaster);
        stair_slab_wall(block_rammed_earth, stair_rammed_earth, slab_rammed_earth, wall_rammed_earth);
        stair_slab_wall(block_slate, stair_slate, slab_slate, wall_slate);
        stair_slab_wall(block_slate_green, stair_slate_green, slab_slate_green, wall_slate_green);
        stair_slab_wall(block_slate_purple, stair_slate_purple, slab_slate_purple, wall_slate_purple);
        stair_slab_wall(block_slate_shingle, stair_slate_shingle, slab_slate_shingle, wall_slate_shingle);
        stair_slab_wall(block_slate_shingle_verte, stair_slate_shingle_verte, slab_slate_shingle_verte, wall_slate_shingle_verte);
        stair_slab_wall(block_slate_shingle_purple, stair_slate_shingle_purple, slab_slate_shingle_purple, wall_slate_shingle_purple);
        stair_slab_wall(block_slate_slab, stair_slate_slab, slab_slate_slab, wall_slate_slab);
        stair_slab_wall(block_slate_slab_green, stair_slate_slab_green, slab_slate_slab_green, wall_slate_slab_green);
        stair_slab_wall(block_slate_slab_purple, stair_slate_slab_purple, slab_slate_slab_purple, wall_slate_slab_purple);
        stair_slab_wall(block_slate_tile, stair_slate_tile, slab_slate_tile, wall_slate_tile);
        stair_slab_wall(block_slate_tile_verte, stair_slate_tile_verte, slab_slate_tile_verte, wall_slate_tile_verte);
        stair_slab_wall(block_slate_tile_purple, stair_slate_tile_purple, slab_slate_tile_purple, wall_slate_tile_purple);
        stair_slab_wall(block_wattle, stair_wattle, slab_wattle, wall_wattle);
        stair_slab_wall(block_wicker, stair_wicker, slab_wicker, wall_wicker);
    }

    //Stairs, Slabs, and Walls

    public static void stair_slab_wall(Block block, Block stair, Block slab, Block wall) {
        ModCraftingManager.addShapedRecipe(stair.getLocalizedName(), new ItemStack(stair, 4), 3,3,
                block, ItemStack.EMPTY, ItemStack.EMPTY,
                block, block, ItemStack.EMPTY,
                block, block, block);

        ModCraftingManager.addShapedRecipe(slab.getLocalizedName(), new ItemStack(slab, 6), 3, 1,
                block, block, block);

        ModCraftingManager.addShapedRecipe(block.getLocalizedName(), new ItemStack(block), 1, 2,
                slab,
                slab);
        ModCraftingManager.addShapedRecipe(wall.getLocalizedName(), new ItemStack(wall, 6), 3, 2,
                block, block, block,
                block, block, block);
    }

    public static void stair_slab_fence(ItemStack block, Block stair, Block slab, Block fence) {
        ModCraftingManager.addShapedRecipe(stair.getLocalizedName(), new ItemStack(stair, 4), 3,3,
                block, ItemStack.EMPTY, ItemStack.EMPTY,
                block, block, ItemStack.EMPTY,
                block, block, block);

        ModCraftingManager.addShapedRecipe(slab.getLocalizedName(), new ItemStack(slab, 6), 3, 1,
                block, block, block);

        ModCraftingManager.addShapedRecipe(block.getDisplayName(), block, 1, 2,
                slab,
                slab);
        ModCraftingManager.addShapedRecipe(fence.getLocalizedName(), new ItemStack(fence, 3),3, 2,
                block, Items.STICK, block,
                block, Items.STICK, block);
    }
}
