package alsender.earthworks.main.registry;


import alsender.earthworks.item.ModItem;
import alsender.earthworks.item.ModItemTool;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by alsender on 12/12/16.
 */
public class ItemRegistry {

    public static Item
            item_adobe,
            item_cob,
            item_lime_plaster,
            item_mud,
            item_chalk,
            item_quicklime,
            item_slaked_lime,
            item_timber;

    public static Item

            tool_square,
            tool_Acheulean,
            tool_adz,
            tool_compass,
            tool_froe,
            tool_planer,
            tool_level,
            tool_saw,

            tool_wood_hammer,
            tool_stone_hammer,
            tool_iron_hammer,
            tool_gold_hammer,
            tool_diamond_hammer;

    public static void init() {
        item_adobe = new ModItem("adobe");
        item_cob = new ModItem("cob");
        item_lime_plaster = new ModItem("lime_plaster");
        item_mud = new ModItem("mud");
        item_chalk = new ModItem("chalk");
        item_quicklime = new ModItem("quicklime");
        item_slaked_lime = new ModItem("slaked_lime");
        item_timber = new ModItem("timber");

        tool_square = new ModItemTool("square", 60);
        tool_Acheulean = new ModItemTool("hand_axe", 132);
        tool_adz = new ModItemTool("adz",251);
        tool_compass = new ModItemTool("compass",251);
        tool_froe = new ModItemTool("froe", 251);
        tool_planer = new ModItemTool("hand_planer", 251);
        tool_level = new ModItemTool("level", 33);
        tool_saw = new ModItemTool("saw", 1562);

        tool_wood_hammer = new ModItemTool("wood_hammer", 60);
        tool_stone_hammer = new ModItemTool("stone_hammer", 132);
        tool_iron_hammer = new ModItemTool("iron_hammer", 251);
        tool_gold_hammer = new ModItemTool("gold_hammer", 33);
        tool_diamond_hammer = new ModItemTool("diamond_hammer", 1562);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        ((ModItem)item_adobe).initModel();
        ((ModItem)item_cob).initModel();
        ((ModItem)item_lime_plaster).initModel();
        ((ModItem)item_mud).initModel();
        ((ModItem)item_chalk).initModel();
        ((ModItem)item_quicklime).initModel();
        ((ModItem)item_slaked_lime).initModel();
        ((ModItem)item_timber).initModel();

        ((ModItemTool)tool_planer).initModel();
        ((ModItemTool)tool_Acheulean).initModel();
        ((ModItemTool)tool_adz).initModel();
        ((ModItemTool)tool_compass).initModel();
        ((ModItemTool)tool_froe).initModel();
        ((ModItemTool)tool_square).initModel();
        ((ModItemTool)tool_level).initModel();
        ((ModItemTool)tool_saw).initModel();

        ((ModItemTool)tool_wood_hammer).initModel();
        ((ModItemTool)tool_stone_hammer).initModel();
        ((ModItemTool)tool_iron_hammer).initModel();
        ((ModItemTool)tool_gold_hammer).initModel();
        ((ModItemTool)tool_diamond_hammer).initModel();
    }
 }
