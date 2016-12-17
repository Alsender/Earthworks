package alsender.earthworks.main.proxy;

import alsender.earthworks.block.ModBlocks;
import alsender.earthworks.item.ModItems;
import alsender.earthworks.main.Earthworks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by alsender on 12/12/16.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void registerItemModel(Item item, int meta, String id){
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Earthworks.mod_id + ":" + id, "inventory"));
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
        ModBlocks.init();
    }
}
