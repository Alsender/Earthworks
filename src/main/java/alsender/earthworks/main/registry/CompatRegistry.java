package alsender.earthworks.main.registry;

import alsender.earthworks.block.*;
import alsender.earthworks.item.ModItem;
import alsender.earthworks.main.crafting.ShapelessReturnRecipes;
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
import net.minecraftforge.oredict.ShapelessOreRecipe;

import static alsender.earthworks.main.registry.RecipeRegistry.stair_slab_wall;

/**
 * Created by alsender on 3/10/17.
 */
public class CompatRegistry {

    public static Block
            block_reed,
            block_thatch,

            slab_reed,
            slab_thatch,

            stair_reed,
            stair_thatch,

            wall_reed,
            wall_thatch;

    public static ModDoubleSlab
            doubleslab_reed,
            doubleslab_thatch;

    public static ModItemSlab
            itemslab_reed,
            itemslab_thatch;

    public static Item
            item_dirt,
            item_sand;

    public static void initQuark() {
        block_reed = new ModRotatedPillar("block_reed", Material.GRASS, SoundType.CLOTH, 0.8F, 1.0F);
        block_thatch = new ModRotatedPillar("block_thatch", Material.GRASS, SoundType.CLOTH, 0.8F, 1.0F);


        slab_reed = new ModSlab("slab_reed", block_reed);
        doubleslab_reed = new ModDoubleSlab(slab_reed);
        itemslab_reed = new ModItemSlab(slab_reed, doubleslab_reed);

        slab_thatch = new ModSlab("slab_thatch", block_thatch);
        doubleslab_thatch = new ModDoubleSlab(slab_thatch);
        itemslab_thatch = new ModItemSlab(slab_thatch, doubleslab_thatch);


        stair_reed = new ModStair("stair_reed", block_reed);
        stair_thatch = new ModStair("stair_thatch", block_thatch);

        wall_reed = new ModWall("wall_reed", block_reed);
        wall_thatch = new ModWall("wall_thatch", block_thatch);
    }

    @SideOnly(Side.CLIENT)
    public static void initQuarkModels() {

        ((ModRotatedPillar)block_reed).initModel();
        ((ModRotatedPillar)block_thatch).initModel();

        ((ModSlab)slab_reed).initModel();
        ((ModSlab)slab_thatch).initModel();

        ((ModStair)stair_reed).initModel();
        ((ModStair)stair_thatch).initModel();

        ((ModWall)wall_reed).initModel();
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

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemRegistry.item_adobe, 8),
                Items.CLAY_BALL, Items.CLAY_BALL, Items.CLAY_BALL,
                Items.CLAY_BALL, "vegetation", Items.CLAY_BALL,
                Items.CLAY_BALL, item_sand, item_sand));

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