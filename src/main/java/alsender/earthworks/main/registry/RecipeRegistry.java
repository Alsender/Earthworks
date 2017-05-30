package alsender.earthworks.main.registry;

import alsender.earthworks.main.Config;
import alsender.earthworks.main.crafting.ModCraftingManager;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import static alsender.earthworks.main.registry.BlockRegistry.*;
import static alsender.earthworks.main.registry.ItemRegistry.*;
import static alsender.earthworks.main.registry.CompatRegistry.block_thatch;

/**
 * Created by alsender on 12/12/16.
 */
public class RecipeRegistry {

    public static void init() {

//Block Recipes

        GameRegistry.addShapedRecipe(new ItemStack(block_adobe),
                "AA","AA",
                'A', item_adobe);

        GameRegistry.addShapedRecipe(new ItemStack(block_chalk),
                "CC","CC",
                'C', item_chalk);

        GameRegistry.addShapedRecipe(new ItemStack(block_cob),
                "CC","CC",
                'C', item_cob);

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(block_cob, 2),
                Blocks.CLAY, "vegetation", block_mud));

        GameRegistry.addShapelessRecipe(new ItemStack(block_concrete, 2),
                Blocks.GRAVEL, item_lime_plaster, Blocks.SAND);

        GameRegistry.addShapedRecipe(new ItemStack(block_cordwood, 5),
                "WPW","PWP","WPW",
                'W', Blocks.LOG,
                'P', item_lime_plaster);

        GameRegistry.addShapedRecipe(new ItemStack(block_dry_stone, 8),
                "CCC","C C","CCC",
                'C', new ItemStack(Blocks.STONE, 1, 0));

        GameRegistry.addShapedRecipe(new ItemStack(block_gabion0, 2),
                "SWS","WGW","SWS",
                'W', Items.WHEAT,
                'S', Items.STICK,
                'G', Blocks.GRAVEL);

        GameRegistry.addShapedRecipe(new ItemStack(block_gabion1, 2),
                "SWS","WGW","SWS",
                'W', Items.WHEAT,
                'S', Items.STICK,
                'G', new ItemStack(Blocks.SAND, 1, 0));

        GameRegistry.addShapedRecipe(new ItemStack(block_gabion2, 2),
                "SWS","WGW","SWS",
                'W', Items.WHEAT,
                'S', Items.STICK,
                'G', Blocks.DIRT);

        GameRegistry.addShapelessRecipe(new ItemStack(block_mud, 8),
                Blocks.DIRT, Blocks.DIRT, Blocks.DIRT,
                Blocks.DIRT, Items.WATER_BUCKET, Blocks.DIRT,
                Blocks.DIRT, Blocks.DIRT, Blocks.DIRT);

        GameRegistry.addShapedRecipe(new ItemStack(block_mud),
                "DD","DD",
                'D', item_mud);

        Block woodPlankVert;

        if (!Loader.isModLoaded("Quark") || Config.persistantplanks == true) {
            woodPlankVert = block_planks_vert;
        } else {
            woodPlankVert = Block.REGISTRY.getObject(new ResourceLocation("quark", "vertical_planks"));
        }

        GameRegistry.addShapelessRecipe(new ItemStack(woodPlankVert, 4, 0),
                block_timber_oak);

        GameRegistry.addShapelessRecipe(new ItemStack(woodPlankVert, 4, 1),
                block_timber_spruce);

        GameRegistry.addShapelessRecipe(new ItemStack(woodPlankVert, 4, 2),
                block_timber_birch);

        GameRegistry.addShapelessRecipe(new ItemStack(woodPlankVert, 4, 3),
                block_timber_jungle);

        GameRegistry.addShapelessRecipe(new ItemStack(woodPlankVert, 4, 4),
                block_timber_acacia);

        GameRegistry.addShapelessRecipe(new ItemStack(woodPlankVert, 4, 5),
                block_timber_dark_oak);

        GameRegistry.addShapedRecipe(new ItemStack(block_plaster),
                " P ","PWP"," P ",
                'P', item_lime_plaster,
                'W', Blocks.PLANKS);

        GameRegistry.addShapedRecipe(new ItemStack(block_rammed_earth, 3),
                "   ","DDD","DDD",
                'D', Blocks.DIRT);

        GameRegistry.addShapedRecipe(new ItemStack(block_slate),
                "FF","FF",
                'F', Items.FLINT);

        GameRegistry.addShapelessRecipe(new ItemStack(block_slate_green),
                block_slate);

        GameRegistry.addShapelessRecipe(new ItemStack(block_slate_purple),
                block_slate_green);

        GameRegistry.addShapedRecipe(new ItemStack(block_slate_slab,8),
                "SSS","S S","SSS",
                'S', block_slate);

        GameRegistry.addShapedRecipe(new ItemStack(block_slate_slab_green,8),
                "SSS","S S","SSS",
                'S', block_slate_green);

        GameRegistry.addShapedRecipe(new ItemStack(block_slate_slab_purple,8),
                "SSS","S S","SSS",
                'S', block_slate_purple);

        GameRegistry.addShapedRecipe(new ItemStack(block_slate_shingle,4),
                "SS","SS",
                'S',block_slate);

        GameRegistry.addShapedRecipe(new ItemStack(block_slate_shingle_verte,4),
                "SS","SS",
                'S',block_slate_green);

        GameRegistry.addShapedRecipe(new ItemStack(block_slate_shingle_purple,4),
                "SS","SS",
                'S',block_slate_purple);

        GameRegistry.addShapedRecipe(new ItemStack(block_slate_tile,4),
                "SS","SS",
                'S',block_slate_slab);

        GameRegistry.addShapedRecipe(new ItemStack(block_slate_tile_verte,4),
                "SS","SS",
                'S',block_slate_slab_green);

        GameRegistry.addShapedRecipe(new ItemStack(block_slate_tile_purple,4),
                "SS","SS",
                'S',block_slate_slab_purple);

        GameRegistry.addShapedRecipe(new ItemStack(block_wattle, 8),
                "CCC","CWC","CCC",
                'C', block_cob,
                'W', block_wicker);

        GameRegistry.addShapedRecipe(new ItemStack(block_wattle, 2),
                "CCC","CWC","CCC",
                'C', item_cob,
                'W', block_wicker);

        GameRegistry.addShapedRecipe(new ItemStack(block_wicker, 2),
                "SWS","W W","SWS",
                'W', Items.WHEAT,
                'S', Items.STICK);

        for (int i = 0; i < 4; i++) {
            ModCraftingManager.addShapelessReturnRecipe(new ItemStack(block_wood_shingle, 6, i),
                    new ItemStack(Blocks.LOG, 1, i), Items.FLINT);
        }

        for (int i = 0; i < 2; i++) {
            ModCraftingManager.addShapelessReturnRecipe(new ItemStack(block_wood_shingle, 6, (i+4)),
                    new ItemStack(Blocks.LOG2, 1, i), Items.FLINT);
        }

        ModCraftingManager.addShapelessReturnRecipe(new ItemStack(block_wood_shingle, 6, 0),
                block_timber_oak, Items.FLINT);

        ModCraftingManager.addShapelessReturnRecipe(new ItemStack(block_wood_shingle, 6, 1),
                block_timber_spruce, Items.FLINT);

        ModCraftingManager.addShapelessReturnRecipe(new ItemStack(block_wood_shingle, 6, 2),
                block_timber_birch, Items.FLINT);

        ModCraftingManager.addShapelessReturnRecipe(new ItemStack(block_wood_shingle, 6, 3),
                block_timber_jungle, Items.FLINT);

        ModCraftingManager.addShapelessReturnRecipe(new ItemStack(block_wood_shingle, 6, 4),
                block_timber_acacia, Items.FLINT);

        ModCraftingManager.addShapelessReturnRecipe(new ItemStack(block_wood_shingle, 6, 5),
                block_timber_dark_oak, Items.FLINT);

