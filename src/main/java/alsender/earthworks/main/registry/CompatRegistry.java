package alsender.earthworks.main.registry;

import alsender.earthworks.block.*;
import alsender.earthworks.item.ModItem;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static alsender.earthworks.main.registry.RecipeRegistry.stair_slab_wall;

/**
 * Created by alsender on 3/10/17.
 */
public class CompatRegistry {

    public static Block
            block_planks_vert,
            block_reed,
            block_thatch,

            slab_planks_vert0,
            slab_planks_vert1,
            slab_planks_vert2,
            slab_planks_vert3,
            slab_planks_vert4,
            slab_planks_vert5,
            slab_reed,
            slab_thatch,

            stair_planks_vert0,
            stair_planks_vert1,
            stair_planks_vert2,
            stair_planks_vert3,
            stair_planks_vert4,
            stair_planks_vert5,
            stair_reed,
            stair_thatch,

            wall_planks_vert0,
            wall_planks_vert1,
            wall_planks_vert2,
            wall_planks_vert3,
            wall_planks_vert4,
            wall_planks_vert5,
            wall_reed,
            wall_thatch;

    public static Item
            item_dirt,
            item_sand;

    public static void initQuark() {
        block_planks_vert = new Block_Planks_Vert("block_planks_vert", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
        block_reed = new ModRotatedPillar("block_reed", Material.GRASS, SoundType.CLOTH, 0.8F, 1.0F);
        block_thatch = new ModRotatedPillar("block_thatch", Material.GRASS, SoundType.CLOTH, 0.8F, 1.0F);

/**     slab_planks_vert0 = new ModSlab("slab_planks_vert_oak", block_planks_vert);
        slab_planks_vert1 = new ModSlab("slab_planks_vert_spruce", block_planks_vert);
        slab_planks_vert2 = new ModSlab("slab_planks_vert_birch", block_planks_vert);
        slab_planks_vert3 = new ModSlab("slab_planks_vert_jungle", block_planks_vert);
        slab_planks_vert4 = new ModSlab("slab_planks_vert_acacia", block_planks_vert);
        slab_planks_vert5 = new ModSlab("slab_planks_vert_dark_oak", block_planks_vert);
 */     slab_reed = new ModSlab("slab_reed", block_reed);
        slab_thatch = new ModSlab("slab_thatch", block_thatch);

/**     stair_planks_vert0 = new ModStair("stair_planks_vert_oak", block_planks_vert);
        stair_planks_vert1 = new ModStair("stair_planks_vert_spruce", block_planks_vert);
        stair_planks_vert2 = new ModStair("stair_planks_vert_birch", block_planks_vert);
        stair_planks_vert3 = new ModStair("stair_planks_vert_jungle", block_planks_vert);
        stair_planks_vert4 = new ModStair("stair_planks_vert_acacia", block_planks_vert);
        stair_planks_vert5 = new ModStair("stair_planks_vert_dark_oak", block_planks_vert);
 */     stair_reed = new ModStair("stair_reed", block_reed);
        stair_thatch = new ModStair("stair_thatch", block_thatch);

/**     wall_planks_vert0 = new ModWall("wall_planks_vert_oak", block_planks_vert);
        wall_planks_vert1 = new ModWall("wall_planks_vert_oak", block_planks_vert);
        wall_planks_vert2 = new ModWall("wall_planks_vert_oak", block_planks_vert);
        wall_planks_vert3 = new ModWall("wall_planks_vert_oak", block_planks_vert);
        wall_planks_vert4 = new ModWall("wall_planks_vert_oak", block_planks_vert);
        wall_planks_vert5 = new ModWall("wall_planks_vert_oak", block_planks_vert);
 */     wall_reed = new ModWall("wall_reed", block_reed);
        wall_thatch = new ModWall("wall_thatch", block_thatch);
    }

    @SideOnly(Side.CLIENT)
    public static void initQuarkModels() {

        ((Block_Planks_Vert)block_planks_vert).initModel();
        ((ModRotatedPillar)block_reed).initModel();
        ((ModRotatedPillar)block_thatch).initModel();

/**     ((ModSlab)slab_planks_vert0).initModel();
        ((ModSlab)slab_planks_vert1).initModel();
        ((ModSlab)slab_planks_vert2).initModel();
        ((ModSlab)slab_planks_vert3).initModel();
        ((ModSlab)slab_planks_vert4).initModel();
        ((ModSlab)slab_planks_vert5).initModel();
 */     ((ModSlab)slab_reed).initModel();
        ((ModSlab)slab_thatch).initModel();

/**     ((ModStair)stair_planks_vert0).initModel();
        ((ModStair)stair_planks_vert1).initModel();
        ((ModStair)stair_planks_vert2).initModel();
        ((ModStair)stair_planks_vert3).initModel();
        ((ModStair)stair_planks_vert4).initModel();
        ((ModStair)stair_planks_vert5).initModel();
 */     ((ModStair)stair_reed).initModel();
        ((ModStair)stair_thatch).initModel();

/**     ((ModWall)wall_planks_vert0).initModel();
        ((ModWall)wall_planks_vert1).initModel();
        ((ModWall)wall_planks_vert2).initModel();
        ((ModWall)wall_planks_vert3).initModel();
        ((ModWall)wall_planks_vert4).initModel();
        ((ModWall)wall_planks_vert5).initModel();
 */     ((ModWall)wall_reed).initModel();
        ((ModWall)wall_thatch).initModel();
    }

    public static void initQuarkRecipe() {

        GameRegistry.addShapedRecipe(new ItemStack(block_reed),
                "RR","RR",
                'R', Items.REEDS);

        GameRegistry.addShapedRecipe(new ItemStack(block_thatch),
                "WW","WW",
                'W', Items.WHEAT);

        stair_slab_wall(block_reed, stair_reed, slab_reed, wall_reed);
        stair_slab_wall(block_thatch, stair_thatch, slab_thatch, wall_thatch);
    }

    public static void initBTM() {
        item_dirt = new ModItem("dirt");
        item_sand = new ModItem("sand");
    }

    @SideOnly(Side.CLIENT)
    public static void initBTMModels() {
        ((ModItem)item_dirt).initModel();
        ((ModItem)item_sand).initModel();
    }

    public static void initBTMRecipe() {

        GameRegistry.addShapedRecipe(new ItemStack(Blocks.DIRT),
                "DD","DD",
                'D', item_dirt);

        GameRegistry.addShapedRecipe(new ItemStack(Blocks.SAND),
                "SS","SS",
                'S', item_sand);

        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.item_adobe, 8),
                Items.CLAY_BALL, Items.CLAY_BALL, Items.CLAY_BALL,
                Items.CLAY_BALL, Items.WHEAT, Items.CLAY_BALL,
                Items.CLAY_BALL, item_sand, item_sand);

        GameRegistry.addShapelessRecipe(new ItemStack(item_dirt, 4),
                Blocks.DIRT);

        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.item_lime_plaster, 2),
                ItemRegistry.item_slaked_lime, item_sand);

        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.item_lime_plaster, 8),
                ItemRegistry.item_quicklime, ItemRegistry.item_quicklime, ItemRegistry.item_quicklime,
                ItemRegistry.item_quicklime, Items.WATER_BUCKET, item_sand,
                item_sand, item_sand, item_sand);

        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.item_mud, 8),
                item_dirt, item_dirt, item_dirt,
                item_dirt, Items.WATER_BUCKET, item_dirt,
                item_dirt, item_dirt, item_dirt);

        GameRegistry.addShapelessRecipe(new ItemStack(item_sand, 4),
                Blocks.SAND);
    }
}
