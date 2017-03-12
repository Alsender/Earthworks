package alsender.earthworks.main.proxy;

import alsender.earthworks.main.Config;
import alsender.earthworks.main.registry.BlockRegistry;
import alsender.earthworks.main.registry.CompatRegistry;
import alsender.earthworks.main.registry.ItemRegistry;
import alsender.earthworks.main.registry.TimberRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by alsender on 12/12/16.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        ItemRegistry.initModels();
        BlockRegistry.initModels();
        TimberRegistry.initModels();
        if (Config.quark == true) {
            CompatRegistry.initQuarkModels();
        }
        if (Config.betterwithmods = true) {
            CompatRegistry.initBTMModels();
        }
    }
}
