package alsender.earthworks.main;

import alsender.earthworks.block.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by alsender on 12/22/16.
 */
public class EarthworksTab extends CreativeTabs {

    public EarthworksTab() {
        super(Earthworks.mod_id);
    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(ModBlocks.block_wattle);
    }
}
