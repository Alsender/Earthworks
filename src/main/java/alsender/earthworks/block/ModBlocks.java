package alsender.earthworks.block;


import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by alsender on 12/12/16.
 */
public class ModBlocks {
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

    public static void init() {
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
    }
}
