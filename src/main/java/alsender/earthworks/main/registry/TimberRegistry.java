package alsender.earthworks.main.registry;


import alsender.earthworks.block.timber.*;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by alsender on 13/01/17.
 */
public class TimberRegistry {

    public static Block
            daub_cob_arrow0, daub_cob_arrow1, daub_cob_arrow2, daub_cob_arrow3,
            daub_cob_barndoor0, daub_cob_barndoor1, daub_cob_barndoor2, daub_cob_barndoor3,
            daub_cob_barndoor4, daub_cob_barndoor5, daub_cob_barndoor6, daub_cob_barndoor7,
            daub_cob_bottom_l, daub_cob_bottom, daub_cob_bottom_r,
            daub_cob_left, daub_cob_right,
            daub_cob_parallel_hor, daub_cob_parallel_vert,
            daub_cob_slash_back, daub_cob_slash,
            daub_cob_square, daub_cob_square_x, daub_cob_x,
            daub_cob_top_l, daub_cob_top, daub_cob_top_r,
            daub_cob_triangle0, daub_cob_triangle1, daub_cob_triangle2, daub_cob_triangle3,
            daub_cob_xbottom, daub_cob_xleft, daub_cob_xright, daub_cob_xtop,
            daub_cob_xdoor0, daub_cob_xdoor1, daub_cob_xdoor2, daub_cob_xdoor3;

    public static Block
            plaster_arrow0, plaster_arrow1, plaster_arrow2, plaster_arrow3,
            plaster_barndoor0, plaster_barndoor1, plaster_barndoor2, plaster_barndoor3,
            plaster_barndoor4, plaster_barndoor5, plaster_barndoor6, plaster_barndoor7,
            plaster_bottom_l, plaster_bottom, plaster_bottom_r,
            plaster_left, plaster_right,
            plaster_parallel_hor, plaster_parallel_vert,
            plaster_slash_back, plaster_slash,
            plaster_square, plaster_square_x, plaster_x,
            plaster_top_l, plaster_top, plaster_top_r,
            plaster_triangle0, plaster_triangle1, plaster_triangle2, plaster_triangle3,
            plaster_xbottom, plaster_xleft, plaster_xright, plaster_xtop,
            plaster_xdoor0, plaster_xdoor1, plaster_xdoor2, plaster_xdoor3;

