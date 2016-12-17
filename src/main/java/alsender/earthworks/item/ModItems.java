package alsender.earthworks.item;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by alsender on 12/12/16.
 */
public class ModItems {

    public static Item_Wattle item_wattle;

    public static void init() {
        item_wattle = new Item_Wattle();
    }

    @SideOnly(Side.CLIENT)
    public void initModels() {
        Item_Wattle.initModel();
    }
}
