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

    public static int Cspawn_rate, Cmin_spawn, Cmax_spawn, Cvein_size,
                        Sspawn_rate, Smin_spawn, Smax_spawn, Svein_size;
    public static boolean quark, persistantplanks, betterwithmods;

    public static void init(File configFile) {
            config = new Configuration(configFile);
            load();
    }

    public static void load() {
        config.addCustomCategoryComment("world","World Gen Configs");
        config.addCustomCategoryComment("compat", "Mod Compatibility Configs");

        Cspawn_rate = config.getInt("chalk_spawn_rate", "world",3,0,42,"Attempts the world generator will make to spawn a CHALK vein per chunk.  Set to 0 to turn off CHALK.");
        Cmin_spawn = config.getInt("chalk_min_spawn","world",48,0,256,"Minimum Y level at which CHALK can spawn.");
        Cmax_spawn = config.getInt("chalk_max_spawn","world",256,0,256,"Maximum Y level at which CHALK can spawn.");
        Cvein_size = config.getInt("chalk_vein_size","world",33,0,33,"Vein size that CHALK can spawn in.");

        Sspawn_rate = config.getInt("slate_spawn_rate", "world",10,0,42,"Attempts the world generator will make to spawn a SLATE vein per chunk.  Set to 0 to turn off SLATE.");
        Smin_spawn = config.getInt("slate_min_spawn","world",0,0,256,"Minimum Y level at which SLATE can spawn.");
        Smax_spawn = config.getInt("slate_max_spawn","world",256,0,256,"Maximum Y level at which SLATE can spawn.");
        Svein_size = config.getInt("slate_vein_size","world",33,0,33,"Vein size that SLATE can spawn in.");

        quark = config.getBoolean("quark","compat",true,"Set this to FALSE to DISABLE Earthworks blocks that Quark also adds.  Currently includes: Thatch, and Reed Blocks.");
        persistantplanks = config.getBoolean("persistant_planks","compat",false,"Set this to true to force Earthworks VERTICAL PLANKS to register when Quark is also installed. This is for cases where you've already started a world with Earthworks, and are adding Quark after the fact.  Of if you just like redundant blocks.");
        betterwithmods = config.getBoolean("betterwithmods","compat",true,"Set this to FALSE to DISABLE Earthworks blocks and items that Better with Mods also adds.  Currently this includes: Dirt and Sand Items.");

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
