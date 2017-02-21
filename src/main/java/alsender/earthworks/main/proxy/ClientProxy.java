package alsender.earthworks.main.proxy;

import alsender.earthworks.main.registry.BlockRegistry;
import alsender.earthworks.main.registry.ItemRegistry;
import alsender.earthworks.main.registry.TimberRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by alsender on 12/12/16.
 */
public class ClientProxy extends CommonProxy {

    ResourceProxy resourceProxy;

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        ItemRegistry.initModels();
        BlockRegistry.initModels();
        TimberRegistry.initModels();
    }

    @Override
    public void addResourceOverride(String space, String dir, String file, String ext) {
        resourceProxy.addResource(space, dir, file, ext);
    }
}
