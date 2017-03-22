package alsender.earthworks.main.registry;


import alsender.earthworks.item.ModItem;
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

    public static void init() {
        item_adobe = new ModItem("adobe");
        item_cob = new ModItem("cob");
        item_lime_plaster = new ModItem("lime_plaster");
        item_mud = new ModItem("mud");
        item_chalk = new ModItem("chalk");
        item_quicklime = new ModItem("quicklime");
        item_slaked_lime = new ModItem("slaked_lime");
        item_timber = new ModItem("timber");
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
    }
 }