//Slabs

	GameRegistry.addShapedRecipe(new ItemStack(slab_wood_shingle_oak, 6),
                "BBB",
                'B', new ItemStack(block_wood_shingle, 1, 0));

        GameRegistry.addShapedRecipe(new ItemStack(slab_wood_shingle_spruce, 6),
                "BBB",
                'B', new ItemStack(block_wood_shingle, 1, 1));

        GameRegistry.addShapedRecipe(new ItemStack(slab_wood_shingle_birch, 6),
                "BBB",
                'B', new ItemStack(block_wood_shingle, 1, 2));

        GameRegistry.addShapedRecipe(new ItemStack(slab_wood_shingle_jungle, 6),
                "BBB",
                'B', new ItemStack(block_wood_shingle, 1, 3));

        GameRegistry.addShapedRecipe(new ItemStack(slab_wood_shingle_acacia, 6),
                "BBB",
                'B', new ItemStack(block_wood_shingle, 1, 4));

        GameRegistry.addShapedRecipe(new ItemStack(slab_wood_shingle_dark_oak, 6),
                "BBB",
                'B', new ItemStack(block_wood_shingle, 1, 5));

//Stairs

	GameRegistry.addShapedRecipe(new ItemStack(stair_wood_shingle_oak, 4),
                "B  ",
                "BB ",
                "BBB",
                'B', new ItemStack(block_wood_shingle, 1, 0));

        GameRegistry.addShapedRecipe(new ItemStack(stair_wood_shingle_spruce, 4),
                "B  ",
                "BB ",
                "BBB",
                'B', new ItemStack(block_wood_shingle, 1, 1));

        GameRegistry.addShapedRecipe(new ItemStack(stair_wood_shingle_birch, 4),
                "B  ",
                "BB ",
                "BBB",
                'B', new ItemStack(block_wood_shingle, 1, 2));

        GameRegistry.addShapedRecipe(new ItemStack(stair_wood_shingle_jungle, 4),
                "B  ",
                "BB ",
                "BBB",
                'B', new ItemStack(block_wood_shingle, 1, 3));

        GameRegistry.addShapedRecipe(new ItemStack(stair_wood_shingle_acacia, 4),
                "B  ",
                "BB ",
                "BBB",
                'B', new ItemStack(block_wood_shingle, 1, 4));

        GameRegistry.addShapedRecipe(new ItemStack(stair_wood_shingle_dark_oak, 4),
                "B  ",
                "BB ",
                "BBB",
                'B', new ItemStack(block_wood_shingle, 1, 5));

