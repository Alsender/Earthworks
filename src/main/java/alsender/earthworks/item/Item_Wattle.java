package alsender.earthworks.item;

import alsender.earthworks.main.Earthworks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by alsender on 12/12/16.
 */
public class Item_Wattle extends Item {
    public Item_Wattle () {
        setCreativeTab(CreativeTabs.MATERIALS);
        setRegistryName("item_wattle");
        setUnlocalizedName(Earthworks.mod_id + ".item_wattle");
        GameRegistry.register(this);
    }
}
