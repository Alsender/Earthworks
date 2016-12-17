package alsender.earthworks.main.proxy;

import alsender.earthworks.block.ModBlocks;
import alsender.earthworks.item.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by alsender on 12/12/16.
 */
public class ClientProxy extends CommonProxy {

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.initModels();
        ModBlocks.initModels();
    }
}
