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

import static alsender.earthworks.main.registry.CompatRegistry.block_thatch;

/**
 * Created by alsender on 12/12/16.
 */
public class RecipeRegistry {

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

        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.block_slate),
                "FF","FF",
                'F', Items.FLINT);

        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.block_slate_slab,8),
                "SSS","S S","SSS",
                'S', BlockRegistry.block_slate);

        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.block_slate_shingle,4),
                "SS","SS",
                'S',BlockRegistry.block_slate);

        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.block_slate_tile,4),
                "SS","SS",
                'S',BlockRegistry.block_slate_slab);

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

//Slabs

        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.slab_slate_shingle,6),
                "SSS",
                'S',BlockRegistry.block_slate_shingle);

        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.slab_slate_tile,6),
                "SSS",
                'S',BlockRegistry.block_slate_tile);

//Stairs

        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.stair_slate_shingle,4),
                "S  ","SS ","SSS",
                'S',BlockRegistry.block_slate_shingle);
        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.stair_slate_shingle, 4),
                "  S"," SS","SSS",
                'S',BlockRegistry.block_slate_shingle);

        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.stair_slate_tile,4),
                "S  ","SS ","SSS",
                'S',BlockRegistry.block_slate_tile);
        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.stair_slate_tile,4),
                "  S"," SS","SSS",
                'S',BlockRegistry.block_slate_tile);

//Walls

//Item Recipes
        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.item_cob, 8),
                Items.CLAY_BALL, Items.CLAY_BALL, Items.CLAY_BALL,
                Items.CLAY_BALL, Items.WHEAT, ItemRegistry.item_mud,
                ItemRegistry.item_mud, ItemRegistry.item_mud, ItemRegistry.item_mud);

        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.item_slaked_lime, 8),
                ItemRegistry.item_quicklime, ItemRegistry.item_quicklime, ItemRegistry.item_quicklime,
                ItemRegistry.item_quicklime, Items.WATER_BUCKET, ItemRegistry.item_quicklime,
                ItemRegistry.item_quicklime, ItemRegistry.item_quicklime, ItemRegistry.item_quicklime);

//Compat Recipes

        if (Loader.isModLoaded("quark")) {
            Block thatch = Block.REGISTRY.getObject(new ResourceLocation("quark", "thatch"));
            GameRegistry.addShapelessRecipe(new ItemStack(block_thatch), thatch);
            GameRegistry.addShapelessRecipe(new ItemStack(thatch), block_thatch);
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
            GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.item_adobe, 8),
                    Items.CLAY_BALL, Items.CLAY_BALL, Items.CLAY_BALL,
                    Items.CLAY_BALL, Items.WHEAT, Items.CLAY_BALL,
                    Items.CLAY_BALL, sand, sand);
            GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.item_lime_plaster, 2),
                    ItemRegistry.item_slaked_lime, sand);
            GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.item_lime_plaster, 8),
                    ItemRegistry.item_quicklime, ItemRegistry.item_quicklime, ItemRegistry.item_quicklime,
                    ItemRegistry.item_quicklime, Items.WATER_BUCKET, sand,
                    sand, sand, sand);
            GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.item_mud, 8),
                    dirt, dirt, dirt,
                    dirt, Items.WATER_BUCKET, dirt,
                    dirt, dirt, dirt);
        }

//Furnace Recipes
        GameRegistry.addSmelting(ItemRegistry.item_chalk, new ItemStack(ItemRegistry.item_quicklime), 0.1F);
        GameRegistry.addSmelting(BlockRegistry.block_chalk, new ItemStack(ItemRegistry.item_quicklime, 4), 0.1F);

        brick(BlockRegistry.block_concrete, BlockRegistry.block_cinder);

        stair_slab_wall(BlockRegistry.block_adobe, BlockRegistry.stair_adobe, BlockRegistry.slab_adobe, BlockRegistry.wall_adobe);
        stair_slab_wall(BlockRegistry.block_cob, BlockRegistry.stair_cob, BlockRegistry.slab_cob, BlockRegistry.wall_cob);
        stair_slab_wall(BlockRegistry.block_cinder, BlockRegistry.stair_cinder, BlockRegistry.slab_cinder, BlockRegistry.wall_cinder);
        stair_slab_wall(BlockRegistry.block_chalk,BlockRegistry.stair_chalk,BlockRegistry.slab_chalk,BlockRegistry.wall_chalk);
        stair_slab_wall(BlockRegistry.block_concrete, BlockRegistry.stair_concrete, BlockRegistry.slab_concrete, BlockRegistry.wall_concrete);
        stair_slab_wall(BlockRegistry.block_cordwood, BlockRegistry.stair_cordwood,BlockRegistry.slab_cordwood,BlockRegistry.wall_cordwood);
        stair_slab_wall(BlockRegistry.block_dry_stone, BlockRegistry.stair_dry_stone, BlockRegistry.slab_dry_stone, BlockRegistry.wall_dry_stone);
        stair_slab_wall(BlockRegistry.block_mud, BlockRegistry.stair_mud, BlockRegistry.slab_mud, BlockRegistry.wall_mud);
        stair_slab_wall(BlockRegistry.block_plaster, BlockRegistry.stair_plaster, BlockRegistry.slab_plaster, BlockRegistry.wall_plaster);
        stair_slab_wall(BlockRegistry.block_rammed_earth, BlockRegistry.stair_rammed_earth, BlockRegistry.slab_rammed_earth, BlockRegistry.wall_rammed_earth);
        stair_slab_wall(BlockRegistry.block_slate, BlockRegistry.stair_slate, BlockRegistry.slab_slate, BlockRegistry.wall_slate);
        stair_slab_wall(BlockRegistry.block_slate_slab,BlockRegistry.stair_slate_slab,BlockRegistry.slab_slate_slab,BlockRegistry.wall_slate_slab);
        stair_slab_wall(BlockRegistry.block_timber, BlockRegistry.stair_timber, BlockRegistry.slab_timber, BlockRegistry.wall_timber);
        stair_slab_wall(BlockRegistry.block_wattle, BlockRegistry.stair_wattle, BlockRegistry.slab_wattle, BlockRegistry.wall_wattle);
        stair_slab_wall(BlockRegistry.block_wicker, BlockRegistry.stair_wicker, BlockRegistry.slab_wicker, BlockRegistry.wall_wicker);
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