    public static void init() {
        daub_cob_arrow0 = new Daub_Cob("arrow0","Bottom Left Framed Arrow");
        daub_cob_arrow1 = new Daub_Cob("arrow1","Top Left Framed Arrow");
        daub_cob_arrow2 = new Daub_Cob("arrow2","Bottom Right Framed Arrow");
        daub_cob_arrow3 = new Daub_Cob("arrow3","Top Right Framed Arrow");
        daub_cob_barndoor0 = new Daub_Cob("barndoor0","Upper Left Barndoor");
        daub_cob_barndoor1 = new Daub_Cob("barndoor1","Left Sideways Barndoor");
        daub_cob_barndoor2 = new Daub_Cob("barndoor2","Right Sideways Barndoor");
        daub_cob_barndoor3 = new Daub_Cob("barndoor3","Lower Left Barndoor");
        daub_cob_barndoor4 = new Daub_Cob("barndoor4","Lower Right Barndoor");
        daub_cob_barndoor5 = new Daub_Cob("barndoor5","Left Sideways Barndoor");
        daub_cob_barndoor6 = new Daub_Cob("barndoor6","Right Sideways Barndoor");
        daub_cob_barndoor7 = new Daub_Cob("barndoor7","Upper Right Barndoor");
        daub_cob_bottom_l = new Daub_Cob("bottom_l","Bottom Left Framed");
        daub_cob_bottom = new Daub_Cob("bottom","Bottom Framed");
        daub_cob_bottom_r = new Daub_Cob("bottom_r","Bottom Right Framed");
        daub_cob_left = new Daub_Cob("left","Left Framed");
        daub_cob_parallel_hor = new Daub_Cob("parallel_hor","Parallel Horizontals");
        daub_cob_parallel_vert = new Daub_Cob("parallel_vert","Parallel Verticals");
        daub_cob_right = new Daub_Cob("right","Right Framed");
        daub_cob_slash_back = new Daub_Cob("slash_back","\\ Diagonal");
        daub_cob_slash = new Daub_Cob("slash","/ Diagonal");
        daub_cob_square = new Daub_Cob("square","Square Framed");
        daub_cob_square_x = new Daub_Cob("square_x","Square Framed X");
        daub_cob_top_l = new Daub_Cob("top_l","Top Left Framed");
        daub_cob_top = new Daub_Cob("top","Top Framed");
        daub_cob_top_r = new Daub_Cob("top_r","Top Right Framed");
        daub_cob_triangle0 = new Daub_Cob("triangle0","Bottom Left Triangle");
        daub_cob_triangle1 = new Daub_Cob("triangle1","Top Left Triangle");
        daub_cob_triangle2 = new Daub_Cob("triangle2","Bottom Right Triangle");
        daub_cob_triangle3 = new Daub_Cob("triangle3","Top Right Triangle");
        daub_cob_xbottom = new Daub_Cob("xbottom","Bottomless Framed");
        daub_cob_xdoor0 = new Daub_Cob("xdoor0","Lower X Framed Barndoor");
        daub_cob_xdoor1 = new Daub_Cob("xdoor1","Right Sideways X Framed Barndoor");
        daub_cob_xdoor2 = new Daub_Cob("xdoor2","Left Sideways X Framed Barndoor");
        daub_cob_xdoor3 = new Daub_Cob("xdoor3","Upper X Framed Barndoor");
        daub_cob_xleft = new Daub_Cob("xleft","Left-less Framed");
        daub_cob_x = new Daub_Cob("x","Frame-less X");
        daub_cob_xright = new Daub_Cob("xright","Right-less Framed");
        daub_cob_xtop = new Daub_Cob("xtop","Topless Framed");

        plaster_arrow0 = new Plaster("arrow0","Bottom Left Framed Arrow");
        plaster_arrow1 = new Plaster("arrow1","Top Left Framed Arrow");
        plaster_arrow2 = new Plaster("arrow2","Bottom Right Framed Arrow");
        plaster_arrow3 = new Plaster("arrow3","Top Right Framed Arrow");
        plaster_barndoor0 = new Plaster("barndoor0","Upper Left Barndoor");
        plaster_barndoor1 = new Plaster("barndoor1","Left Sideways Barndoor");
        plaster_barndoor2 = new Plaster("barndoor2","Right Sideways Barndoor");
        plaster_barndoor3 = new Plaster("barndoor3","Lower Left Barndoor");
        plaster_barndoor4 = new Plaster("barndoor4","Lower Right Barndoor");
        plaster_barndoor5 = new Plaster("barndoor5","Left Sideways Barndoor");
        plaster_barndoor6 = new Plaster("barndoor6","Right Sideways Barndoor");
        plaster_barndoor7 = new Plaster("barndoor7","Upper Right Barndoor");
        plaster_bottom_l = new Plaster("bottom_l","Bottom Left Framed");
        plaster_bottom = new Plaster("bottom","Bottom Framed");
        plaster_bottom_r = new Plaster("bottom_r","Bottom Right Framed");
        plaster_left = new Plaster("left","Left Framed");
        plaster_parallel_hor = new Plaster("parallel_hor","Parallel Horizontals");
        plaster_parallel_vert = new Plaster("parallel_vert","Parallel Verticals");
        plaster_right = new Plaster("right","Right Framed");
        plaster_slash_back = new Plaster("slash_back","\\ Diagonal");
        plaster_slash = new Plaster("slash","/ Diagonal");
        plaster_square = new Plaster("square","Square Framed");
        plaster_square_x = new Plaster("square_x","Square Framed X");
        plaster_top_l = new Plaster("top_l","Top Left Framed");
        plaster_top = new Plaster("top","Top Framed");
        plaster_top_r = new Plaster("top_r","Top Right Framed");
        plaster_triangle0 = new Plaster("triangle0","Bottom Left Triangle");
        plaster_triangle1 = new Plaster("triangle1","Top Left Triangle");
        plaster_triangle2 = new Plaster("triangle2","Bottom Right Triangle");
        plaster_triangle3 = new Plaster("triangle3","Top Right Triangle");
        plaster_xbottom = new Plaster("xbottom","Bottomless Framed");
        plaster_xdoor0 = new Plaster("xdoor0","Lower X Framed Barndoor");
        plaster_xdoor1 = new Plaster("xdoor1","Right Sideways X Framed Barndoor");
        plaster_xdoor2 = new Plaster("xdoor2","Left Sideways X Framed Barndoor");
        plaster_xdoor3 = new Plaster("xdoor3","Upper X Framed Barndoor");
        plaster_xleft = new Plaster("xleft","Left-less Framed");
        plaster_x = new Plaster("x","Frame-less X");
        plaster_xright = new Plaster("xright","Right-less Framed");
        plaster_xtop = new Plaster("xtop","Topless Framed");
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        ((Daub_Cob)daub_cob_arrow0).initModel();
        ((Daub_Cob)daub_cob_arrow1).initModel();
        ((Daub_Cob)daub_cob_arrow2).initModel();
        ((Daub_Cob)daub_cob_arrow3).initModel();
        ((Daub_Cob)daub_cob_barndoor0).initModel();
        ((Daub_Cob)daub_cob_barndoor1).initModel();
        ((Daub_Cob)daub_cob_barndoor2).initModel();
        ((Daub_Cob)daub_cob_barndoor3).initModel();
        ((Daub_Cob)daub_cob_barndoor4).initModel();
        ((Daub_Cob)daub_cob_barndoor5).initModel();
        ((Daub_Cob)daub_cob_barndoor6).initModel();
        ((Daub_Cob)daub_cob_barndoor7).initModel();
        ((Daub_Cob)daub_cob_bottom_l).initModel();
        ((Daub_Cob)daub_cob_bottom).initModel();
        ((Daub_Cob)daub_cob_bottom_r).initModel();
        ((Daub_Cob)daub_cob_left).initModel();
        ((Daub_Cob)daub_cob_parallel_hor).initModel();
        ((Daub_Cob)daub_cob_parallel_vert).initModel();
        ((Daub_Cob)daub_cob_right).initModel();
        ((Daub_Cob)daub_cob_slash_back).initModel();
        ((Daub_Cob)daub_cob_slash).initModel();
        ((Daub_Cob)daub_cob_square).initModel();
        ((Daub_Cob)daub_cob_square_x).initModel();
        ((Daub_Cob)daub_cob_top_l).initModel();
        ((Daub_Cob)daub_cob_top).initModel();
        ((Daub_Cob)daub_cob_top_r).initModel();
        ((Daub_Cob)daub_cob_triangle0).initModel();
        ((Daub_Cob)daub_cob_triangle1).initModel();
        ((Daub_Cob)daub_cob_triangle2).initModel();
        ((Daub_Cob)daub_cob_triangle3).initModel();
        ((Daub_Cob)daub_cob_xbottom).initModel();
        ((Daub_Cob)daub_cob_xdoor0).initModel();
        ((Daub_Cob)daub_cob_xdoor1).initModel();
        ((Daub_Cob)daub_cob_xdoor2).initModel();
        ((Daub_Cob)daub_cob_xdoor3).initModel();
        ((Daub_Cob)daub_cob_xleft).initModel();
        ((Daub_Cob)daub_cob_x).initModel();
        ((Daub_Cob)daub_cob_xright).initModel();
        ((Daub_Cob)daub_cob_xtop).initModel();

        ((Plaster)plaster_arrow0).initModel();
        ((Plaster)plaster_arrow1).initModel();
        ((Plaster)plaster_arrow2).initModel();
        ((Plaster)plaster_arrow3).initModel();
        ((Plaster)plaster_barndoor0).initModel();
        ((Plaster)plaster_barndoor1).initModel();
        ((Plaster)plaster_barndoor2).initModel();
        ((Plaster)plaster_barndoor3).initModel();
        ((Plaster)plaster_barndoor4).initModel();
        ((Plaster)plaster_barndoor5).initModel();
        ((Plaster)plaster_barndoor6).initModel();
        ((Plaster)plaster_barndoor7).initModel();
        ((Plaster)plaster_bottom_l).initModel();
        ((Plaster)plaster_bottom).initModel();
        ((Plaster)plaster_bottom_r).initModel();
        ((Plaster)plaster_left).initModel();
        ((Plaster)plaster_parallel_hor).initModel();
        ((Plaster)plaster_parallel_vert).initModel();
        ((Plaster)plaster_right).initModel();
        ((Plaster)plaster_slash_back).initModel();
        ((Plaster)plaster_slash).initModel();
        ((Plaster)plaster_square).initModel();
        ((Plaster)plaster_square_x).initModel();
        ((Plaster)plaster_top_l).initModel();
        ((Plaster)plaster_top).initModel();
        ((Plaster)plaster_top_r).initModel();
        ((Plaster)plaster_triangle0).initModel();
        ((Plaster)plaster_triangle1).initModel();
        ((Plaster)plaster_triangle2).initModel();
        ((Plaster)plaster_triangle3).initModel();
        ((Plaster)plaster_xbottom).initModel();
        ((Plaster)plaster_xdoor0).initModel();
        ((Plaster)plaster_xdoor1).initModel();
        ((Plaster)plaster_xdoor2).initModel();
        ((Plaster)plaster_xdoor3).initModel();
        ((Plaster)plaster_xleft).initModel();
        ((Plaster)plaster_x).initModel();
        ((Plaster)plaster_xright).initModel();
        ((Plaster)plaster_xtop).initModel();
    }

