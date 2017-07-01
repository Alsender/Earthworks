package alsender.earthworks.main.registry;


import alsender.earthworks.block.timber.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by alsender on 13/01/17.
 */
@Mod.EventBusSubscriber
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

    @SubscribeEvent
    public static void initBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> r = event.getRegistry();
        daub_cob_arrow0 = new Daub_Cob(r, "arrow0","Bottom Left Framed Arrow",0);
        daub_cob_arrow1 = new Daub_Cob(r, "arrow1","Top Left Framed Arrow",1);
        daub_cob_arrow2 = new Daub_Cob(r, "arrow2","Bottom Right Framed Arrow",2);
        daub_cob_arrow3 = new Daub_Cob(r, "arrow3","Top Right Framed Arrow",3);
        daub_cob_barndoor0 = new Daub_Cob(r, "barndoor0","Lower Left Barndoor",4);
        daub_cob_barndoor1 = new Daub_Cob(r, "barndoor1","Left Sideways Barndoor",5);
        daub_cob_barndoor2 = new Daub_Cob(r, "barndoor2","Right Sideways Barndoor",6);
        daub_cob_barndoor3 = new Daub_Cob(r, "barndoor3","Upper Left Barndoor",7);
        daub_cob_barndoor4 = new Daub_Cob(r, "barndoor4","Lower Right Barndoor",8);
        daub_cob_barndoor5 = new Daub_Cob(r, "barndoor5","Left Sideways Barndoor",9);
        daub_cob_barndoor6 = new Daub_Cob(r, "barndoor6","Right Sideways Barndoor",10);
        daub_cob_barndoor7 = new Daub_Cob(r, "barndoor7","Upper Right Barndoor",11);
        daub_cob_bottom_l = new Daub_Cob(r, "bottom_l","Bottom Left Framed",12);
        daub_cob_bottom = new Daub_Cob(r, "bottom","Bottom Framed",13);
        daub_cob_bottom_r = new Daub_Cob(r, "bottom_r","Bottom Right Framed",14);
        daub_cob_left = new Daub_Cob(r, "left","Left Framed",15);
        daub_cob_parallel_hor = new Daub_Cob(r, "parallel_hor","Parallel Horizontals",16);
        daub_cob_parallel_vert = new Daub_Cob(r, "parallel_vert","Parallel Verticals",17);
        daub_cob_right = new Daub_Cob(r, "right","Right Framed",18);
        daub_cob_slash_back = new Daub_Cob(r, "slash_back","\\ Diagonal",19);
        daub_cob_slash = new Daub_Cob(r, "slash","/ Diagonal",20);
        daub_cob_square = new Daub_Cob(r, "square","Square Framed",21);
        daub_cob_square_x = new Daub_Cob(r, "square_x","Square Framed X",22);
        daub_cob_top_l = new Daub_Cob(r, "top_l","Top Left Framed",23);
        daub_cob_top = new Daub_Cob(r, "top","Top Framed",24);
        daub_cob_top_r = new Daub_Cob(r, "top_r","Top Right Framed",25);
        daub_cob_triangle0 = new Daub_Cob(r, "triangle0","Bottom Left Triangle",26);
        daub_cob_triangle1 = new Daub_Cob(r, "triangle1","Top Left Triangle",27);
        daub_cob_triangle2 = new Daub_Cob(r, "triangle2","Bottom Right Triangle",28);
        daub_cob_triangle3 = new Daub_Cob(r, "triangle3","Top Right Triangle",29);
        daub_cob_xbottom = new Daub_Cob(r, "xbottom","Bottomless Framed",30);
        daub_cob_xdoor0 = new Daub_Cob(r, "xdoor0","Lower X Framed Barndoor",31);
        daub_cob_xdoor1 = new Daub_Cob(r, "xdoor1","Right Sideways X Framed Barndoor",32);
        daub_cob_xdoor2 = new Daub_Cob(r, "xdoor2","Left Sideways X Framed Barndoor",33);
        daub_cob_xdoor3 = new Daub_Cob(r, "xdoor3","Upper X Framed Barndoor",34);
        daub_cob_xleft = new Daub_Cob(r, "xleft","Left-less Framed",35);
        daub_cob_x = new Daub_Cob(r, "x","Frame-less X",36);
        daub_cob_xright = new Daub_Cob(r, "xright","Right-less Framed",37);
        daub_cob_xtop = new Daub_Cob(r, "xtop","Topless Framed",38);

        plaster_arrow0 = new Plaster(r, "arrow0","Bottom Left Framed Arrow",0);
        plaster_arrow1 = new Plaster(r, "arrow1","Top Left Framed Arrow",1);
        plaster_arrow2 = new Plaster(r, "arrow2","Bottom Right Framed Arrow",2);
        plaster_arrow3 = new Plaster(r, "arrow3","Top Right Framed Arrow",3);
        plaster_barndoor0 = new Plaster(r, "barndoor0","Lower Left Barndoor",4);
        plaster_barndoor1 = new Plaster(r, "barndoor1","Left Sideways Barndoor",5);
        plaster_barndoor2 = new Plaster(r, "barndoor2","Right Sideways Barndoor",6);
        plaster_barndoor3 = new Plaster(r, "barndoor3","Upper Left Barndoor",7);
        plaster_barndoor4 = new Plaster(r, "barndoor4","Lower Right Barndoor",8);
        plaster_barndoor5 = new Plaster(r, "barndoor5","Left Sideways Barndoor",9);
        plaster_barndoor6 = new Plaster(r, "barndoor6","Right Sideways Barndoor",10);
        plaster_barndoor7 = new Plaster(r, "barndoor7","Upper Right Barndoor",11);
        plaster_bottom_l = new Plaster(r, "bottom_l","Bottom Left Framed",12);
        plaster_bottom = new Plaster(r, "bottom","Bottom Framed",13);
        plaster_bottom_r = new Plaster(r, "bottom_r","Bottom Right Framed",14);
        plaster_left = new Plaster(r, "left","Left Framed",15);
        plaster_parallel_hor = new Plaster(r, "parallel_hor","Parallel Horizontals",16);
        plaster_parallel_vert = new Plaster(r, "parallel_vert","Parallel Verticals",17);
        plaster_right = new Plaster(r, "right","Right Framed",18);
        plaster_slash_back = new Plaster(r, "slash_back","\\ Diagonal",19);
        plaster_slash = new Plaster(r, "slash","/ Diagonal",20);
        plaster_square = new Plaster(r, "square","Square Framed",21);
        plaster_square_x = new Plaster(r, "square_x","Square Framed X",22);
        plaster_top_l = new Plaster(r, "top_l","Top Left Framed",23);
        plaster_top = new Plaster(r, "top","Top Framed",24);
        plaster_top_r = new Plaster(r, "top_r","Top Right Framed",25);
        plaster_triangle0 = new Plaster(r, "triangle0","Bottom Left Triangle",26);
        plaster_triangle1 = new Plaster(r, "triangle1","Top Left Triangle",27);
        plaster_triangle2 = new Plaster(r, "triangle2","Bottom Right Triangle",28);
        plaster_triangle3 = new Plaster(r, "triangle3","Top Right Triangle",29);
        plaster_xbottom = new Plaster(r, "xbottom","Bottomless Framed",30);
        plaster_xdoor0 = new Plaster(r, "xdoor0","Lower X Framed Barndoor",31);
        plaster_xdoor1 = new Plaster(r, "xdoor1","Right Sideways X Framed Barndoor",32);
        plaster_xdoor2 = new Plaster(r, "xdoor2","Left Sideways X Framed Barndoor",33);
        plaster_xdoor3 = new Plaster(r, "xdoor3","Upper X Framed Barndoor",34);
        plaster_xleft = new Plaster(r, "xleft","Left-less Framed",35);
        plaster_x = new Plaster(r, "x","Frame-less X",36);
        plaster_xright = new Plaster(r, "xright","Right-less Framed",37);
        plaster_xtop = new Plaster(r, "xtop","Topless Framed",38);
    }

    @SubscribeEvent
    public static void initItemBlocks(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> r = event.getRegistry();
        r.register(itemblock(daub_cob_arrow0));
        r.register(itemblock(daub_cob_arrow1));
        r.register(itemblock(daub_cob_arrow2));
        r.register(itemblock(daub_cob_arrow3));
        r.register(itemblock(daub_cob_barndoor0));
        r.register(itemblock(daub_cob_barndoor1));
        r.register(itemblock(daub_cob_barndoor2));
        r.register(itemblock(daub_cob_barndoor3));
        r.register(itemblock(daub_cob_barndoor4));
        r.register(itemblock(daub_cob_barndoor5));
        r.register(itemblock(daub_cob_barndoor6));
        r.register(itemblock(daub_cob_barndoor7));
        r.register(itemblock(daub_cob_bottom_l));
        r.register(itemblock(daub_cob_bottom));
        r.register(itemblock(daub_cob_bottom_r));
        r.register(itemblock(daub_cob_left));
        r.register(itemblock(daub_cob_parallel_hor));
        r.register(itemblock(daub_cob_parallel_vert));
        r.register(itemblock(daub_cob_right));
        r.register(itemblock(daub_cob_slash_back));
        r.register(itemblock(daub_cob_slash));
        r.register(itemblock(daub_cob_square));
        r.register(itemblock(daub_cob_square_x));
        r.register(itemblock(daub_cob_top_l));
        r.register(itemblock(daub_cob_top));
        r.register(itemblock(daub_cob_top_r));
        r.register(itemblock(daub_cob_triangle0));
        r.register(itemblock(daub_cob_triangle1));
        r.register(itemblock(daub_cob_triangle2));
        r.register(itemblock(daub_cob_triangle3));
        r.register(itemblock(daub_cob_xbottom));
        r.register(itemblock(daub_cob_xdoor0));
        r.register(itemblock(daub_cob_xdoor1));
        r.register(itemblock(daub_cob_xdoor2));
        r.register(itemblock(daub_cob_xdoor3));
        r.register(itemblock(daub_cob_xleft));
        r.register(itemblock(daub_cob_x));
        r.register(itemblock(daub_cob_xright));
        r.register(itemblock(daub_cob_xtop));

        r.register(itemblock(plaster_arrow0));
        r.register(itemblock(plaster_arrow1));
        r.register(itemblock(plaster_arrow2));
        r.register(itemblock(plaster_arrow3));
        r.register(itemblock(plaster_barndoor0));
        r.register(itemblock(plaster_barndoor1));
        r.register(itemblock(plaster_barndoor2));
        r.register(itemblock(plaster_barndoor3));
        r.register(itemblock(plaster_barndoor4));
        r.register(itemblock(plaster_barndoor5));
        r.register(itemblock(plaster_barndoor6));
        r.register(itemblock(plaster_barndoor7));
        r.register(itemblock(plaster_bottom_l));
        r.register(itemblock(plaster_bottom));
        r.register(itemblock(plaster_bottom_r));
        r.register(itemblock(plaster_left));
        r.register(itemblock(plaster_parallel_hor));
        r.register(itemblock(plaster_parallel_vert));
        r.register(itemblock(plaster_right));
        r.register(itemblock(plaster_slash_back));
        r.register(itemblock(plaster_slash));
        r.register(itemblock(plaster_square));
        r.register(itemblock(plaster_square_x));
        r.register(itemblock(plaster_top_l));
        r.register(itemblock(plaster_top));
        r.register(itemblock(plaster_top_r));
        r.register(itemblock(plaster_triangle0));
        r.register(itemblock(plaster_triangle1));
        r.register(itemblock(plaster_triangle2));
        r.register(itemblock(plaster_triangle3));
        r.register(itemblock(plaster_xbottom));
        r.register(itemblock(plaster_xdoor0));
        r.register(itemblock(plaster_xdoor1));
        r.register(itemblock(plaster_xdoor2));
        r.register(itemblock(plaster_xdoor3));
        r.register(itemblock(plaster_xleft));
        r.register(itemblock(plaster_x));
        r.register(itemblock(plaster_xright));
        r.register(itemblock(plaster_xtop));
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

    private static Item itemblock(Block block) {
        return new ItemBlock(block).setRegistryName(block.getRegistryName());
    }
}