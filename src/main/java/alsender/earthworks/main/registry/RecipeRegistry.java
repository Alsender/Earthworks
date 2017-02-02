package alsender.earthworks.main.registry;

import alsender.earthworks.main.Config;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by alsender on 12/12/16.
 */
public class RecipeRegistry {

    //Stairs, Slabs, and Walls

    private static void stair_slab_wall(Block block, Block stair, Block slab, Block wall) {
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

    public static void init() {

//Block Recipes

        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.block_adobe),
                "AA","AA",
                'A', ItemRegistry.item_adobe);

        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.block_cob),
                "CC","CC",
                'C', ItemRegistry.item_cob);

        GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.block_cob, 2),
                Blocks.CLAY, Items.WHEAT, BlockRegistry.block_mud);

        GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.block_concrete, 2),
                Blocks.GRAVEL, ItemRegistry.item_lime_plaster, Blocks.SAND);

        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.block_cordwood, 5),
                "WPW","PWP","WPW",
                'W', Blocks.LOG,
                'P', ItemRegistry.item_lime_plaster);

        GameRegistry.addShapedRecipe(new ItemStack(Blocks.DIRT),
                "DD","DD",
                'D', ItemRegistry.item_dirt);

        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.block_dry_stone, 8),
                "CCC","C C","CCC",
                'C', Blocks.STONE);

        GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.block_mud, 8),
                Blocks.DIRT, Blocks.DIRT, Blocks.DIRT,
                Blocks.DIRT, Items.WATER_BUCKET, Blocks.DIRT,
                Blocks.DIRT, Blocks.DIRT, Blocks.DIRT);

        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.block_mud),
                "DD","DD",
                'D', ItemRegistry.item_mud);

        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.block_plaster),
                " P ","PWP"," P ",
                'P', ItemRegistry.item_lime_plaster,
                'W', Blocks.PLANKS);

        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.block_rammed_earth, 3),
                "   ","DDD","DDD",
                'D', Blocks.DIRT);

        if (Config.generate_quark ==true) {
            GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.block_reed),
                    "RR","RR",
                    'R', Items.REEDS);
        }

        GameRegistry.addShapedRecipe(new ItemStack(Blocks.SAND),
                "SS","SS",
                'S', ItemRegistry.item_sand);

        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.block_slate),
                "FF","FF",'F', Items.FLINT);

        if (Config.generate_quark ==true) {
            GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.block_thatch),
                    "WW","WW",
                    'W', Items.WHEAT);
        }

        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.block_wattle, 8),
                "CCC","CWC","CCC",
                'C', BlockRegistry.block_cob,
                'W', BlockRegistry.block_wicker);

        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.block_wattle, 2),
                "CCC","CWC","CCC",
                'C', ItemRegistry.item_cob,
                'W', BlockRegistry.block_wicker);

        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.block_wicker, 2),
                "SWS","W W","SWS",
                'W', Items.WHEAT,
                'S', Items.STICK);

        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.block_chalk),
                "CC","CC",
                'C', ItemRegistry.item_chalk);

//Item Recipes
        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.item_adobe, 8),
                Items.CLAY_BALL, Items.CLAY_BALL, Items.CLAY_BALL,
                Items.CLAY_BALL, Items.WHEAT, Items.CLAY_BALL,
                Items.CLAY_BALL, ItemRegistry.item_sand, ItemRegistry.item_sand);

        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.item_cob, 8),
                Items.CLAY_BALL, Items.CLAY_BALL, Items.CLAY_BALL,
                Items.CLAY_BALL, Items.WHEAT, ItemRegistry.item_mud,
                ItemRegistry.item_mud, ItemRegistry.item_mud, ItemRegistry.item_mud);

        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.item_dirt, 4),
                Blocks.DIRT);

        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.item_lime_plaster, 2),
                ItemRegistry.item_slaked_lime, ItemRegistry.item_sand);

        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.item_lime_plaster, 8),
                ItemRegistry.item_quicklime, ItemRegistry.item_quicklime, ItemRegistry.item_quicklime,
                ItemRegistry.item_quicklime, Items.WATER_BUCKET, ItemRegistry.item_sand,
                ItemRegistry.item_sand, ItemRegistry.item_sand, ItemRegistry.item_sand);

        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.item_mud, 8),
                ItemRegistry.item_dirt, ItemRegistry.item_dirt, ItemRegistry.item_dirt,
                ItemRegistry.item_dirt, Items.WATER_BUCKET, ItemRegistry.item_dirt,
                ItemRegistry.item_dirt, ItemRegistry.item_dirt, ItemRegistry.item_dirt);

        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.item_sand, 4),
                Blocks.SAND);

        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.item_slaked_lime, 8),
                ItemRegistry.item_quicklime, ItemRegistry.item_quicklime, ItemRegistry.item_quicklime,
                ItemRegistry.item_quicklime, Items.WATER_BUCKET, ItemRegistry.item_quicklime,
                ItemRegistry.item_quicklime, ItemRegistry.item_quicklime, ItemRegistry.item_quicklime);

