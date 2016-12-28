package alsender.earthworks.block;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by alsender on 12/12/16.
 */
public class ModBlocks {

    public static Block
            block_adobe,
            block_cinder,
            block_cob,
            block_concrete,
            block_dry_stone,
            block_gold_leaf,
            block_lapis_inlay,
            block_mud,
            block_mud_bottom,
            block_rammed_earth,
            block_reed,
            block_slate,
            block_thatch,
            block_wattle,
            block_wicker;

    public static Block
            slab_adobe,
//          slab_cinder,
            slab_cob,
//          slab_concrete,
            slab_dry_stone,
//          slab_gold_leaf,
//          slab_lapis_inlay,
            slab_mud,
            slab_rammed_earth,
            slab_reed,
            slab_slate,
            slab_thatch,
            slab_wattle,
            slab_wicker;

    public static Block
            stair_adobe,
//          stair_cinder,
            stair_cob,
//          stair_concrete,
            stair_dry_stone,
//          stair_gold_leaf,
//          stair_lapis_inlay,
            stair_mud,
            stair_rammed_earth,
            stair_reed,
            stair_slate,
            stair_thatch,
            stair_wattle,
            stair_wicker;

    public static Block
            wall_adobe,
            wall_cinder,
            wall_cob,
            wall_concrete,
            wall_dry_stone,
            wall_gold_leaf,
            wall_lapis_inlay,
            wall_mud,
            wall_rammed_earth,
            wall_reed,
            wall_slate,
            wall_thatch,
            wall_wattle,
            wall_wicker;

