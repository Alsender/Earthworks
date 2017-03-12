package alsender.earthworks.main.proxy;

import alsender.earthworks.main.Config;
import alsender.earthworks.main.registry.BlockRegistry;
import alsender.earthworks.main.registry.CompatRegistry;
import alsender.earthworks.main.registry.ItemRegistry;
import alsender.earthworks.main.registry.TimberRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by alsender on 12/12/16.
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        BlockRegistry.init();
        TimberRegistry.init();
        ItemRegistry.init();
        if (Config.quark == true) {
            CompatRegistry.initQuark();
        }
        if (Config.betterwithmods == true) {
            CompatRegistry.initBTM();
        }
    }

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
    }

    public void addResourceOverride(String space, String dir, String file, String ext) {}
}