//Walls

        GameRegistry.addShapedRecipe(new ItemStack(wall_wood_shingle_oak, 6),
                "BBB",
                "BBB",
                'B', new ItemStack(block_wood_shingle, 1, 0));

        GameRegistry.addShapedRecipe(new ItemStack(wall_wood_shingle_spruce, 6),
                "BBB",
                "BBB",
                'B', new ItemStack(block_wood_shingle, 1, 1));

        GameRegistry.addShapedRecipe(new ItemStack(wall_wood_shingle_birch, 6),
                "BBB",
                "BBB",
                'B', new ItemStack(block_wood_shingle, 1, 2));

        GameRegistry.addShapedRecipe(new ItemStack(wall_wood_shingle_jungle, 6),
                "BBB",
                "BBB",
                'B', new ItemStack(block_wood_shingle, 1, 3));

        GameRegistry.addShapedRecipe(new ItemStack(wall_wood_shingle_acacia, 6),
                "BBB",
                "BBB",
                'B', new ItemStack(block_wood_shingle, 1, 4));

        GameRegistry.addShapedRecipe(new ItemStack(wall_wood_shingle_dark_oak, 6),
                "BBB",
                "BBB",
                'B', new ItemStack(block_wood_shingle, 1, 5));

//Item Recipes

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(item_cob, 8),
                Items.CLAY_BALL, Items.CLAY_BALL, Items.CLAY_BALL,
                Items.CLAY_BALL, "vegetation", item_mud,
                item_mud, item_mud, item_mud));

        GameRegistry.addShapelessRecipe(new ItemStack(item_slaked_lime, 8),
                item_quicklime, item_quicklime, item_quicklime,
                item_quicklime, Items.WATER_BUCKET, item_quicklime,
                item_quicklime, item_quicklime, item_quicklime);