    public static void init() {

        GameRegistry.registerBlock(block_adobe = new ModBlock("block_adobe", Material.ROCK, 2.0F, 10.0F));
//      GameRegistry.registerBlock(block_cinder = new ModBlock("block_cinder", Material.ROCK, 1.5F, 17.5F));
        GameRegistry.registerBlock(block_cob = new ModBlock("block_cob", Material.GROUND, 1.0F, 5.0F));
//      GameRegistry.registerBlock(block_concrete = new ModBlock("block_concrete", Material.ROCK, 2.0F, 10.0F));
        GameRegistry.registerBlock(block_dry_stone = new ModBlock("block_dry_stone", Material.ROCK, 2.0F, 4000.0F));
//      GameRegistry.registerBlock(block_gold_leaf = new ModBlock("block_gold_leaf", Material.ROCK, 2.0F, 9.0F));
//      GameRegistry.registerBlock(block_lapis_inlay = new ModBlock("block_lapis_inlay", Material.ROCK, 2.0F, 9.0F));
        GameRegistry.registerBlock(block_mud = new Block_Mud("block_mud"));
        GameRegistry.registerBlock(block_mud_bottom = new Block_Mud_Bottom("block_mud_bottom"));
        GameRegistry.registerBlock(block_rammed_earth = new ModBlock("block_rammed_earth", Material.ROCK, 1.5F, 30.0F));
        GameRegistry.registerBlock(block_reed = new ModRotatedPillar("block_reed", Material.GRASS, 0.8F, 3.0F));
        GameRegistry.registerBlock(block_slate = new ModBlock("block_slate", Material.ROCK, 1.5F, 30.0F));
        GameRegistry.registerBlock(block_thatch = new ModRotatedPillar("block_thatch", Material.GRASS,0.8F, 3.0F));
        GameRegistry.registerBlock(block_wattle = new ModBlock("block_wattle", Material.ROCK, 1.5F, 30.0F));
        GameRegistry.registerBlock(block_wicker = new ModBlock("block_wicker", Material.WOOD, 0.8F, 3.0F));

        GameRegistry.registerBlock(slab_adobe = new ModSlab("slab_adobe", Material.ROCK));
//      GameRegistry.registerBlock(slab_cinder = new ModSlab("slab_cinder", Material.ROCK));
        GameRegistry.registerBlock(slab_cob = new ModSlab("slab_cob", Material.GROUND));
//      GameRegistry.registerBlock(slab_concrete = new ModSlab("slab_concrete", Material.CLAY));
        GameRegistry.registerBlock(slab_dry_stone = new ModSlab("slab_dry_stone", Material.ROCK));
//      GameRegistry.registerBlock(slab_gold_leaf = new ModSlab("slab_gold_leaf", Material.ROCK));
//      GameRegistry.registerBlock(slab_lapis_inlay = new ModSlab("slab_lapis_inlay", Material.ROCK));
        GameRegistry.registerBlock(slab_mud = new ModSlab("slab_mud", Material.ROCK));
        GameRegistry.registerBlock(slab_rammed_earth = new ModSlab("slab_rammed_earth", Material.GROUND));
        GameRegistry.registerBlock(slab_reed = new ModSlab("slab_reed", Material.GRASS));
        GameRegistry.registerBlock(slab_slate = new ModSlab("slab_slate", Material.ROCK));
        GameRegistry.registerBlock(slab_thatch = new ModSlab("slab_thatch", Material.GRASS));
        GameRegistry.registerBlock(slab_wattle = new ModSlab("slab_wattle", Material.ROCK));
        GameRegistry.registerBlock(slab_wicker = new ModSlab("slab_wicker", Material.GRASS));

        GameRegistry.registerBlock(stair_adobe = new ModStair("stair_adobe", block_adobe));
//      GameRegistry.registerBlock(stair_cinder = new ModStair("stair_cinder", block_cinder));
        GameRegistry.registerBlock(stair_cob = new ModStair("stair_cob", block_cob));
//      GameRegistry.registerBlock(stair_concrete = new ModStair("stair_concrete", block_concrete));
        GameRegistry.registerBlock(stair_dry_stone = new ModStair("stair_dry_stone", block_dry_stone));
//      GameRegistry.registerBlock(stair_gold_leaf = new ModStair("stair_gold_leaf", block_gold_leaf));
//      GameRegistry.registerBlock(stair_lapis_inlay = new ModStair("stair_lapis_inlay", block_lapis_inlay));
        GameRegistry.registerBlock(stair_mud = new ModStair("stair_mud", block_mud));
        GameRegistry.registerBlock(stair_rammed_earth = new ModStair("stair_rammed_earth", block_rammed_earth));
        GameRegistry.registerBlock(stair_reed = new ModStair("stair_reed", block_reed));
        GameRegistry.registerBlock(stair_slate = new ModStair("stair_slate", block_slate));
        GameRegistry.registerBlock(stair_thatch = new ModStair("stair_thatch", block_thatch));
        GameRegistry.registerBlock(stair_wattle = new ModStair("stair_wattle", block_wattle));
        GameRegistry.registerBlock(stair_wicker = new ModStair("stair_wicker", block_wicker));

        GameRegistry.registerBlock(wall_adobe = new ModWall("wall_adobe", block_adobe));
//      GameRegistry.registerBlock(wall_cinder =new ModWall("wall_cinder", block_cinder));
        GameRegistry.registerBlock(wall_cob = new ModWall("wall_cob", block_cob));
//      GameRegistry.registerBlock(wall_concrete = new ModWall("wall_concrete", block_concrete));
        GameRegistry.registerBlock(wall_dry_stone = new ModWall("wall_dry_stone", block_dry_stone));
//      GameRegistry.registerBlock(wall_gold_leaf = new ModWall("wall_gold_leaf", block_gold_leaf));
//      GameRegistry.registerBlock(wall_lapis_inlay = new ModWall("wall_lapis_inlay", block_lapis_inlay));
        GameRegistry.registerBlock(wall_mud = new ModWall("wall_mud", block_mud));
        GameRegistry.registerBlock(wall_rammed_earth = new ModWall("wall_rammed_earth", block_rammed_earth));
        GameRegistry.registerBlock(wall_reed = new ModWall("wall_reed", block_reed));
        GameRegistry.registerBlock(wall_slate = new ModWall("wall_slate", block_slate));
        GameRegistry.registerBlock(wall_thatch = new ModWall("wall_thatch", block_thatch));
        GameRegistry.registerBlock(wall_wattle = new ModWall("wall_wattle", block_wattle));
        GameRegistry.registerBlock(wall_wicker = new ModWall("wall_wicker", block_wicker));
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {

        ((ModBlock)block_adobe).initModel();
        ((ModBlock)block_cob).initModel();
        ((ModBlock)block_dry_stone).initModel();
        ((Block_Mud)block_mud).initModel();
        ((ModBlock)block_rammed_earth).initModel();
        ((ModRotatedPillar)block_reed).initModel();
        ((ModBlock)block_slate).initModel();
        ((ModRotatedPillar)block_thatch).initModel();
        ((ModBlock)block_wattle).initModel();
        ((ModBlock)block_wicker).initModel();

        ((ModSlab)slab_adobe).initModel();
        ((ModSlab)slab_cob).initModel();
        ((ModSlab)slab_dry_stone).initModel();
        ((ModSlab)slab_mud).initModel();
        ((ModSlab)slab_rammed_earth).initModel();
        ((ModSlab)slab_reed).initModel();
        ((ModSlab)slab_slate).initModel();
        ((ModSlab)slab_thatch).initModel();
        ((ModSlab)slab_wattle).initModel();
        ((ModSlab)slab_wicker).initModel();

        ((ModStair)stair_adobe).initModel();
        ((ModStair)stair_cob).initModel();
        ((ModStair)stair_dry_stone).initModel();
        ((ModStair)stair_mud).initModel();
        ((ModStair)stair_rammed_earth).initModel();
        ((ModStair)stair_reed).initModel();
        ((ModStair)stair_slate).initModel();
        ((ModStair)stair_thatch).initModel();
        ((ModStair)stair_wattle).initModel();
        ((ModStair)stair_wicker).initModel();

        ((ModWall)wall_adobe).initModel();
//      ((ModWall)wall_cinder).initModel();
        ((ModWall)wall_cob).initModel();
//      ((ModWall)wall_concrete).initModel();
        ((ModWall)wall_dry_stone).initModel();
//      ((ModWall)wall_gold_leaf).initModel();
//      ((ModWall)wall_lapis_inlay).initModel();
        ((ModWall)wall_mud).initModel();
        ((ModWall)wall_rammed_earth).initModel();
        ((ModWall)wall_reed).initModel();
        ((ModWall)wall_slate).initModel();
        ((ModWall)wall_thatch).initModel();
        ((ModWall)wall_wattle).initModel();
        ((ModWall)wall_wicker).initModel();
    }
}
