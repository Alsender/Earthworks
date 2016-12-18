package alsender.earthworks.item;


import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by alsender on 12/12/16.
 */
public class ModItems {

    public static Item_Cob item_cob;
    public static Item_Dirt item_dirt;

    public static void init() {
        item_cob = new Item_Cob();
        item_dirt = new Item_Dirt();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        item_cob.initModel();
        item_dirt.initModel();
    }
}
