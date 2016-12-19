package alsender.earthworks.item;

import alsender.earthworks.main.Earthworks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by alsender on 12/18/16.
 */
public class Item_Mud extends Item {

    public Item_Mud() {
        setCreativeTab(CreativeTabs.MATERIALS);
        setRegistryName("item_mud");
        setUnlocalizedName(Earthworks.mod_id + ".item_mud");
        GameRegistry.register(this);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
