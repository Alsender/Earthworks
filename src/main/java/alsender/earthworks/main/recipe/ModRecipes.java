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
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.block_adobe, 4),
                "CC",
                "CC",
                'C', ModBlocks.block_cob);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.block_cob),
                "CC",
                "CC",
                'C', ModItems.item_cob);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.item_cob, 8),
                Items.CLAY_BALL, ModItems.item_dirt, Items.WHEAT);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.item_dirt, 9),
                Blocks.DIRT);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.DIRT),
                ModItems.item_dirt);
        GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.block_mud, 8),
                "DDD",
                "DWD",
                "DDD",
                'D', Blocks.DIRT,
                'W', Items.WATER_BUCKET);
    }
}