    public static void initRecipes() {

        GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.block_timber, 3),
                " W "," W "," W ",
                'W', Blocks.LOG);

        GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.block_timber, 1),
                ItemRegistry.item_timber, ItemRegistry.item_timber, ItemRegistry.item_timber);

        GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.item_timber, 3),
                BlockRegistry.block_timber);

        arrow0(daub_cob_arrow0, BlockRegistry.block_wattle);
        arrow1(daub_cob_arrow1, BlockRegistry.block_wattle);
        arrow2(daub_cob_arrow2, BlockRegistry.block_wattle);
        arrow3(daub_cob_arrow3, BlockRegistry.block_wattle);
        barndoor(daub_cob_barndoor0, BlockRegistry.block_wattle);
            GameRegistry.addShapelessRecipe(new ItemStack(daub_cob_barndoor1), daub_cob_barndoor0);
            GameRegistry.addShapelessRecipe(new ItemStack(daub_cob_barndoor2), daub_cob_barndoor1);
            GameRegistry.addShapelessRecipe(new ItemStack(daub_cob_barndoor3), daub_cob_barndoor2);
            GameRegistry.addShapelessRecipe(new ItemStack(daub_cob_barndoor4), daub_cob_barndoor3);
            GameRegistry.addShapelessRecipe(new ItemStack(daub_cob_barndoor5), daub_cob_barndoor4);
            GameRegistry.addShapelessRecipe(new ItemStack(daub_cob_barndoor6), daub_cob_barndoor5);
            GameRegistry.addShapelessRecipe(new ItemStack(daub_cob_barndoor7), daub_cob_barndoor6);
            GameRegistry.addShapelessRecipe(new ItemStack(daub_cob_xdoor0), daub_cob_barndoor7);
            GameRegistry.addShapelessRecipe(new ItemStack(daub_cob_xdoor1), daub_cob_xdoor0);
            GameRegistry.addShapelessRecipe(new ItemStack(daub_cob_xdoor2), daub_cob_xdoor1);
            GameRegistry.addShapelessRecipe(new ItemStack(daub_cob_xdoor3), daub_cob_xdoor2);
            GameRegistry.addShapelessRecipe(new ItemStack(daub_cob_barndoor0), daub_cob_xdoor3);
        bottom(daub_cob_bottom, BlockRegistry.block_wattle);
        bottom_l(daub_cob_bottom_l, BlockRegistry.block_wattle);
        bottom_r(daub_cob_bottom_r, BlockRegistry.block_wattle);
        left(daub_cob_left, BlockRegistry.block_wattle);
        parallel_hor(daub_cob_parallel_hor, BlockRegistry.block_wattle);
        parallel_vert(daub_cob_parallel_vert, BlockRegistry.block_wattle);
        right(daub_cob_right, BlockRegistry.block_wattle);
        slash(daub_cob_slash, BlockRegistry.block_wattle);
        backslash(daub_cob_slash_back, BlockRegistry.block_wattle);
        square(daub_cob_square, BlockRegistry.block_wattle);
            GameRegistry.addShapelessRecipe(new ItemStack(daub_cob_square_x), daub_cob_square);
            GameRegistry.addShapelessRecipe(new ItemStack(daub_cob_x), daub_cob_square_x);
            GameRegistry.addShapelessRecipe(new ItemStack(daub_cob_x), daub_cob_square);
        top(daub_cob_top, BlockRegistry.block_wattle);
        top_l(daub_cob_top_l, BlockRegistry.block_wattle);
        top_r(daub_cob_top_r, BlockRegistry.block_wattle);
        triangle0(daub_cob_triangle0, BlockRegistry.block_wattle);
        triangle1(daub_cob_triangle1, BlockRegistry.block_wattle);
        triangle2(daub_cob_triangle2, BlockRegistry.block_wattle);
        triangle3(daub_cob_triangle3, BlockRegistry.block_wattle);
        xbottom(daub_cob_xbottom, BlockRegistry.block_wattle);
        xleft(daub_cob_xleft, BlockRegistry.block_wattle);
        xright(daub_cob_xright, BlockRegistry.block_wattle);
        xtop(daub_cob_xtop, BlockRegistry.block_wattle);

        arrow0(plaster_arrow0, BlockRegistry.block_plaster);
        arrow1(plaster_arrow1, BlockRegistry.block_plaster);
        arrow2(plaster_arrow2, BlockRegistry.block_plaster);
        arrow3(plaster_arrow3, BlockRegistry.block_plaster);
        barndoor(plaster_barndoor0, BlockRegistry.block_plaster);
            GameRegistry.addShapelessRecipe(new ItemStack(plaster_barndoor1), plaster_barndoor0);
            GameRegistry.addShapelessRecipe(new ItemStack(plaster_barndoor2), plaster_barndoor1);
            GameRegistry.addShapelessRecipe(new ItemStack(plaster_barndoor3), plaster_barndoor2);
            GameRegistry.addShapelessRecipe(new ItemStack(plaster_barndoor4), plaster_barndoor3);
            GameRegistry.addShapelessRecipe(new ItemStack(plaster_barndoor5), plaster_barndoor4);
            GameRegistry.addShapelessRecipe(new ItemStack(plaster_barndoor6), plaster_barndoor5);
            GameRegistry.addShapelessRecipe(new ItemStack(plaster_barndoor7), plaster_barndoor6);
            GameRegistry.addShapelessRecipe(new ItemStack(plaster_xdoor0), plaster_barndoor7);
            GameRegistry.addShapelessRecipe(new ItemStack(plaster_xdoor1), plaster_xdoor0);
            GameRegistry.addShapelessRecipe(new ItemStack(plaster_xdoor2), plaster_xdoor1);
            GameRegistry.addShapelessRecipe(new ItemStack(plaster_xdoor3), plaster_xdoor2);
            GameRegistry.addShapelessRecipe(new ItemStack(plaster_barndoor0), plaster_xdoor3);
        bottom(plaster_bottom, BlockRegistry.block_plaster);
        bottom_l(plaster_bottom_l, BlockRegistry.block_plaster);
        bottom_r(plaster_bottom_r, BlockRegistry.block_plaster);
        left(plaster_left, BlockRegistry.block_plaster);
        parallel_hor(plaster_parallel_hor, BlockRegistry.block_plaster);
        parallel_vert(plaster_parallel_vert, BlockRegistry.block_plaster);
        right(plaster_right, BlockRegistry.block_plaster);
        slash(plaster_slash, BlockRegistry.block_plaster);
        backslash(plaster_slash_back, BlockRegistry.block_plaster);
        square(plaster_square, BlockRegistry.block_plaster);
            GameRegistry.addShapelessRecipe(new ItemStack(plaster_square_x), plaster_square);
            GameRegistry.addShapelessRecipe(new ItemStack(plaster_x), plaster_square_x);
            GameRegistry.addShapelessRecipe(new ItemStack(plaster_x), plaster_square);
        top(plaster_top, BlockRegistry.block_plaster);
        top_l(plaster_top_l, BlockRegistry.block_plaster);
        top_r(plaster_top_r, BlockRegistry.block_plaster);
        triangle0(plaster_triangle0, BlockRegistry.block_plaster);
        triangle1(plaster_triangle1, BlockRegistry.block_plaster);
        triangle2(plaster_triangle2, BlockRegistry.block_plaster);
        triangle3(plaster_triangle3, BlockRegistry.block_plaster);
        xbottom(plaster_xbottom, BlockRegistry.block_plaster);
        xleft(plaster_xleft, BlockRegistry.block_plaster);
        xright(plaster_xright, BlockRegistry.block_plaster);
        xtop(plaster_xtop, BlockRegistry.block_plaster);
    }

    public static void arrow0(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 4),
                "tbt","ttb","ttt",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void arrow1(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 4),
                "ttt","ttb","tbt",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void arrow2(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 4),
                "tbt", "btt", "ttt",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void arrow3(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 4),
                "ttt","btt","tbt",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void barndoor(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 4),
                "tbt","ttt","tbt",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void bottom(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 4),
                "   ","bbb","ttt",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void bottom_l(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 5),
                "tbb","tbb","ttt",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void bottom_r(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 5),
                "bbt","bbt","ttt",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void left(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 4),
                "tb ","tb ","tb ",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void parallel_hor(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 5),
                "ttt","bbb","ttt",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void parallel_vert(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 5),
                "tbt","tbt","tbt",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void right(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 4),
                " bt"," bt"," bt",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void slash(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 7),
                "bbt","btb","tbb",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void backslash(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 7),
                "tbb","btb","bbt",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void square(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 4),
                "ttt","tbt","ttt",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void top(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 4),
                "ttt","bbb","   ",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void top_l(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 5),
                "ttt","tbb","tbb",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void top_r(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 5),
                "ttt","bbt","bbt",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void triangle0(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 5),
                "tbb","ttb","ttt",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void triangle1(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 5),
                "ttt","ttb","tbb",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void triangle2(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 5),
                "bbt","btt","ttt",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void triangle3(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 5),
                "ttt","btt","bbt",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void xbottom(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 4),
                "ttt","tbt","tbt",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void xleft(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 4),
                "ttt","bbt","ttt",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void xright(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 4),
                "ttt","tbb","ttt",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
    public static void xtop(Block blockOut, Block blockIn) {
        GameRegistry.addShapedRecipe(new ItemStack(blockOut, 4),
                "tbt","tbt","ttt",
                't', ItemRegistry.item_timber,
                'b', blockIn);
    }
}