package alsender.earthworks.block;


import alsender.earthworks.block.slab.ModBlock_Slab;
import alsender.earthworks.block.slab.Slab_Adobe;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by alsender on 12/12/16.
 */
public class ModBlocks {

/** public static Block block_adobe,
                        block_cinder,
                        block_cob,
                        block_concrete,
                        block_dry_stone,
                        block_mud,
                        block_mud_bottom,
                        block_rammed_earth,
                        block_reed,
                        block_slate,
                        block_thatch,
                        block_wattle,
                        block_wicker;
*/
    public static Block_Adobe block_adobe;
//  public static Block_Cinder block_cinder;
    public static Block_Cob block_cob;
//  public static Block_Concrete block_concrete;
    public static Block_Dry_Stone block_dry_stone;
//  public static Block_Gold_Leaf block_gold_leaf;
//  public static Block_Lapis_Inlay block_lapis_inlay;
    public static Block_Mud block_mud;
    public static Block_Mud_Bottom block_mud_bottom;
    public static Block_Rammed_Earth block_rammed_earth;
    public static Block_Reed block_reed;
    public static Block_Slate block_slate;
    public static Block_Thatch block_thatch;
    public static Block_Wattle block_wattle;
    public static Block_Wicker block_wicker;

    public static Slab_Adobe slab_adobe;

    public static void init() {

/**     GameRegistry.register(block_adobe = new ModBlock("block_adobe", Material.ROCK, 2.0F, 10.0F));
        GameRegistry.register(block_cob = new ModBlock("block_cob", Material.GROUND, 1.0F, 5.0F));
        GameRegistry.register(block_concrete = new ModBlock("block_concrete", Material.CLAY, 0.0F, 0.0F));
        GameRegistry.register(block_dry_stone = new ModBlock("block_dry_stone", Material.ROCK, 2.0F, 4000.0F));
        GameRegistry.register(block_mud = new Block_Mud());
        GameRegistry.register(block_rammed_earth = new ModBlock("block_rammed_earth", Material.ROCK, 1.5F, 30.0F));
        GameRegistry.register(block_reed = new ModBlock("block_reed", Material.CLOTH))
*/
        block_adobe = new Block_Adobe();
//      block_cinder = new Block_Cinder();
        block_cob = new Block_Cob();
//      block_concrete = new Block_Concrete();
        block_dry_stone = new Block_Dry_Stone();
//      block_gold_leaf = new Block_Gold_Leaf ();
//      block_lapis_inlay = new Block_Lapis_Inlay();
        block_mud = new Block_Mud();
        block_mud_bottom = new Block_Mud_Bottom();
        block_rammed_earth = new Block_Rammed_Earth();
        block_reed = new Block_Reed();
        block_slate = new Block_Slate();
        block_thatch = new Block_Thatch();
        block_wattle = new Block_Wattle();
        block_wicker = new Block_Wicker();

        slab_adobe = new Slab_Adobe();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        block_adobe.initModel();
        block_cob.initModel();
        block_dry_stone.initModel();
        block_mud.initModel();
        block_rammed_earth.initModel();
        block_reed.initModel();
        block_slate.initModel();
        block_thatch.initModel();
        block_wattle.initModel();
        block_wicker.initModel();

        slab_adobe.initModel();
    }
}