//Tool Recipes

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(tool_square),
                "W  ","W  ","WWW",'W',"plankWood"));

        GameRegistry.addShapelessRecipe(new ItemStack(tool_Acheulean),
                Blocks.COBBLESTONE, Items.FLINT);
        GameRegistry.addShapelessRecipe(new ItemStack(tool_Acheulean),
                Blocks.STONE, Items.FLINT);

        GameRegistry.addShapedRecipe(new ItemStack(tool_adz),
                "IS "," S "," S ",'I', Items.IRON_INGOT, 'S', Items.STICK);

        GameRegistry.addShapelessRecipe(new ItemStack(tool_compass),
                Items.COMPASS);

        GameRegistry.addShapedRecipe(new ItemStack(tool_froe),
                "II "," S ",'I', Items.IRON_INGOT, 'S', Items.STICK);

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(tool_planer),
                "W W","WIW",'W', "plankWood", 'I', Items.IRON_INGOT));

        GameRegistry.addShapedRecipe(new ItemStack(tool_level),
                "GGG",'G', Items.GOLD_INGOT);

        GameRegistry.addShapedRecipe(new ItemStack(tool_saw),
                "IIS","DDS",'I', Items.IRON_INGOT, 'S', Items.STICK, 'D', Items.DIAMOND);

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(tool_wood_hammer),
                "WWW","WSW"," S ",'W', "plankWood", 'S', Items.STICK));

        GameRegistry.addShapedRecipe(new ItemStack(tool_stone_hammer),
                "WWW","WSW"," S ",'W', Blocks.COBBLESTONE, 'S', Items.STICK);

        GameRegistry.addShapedRecipe(new ItemStack(tool_iron_hammer),
                "WWW","WSW"," S ",'W', Items.IRON_INGOT, 'S', Items.STICK);

        GameRegistry.addShapedRecipe(new ItemStack(tool_gold_hammer),
                "WWW","WSW"," S ",'W', Items.GOLD_INGOT, 'S', Items.STICK);

        GameRegistry.addShapedRecipe(new ItemStack(tool_diamond_hammer),
                "WWW","WSW"," S ",'W', Items.DIAMOND, 'S', Items.STICK);

//Compat Recipes

        if (Loader.isModLoaded("Quark")) {
            if (Config.quark == true) {
                Block thatch = Block.REGISTRY.getObject(new ResourceLocation("quark", "thatch"));
                GameRegistry.addShapelessRecipe(new ItemStack(thatch), block_thatch);
            }
        }

        if (Loader.isModLoaded("betterwithmods")) {
            Item dirt = Item.REGISTRY.getObject(new ResourceLocation("betterwithmods", "dirt_pile"));
            Item sand = Item.REGISTRY.getObject(new ResourceLocation("betterwithmods", "sand_pile"));

            GameRegistry.addShapedRecipe(new ItemStack(Blocks.DIRT),
                    "DD", "DD",
                    'D', dirt);
            GameRegistry.addShapedRecipe(new ItemStack(Blocks.SAND),
                    "SS", "SS",
                    'S', sand);
            GameRegistry.addShapelessRecipe(new ItemStack(item_adobe, 8),
                    Items.CLAY_BALL, Items.CLAY_BALL, Items.CLAY_BALL,
                    Items.CLAY_BALL, Items.WHEAT, Items.CLAY_BALL,
                    Items.CLAY_BALL, sand, sand);
            GameRegistry.addShapelessRecipe(new ItemStack(item_lime_plaster, 2),
                    item_slaked_lime, sand);
            GameRegistry.addShapelessRecipe(new ItemStack(item_lime_plaster, 8),
                    item_quicklime, item_quicklime, item_quicklime,
                    item_quicklime, Items.WATER_BUCKET, sand,
                    sand, sand, sand);
            GameRegistry.addShapelessRecipe(new ItemStack(item_mud, 8),
                    dirt, dirt, dirt,
                    dirt, Items.WATER_BUCKET, dirt,
                    dirt, dirt, dirt);
        }

