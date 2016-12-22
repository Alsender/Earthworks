package alsender.earthworks.item;


import alsender.earthworks.block.ModBlock;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by alsender on 12/12/16.
 */
public class ModItems {

    public static Item_Cob item_cob;
    public static Item_Dirt item_dirt;
    public static Item_Mud item_mud;

    public static void init() {
        item_cob = new Item_Cob();
        item_dirt = new Item_Dirt();
        item_mud = new Item_Mud();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        item_cob.initModel();
        item_dirt.initModel();
        item_mud.initModel();
    }
}
