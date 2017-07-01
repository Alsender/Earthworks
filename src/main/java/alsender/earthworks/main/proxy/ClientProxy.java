package alsender.earthworks.main.proxy;

import alsender.earthworks.main.registry.BlockRegistry;
import alsender.earthworks.main.registry.ItemRegistry;
import alsender.earthworks.main.registry.TimberRegistry;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Created by alsender on 12/12/16.
 */
@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        BlockRegistry.initModels();
        TimberRegistry.initModels();
        ItemRegistry.initModels();
    }
}
