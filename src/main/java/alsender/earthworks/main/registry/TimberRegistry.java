package alsender.earthworks.main.registry;


import alsender.earthworks.block.timber.*;
import alsender.earthworks.main.crafting.MirrorlessShapedRecipes;
import alsender.earthworks.main.crafting.ModCraftingManager;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.RecipeSorter;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import static alsender.earthworks.main.registry.BlockRegistry.*;
import static alsender.earthworks.main.registry.ItemRegistry.*;

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
        daub_cob_arrow0 = new Daub_Cob("arrow0","Bottom Left Framed Arrow",0);
        daub_cob_arrow1 = new Daub_Cob("arrow1","Top Left Framed Arrow",1);
        daub_cob_arrow2 = new Daub_Cob("arrow2","Bottom Right Framed Arrow",2);
        daub_cob_arrow3 = new Daub_Cob("arrow3","Top Right Framed Arrow",3);
        daub_cob_barndoor0 = new Daub_Cob("barndoor0","Lower Left Barndoor",4);
        daub_cob_barndoor1 = new Daub_Cob("barndoor1","Left Sideways Barndoor",5);
        daub_cob_barndoor2 = new Daub_Cob("barndoor2","Right Sideways Barndoor",6);
        daub_cob_barndoor3 = new Daub_Cob("barndoor3","Upper Left Barndoor",7);
        daub_cob_barndoor4 = new Daub_Cob("barndoor4","Lower Right Barndoor",8);
        daub_cob_barndoor5 = new Daub_Cob("barndoor5","Left Sideways Barndoor",9);
        daub_cob_barndoor6 = new Daub_Cob("barndoor6","Right Sideways Barndoor",10);
        daub_cob_barndoor7 = new Daub_Cob("barndoor7","Upper Right Barndoor",11);
        daub_cob_bottom_l = new Daub_Cob("bottom_l","Bottom Left Framed",12);
        daub_cob_bottom = new Daub_Cob("bottom","Bottom Framed",13);
        daub_cob_bottom_r = new Daub_Cob("bottom_r","Bottom Right Framed",14);
        daub_cob_left = new Daub_Cob("left","Left Framed",15);
        daub_cob_parallel_hor = new Daub_Cob("parallel_hor","Parallel Horizontals",16);
        daub_cob_parallel_vert = new Daub_Cob("parallel_vert","Parallel Verticals",17);
        daub_cob_right = new Daub_Cob("right","Right Framed",18);
        daub_cob_slash_back = new Daub_Cob("slash_back","\\ Diagonal",19);
        daub_cob_slash = new Daub_Cob("slash","/ Diagonal",20);
        daub_cob_square = new Daub_Cob("square","Square Framed",21);
        daub_cob_square_x = new Daub_Cob("square_x","Square Framed X",22);
        daub_cob_top_l = new Daub_Cob("top_l","Top Left Framed",23);
        daub_cob_top = new Daub_Cob("top","Top Framed",24);
        daub_cob_top_r = new Daub_Cob("top_r","Top Right Framed",25);
        daub_cob_triangle0 = new Daub_Cob("triangle0","Bottom Left Triangle",26);
        daub_cob_triangle1 = new Daub_Cob("triangle1","Top Left Triangle",27);
        daub_cob_triangle2 = new Daub_Cob("triangle2","Bottom Right Triangle",28);
        daub_cob_triangle3 = new Daub_Cob("triangle3","Top Right Triangle",29);
        daub_cob_xbottom = new Daub_Cob("xbottom","Bottomless Framed",30);
        daub_cob_xdoor0 = new Daub_Cob("xdoor0","Lower X Framed Barndoor",31);
        daub_cob_xdoor1 = new Daub_Cob("xdoor1","Right Sideways X Framed Barndoor",32);
        daub_cob_xdoor2 = new Daub_Cob("xdoor2","Left Sideways X Framed Barndoor",33);
        daub_cob_xdoor3 = new Daub_Cob("xdoor3","Upper X Framed Barndoor",34);
        daub_cob_xleft = new Daub_Cob("xleft","Left-less Framed",35);
        daub_cob_x = new Daub_Cob("x","Frame-less X",36);
        daub_cob_xright = new Daub_Cob("xright","Right-less Framed",37);
        daub_cob_xtop = new Daub_Cob("xtop","Topless Framed",38);

        plaster_arrow0 = new Plaster("arrow0","Bottom Left Framed Arrow",0);
        plaster_arrow1 = new Plaster("arrow1","Top Left Framed Arrow",1);
        plaster_arrow2 = new Plaster("arrow2","Bottom Right Framed Arrow",2);
        plaster_arrow3 = new Plaster("arrow3","Top Right Framed Arrow",3);
        plaster_barndoor0 = new Plaster("barndoor0","Lower Left Barndoor",4);
        plaster_barndoor1 = new Plaster("barndoor1","Left Sideways Barndoor",5);
        plaster_barndoor2 = new Plaster("barndoor2","Right Sideways Barndoor",6);
        plaster_barndoor3 = new Plaster("barndoor3","Upper Left Barndoor",7);
        plaster_barndoor4 = new Plaster("barndoor4","Lower Right Barndoor",8);
        plaster_barndoor5 = new Plaster("barndoor5","Left Sideways Barndoor",9);
        plaster_barndoor6 = new Plaster("barndoor6","Right Sideways Barndoor",10);
        plaster_barndoor7 = new Plaster("barndoor7","Upper Right Barndoor",11);
        plaster_bottom_l = new Plaster("bottom_l","Bottom Left Framed",12);
        plaster_bottom = new Plaster("bottom","Bottom Framed",13);
        plaster_bottom_r = new Plaster("bottom_r","Bottom Right Framed",14);
        plaster_left = new Plaster("left","Left Framed",15);
        plaster_parallel_hor = new Plaster("parallel_hor","Parallel Horizontals",16);
        plaster_parallel_vert = new Plaster("parallel_vert","Parallel Verticals",17);
        plaster_right = new Plaster("right","Right Framed",18);
        plaster_slash_back = new Plaster("slash_back","\\ Diagonal",19);
        plaster_slash = new Plaster("slash","/ Diagonal",20);
        plaster_square = new Plaster("square","Square Framed",21);
        plaster_square_x = new Plaster("square_x","Square Framed X",22);
        plaster_top_l = new Plaster("top_l","Top Left Framed",23);
        plaster_top = new Plaster("top","Top Framed",24);
        plaster_top_r = new Plaster("top_r","Top Right Framed",25);
        plaster_triangle0 = new Plaster("triangle0","Bottom Left Triangle",26);
        plaster_triangle1 = new Plaster("triangle1","Top Left Triangle",27);
        plaster_triangle2 = new Plaster("triangle2","Bottom Right Triangle",28);
        plaster_triangle3 = new Plaster("triangle3","Top Right Triangle",29);
        plaster_xbottom = new Plaster("xbottom","Bottomless Framed",30);
        plaster_xdoor0 = new Plaster("xdoor0","Lower X Framed Barndoor",31);
        plaster_xdoor1 = new Plaster("xdoor1","Right Sideways X Framed Barndoor",32);
        plaster_xdoor2 = new Plaster("xdoor2","Left Sideways X Framed Barndoor",33);
        plaster_xdoor3 = new Plaster("xdoor3","Upper X Framed Barndoor",34);
        plaster_xleft = new Plaster("xleft","Left-less Framed",35);
        plaster_x = new Plaster("x","Frame-less X",36);
        plaster_xright = new Plaster("xright","Right-less Framed",37);
        plaster_xtop = new Plaster("xtop","Topless Framed",38);
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

        //Timber Logs

        GameRegistry.addShapedRecipe(new ItemStack(block_timber_oak, 3),
                " W "," W "," W ",
                'W', new ItemStack(Blocks.LOG, 1, 0));

        GameRegistry.addShapedRecipe(new ItemStack(block_timber_spruce, 3),
                " W "," W "," W ",
                'W', new ItemStack(Blocks.LOG, 1, 1));

        GameRegistry.addShapedRecipe(new ItemStack(block_timber_birch, 3),
                " W "," W "," W ",
                'W', new ItemStack(Blocks.LOG, 1, 2));

        GameRegistry.addShapedRecipe(new ItemStack(block_timber_jungle, 3),
                " W "," W "," W ",
                'W', new ItemStack(Blocks.LOG, 1, 3));

        GameRegistry.addShapedRecipe(new ItemStack(block_timber_acacia, 3),
                " W "," W "," W ",
                'W', new ItemStack(Blocks.LOG2, 1, 0));

        GameRegistry.addShapedRecipe(new ItemStack(block_timber_dark_oak, 3),
                " W "," W "," W ",
                'W', new ItemStack(Blocks.LOG2, 1, 1));

