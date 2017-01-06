package alsender.earthworks.item;

import alsender.earthworks.main.Earthworks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by alsender on 12/30/16.
 */
public class ModItem extends Item {

    public ModItem(String name) {
        setCreativeTab(Earthworks.creativeTab);
        setRegistryName("item_" + name);
        setUnlocalizedName(Earthworks.mod_id + ".item_" + name);
        GameRegistry.register(this);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
