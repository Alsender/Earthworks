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
        if (Config.quark == true) {
            CompatRegistry.initQuark();
        }
        if (Config.betterwithmods == true) {
            CompatRegistry.initBTM();
        }
    }

    public void init(FMLInitializationEvent event) {
        RecipeRegistry.init();
        TimberRegistry.initRecipes();
        if (Config.quark == true) {
            CompatRegistry.initQuarkRecipe();
        }
        if (Config.betterwithmods == true) {
            CompatRegistry.initBTMRecipe();
        }
    }

    public void postInit(FMLPostInitializationEvent event) {
    }
}