//Furnace Recipes

        GameRegistry.addSmelting(item_chalk, new ItemStack(item_quicklime), 0.1F);
        GameRegistry.addSmelting(block_chalk, new ItemStack(item_quicklime, 4), 0.1F);

//Extraneous

        brick(block_concrete, block_cinder);

        stair_slab_fence(new ItemStack(woodPlankVert, 1, 0), stair_planks_vert0, slab_planks_vert0, fence_planks_vert0);
        stair_slab_fence(new ItemStack(woodPlankVert, 1, 1), stair_planks_vert1, slab_planks_vert1, fence_planks_vert1);
        stair_slab_fence(new ItemStack(woodPlankVert, 1, 2), stair_planks_vert2, slab_planks_vert2, fence_planks_vert2);
        stair_slab_fence(new ItemStack(woodPlankVert, 1, 3), stair_planks_vert3, slab_planks_vert3, fence_planks_vert3);
        stair_slab_fence(new ItemStack(woodPlankVert, 1, 4), stair_planks_vert4, slab_planks_vert4, fence_planks_vert4);
        stair_slab_fence(new ItemStack(woodPlankVert, 1, 5), stair_planks_vert5, slab_planks_vert5, fence_planks_vert5);

        stair_slab_wall(block_adobe, stair_adobe, slab_adobe, wall_adobe);
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
        stair_slab_wall(block_slate_slab,stair_slate_slab,slab_slate_slab,wall_slate_slab);
        stair_slab_wall(block_slate_slab_green, stair_slate_slab_green, slab_slate_slab_green, wall_slate_slab_green);
        stair_slab_wall(block_slate_slab_purple, stair_slate_slab_purple, slab_slate_slab_purple, wall_slate_slab_purple);
        stair_slab_wall(block_slate_tile,stair_slate_tile,slab_slate_tile,wall_slate_tile);
        stair_slab_wall(block_slate_tile_verte, stair_slate_tile_verte, slab_slate_tile_verte, wall_slate_tile_verte);
        stair_slab_wall(block_slate_tile_purple, stair_slate_tile_purple, slab_slate_tile_purple, wall_slate_tile_purple);
        stair_slab_wall(block_wattle, stair_wattle, slab_wattle, wall_wattle);
        stair_slab_wall(block_wicker, stair_wicker, slab_wicker, wall_wicker);

    }
    //Stairs, Slabs, and Walls

    public static void stair_slab_wall(Block block, Block stair, Block slab, Block wall) {
        GameRegistry.addShapedRecipe(new ItemStack(stair, 4),
                "B  ",
                "BB ",
                "BBB",
                'B', block);
        GameRegistry.addShapedRecipe(new ItemStack(slab, 6),
                "BBB",
                'B', block);
        GameRegistry.addShapedRecipe(new ItemStack(block),
                "B",
                "B",
                'B', slab);
        GameRegistry.addShapedRecipe(new ItemStack(wall, 6),
                "BBB",
                "BBB",
                'B', block);
    }

    public static void stair_slab_fence(ItemStack block, Block stair, Block slab, Block fence) {
        GameRegistry.addShapedRecipe(new ItemStack(stair, 4),
                "B  ",
                "BB ",
                "BBB",
                'B', block);
        GameRegistry.addShapedRecipe(new ItemStack(slab, 6),
                "BBB",
                'B', block);
        GameRegistry.addShapedRecipe(block,
                "B",
                "B",
                'B', slab);
        GameRegistry.addShapedRecipe(new ItemStack(fence, 3),
                "BSB","BSB",
                'B', block, 'S', Items.STICK);
    }

    //Bricks

    private static void brick(Block blockIn, Block blockOut) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 4),
                "BB",
                "BB",
                'B', blockIn);
    }
    private static void brick(Item itemIn, Block blockOut) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 4),
                "BB",
                "BB",
                'B', itemIn);
    }
}
