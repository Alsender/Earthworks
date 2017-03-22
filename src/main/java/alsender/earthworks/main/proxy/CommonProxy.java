package alsender.earthworks.main.proxy;

import alsender.earthworks.main.Config;
import alsender.earthworks.main.registry.*;
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
        RecipeRegistry.init();
        TimberRegistry.initRecipes();
        if (Config.quark == true) {
            CompatRegistry.initQuark();
            CompatRegistry.initQuarkRecipe();
        }
        if (Config.betterwithmods == true) {
            CompatRegistry.initBTM();
            CompatRegistry.initBTMRecipe();
        }
    }

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
    }
}
