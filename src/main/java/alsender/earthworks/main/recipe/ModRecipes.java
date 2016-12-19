package alsender.earthworks.main.recipe;

import alsender.earthworks.block.ModBlocks;
import alsender.earthworks.item.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by alsender on 12/12/16.
 */
public class ModRecipes {

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
    }
}
