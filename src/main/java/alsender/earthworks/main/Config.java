package alsender.earthworks.main;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

/**
 * Created by alsender on 1/29/17.
 */
public class Config {

    public static Configuration config;

    public static int spawn_rate, min_spawn, max_spawn, vein_size;
    public static boolean quark, betterwithmods;

    public static void init(File configFile) {
            config = new Configuration(configFile);
            load();
    }

    public static void load() {
        config.addCustomCategoryComment("world","World Gen Configs");
        config.addCustomCategoryComment("block","Block Configs");
        config.addCustomCategoryComment("compat", "Mod Compatability Configs");

        spawn_rate = config.getInt("spawn_rate", "world",3,0,42,"Attempts the world generator will make to spawn a CHALK vein.  Set to 0 to turn off CHALK");
        min_spawn = config.getInt("min_spawn","world",48,0,256,"Minimum Y level at which CHALK can spawn");
        max_spawn = config.getInt("max_spawn","world",256,0,256,"Maximum Y level at which CHALK can spawn.");
        vein_size = config.getInt("vein_size","world",33,0,33,"Vein size that CHALK can spawn in.");

        quark = config.getBoolean("quark","compat",true,"Set this to false to disable Earthworks blocks that Quark also adds.  Currently includes: Thatch, and Reed Block");
        betterwithmods = config.getBoolean("betterwithmods","compat",true,"Set this to false to disable Earthworks Blocks and Items that Better with Mods also adds.  Currently this includes: Dirt and Sand Items.");

        if (config.hasChanged()) {
            config.save();
        }
    }

    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equalsIgnoreCase(Earthworks.mod_id)) {
            load();
        }
    }
}