//Slabs/Stairs/Walls

        RecipeSorter.register("earthworks:mirrorlessShaped", MirrorlessShapedRecipes.class, RecipeSorter.Category.SHAPED, "");
        RecipeRegistry.stair_slab_wall(block_timber_oak, stair_timber_oak, slab_timber_oak, wall_timber_oak);
        RecipeRegistry.stair_slab_wall(block_timber_spruce, stair_timber_spruce, slab_timber_spruce, wall_timber_spruce);
        RecipeRegistry.stair_slab_wall(block_timber_birch, stair_timber_birch, slab_timber_birch, wall_timber_birch);
        RecipeRegistry.stair_slab_wall(block_timber_jungle, stair_timber_jungle, slab_timber_jungle, wall_timber_jungle);
        RecipeRegistry.stair_slab_wall(block_timber_acacia, stair_timber_acacia, slab_timber_acacia, wall_timber_acacia);
        RecipeRegistry.stair_slab_wall(block_timber_dark_oak, stair_timber_dark_oak, slab_timber_dark_oak, wall_timber_dark_oak);

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(item_timber, 6),
                new Object[] {"logTimber", "logTimber"}));

        arrow0(daub_cob_arrow0, block_wattle);
        arrow1(daub_cob_arrow1, block_wattle);
        arrow2(daub_cob_arrow2, block_wattle);
        arrow3(daub_cob_arrow3, block_wattle);
        barndoor(daub_cob_barndoor0, block_wattle);
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
        bottom(daub_cob_bottom, block_wattle);
        bottom_l(daub_cob_bottom_l, block_wattle);
        bottom_r(daub_cob_bottom_r, block_wattle);
        left(daub_cob_left, block_wattle);
        parallel_hor(daub_cob_parallel_hor, block_wattle);
        parallel_vert(daub_cob_parallel_vert, block_wattle);
        right(daub_cob_right, block_wattle);
        slash(daub_cob_slash, block_wattle);
        backslash(daub_cob_slash_back, block_wattle);
        square(daub_cob_square, block_wattle);
            GameRegistry.addShapelessRecipe(new ItemStack(daub_cob_square_x), daub_cob_square);
            GameRegistry.addShapelessRecipe(new ItemStack(daub_cob_x), daub_cob_square_x);
            GameRegistry.addShapelessRecipe(new ItemStack(daub_cob_x), daub_cob_square);
        top(daub_cob_top, block_wattle);
        top_l(daub_cob_top_l, block_wattle);
        top_r(daub_cob_top_r, block_wattle);
        triangle0(daub_cob_triangle0, block_wattle);
        triangle1(daub_cob_triangle1, block_wattle);
        triangle2(daub_cob_triangle2, block_wattle);
        triangle3(daub_cob_triangle3, block_wattle);
        xbottom(daub_cob_xbottom, block_wattle);
        xleft(daub_cob_xleft, block_wattle);
        xright(daub_cob_xright, block_wattle);
        xtop(daub_cob_xtop, block_wattle);

        arrow0(plaster_arrow0, block_plaster);
        arrow1(plaster_arrow1, block_plaster);
        arrow2(plaster_arrow2, block_plaster);
        arrow3(plaster_arrow3, block_plaster);
        barndoor(plaster_barndoor0, block_plaster);
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
        bottom(plaster_bottom, block_plaster);
        bottom_l(plaster_bottom_l, block_plaster);
        bottom_r(plaster_bottom_r, block_plaster);
        left(plaster_left, block_plaster);
        parallel_hor(plaster_parallel_hor, block_plaster);
        parallel_vert(plaster_parallel_vert, block_plaster);
        right(plaster_right, block_plaster);
        slash(plaster_slash, block_plaster);
        backslash(plaster_slash_back, block_plaster);
        square(plaster_square, block_plaster);
            GameRegistry.addShapelessRecipe(new ItemStack(plaster_square_x), plaster_square);
            GameRegistry.addShapelessRecipe(new ItemStack(plaster_x), plaster_square_x);
            GameRegistry.addShapelessRecipe(new ItemStack(plaster_x), plaster_square);
        top(plaster_top, block_plaster);
        top_l(plaster_top_l, block_plaster);
        top_r(plaster_top_r, block_plaster);
        triangle0(plaster_triangle0, block_plaster);
        triangle1(plaster_triangle1, block_plaster);
        triangle2(plaster_triangle2, block_plaster);
        triangle3(plaster_triangle3, block_plaster);
        xbottom(plaster_xbottom, block_plaster);
        xleft(plaster_xleft, block_plaster);
        xright(plaster_xright, block_plaster);
        xtop(plaster_xtop, block_plaster);
    }

    public static void arrow0(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 4),
                "tbt","ttb","ttt",
                't', item_timber,
                'b', blockIn);
    }
    public static void arrow1(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 4),
                "ttt","ttb","tbt",
                't', item_timber,
                'b', blockIn);
    }
    public static void arrow2(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 4),
                "tbt", "btt", "ttt",
                't', item_timber,
                'b', blockIn);
    }
    public static void arrow3(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 4),
                "ttt","btt","tbt",
                't', item_timber,
                'b', blockIn);
    }
    public static void barndoor(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 4),
                "tbt","ttt","tbt",
                't', item_timber,
                'b', blockIn);
    }
    public static void bottom(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 4),
                "   ","bbb","ttt",
                't', item_timber,
                'b', blockIn);
    }
    public static void bottom_l(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 5),
                "tbb","tbb","ttt",
                't', item_timber,
                'b', blockIn);
    }
    public static void bottom_r(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 5),
                "bbt","bbt","ttt",
                't', item_timber,
                'b', blockIn);
    }
    public static void left(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 4),
                "tb ","tb ","tb ",
                't', item_timber,
                'b', blockIn);
    }
    public static void parallel_hor(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 5),
                "ttt","bbb","ttt",
                't', item_timber,
                'b', blockIn);
    }
    public static void parallel_vert(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 5),
                "tbt","tbt","tbt",
                't', item_timber,
                'b', blockIn);
    }
    public static void right(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 4),
                " bt"," bt"," bt",
                't', item_timber,
                'b', blockIn);
    }
    public static void slash(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 7),
                "bbt","btb","tbb",
                't', item_timber,
                'b', blockIn);
    }
    public static void backslash(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 7),
                "tbb","btb","bbt",
                't', item_timber,
                'b', blockIn);
    }
    public static void square(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 4),
                "ttt","tbt","ttt",
                't', item_timber,
                'b', blockIn);
    }
    public static void top(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 4),
                "ttt","bbb","   ",
                't', item_timber,
                'b', blockIn);
    }
    public static void top_l(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 5),
                "ttt","tbb","tbb",
                't', item_timber,
                'b', blockIn);
    }
    public static void top_r(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 5),
                "ttt","bbt","bbt",
                't', item_timber,
                'b', blockIn);
    }
    public static void triangle0(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 5),
                "tbb","ttb","ttt",
                't', item_timber,
                'b', blockIn);
    }
    public static void triangle1(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 5),
                "ttt","ttb","tbb",
                't', item_timber,
                'b', blockIn);
    }
    public static void triangle2(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 5),
                "bbt","btt","ttt",
                't', item_timber,
                'b', blockIn);
    }
    public static void triangle3(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 5),
                "ttt","btt","bbt",
                't', item_timber,
                'b', blockIn);
    }
    public static void xbottom(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 4),
                "ttt","tbt","tbt",
                't', item_timber,
                'b', blockIn);
    }
    public static void xleft(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 4),
                "ttt","bbt","ttt",
                't', item_timber,
                'b', blockIn);
    }
    public static void xright(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 4),
                "ttt","tbb","ttt",
                't', item_timber,
                'b', blockIn);
    }
    public static void xtop(Block blockOut, Block blockIn) {
        ModCraftingManager.addMirrorlessRecipe(new ItemStack(blockOut, 4),
                "tbt","tbt","ttt",
                't', item_timber,
                'b', blockIn);
    }
}