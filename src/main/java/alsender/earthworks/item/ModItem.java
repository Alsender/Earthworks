package alsender.earthworks.item;

import alsender.earthworks.main.Earthworks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by alsender on 12/30/16.
 */
public class ModItem extends Item {

    public ModItem(IForgeRegistry<Item> registry, String name) {
        setCreativeTab(Earthworks.creativeTab);
        setRegistryName("item_" + name);
        setTranslationKey(Earthworks.mod_id + ".item_" + name);
        registry.register(this);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
