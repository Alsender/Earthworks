package alsender.earthworks.main.registry;


import alsender.earthworks.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by alsender on 12/12/16.
 */
public class BlockRegistry {

    public static Block
            block_adobe,
            block_chalk,
            block_cinder,
            block_cob,
            block_concrete,
            block_cordwood,
            block_dry_stone,
            block_mud,
            block_mud_bottom,
            block_plaster,
            block_rammed_earth,
            block_reed,
            block_slate,
            block_thatch,
            block_wattle,
            block_wicker;

    public static Block
            slab_adobe,
            slab_chalk,
            slab_cinder,
            slab_cob,
            slab_concrete,
            slab_cordwood,
            slab_dry_stone,
            slab_mud,
            slab_plaster,
            slab_rammed_earth,
            slab_reed,
            slab_slate,
            slab_thatch,
            slab_wattle,
            slab_wicker;

    public static Block
            stair_adobe,
            stair_chalk,
            stair_cinder,
            stair_cob,
            stair_concrete,
            stair_cordwood,
            stair_dry_stone,
            stair_mud,
            stair_plaster,
            stair_rammed_earth,
            stair_reed,
            stair_slate,
            stair_thatch,
            stair_wattle,
            stair_wicker;

    public static Block
            wall_adobe,
            wall_chalk,
            wall_cinder,
            wall_cob,
            wall_concrete,
            wall_cordwood,
            wall_dry_stone,
            wall_mud,
            wall_plaster,
            wall_rammed_earth,
            wall_reed,
            wall_slate,
            wall_thatch,
            wall_wattle,
            wall_wicker;

