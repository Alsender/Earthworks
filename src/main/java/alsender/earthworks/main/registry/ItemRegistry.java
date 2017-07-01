package alsender.earthworks.main.registry;


import alsender.earthworks.item.Item_Chalk;
import alsender.earthworks.item.ModItem;
import alsender.earthworks.item.ModItemTool;
import alsender.earthworks.main.Config;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by alsender on 12/12/16.
 */
@Mod.EventBusSubscriber
public class ItemRegistry {

    public static Item
            item_adobe,
            item_cob,
            item_dirt,
            item_lime_plaster,
            item_mud,
            item_chalk,
            item_quicklime,
            item_sand,
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

    @SubscribeEvent
    public static void initItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> r = event.getRegistry();
        item_adobe = new ModItem(r, "adobe");
        item_chalk = new Item_Chalk(r);
        item_cob = new ModItem(r, "cob");
        item_lime_plaster = new ModItem(r, "lime_plaster");
        item_mud = new ModItem(r, "mud");
        item_quicklime = new ModItem(r, "quicklime");
        item_slaked_lime = new ModItem(r, "slaked_lime");
        item_timber = new ModItem(r, "timber");

        tool_square = new ModItemTool(r, "square", 60);
        tool_Acheulean = new ModItemTool(r, "hand_axe", 132);
        tool_adz = new ModItemTool(r, "adz",251);
        tool_compass = new ModItemTool(r, "compass",251);
        tool_froe = new ModItemTool(r, "froe", 251);
        tool_planer = new ModItemTool(r, "hand_planer", 251);
        tool_level = new ModItemTool(r, "level", 33);
        tool_saw = new ModItemTool(r, "saw", 1562);

        tool_wood_hammer = new ModItemTool(r, "wood_hammer", 60);
        tool_stone_hammer = new ModItemTool(r, "stone_hammer", 132);
        tool_iron_hammer = new ModItemTool(r, "iron_hammer", 251);
        tool_gold_hammer = new ModItemTool(r, "gold_hammer", 33);
        tool_diamond_hammer = new ModItemTool(r, "diamond_hammer", 1562);

        //  BETTER WITH MODS COMPAT //

        if (Config.betterwithmods == true) {
            item_dirt = new ModItem(r, "dirt");
            item_sand = new ModItem(r, "sand");
        }
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

        //  BETTER WITH MODS COMPAT //

        if (Config.betterwithmods == true) {
            ((ModItem)item_dirt).initModel();
            ((ModItem)item_sand).initModel();
        }
    }
}
