package alsender.earthworks.main.registry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;

import static alsender.earthworks.main.registry.BlockRegistry.*;
import static alsender.earthworks.main.registry.ItemRegistry.*;

/**
 * Created by alsender on 6/20/17.
 */
public class OreDictRegistry {

    public static void init() {
        OreDictionary.registerOre("dustDirt", item_dirt);
        OreDictionary.registerOre("dustSand", item_sand);

        OreDictionary.registerOre("logTimber", block_timber_oak);
        OreDictionary.registerOre("logTimber", block_timber_spruce);
        OreDictionary.registerOre("logTimber", block_timber_birch);
        OreDictionary.registerOre("logTimber", block_timber_jungle);
        OreDictionary.registerOre("logTimber", block_timber_acacia);
        OreDictionary.registerOre("logTimber", block_timber_dark_oak);

        OreDictionary.registerOre("materialBinding", Items.PAPER);
        OreDictionary.registerOre("materialBinding", Items.REEDS);
        OreDictionary.registerOre("materialBinding", Items.STRING);
        OreDictionary.registerOre("materialBinding", Items.WHEAT);
        OreDictionary.registerOre("materialBinding", Blocks.CACTUS);
        OreDictionary.registerOre("materialBinding", Blocks.DEADBUSH);
        OreDictionary.registerOre("materialBinding", Blocks.DOUBLE_PLANT);
        OreDictionary.registerOre("materialBinding", Blocks.LEAVES);
        OreDictionary.registerOre("materialBinding", Blocks.LEAVES2);
        OreDictionary.registerOre("materialBinding", Blocks.SAPLING);
        OreDictionary.registerOre("materialBinding", Blocks.TALLGRASS);
        OreDictionary.registerOre("materialBinding", Blocks.VINE);
        OreDictionary.registerOre("materialBinding", Blocks.RED_FLOWER);
        OreDictionary.registerOre("materialBinding", Blocks.YELLOW_FLOWER);
        OreDictionary.registerOre("materialBinding", Blocks.WEB);
    }
}
