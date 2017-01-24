package alsender.earthworks.main;

import alsender.earthworks.main.proxy.CommonProxy;
import alsender.earthworks.main.registry.BlockRegistry;
import alsender.earthworks.main.registry.RecipeRegistry;
import alsender.earthworks.main.registry.TimberRegistry;
import alsender.earthworks.main.world.ModWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alsender on 12/12/16.
 */
@Mod(modid = Earthworks.mod_id, name = Earthworks.name, version = Earthworks.version)

public class Earthworks {

    public static final String mod_id = "earthworks";
    public static final String name = "Earthworks";
    public static final String version = "0.2.1";

    public static final CreativeTabs creativeTab = (new CreativeTabs("earthworks") {

        public String getTabLabel() {
            return "earthworks";
        }
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(BlockRegistry.block_wattle);
        }

        @Override
        public boolean hasSearchBar() {
            return true;
        }
    }).setBackgroundImageName("item_search.png");

    @Mod.Instance
    public static Earthworks instance;
    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        RecipeRegistry.init();
        TimberRegistry.initRecipes();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @SidedProxy(serverSide = "alsender.earthworks.main.proxy.CommonProxy", clientSide = "alsender.earthworks.main.proxy.ClientProxy")
    public static CommonProxy proxy;

}
