package alsender.earthworks.main.recipe;

import alsender.earthworks.block.ModBlock;
import alsender.earthworks.block.ModBlocks;
import alsender.earthworks.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by alsender on 12/12/16.
 */
public class ModRecipes {

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

    public static void init() {
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.block_adobe),
                "CC",
                "CC",
                'C', ModBlocks.block_cob);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.block_cob),
                "CC",
                "CC",
                'C', ModItems.item_cob);

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.block_cob, 2),
                Blocks.CLAY, Items.WHEAT, ModBlocks.block_mud);

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.item_cob, 8),
                Items.CLAY_BALL, Items.CLAY_BALL, Items.CLAY_BALL, Items.CLAY_BALL,
                Items.WHEAT,
                ModItems.item_mud, ModItems.item_mud, ModItems.item_mud, ModItems.item_mud);

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.item_dirt, 4),
                Blocks.DIRT);

        GameRegistry.addShapedRecipe(new ItemStack(Blocks.DIRT),
                "DD",
                "DD",
                'D', ModItems.item_dirt);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.block_dry_stone, 8),
                "CCC",
                "C C",
                "CCC",
                'C', Blocks.STONE);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.block_mud, 8),
                "DDD",
                "DWD",
                "DDD",
                'D', Blocks.DIRT,
                'W', Items.WATER_BUCKET);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.block_mud),
                "DD",
                "DD",
                'D', ModItems.item_mud);

        GameRegistry.addShapedRecipe(new ItemStack(ModItems.item_mud, 8),
                "DDD",
                "DWD",
                "DDD",
                'D', ModItems.item_dirt,
                'W', Items.WATER_BUCKET);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.block_rammed_earth, 3),
                "   ",
                "DDD",
                "DDD",
                'D', Blocks.DIRT);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.block_reed),
                "RR",
                "RR",
                'R', Items.REEDS);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.block_slate),
                "FFF",
                "FFF",
                "FFF",
                'F', Items.FLINT);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.block_thatch),
                "WW",
                "WW",
                'W', Items.WHEAT);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.block_wattle, 8),
                "CCC",
                "CWC",
                "CCC",
                'C', ModBlocks.block_cob,
                'W', ModBlocks.block_wicker);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.block_wattle, 2),
                "CCC",
                "CWC",
                "CCC",
                'C', ModItems.item_cob,
                'W', ModBlocks.block_wicker);

        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.block_wicker, 2),
                "SWS",
                "W W",
                "SWS",
                'W', Items.WHEAT,
                'S', Items.STICK);
        stair_slab_wall(ModBlocks.block_adobe, ModBlocks.stair_adobe, ModBlocks.slab_adobe, ModBlocks.wall_adobe);
        stair_slab_wall(ModBlocks.block_cob, ModBlocks.stair_cob, ModBlocks.slab_cob, ModBlocks.wall_cob);
        stair_slab_wall(ModBlocks.block_dry_stone, ModBlocks.stair_dry_stone, ModBlocks.slab_dry_stone, ModBlocks.wall_dry_stone);
        stair_slab_wall(ModBlocks.block_mud, ModBlocks.stair_mud, ModBlocks.slab_mud, ModBlocks.wall_mud);
        stair_slab_wall(ModBlocks.block_rammed_earth, ModBlocks.stair_rammed_earth, ModBlocks.slab_rammed_earth, ModBlocks.wall_rammed_earth);
        stair_slab_wall(ModBlocks.block_reed, ModBlocks.stair_reed, ModBlocks.slab_reed, ModBlocks.wall_reed);
        stair_slab_wall(ModBlocks.block_slate, ModBlocks.stair_slate, ModBlocks.slab_slate, ModBlocks.wall_slate);
        stair_slab_wall(ModBlocks.block_thatch, ModBlocks.stair_thatch, ModBlocks.slab_thatch, ModBlocks.wall_thatch);
        stair_slab_wall(ModBlocks.block_wattle, ModBlocks.stair_wattle, ModBlocks.slab_wattle, ModBlocks.wall_wattle);
        stair_slab_wall(ModBlocks.block_wicker, ModBlocks.stair_wicker, ModBlocks.slab_wicker, ModBlocks.wall_wicker);
    }
}