//Furnace Recipes
        GameRegistry.addSmelting(ItemRegistry.item_chalk, new ItemStack(ItemRegistry.item_quicklime), 0.1F);
        GameRegistry.addSmelting(BlockRegistry.block_chalk, new ItemStack(ItemRegistry.item_quicklime, 4), 0.1F);

        brick(BlockRegistry.block_concrete, BlockRegistry.block_cinder);

        stair_slab_wall(BlockRegistry.block_adobe, BlockRegistry.stair_adobe, BlockRegistry.slab_adobe, BlockRegistry.wall_adobe);
        stair_slab_wall(BlockRegistry.block_cob, BlockRegistry.stair_cob, BlockRegistry.slab_cob, BlockRegistry.wall_cob);
        stair_slab_wall(BlockRegistry.block_cinder, BlockRegistry.stair_cinder, BlockRegistry.slab_cinder, BlockRegistry.wall_cinder);
        stair_slab_wall(BlockRegistry.block_dry_stone, BlockRegistry.stair_dry_stone, BlockRegistry.slab_dry_stone, BlockRegistry.wall_dry_stone);
        stair_slab_wall(BlockRegistry.block_concrete, BlockRegistry.stair_concrete, BlockRegistry.slab_concrete, BlockRegistry.wall_concrete);
        stair_slab_wall(BlockRegistry.block_mud, BlockRegistry.stair_mud, BlockRegistry.slab_mud, BlockRegistry.wall_mud);
        stair_slab_wall(BlockRegistry.block_plaster, BlockRegistry.stair_plaster, BlockRegistry.slab_plaster, BlockRegistry.wall_plaster);
        stair_slab_wall(BlockRegistry.block_rammed_earth, BlockRegistry.stair_rammed_earth, BlockRegistry.slab_rammed_earth, BlockRegistry.wall_rammed_earth);
        if (Config.generate_quark ==true) {
            stair_slab_wall(BlockRegistry.block_reed, BlockRegistry.stair_reed, BlockRegistry.slab_reed, BlockRegistry.wall_reed);
        }
        stair_slab_wall(BlockRegistry.block_slate, BlockRegistry.stair_slate, BlockRegistry.slab_slate, BlockRegistry.wall_slate);
        if (Config.generate_quark ==true) {
            stair_slab_wall(BlockRegistry.block_thatch, BlockRegistry.stair_thatch, BlockRegistry.slab_thatch, BlockRegistry.wall_thatch);
        }
        stair_slab_wall(BlockRegistry.block_timber, BlockRegistry.stair_timber, BlockRegistry.slab_timber, BlockRegistry.wall_timber);
        stair_slab_wall(BlockRegistry.block_wattle, BlockRegistry.stair_wattle, BlockRegistry.slab_wattle, BlockRegistry.wall_wattle);
        stair_slab_wall(BlockRegistry.block_wicker, BlockRegistry.stair_wicker, BlockRegistry.slab_wicker, BlockRegistry.wall_wicker);

    // compat recipes
        if (Config.generate_quark ==true) {
            if (Loader.isModLoaded("Quark")) {
                Block thatch = Block.REGISTRY.getObject(new ResourceLocation("quark", "thatch"));
                GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.block_thatch), thatch);
                GameRegistry.addShapelessRecipe(new ItemStack(thatch), BlockRegistry.block_thatch);
            }
        }
    }
}