    public static void init() {

        block_adobe = new ModBlock("block_adobe", Material.ROCK, 2.0F, 10.0F);
        block_chalk = new Block_Chalk("block_chalk");
        block_cinder = new ModBlock("block_cinder", Material.ROCK, 1.5F, 17.5F);
        block_cob = new ModBlock("block_cob", Material.GROUND, 1.0F, 5.0F);
        block_concrete = new ModBlock("block_concrete", Material.ROCK, 2.0F, 10.0F);
        block_cordwood = new Block_Cordwood("block_cordwood", Material.ROCK, 1.5F, 8.5F);
        block_dry_stone = new ModBlock("block_dry_stone", Material.ROCK, 2.0F, 4000.0F);
        block_mud = new Block_Mud("block_mud");
        block_mud_bottom = new Block_Mud_Bottom("block_mud_bottom");
        block_plaster = new ModBlock("block_plaster", Material.ROCK, 3.0F, 22.5f);
        block_rammed_earth = new ModBlock("block_rammed_earth", Material.ROCK, 1.5F, 30.0F);
        block_reed = new ModRotatedPillar("block_reed", Material.GRASS, 0.8F, 3.0F);
        block_slate = new ModBlock("block_slate", Material.ROCK, 1.5F, 30.0F);
        block_thatch = new ModRotatedPillar("block_thatch", Material.GRASS,0.8F, 3.0F);
        block_wattle = new ModBlock("block_wattle", Material.ROCK, 1.5F, 30.0F);
        block_wicker = new ModBlock("block_wicker", Material.WOOD, 0.8F, 3.0F);

        slab_adobe = new ModSlab("slab_adobe", block_adobe);
        slab_chalk = new ModSlab("slab_chalk", block_chalk);
        slab_cinder = new ModSlab("slab_cinder", block_cinder);
        slab_cob = new ModSlab("slab_cob", block_cob);
        slab_concrete = new ModSlab("slab_concrete", block_concrete);
        slab_cordwood = new ModSlab("slab_cordwood", block_cordwood);
        slab_dry_stone = new ModSlab("slab_dry_stone", block_dry_stone);
        slab_mud = new ModSlab("slab_mud", block_mud);
        slab_plaster = new ModSlab("slab_plaster", block_plaster);
        slab_rammed_earth = new ModSlab("slab_rammed_earth", block_rammed_earth);
        slab_reed = new ModSlab("slab_reed", block_reed);
        slab_slate = new ModSlab("slab_slate", block_slate);
        slab_thatch = new ModSlab("slab_thatch", block_thatch);
        slab_wattle = new ModSlab("slab_wattle", block_wattle);
        slab_wicker = new ModSlab("slab_wicker", block_wicker);

        stair_adobe = new ModStair("stair_adobe", block_adobe);
        stair_chalk = new ModStair("stair_chalk", block_chalk);
        stair_cinder = new ModStair("stair_cinder", block_cinder);
        stair_cob = new ModStair("stair_cob", block_cob);
        stair_concrete = new ModStair("stair_concrete", block_concrete);
        stair_cordwood = new ModStair("stair_cordwood", block_cordwood);
        stair_dry_stone = new ModStair("stair_dry_stone", block_dry_stone);
        stair_mud = new ModStair("stair_mud", block_mud);
        stair_plaster = new ModStair("stair_plaster", block_plaster);
        stair_rammed_earth = new ModStair("stair_rammed_earth", block_rammed_earth);
        stair_reed = new ModStair("stair_reed", block_reed);
        stair_slate = new ModStair("stair_slate", block_slate);
        stair_thatch = new ModStair("stair_thatch", block_thatch);
        stair_wattle = new ModStair("stair_wattle", block_wattle);
        stair_wicker = new ModStair("stair_wicker", block_wicker);

        wall_adobe = new ModWall("wall_adobe", block_adobe);
        wall_chalk = new ModWall("wall_chalk", block_chalk);
        wall_cinder =new ModWall("wall_cinder", block_cinder);
        wall_cob = new ModWall("wall_cob", block_cob);
        wall_concrete = new ModWall("wall_concrete", block_concrete);
        wall_cordwood = new ModWall("wall_cordwood", block_cordwood);
        wall_dry_stone = new ModWall("wall_dry_stone", block_dry_stone);
        wall_mud = new ModWall("wall_mud", block_mud);
        wall_plaster = new ModWall("wall_plaster", block_plaster);
        wall_rammed_earth = new ModWall("wall_rammed_earth", block_rammed_earth);
        wall_reed = new ModWall("wall_reed", block_reed);
        wall_slate = new ModWall("wall_slate", block_slate);
        wall_thatch = new ModWall("wall_thatch", block_thatch);
        wall_wattle = new ModWall("wall_wattle", block_wattle);
        wall_wicker = new ModWall("wall_wicker", block_wicker);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {

        ((ModBlock)block_adobe).initModel();
        ((ModBlock)block_chalk).initModel();
        ((ModBlock)block_cinder).initModel();
        ((ModBlock)block_cob).initModel();
        ((ModBlock)block_concrete).initModel();
        ((Block_Cordwood)block_cordwood).initModel();
        ((ModBlock)block_dry_stone).initModel();
        ((Block_Mud)block_mud).initModel();
        ((ModBlock)block_plaster).initModel();
        ((ModBlock)block_rammed_earth).initModel();
        ((ModRotatedPillar)block_reed).initModel();
        ((ModBlock)block_slate).initModel();
        ((ModRotatedPillar)block_thatch).initModel();
        ((ModBlock)block_wattle).initModel();
        ((ModBlock)block_wicker).initModel();

        ((ModSlab)slab_adobe).initModel();
        ((ModSlab)slab_chalk).initModel();
        ((ModSlab)slab_cinder).initModel();
        ((ModSlab)slab_cob).initModel();
        ((ModSlab)slab_concrete).initModel();
        ((ModSlab)slab_cordwood).initModel();
        ((ModSlab)slab_dry_stone).initModel();
        ((ModSlab)slab_mud).initModel();
        ((ModSlab)slab_plaster).initModel();
        ((ModSlab)slab_rammed_earth).initModel();
        ((ModSlab)slab_reed).initModel();
        ((ModSlab)slab_slate).initModel();
        ((ModSlab)slab_thatch).initModel();
        ((ModSlab)slab_wattle).initModel();
        ((ModSlab)slab_wicker).initModel();

        ((ModStair)stair_adobe).initModel();
        ((ModStair)stair_chalk).initModel();
        ((ModStair)stair_cinder).initModel();
        ((ModStair)stair_cob).initModel();
        ((ModStair)stair_concrete).initModel();
        ((ModStair)stair_cordwood).initModel();
        ((ModStair)stair_dry_stone).initModel();
        ((ModStair)stair_mud).initModel();
        ((ModStair)stair_plaster).initModel();
        ((ModStair)stair_rammed_earth).initModel();
        ((ModStair)stair_reed).initModel();
        ((ModStair)stair_slate).initModel();
        ((ModStair)stair_thatch).initModel();
        ((ModStair)stair_wattle).initModel();
        ((ModStair)stair_wicker).initModel();

        ((ModWall)wall_adobe).initModel();
        ((ModWall)wall_chalk).initModel();
        ((ModWall)wall_cinder).initModel();
        ((ModWall)wall_cob).initModel();
        ((ModWall)wall_concrete).initModel();
        ((ModWall)wall_cordwood).initModel();
        ((ModWall)wall_dry_stone).initModel();
        ((ModWall)wall_mud).initModel();
        ((ModWall)wall_plaster).initModel();
        ((ModWall)wall_rammed_earth).initModel();
        ((ModWall)wall_reed).initModel();
        ((ModWall)wall_slate).initModel();
        ((ModWall)wall_thatch).initModel();
        ((ModWall)wall_wattle).initModel();
        ((ModWall)wall_wicker).initModel();
    }
}
