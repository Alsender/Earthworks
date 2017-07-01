package alsender.earthworks.main.proxy;

import alsender.earthworks.main.registry.BlockRegistry;
import alsender.earthworks.main.registry.ItemRegistry;
import alsender.earthworks.main.registry.OreDictRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by alsender on 12/12/16.
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {

    }

    public void init(FMLInitializationEvent event) {
        GameRegistry.addSmelting(ItemRegistry.item_chalk, new ItemStack(ItemRegistry.item_quicklime), 0.1F);
        GameRegistry.addSmelting(BlockRegistry.block_chalk, new ItemStack(ItemRegistry.item_quicklime, 4), 0.1F);
    }

    public void postInit(FMLPostInitializationEvent event) {
        OreDictRegistry.init();
    }
}
