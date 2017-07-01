package alsender.earthworks.main.registry;


import alsender.earthworks.block.*;
import alsender.earthworks.item.BlockItemPlanksVert;
import alsender.earthworks.item.BlockItemWoodShingle;
import alsender.earthworks.item.ModItemSlab;
import alsender.earthworks.main.Config;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by alsender on 12/12/16.
 */
@Mod.EventBusSubscriber
public class BlockRegistry {

    public static Block
            block_adobe,
            block_chalk,
            block_chalk_dust,
            block_cinder,
            block_cob,
            block_concrete,
            block_cordwood,
            block_dry_stone,
            block_gabion0, block_gabion1, block_gabion2,
            block_gabion_falling0, block_gabion_falling1, block_gabion_falling2,
            block_mud,
            block_mud_bottom,
            block_planks_vert,
            block_plaster,
            block_rammed_earth,
            block_reed,
            block_slate, block_slate_green, block_slate_purple,
            block_slate_slab, block_slate_slab_green, block_slate_slab_purple,
            block_slate_shingle, block_slate_shingle_verte, block_slate_shingle_purple,
            block_slate_tile, block_slate_tile_verte, block_slate_tile_purple,
            block_thatch,
            block_timber_oak, block_timber_birch, block_timber_spruce,
            block_timber_jungle, block_timber_acacia, block_timber_dark_oak,
            block_wattle,
            block_wicker,
            block_wood_shingle;
    
    public static Block
            fence_planks_vert0, fence_planks_vert1, fence_planks_vert2,
            fence_planks_vert3, fence_planks_vert4, fence_planks_vert5;

    public static Block
            slab_adobe,
            slab_chalk,
            slab_cinder,
            slab_cob,
            slab_concrete,
            slab_cordwood,
            slab_dry_stone,
            slab_gabion0, slab_gabion1, slab_gabion2,
            slab_mud,
            slab_planks_vert0, slab_planks_vert1, slab_planks_vert2,
            slab_planks_vert3, slab_planks_vert4, slab_planks_vert5,
            slab_plaster,
            slab_rammed_earth,
            slab_reed,
            slab_slate, slab_slate_green, slab_slate_purple,
            slab_slate_slab, slab_slate_slab_green, slab_slate_slab_purple,
            slab_slate_shingle, slab_slate_shingle_verte, slab_slate_shingle_purple,
            slab_slate_tile, slab_slate_tile_verte, slab_slate_tile_purple,
            slab_thatch,
            slab_timber_oak, slab_timber_birch, slab_timber_spruce,
            slab_timber_jungle, slab_timber_acacia, slab_timber_dark_oak,
            slab_wattle,
            slab_wicker,
            slab_wood_shingle_oak, slab_wood_shingle_spruce, slab_wood_shingle_birch,
            slab_wood_shingle_jungle, slab_wood_shingle_acacia, slab_wood_shingle_dark_oak;

    public static Block
            stair_adobe,
            stair_chalk,
            stair_cinder,
            stair_cob,
            stair_concrete,
            stair_cordwood,
            stair_dry_stone,
            stair_gabion0, stair_gabion1, stair_gabion2,
            stair_mud,
            stair_planks_vert0, stair_planks_vert1, stair_planks_vert2,
            stair_planks_vert3, stair_planks_vert4, stair_planks_vert5,
            stair_plaster,
            stair_rammed_earth,
            stair_reed,
            stair_slate, stair_slate_green, stair_slate_purple,
            stair_slate_slab, stair_slate_slab_green, stair_slate_slab_purple,
            stair_slate_shingle, stair_slate_shingle_verte, stair_slate_shingle_purple,
            stair_slate_tile, stair_slate_tile_verte, stair_slate_tile_purple,
            stair_thatch,
            stair_timber_oak, stair_timber_birch, stair_timber_spruce,
            stair_timber_jungle, stair_timber_acacia, stair_timber_dark_oak,
            stair_wattle,
            stair_wicker,
            stair_wood_shingle_oak, stair_wood_shingle_spruce, stair_wood_shingle_birch,
            stair_wood_shingle_jungle, stair_wood_shingle_acacia, stair_wood_shingle_dark_oak;

    public static Block
            wall_adobe,
            wall_chalk,
            wall_cinder,
            wall_cob,
            wall_concrete,
            wall_cordwood,
            wall_dry_stone,
            wall_gabion0, wall_gabion1, wall_gabion2,
            wall_mud,
            wall_plaster,
            wall_rammed_earth,
            wall_reed,
            wall_slate, wall_slate_green, wall_slate_purple,
            wall_slate_slab, wall_slate_slab_green, wall_slate_slab_purple,
            wall_slate_shingle, wall_slate_shingle_verte, wall_slate_shingle_purple,
            wall_slate_tile, wall_slate_tile_verte, wall_slate_tile_purple,
            wall_thatch,
            wall_timber_oak, wall_timber_birch, wall_timber_spruce,
            wall_timber_jungle, wall_timber_acacia, wall_timber_dark_oak,
            wall_wattle,
            wall_wicker,
            wall_wood_shingle_oak, wall_wood_shingle_spruce, wall_wood_shingle_birch,
            wall_wood_shingle_jungle, wall_wood_shingle_acacia, wall_wood_shingle_dark_oak;

    public static ModItemSlab
            itemslab_adobe,
            itemslab_chalk,
            itemslab_cinder,
            itemslab_cob,
            itemslab_concrete,
            itemslab_cordwood,
            itemslab_dry_stone,
            itemslab_gabion0, itemslab_gabion1, itemslab_gabion2,
            itemslab_mud,
            itemslab_planks_vert0, itemslab_planks_vert1, itemslab_planks_vert2,
            itemslab_planks_vert3, itemslab_planks_vert4, itemslab_planks_vert5,
            itemslab_plaster,
            itemslab_rammed_earth,
            itemslab_reed,
            itemslab_slate, itemslab_slate_green, itemslab_slate_purple,
            itemslab_slate_slab, itemslab_slate_slab_green, itemslab_slate_slab_purple,
            itemslab_slate_shingle, itemslab_slate_shingle_verte, itemslab_slate_shingle_purple,
            itemslab_slate_tile, itemslab_slate_tile_verte, itemslab_slate_tile_purple,
            itemslab_thatch,
            itemslab_timber_oak, itemslab_timber_birch, itemslab_timber_spruce,
            itemslab_timber_jungle, itemslab_timber_acacia, itemslab_timber_dark_oak,
            itemslab_wattle,
            itemslab_wicker,
            itemslab_wood_shingle_oak, itemslab_wood_shingle_spruce, itemslab_wood_shingle_birch,
            itemslab_wood_shingle_jungle, itemslab_wood_shingle_acacia, itemslab_wood_shingle_dark_oak;

    public static ModDoubleSlab
            doubleslab_adobe,
            doubleslab_chalk,
            doubleslab_cinder,
            doubleslab_cob,
            doubleslab_concrete,
            doubleslab_cordwood,
            doubleslab_dry_stone,
            doubleslab_gabion0, doubleslab_gabion1, doubleslab_gabion2,
            doubleslab_mud,
            doubleslab_planks_vert0, doubleslab_planks_vert1, doubleslab_planks_vert2,
            doubleslab_planks_vert3, doubleslab_planks_vert4, doubleslab_planks_vert5,
            doubleslab_plaster,
            doubleslab_rammed_earth,
            doubleslab_reed,
            doubleslab_slate, doubleslab_slate_green, doubleslab_slate_purple,
            doubleslab_slate_slab, doubleslab_slate_slab_green, doubleslab_slate_slab_purple,
            doubleslab_slate_shingle, doubleslab_slate_shingle_verte, doubleslab_slate_shingle_purple,
            doubleslab_slate_tile, doubleslab_slate_tile_verte, doubleslab_slate_tile_purple,
            doubleslab_thatch,
            doubleslab_timber_oak, doubleslab_timber_birch, doubleslab_timber_spruce,
            doubleslab_timber_jungle, doubleslab_timber_acacia, doubleslab_timber_dark_oak,
            doubleslab_wattle,
            doubleslab_wicker,
            doubleslab_wood_shingle_oak, doubleslab_wood_shingle_spruce, doubleslab_wood_shingle_birch,
            doubleslab_wood_shingle_jungle, doubleslab_wood_shingle_acacia, doubleslab_wood_shingle_dark_oak;

    @SubscribeEvent
    public static void initBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> r = event.getRegistry();
        block_adobe = new ModBlock(r, "block_adobe", Material.ROCK, SoundType.STONE, 2.0F, 3.3F);
        block_chalk = new Block_Chalk(r, "block_chalk");
        block_cinder = new ModBlock(r, "block_cinder", Material.ROCK, SoundType.STONE, 1.5F, 5.83F);
        block_cob = new ModBlock(r, "block_cob", Material.GROUND, SoundType.GROUND, 1.0F, 3.0F);
        block_concrete = new ModBlock(r, "block_concrete", Material.ROCK, SoundType.STONE, 2.0F, 10.0F);
        block_cordwood = new ModBlockFacing(r, "block_cordwood", Material.ROCK, SoundType.STONE,1.5F, 2.83F);
        block_dry_stone = new ModBlock(r, "block_dry_stone", Material.ROCK, SoundType.STONE, 2.0F, 1333.3F);
        block_gabion0 = new Block_Gabion(r, "block_gabion_gravel",0, Material.ROCK,SoundType.SAND,2.0F,12.0F, Blocks.GRAVEL);
        block_gabion1 = new Block_Gabion(r, "block_gabion_sand",1, Material.ROCK,SoundType.SAND,2.0F,12.0F, Blocks.SAND);
        block_gabion2 = new Block_Gabion(r, "block_gabion_dirt",2, Material.ROCK,SoundType.SAND,2.0F,12.0F, Blocks.DIRT);
        block_gabion_falling0 = new Block_Gabion_Falling(r, "gravel", block_gabion0);
        block_gabion_falling1 = new Block_Gabion_Falling(r, "sand", block_gabion1);
        block_gabion_falling2 = new Block_Gabion_Falling(r, "dirt", block_gabion2);
        block_mud = new Block_Mud(r, "block_mud");
        block_mud_bottom = new Block_Mud_Bottom(r, "block_mud_bottom");
        block_plaster = new ModBlock(r, "block_plaster", Material.ROCK, SoundType.STONE, 2.0F, 7.5F);
        block_rammed_earth = new ModBlock(r, "block_rammed_earth", Material.GROUND, SoundType.STONE, 2.0F, 10.0F);
        block_slate = new ModBlock(r, "block_slate", Material.ROCK, SoundType.STONE, 1.5F, 10.0F);
        block_slate_green = new ModBlock(r, "block_slate_green", Material.ROCK, SoundType.STONE, 1.5F, 10.0F);
        block_slate_purple = new ModBlock(r, "block_slate_purple", Material.ROCK, SoundType.STONE, 1.5F, 10.0F);
        block_slate_slab = new ModBlock(r, "block_slate_slab",Material.ROCK,SoundType.STONE,1.5F,10.0F);
        block_slate_slab_green = new ModBlock(r, "block_slate_slab_green",Material.ROCK,SoundType.STONE,1.5F,10.0F);
        block_slate_slab_purple = new ModBlock(r, "block_slate_slab_purple",Material.ROCK,SoundType.STONE,1.5F,10.0F);
        block_slate_shingle = new ModBlockFacing(r, "block_slate_shingle",Material.ROCK,SoundType.STONE,1.2F,10.0F);
        block_slate_shingle_verte = new ModBlockFacing(r, "block_slate_shingle_verte",Material.ROCK,SoundType.STONE,1.2F,10.0F);
        block_slate_shingle_purple = new ModBlockFacing(r, "block_slate_shingle_purple",Material.ROCK,SoundType.STONE,1.2F,10.0F);
        block_slate_tile = new ModBlock(r, "block_slate_tile",Material.ROCK,SoundType.STONE,1.2F,10.0F);
        block_slate_tile_verte  = new ModBlock(r, "block_slate_tile_verte",Material.ROCK,SoundType.STONE,1.2F,10.0F);
        block_slate_tile_purple = new ModBlock(r, "block_slate_tile_purple",Material.ROCK,SoundType.STONE,1.2F,10.0F);
        block_timber_oak = new ModRotatedPillar(r, "block_timber", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
        block_timber_birch = new ModRotatedPillar(r, "block_timber_birch", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
        block_timber_spruce = new ModRotatedPillar(r, "block_timber_spruce", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
        block_timber_jungle = new ModRotatedPillar(r, "block_timber_jungle", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
        block_timber_acacia = new ModRotatedPillar(r, "block_timber_acacia", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
        block_timber_dark_oak = new ModRotatedPillar(r, "block_timber_dark_oak", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
        block_wattle = new ModBlock(r, "block_wattle", Material.ROCK, SoundType.STONE, 1.5F, 8.33F);
        block_wicker = new ModBlock(r, "block_wicker", Material.WOOD, SoundType.CLOTH, 0.8F, 1.0F);
        block_wood_shingle = new Block_Wood_Shingle(r, "block_wood_shingle",Material.WOOD,SoundType.WOOD,2.0F,3.33F);

        if (!Loader.isModLoaded("quark") || Config.persistantplanks == true) {
            block_planks_vert = new Block_Planks_Vert(r, "block_planks_vert", Material.WOOD, SoundType.WOOD, 2.0F, 3.33F);
            OreDictionary.registerOre("plankWood", block_planks_vert);
        }

//      block_chalk_dust = new Block_ChalkDust();

        fence_planks_vert0 = new ModFence(r, "fence_planks_vert_oak");
        fence_planks_vert1 = new ModFence(r, "fence_planks_vert_spruce");
        fence_planks_vert2 = new ModFence(r, "fence_planks_vert_birch");
        fence_planks_vert3 = new ModFence(r, "fence_planks_vert_jungle");
        fence_planks_vert4 = new ModFence(r, "fence_planks_vert_acacia");
        fence_planks_vert5 = new ModFence(r, "fence_planks_vert_dark_oak");


        slab_adobe = new ModSlab(r, "slab_adobe", block_adobe);
        doubleslab_adobe = new ModDoubleSlab(r, slab_adobe);

        slab_chalk = new ModSlab(r, "slab_chalk", block_chalk);
        doubleslab_chalk = new ModDoubleSlab(r, slab_chalk);

        slab_cinder = new ModSlab(r, "slab_cinder", block_cinder);
        doubleslab_cinder = new ModDoubleSlab(r, slab_cinder);

        slab_cob = new ModSlab(r, "slab_cob", block_cob);
        doubleslab_cob = new ModDoubleSlab(r, slab_cob);

        slab_concrete = new ModSlab(r, "slab_concrete", block_concrete);
        doubleslab_concrete = new ModDoubleSlab(r, slab_concrete);

        slab_cordwood = new ModSlab(r, "slab_cordwood", block_cordwood);
        doubleslab_cordwood = new ModDoubleSlab(r, slab_cordwood);

        slab_dry_stone = new ModSlab(r, "slab_dry_stone", block_dry_stone);
        doubleslab_dry_stone = new ModDoubleSlab(r, slab_dry_stone);

        slab_gabion0 = new ModSlab(r, "slab_gabion_gravel", block_gabion0);
        doubleslab_gabion0 = new ModDoubleSlab(r, slab_gabion0);

        slab_gabion1 = new ModSlab(r, "slab_gabion_sand", block_gabion1);
        doubleslab_gabion1 = new ModDoubleSlab(r, slab_gabion1);

        slab_gabion2 = new ModSlab(r, "slab_gabion_dirt", block_gabion2);
        doubleslab_gabion2 = new ModDoubleSlab(r, slab_gabion2);

        slab_mud = new ModSlab(r, "slab_mud", block_mud);
        doubleslab_mud = new ModDoubleSlab(r, slab_mud);

        slab_planks_vert0 = new ModSlab(r, "slab_planks_vert_oak");
        doubleslab_planks_vert0 = new ModDoubleSlab(r, slab_planks_vert0);

        slab_planks_vert1 = new ModSlab(r, "slab_planks_vert_spruce");
        doubleslab_planks_vert1 = new ModDoubleSlab(r, slab_planks_vert1);

        slab_planks_vert2 = new ModSlab(r, "slab_planks_vert_birch");
        doubleslab_planks_vert2 = new ModDoubleSlab(r, slab_planks_vert2);

        slab_planks_vert3 = new ModSlab(r, "slab_planks_vert_jungle");
        doubleslab_planks_vert3 = new ModDoubleSlab(r, slab_planks_vert3);

        slab_planks_vert4 = new ModSlab(r, "slab_planks_vert_acacia");
        doubleslab_planks_vert4 = new ModDoubleSlab(r, slab_planks_vert4);

        slab_planks_vert5 = new ModSlab(r, "slab_planks_vert_dark_oak");
        doubleslab_planks_vert5 = new ModDoubleSlab(r, slab_planks_vert5);

        slab_plaster = new ModSlab(r, "slab_plaster", block_plaster);
        doubleslab_plaster = new ModDoubleSlab(r, slab_plaster);

        slab_rammed_earth = new ModSlab(r, "slab_rammed_earth", block_rammed_earth);
        doubleslab_rammed_earth = new ModDoubleSlab(r, slab_rammed_earth);

        slab_slate = new ModSlab(r, "slab_slate", block_slate);
        doubleslab_slate = new ModDoubleSlab(r, slab_slate);

        slab_slate_green = new ModSlab(r, "slab_slate_green", block_slate_green);
        doubleslab_slate_green = new ModDoubleSlab(r, slab_slate_green);

        slab_slate_purple = new ModSlab(r, "slab_slate_purple", block_slate_purple);
        doubleslab_slate_purple = new ModDoubleSlab(r, slab_slate_purple);

        slab_slate_slab = new ModSlab(r, "slab_slate_slab", block_slate_slab);
        doubleslab_slate_slab = new ModDoubleSlab(r, slab_slate_slab);

        slab_slate_slab_green = new ModSlab(r, "slab_slate_slab_green", block_slate_slab_green);
        doubleslab_slate_slab_green = new ModDoubleSlab(r, slab_slate_slab_green);

        slab_slate_slab_purple = new ModSlab(r, "slab_slate_slab_purple", block_slate_slab_purple);
        doubleslab_slate_slab_purple = new ModDoubleSlab(r, slab_slate_slab_purple);

        slab_slate_shingle = new ModSlab(r, "slab_slate_shingle",block_slate_shingle);
        doubleslab_slate_shingle = new ModDoubleSlab(r, slab_slate_shingle);

        slab_slate_shingle_verte = new ModSlab(r, "slab_slate_shingle_verte",block_slate_shingle_verte);
        doubleslab_slate_shingle_verte = new ModDoubleSlab(r, slab_slate_shingle_verte);

        slab_slate_shingle_purple = new ModSlab(r, "slab_slate_shingle_purple",block_slate_shingle_purple);
        doubleslab_slate_shingle_purple = new ModDoubleSlab(r, slab_slate_shingle_purple);

        slab_slate_tile = new ModSlab(r, "slab_slate_tile",block_slate_tile);
        doubleslab_slate_tile = new ModDoubleSlab(r, slab_slate_tile);

        slab_slate_tile_verte = new ModSlab(r, "slab_slate_tile_verte",block_slate_tile_verte);
        doubleslab_slate_tile_verte = new ModDoubleSlab(r, slab_slate_tile_verte);

        slab_slate_tile_purple = new ModSlab(r, "slab_slate_tile_purple",block_slate_tile_purple);
        doubleslab_slate_tile_purple = new ModDoubleSlab(r, slab_slate_tile_purple);

        slab_timber_oak = new ModSlab(r, "slab_timber", block_timber_oak);
        doubleslab_timber_oak = new ModDoubleSlab(r, slab_timber_oak);

        slab_timber_birch = new ModSlab(r, "slab_timber_birch", block_timber_birch);
        doubleslab_timber_birch = new ModDoubleSlab(r, slab_timber_birch);

        slab_timber_spruce = new ModSlab(r, "slab_timber_spruce", block_timber_spruce);
        doubleslab_timber_spruce = new ModDoubleSlab(r, slab_timber_spruce);

        slab_timber_jungle = new ModSlab(r, "slab_timber_jungle", block_timber_jungle);
        doubleslab_timber_jungle = new ModDoubleSlab(r, slab_timber_jungle);

        slab_timber_acacia = new ModSlab(r, "slab_timber_acacia", block_timber_acacia);
        doubleslab_timber_acacia = new ModDoubleSlab(r, slab_timber_acacia);

        slab_timber_dark_oak = new ModSlab(r, "slab_timber_dark_oak", block_timber_dark_oak);
        doubleslab_timber_dark_oak = new ModDoubleSlab(r, slab_timber_dark_oak);

        slab_wattle = new ModSlab(r, "slab_wattle", block_wattle);
        doubleslab_wattle = new ModDoubleSlab(r, slab_wattle);

        slab_wicker = new ModSlab(r, "slab_wicker", block_wicker);
        doubleslab_wicker = new ModDoubleSlab(r, slab_wicker);

        slab_wood_shingle_oak = new ModSlab(r, "slab_wood_shingle_oak", block_wood_shingle);
        doubleslab_wood_shingle_oak = new ModDoubleSlab(r, slab_wood_shingle_oak);

        slab_wood_shingle_spruce = new ModSlab(r, "slab_wood_shingle_spruce", block_wood_shingle);
        doubleslab_wood_shingle_spruce = new ModDoubleSlab(r, slab_wood_shingle_spruce);

        slab_wood_shingle_birch = new ModSlab(r, "slab_wood_shingle_birch", block_wood_shingle);
        doubleslab_wood_shingle_birch = new ModDoubleSlab(r, slab_wood_shingle_birch);

        slab_wood_shingle_jungle = new ModSlab(r, "slab_wood_shingle_jungle", block_wood_shingle);
        doubleslab_wood_shingle_jungle = new ModDoubleSlab(r, slab_wood_shingle_jungle);

        slab_wood_shingle_acacia = new ModSlab(r, "slab_wood_shingle_acacia", block_wood_shingle);
        doubleslab_wood_shingle_acacia = new ModDoubleSlab(r, slab_wood_shingle_acacia);

        slab_wood_shingle_dark_oak = new ModSlab(r, "slab_wood_shingle_dark_oak", block_wood_shingle);
        doubleslab_wood_shingle_dark_oak = new ModDoubleSlab(r, slab_wood_shingle_dark_oak);


        stair_adobe = new ModStair(r, "stair_adobe", block_adobe);
        stair_chalk = new ModStair(r, "stair_chalk", block_chalk);
        stair_cinder = new ModStair(r, "stair_cinder", block_cinder);
        stair_cob = new ModStair(r, "stair_cob", block_cob);
        stair_concrete = new ModStair(r, "stair_concrete", block_concrete);
        stair_cordwood = new ModStair(r, "stair_cordwood", block_cordwood);
        stair_dry_stone = new ModStair(r, "stair_dry_stone", block_dry_stone);
        stair_gabion0 = new ModStair(r, "stair_gabion_gravel", block_gabion0);
        stair_gabion1 = new ModStair(r, "stair_gabion_sand", block_gabion1);
        stair_gabion2 = new ModStair(r, "stair_gabion_dirt", block_gabion2);
        stair_mud = new ModStair(r, "stair_mud", block_mud);
        stair_planks_vert0 = new ModStair(r, "stair_planks_vert_oak", block_adobe);
        stair_planks_vert1 = new ModStair(r, "stair_planks_vert_spruce", block_adobe);
        stair_planks_vert2 = new ModStair(r, "stair_planks_vert_birch", block_adobe);
        stair_planks_vert3 = new ModStair(r, "stair_planks_vert_jungle", block_adobe);
        stair_planks_vert4 = new ModStair(r, "stair_planks_vert_acacia", block_adobe);
        stair_planks_vert5 = new ModStair(r, "stair_planks_vert_dark_oak", block_adobe);
        stair_plaster = new ModStair(r, "stair_plaster", block_plaster);
        stair_rammed_earth = new ModStair(r, "stair_rammed_earth", block_rammed_earth);
        stair_slate = new ModStair(r, "stair_slate", block_slate);
        stair_slate_green = new ModStair(r, "stair_slate_green", block_slate_green);
        stair_slate_purple = new ModStair(r, "stair_slate_purple", block_slate_purple);
        stair_slate_slab = new ModStair(r, "stair_slate_slab",block_slate_slab);
        stair_slate_slab_green = new ModStair(r, "stair_slate_slab_green",block_slate_slab_green);
        stair_slate_slab_purple = new ModStair(r, "stair_slate_slab_purple",block_slate_slab_purple);
        stair_slate_shingle = new ModStair(r, "stair_slate_shingle",block_slate_shingle);
        stair_slate_shingle_verte = new ModStair(r, "stair_slate_shingle_verte",block_slate_shingle_verte);
        stair_slate_shingle_purple = new ModStair(r, "stair_slate_shingle_purple",block_slate_shingle_purple);
        stair_slate_tile = new ModStair(r, "stair_slate_tile",block_slate_tile);
        stair_slate_tile_verte = new ModStair(r, "stair_slate_tile_verte",block_slate_tile_verte);
        stair_slate_tile_purple = new ModStair(r, "stair_slate_tile_purple",block_slate_tile_purple);
        stair_timber_oak = new ModStair(r, "stair_timber", block_timber_oak);
        stair_timber_spruce = new ModStair(r, "stair_timber_spruce", block_timber_spruce);
        stair_timber_birch = new ModStair(r, "stair_timber_birch", block_timber_birch);
        stair_timber_jungle = new ModStair(r, "stair_timber_jungle", block_timber_jungle);
        stair_timber_acacia = new ModStair(r, "stair_timber_acacia", block_timber_acacia);
        stair_timber_dark_oak = new ModStair(r, "stair_timber_dark_oak", block_timber_dark_oak);
        stair_wattle = new ModStair(r, "stair_wattle", block_wattle);
        stair_wicker = new ModStair(r, "stair_wicker", block_wicker);
        stair_wood_shingle_oak = new ModStair(r, "stair_wood_shingle_oak", block_wood_shingle);
        stair_wood_shingle_spruce = new ModStair(r, "stair_wood_shingle_spruce", block_wood_shingle);
        stair_wood_shingle_birch = new ModStair(r, "stair_wood_shingle_birch", block_wood_shingle);
        stair_wood_shingle_jungle = new ModStair(r, "stair_wood_shingle_jungle", block_wood_shingle);
        stair_wood_shingle_acacia = new ModStair(r, "stair_wood_shingle_acacia", block_wood_shingle);
        stair_wood_shingle_dark_oak = new ModStair(r, "stair_wood_shingle_dark_oak", block_wood_shingle);

        wall_adobe = new ModWall(r, "wall_adobe", block_adobe);
        wall_chalk = new ModWall(r, "wall_chalk", block_chalk);
        wall_cinder =new ModWall(r, "wall_cinder", block_cinder);
        wall_cob = new ModWall(r, "wall_cob", block_cob);
        wall_concrete = new ModWall(r, "wall_concrete", block_concrete);
        wall_cordwood = new ModWall(r, "wall_cordwood", block_cordwood);
        wall_dry_stone = new ModWall(r, "wall_dry_stone", block_dry_stone);
        wall_gabion0 = new ModWall(r, "wall_gabion_gravel", block_gabion0);
        wall_gabion1 = new ModWall(r, "wall_gabion_sand", block_gabion1);
        wall_gabion2 = new ModWall(r, "wall_gabion_dirt", block_gabion2);
        wall_mud = new ModWall(r, "wall_mud", block_mud);
        wall_plaster = new ModWall(r, "wall_plaster", block_plaster);
        wall_rammed_earth = new ModWall(r, "wall_rammed_earth", block_rammed_earth);
        wall_slate = new ModWall(r, "wall_slate", block_slate);
        wall_slate_green = new ModWall(r, "wall_slate_green", block_slate_green);
        wall_slate_purple = new ModWall(r, "wall_slate_purple", block_slate_purple);
        wall_slate_slab = new ModWall(r, "wall_slate_slab", block_slate_slab);
        wall_slate_slab_green = new ModWall(r, "wall_slate_slab_green", block_slate_slab_green);
        wall_slate_slab_purple = new ModWall(r, "wall_slate_slab_purple", block_slate_slab_purple);
        wall_slate_shingle = new ModWall(r, "wall_slate_shingle", block_slate_shingle);
        wall_slate_shingle_verte = new ModWall(r, "wall_slate_shingle_verte", block_slate_shingle_verte);
        wall_slate_shingle_purple = new ModWall(r, "wall_slate_shingle_purple", block_slate_shingle_purple);
        wall_slate_tile = new ModWall(r, "wall_slate_tile", block_slate_tile);
        wall_slate_tile_verte = new ModWall(r, "wall_slate_tile_verte", block_slate_tile_verte);
        wall_slate_tile_purple = new ModWall(r, "wall_slate_tile_purple", block_slate_tile_purple);
        wall_timber_oak = new ModWall(r, "wall_timber", block_timber_oak);
        wall_timber_spruce = new ModWall(r, "wall_timber_spruce", block_timber_spruce);
        wall_timber_birch = new ModWall(r, "wall_timber_birch", block_timber_birch);
        wall_timber_jungle = new ModWall(r, "wall_timber_jungle", block_timber_jungle);
        wall_timber_acacia = new ModWall(r, "wall_timber_acacia", block_timber_acacia);
        wall_timber_dark_oak = new ModWall(r, "wall_timber_dark_oak", block_timber_dark_oak);
        wall_wattle = new ModWall(r, "wall_wattle", block_wattle);
        wall_wicker = new ModWall(r, "wall_wicker", block_wicker);
        wall_wood_shingle_oak = new ModWall(r, "wall_wood_shingle_oak", block_wood_shingle);
        wall_wood_shingle_spruce = new ModWall(r, "wall_wood_shingle_spruce", block_wood_shingle);
        wall_wood_shingle_birch = new ModWall(r, "wall_wood_shingle_birch", block_wood_shingle);
        wall_wood_shingle_jungle = new ModWall(r, "wall_wood_shingle_jungle", block_wood_shingle);
        wall_wood_shingle_acacia = new ModWall(r, "wall_wood_shingle_acacia", block_wood_shingle);
        wall_wood_shingle_dark_oak = new ModWall(r, "wall_wood_shingle_dark_oak", block_wood_shingle);
        
        //  QUARK COMPAT    //
        
        if (Config.quark == true) {
            block_reed = new ModRotatedPillar(r, "block_reed", Material.GRASS, SoundType.CLOTH, 0.8F, 1.0F);
            block_thatch = new ModRotatedPillar(r, "block_thatch", Material.GRASS, SoundType.CLOTH, 0.8F, 1.0F);

            slab_reed = new ModSlab(r, "slab_reed", block_reed);
            doubleslab_reed = new ModDoubleSlab(r, slab_reed);

            slab_thatch = new ModSlab(r, "slab_thatch", block_thatch);
            doubleslab_thatch = new ModDoubleSlab(r, slab_thatch);


            stair_reed = new ModStair(r, "stair_reed", block_reed);
            stair_thatch = new ModStair(r, "stair_thatch", block_thatch);

            wall_reed = new ModWall(r, "wall_reed", block_reed);
            wall_thatch = new ModWall(r, "wall_thatch", block_thatch);
        }
    }

    @SubscribeEvent
    public static void initItemBlocks(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> r = event.getRegistry();
        r.register(itemblock(block_adobe));
        r.register(itemblock(block_chalk));
        r.register(itemblock(block_cinder));
        r.register(itemblock(block_cob));
        r.register(itemblock(block_concrete));
        r.register(itemblock(block_cordwood));
        r.register(itemblock(block_dry_stone));
        r.register(itemblock(block_gabion0));
        r.register(itemblock(block_gabion1));
        r.register(itemblock(block_gabion2));
        r.register(itemblock(block_mud));

        if (!Loader.isModLoaded("quark") || Config.persistantplanks == true){
            r.register(new BlockItemPlanksVert(block_planks_vert).setRegistryName(block_planks_vert.getRegistryName()));
        }

        r.register(itemblock(block_plaster));
        r.register(itemblock(block_rammed_earth));
        r.register(itemblock(block_slate));
        r.register(itemblock(block_slate_green));
        r.register(itemblock(block_slate_purple));
        r.register(itemblock(block_slate_slab));
        r.register(itemblock(block_slate_slab_green));
        r.register(itemblock(block_slate_slab_purple));
        r.register(itemblock(block_slate_shingle));
        r.register(itemblock(block_slate_shingle_verte));
        r.register(itemblock(block_slate_shingle_purple));
        r.register(itemblock(block_slate_tile));
        r.register(itemblock(block_slate_tile_verte));
        r.register(itemblock(block_slate_tile_purple));
        r.register(itemblock(block_timber_oak));
        r.register(itemblock(block_timber_birch));
        r.register(itemblock(block_timber_spruce));
        r.register(itemblock(block_timber_jungle));
        r.register(itemblock(block_timber_acacia));
        r.register(itemblock(block_timber_dark_oak));
        r.register(itemblock(block_wattle));
        r.register(itemblock(block_wicker));
        r.register(new BlockItemWoodShingle(block_wood_shingle).setRegistryName(block_wood_shingle.getRegistryName()));

        r.register(itemblock(fence_planks_vert0));
        r.register(itemblock(fence_planks_vert1));
        r.register(itemblock(fence_planks_vert2));
        r.register(itemblock(fence_planks_vert3));
        r.register(itemblock(fence_planks_vert4));
        r.register(itemblock(fence_planks_vert5));

        itemslab_adobe = new ModItemSlab(r, slab_adobe, doubleslab_adobe);
        itemslab_chalk = new ModItemSlab(r, slab_chalk, doubleslab_chalk);
        itemslab_cinder = new ModItemSlab(r, slab_cinder, doubleslab_cinder);
        itemslab_cob = new ModItemSlab(r, slab_cob, doubleslab_cob);
        itemslab_concrete = new ModItemSlab(r, slab_concrete, doubleslab_concrete);
        itemslab_cordwood = new ModItemSlab(r, slab_cordwood, doubleslab_cordwood);
        itemslab_dry_stone = new ModItemSlab(r, slab_dry_stone, doubleslab_dry_stone);
        itemslab_gabion0 = new ModItemSlab(r, slab_gabion0, doubleslab_gabion0);
        itemslab_gabion1 = new ModItemSlab(r, slab_gabion1, doubleslab_gabion1);
        itemslab_gabion2 = new ModItemSlab(r, slab_gabion2, doubleslab_gabion2);
        itemslab_mud = new ModItemSlab(r, slab_mud, doubleslab_mud);
        itemslab_planks_vert0 = new ModItemSlab(r, slab_planks_vert0, doubleslab_planks_vert0);
        itemslab_planks_vert1 = new ModItemSlab(r, slab_planks_vert1, doubleslab_planks_vert1);
        itemslab_planks_vert2 = new ModItemSlab(r, slab_planks_vert2, doubleslab_planks_vert2);
        itemslab_planks_vert3 = new ModItemSlab(r, slab_planks_vert3, doubleslab_planks_vert3);
        itemslab_planks_vert4 = new ModItemSlab(r, slab_planks_vert4, doubleslab_planks_vert4);
        itemslab_planks_vert5 = new ModItemSlab(r, slab_planks_vert5, doubleslab_planks_vert5);
        itemslab_plaster = new ModItemSlab(r, slab_plaster, doubleslab_plaster);
        itemslab_rammed_earth = new ModItemSlab(r, slab_rammed_earth, doubleslab_rammed_earth);
        itemslab_slate = new ModItemSlab(r, slab_slate, doubleslab_slate);
        itemslab_slate_green = new ModItemSlab(r, slab_slate_green, doubleslab_slate_green);
        itemslab_slate_purple = new ModItemSlab(r, slab_slate_purple, doubleslab_slate_purple);
        itemslab_slate_slab = new ModItemSlab(r, slab_slate_slab, doubleslab_slate_slab);
        itemslab_slate_slab_green = new ModItemSlab(r, slab_slate_slab_green, doubleslab_slate_slab_green);
        itemslab_slate_slab_purple = new ModItemSlab(r, slab_slate_slab_purple, doubleslab_slate_slab_purple);
        itemslab_slate_shingle = new ModItemSlab(r, slab_slate_shingle, doubleslab_slate_shingle);
        itemslab_slate_shingle_verte = new ModItemSlab(r, slab_slate_shingle_verte, doubleslab_slate_shingle_verte);
        itemslab_slate_shingle_purple = new ModItemSlab(r, slab_slate_shingle_purple, doubleslab_slate_shingle_purple);
        itemslab_slate_tile = new ModItemSlab(r, slab_slate_tile, doubleslab_slate_tile);
        itemslab_slate_tile_verte = new ModItemSlab(r, slab_slate_tile_verte, doubleslab_slate_tile_verte);
        itemslab_slate_tile_purple = new ModItemSlab(r, slab_slate_tile_purple, doubleslab_slate_tile_purple);
        itemslab_timber_oak = new ModItemSlab(r, slab_timber_oak, doubleslab_timber_oak);
        itemslab_timber_birch = new ModItemSlab(r, slab_timber_birch, doubleslab_timber_birch);
        itemslab_timber_spruce = new ModItemSlab(r, slab_timber_spruce, doubleslab_timber_spruce);
        itemslab_timber_jungle = new ModItemSlab(r, slab_timber_jungle, doubleslab_timber_jungle);
        itemslab_timber_acacia = new ModItemSlab(r, slab_timber_acacia, doubleslab_timber_acacia);
        itemslab_timber_dark_oak = new ModItemSlab(r, slab_timber_dark_oak, doubleslab_timber_dark_oak);
        itemslab_wattle = new ModItemSlab(r, slab_wattle, doubleslab_wattle);
        itemslab_wicker = new ModItemSlab(r, slab_wicker, doubleslab_wicker);
        itemslab_wood_shingle_oak = new ModItemSlab(r, slab_wood_shingle_oak, doubleslab_wood_shingle_oak);
        itemslab_wood_shingle_spruce = new ModItemSlab(r, slab_wood_shingle_spruce, doubleslab_wood_shingle_spruce);
        itemslab_wood_shingle_birch = new ModItemSlab(r, slab_wood_shingle_birch, doubleslab_wood_shingle_birch);
        itemslab_wood_shingle_jungle = new ModItemSlab(r, slab_wood_shingle_jungle, doubleslab_wood_shingle_jungle);
        itemslab_wood_shingle_acacia = new ModItemSlab(r, slab_wood_shingle_acacia, doubleslab_wood_shingle_acacia);
        itemslab_wood_shingle_dark_oak = new ModItemSlab(r, slab_wood_shingle_dark_oak, doubleslab_wood_shingle_dark_oak);

        r.register(itemblock(stair_adobe));
        r.register(itemblock(stair_chalk));
        r.register(itemblock(stair_cinder));
        r.register(itemblock(stair_cob));
        r.register(itemblock(stair_concrete));
        r.register(itemblock(stair_cordwood));
        r.register(itemblock(stair_dry_stone));
        r.register(itemblock(stair_gabion0));
        r.register(itemblock(stair_gabion1));
        r.register(itemblock(stair_gabion2));
        r.register(itemblock(stair_mud));
        r.register(itemblock(stair_planks_vert0));
        r.register(itemblock(stair_planks_vert1));
        r.register(itemblock(stair_planks_vert2));
        r.register(itemblock(stair_planks_vert3));
        r.register(itemblock(stair_planks_vert4));
        r.register(itemblock(stair_planks_vert5));
        r.register(itemblock(stair_plaster));
        r.register(itemblock(stair_rammed_earth));
        r.register(itemblock(stair_slate));
        r.register(itemblock(stair_slate_green));
        r.register(itemblock(stair_slate_purple));
        r.register(itemblock(stair_slate_slab));
        r.register(itemblock(stair_slate_slab_green));
        r.register(itemblock(stair_slate_slab_purple));
        r.register(itemblock(stair_slate_shingle));
        r.register(itemblock(stair_slate_shingle_verte));
        r.register(itemblock(stair_slate_shingle_purple));
        r.register(itemblock(stair_slate_tile));
        r.register(itemblock(stair_slate_tile_verte));
        r.register(itemblock(stair_slate_tile_purple));
        r.register(itemblock(stair_timber_oak));
        r.register(itemblock(stair_timber_birch));
        r.register(itemblock(stair_timber_spruce));
        r.register(itemblock(stair_timber_jungle));
        r.register(itemblock(stair_timber_acacia));
        r.register(itemblock(stair_timber_dark_oak));
        r.register(itemblock(stair_wattle));
        r.register(itemblock(stair_wicker));
        r.register(itemblock(stair_wood_shingle_oak));
        r.register(itemblock(stair_wood_shingle_spruce));
        r.register(itemblock(stair_wood_shingle_birch));
        r.register(itemblock(stair_wood_shingle_jungle));
        r.register(itemblock(stair_wood_shingle_acacia));
        r.register(itemblock(stair_wood_shingle_dark_oak));

        r.register(itemblock(wall_adobe));
        r.register(itemblock(wall_chalk));
        r.register(itemblock(wall_cinder));
        r.register(itemblock(wall_cob));
        r.register(itemblock(wall_concrete));
        r.register(itemblock(wall_cordwood));
        r.register(itemblock(wall_dry_stone));
        r.register(itemblock(wall_gabion0));
        r.register(itemblock(wall_gabion1));
        r.register(itemblock(wall_gabion2));
        r.register(itemblock(wall_mud));
        r.register(itemblock(wall_plaster));
        r.register(itemblock(wall_rammed_earth));
        r.register(itemblock(wall_slate));
        r.register(itemblock(wall_slate_green));
        r.register(itemblock(wall_slate_purple));
        r.register(itemblock(wall_slate_slab));
        r.register(itemblock(wall_slate_slab_green));
        r.register(itemblock(wall_slate_slab_purple));
        r.register(itemblock(wall_slate_shingle));
        r.register(itemblock(wall_slate_shingle_verte));
        r.register(itemblock(wall_slate_shingle_purple));
        r.register(itemblock(wall_slate_tile));
        r.register(itemblock(wall_slate_tile_verte));
        r.register(itemblock(wall_slate_tile_purple));
        r.register(itemblock(wall_timber_oak));
        r.register(itemblock(wall_timber_birch));
        r.register(itemblock(wall_timber_spruce));
        r.register(itemblock(wall_timber_jungle));
        r.register(itemblock(wall_timber_acacia));
        r.register(itemblock(wall_timber_dark_oak));
        r.register(itemblock(wall_wattle));
        r.register(itemblock(wall_wicker));
        r.register(itemblock(wall_wood_shingle_oak));
        r.register(itemblock(wall_wood_shingle_spruce));
        r.register(itemblock(wall_wood_shingle_birch));
        r.register(itemblock(wall_wood_shingle_jungle));
        r.register(itemblock(wall_wood_shingle_acacia));
        r.register(itemblock(wall_wood_shingle_dark_oak));
        
        //  QUARK COMPAT    //

        if (Config.quark == true) {
            r.register(itemblock(block_reed));
            r.register(itemblock(block_thatch));
            itemslab_reed = new ModItemSlab(r, slab_reed, doubleslab_reed);
            itemslab_thatch = new ModItemSlab(r, slab_thatch, doubleslab_thatch);
            r.register(itemblock(stair_reed));
            r.register(itemblock(stair_thatch));
            r.register(itemblock(wall_reed));
            r.register(itemblock(wall_thatch));
        }
    }

    @SideOnly(Side.CLIENT)
     public static void initModels() {
        ((ModBlock)block_adobe).initModel();
        ((ModBlock)block_chalk).initModel();
        ((ModBlock)block_cinder).initModel();
        ((ModBlock)block_cob).initModel();
        ((ModBlock)block_concrete).initModel();
        ((ModBlockFacing)block_cordwood).initModel();
        ((ModBlock)block_dry_stone).initModel();
        ((ModBlock)block_gabion0).initModel();
        ((ModBlock)block_gabion1).initModel();
        ((ModBlock)block_gabion2).initModel();
        ((ModBlock)block_gabion_falling0).initModel();
        ((ModBlock)block_gabion_falling1).initModel();
        ((ModBlock)block_gabion_falling2).initModel();
        ((Block_Mud)block_mud).initModel();
        ((ModBlock)block_plaster).initModel();
        ((ModBlock)block_rammed_earth).initModel();
        ((ModBlock)block_slate).initModel();
        ((ModBlock)block_slate_green).initModel();
        ((ModBlock)block_slate_purple).initModel();
        ((ModBlock)block_slate_slab).initModel();
        ((ModBlock)block_slate_slab_green).initModel();
        ((ModBlock)block_slate_slab_purple).initModel();
        ((ModBlockFacing)block_slate_shingle).initModel();
        ((ModBlockFacing)block_slate_shingle_verte).initModel();
        ((ModBlockFacing)block_slate_shingle_purple).initModel();
        ((ModBlock)block_slate_tile).initModel();
        ((ModBlock)block_slate_tile_verte).initModel();
        ((ModBlock)block_slate_tile_purple).initModel();
        ((ModRotatedPillar)block_timber_oak).initModel();
        ((ModRotatedPillar)block_timber_spruce).initModel();
        ((ModRotatedPillar)block_timber_birch).initModel();
        ((ModRotatedPillar)block_timber_jungle).initModel();
        ((ModRotatedPillar)block_timber_acacia).initModel();
        ((ModRotatedPillar)block_timber_dark_oak).initModel();
        ((ModBlock)block_wattle).initModel();
        ((ModBlock)block_wicker).initModel();
        ((Block_Wood_Shingle)block_wood_shingle).initModel();

        if (!Loader.isModLoaded("quark") || Config.persistantplanks == true) {
            ((Block_Planks_Vert)block_planks_vert).initModel();
        }

        ((ModFence)fence_planks_vert0).initModel();
        ((ModFence)fence_planks_vert1).initModel();
        ((ModFence)fence_planks_vert2).initModel();
        ((ModFence)fence_planks_vert3).initModel();
        ((ModFence)fence_planks_vert4).initModel();
        ((ModFence)fence_planks_vert5).initModel();

        ((ModSlab)slab_adobe).initModel();
        ((ModSlab)slab_chalk).initModel();
        ((ModSlab)slab_cinder).initModel();
        ((ModSlab)slab_cob).initModel();
        ((ModSlab)slab_concrete).initModel();
        ((ModSlab)slab_cordwood).initModel();
        ((ModSlab)slab_dry_stone).initModel();
        ((ModSlab)slab_gabion0).initModel();
        ((ModSlab)slab_gabion1).initModel();
        ((ModSlab)slab_gabion2).initModel();
        ((ModSlab)slab_mud).initModel();
        ((ModSlab)slab_planks_vert0).initModel();
        ((ModSlab)slab_planks_vert1).initModel();
        ((ModSlab)slab_planks_vert2).initModel();
        ((ModSlab)slab_planks_vert3).initModel();
        ((ModSlab)slab_planks_vert4).initModel();
        ((ModSlab)slab_planks_vert5).initModel();
        ((ModSlab)slab_plaster).initModel();
        ((ModSlab)slab_rammed_earth).initModel();
        ((ModSlab)slab_slate).initModel();
        ((ModSlab)slab_slate_green).initModel();
        ((ModSlab)slab_slate_purple).initModel();
        ((ModSlab)slab_slate_slab).initModel();
        ((ModSlab)slab_slate_slab_green).initModel();
        ((ModSlab)slab_slate_slab_purple).initModel();
        ((ModSlab)slab_slate_shingle).initModel();
        ((ModSlab)slab_slate_shingle_verte).initModel();
        ((ModSlab)slab_slate_shingle_purple).initModel();
        ((ModSlab)slab_slate_tile).initModel();
        ((ModSlab)slab_slate_tile_verte).initModel();
        ((ModSlab)slab_slate_tile_purple).initModel();
        ((ModSlab)slab_timber_oak).initModel();
        ((ModSlab)slab_timber_spruce).initModel();
        ((ModSlab)slab_timber_birch).initModel();
        ((ModSlab)slab_timber_jungle).initModel();
        ((ModSlab)slab_timber_acacia).initModel();
        ((ModSlab)slab_timber_dark_oak).initModel();
        ((ModSlab)slab_wattle).initModel();
        ((ModSlab)slab_wicker).initModel();
        ((ModSlab)slab_wood_shingle_oak).initModel();
        ((ModSlab)slab_wood_shingle_spruce).initModel();
        ((ModSlab)slab_wood_shingle_birch).initModel();
        ((ModSlab)slab_wood_shingle_jungle).initModel();
        ((ModSlab)slab_wood_shingle_acacia).initModel();
        ((ModSlab)slab_wood_shingle_dark_oak).initModel();

        ((ModStair)stair_adobe).initModel();
        ((ModStair)stair_chalk).initModel();
        ((ModStair)stair_cinder).initModel();
        ((ModStair)stair_cob).initModel();
        ((ModStair)stair_concrete).initModel();
        ((ModStair)stair_cordwood).initModel();
        ((ModStair)stair_dry_stone).initModel();
        ((ModStair)stair_gabion0).initModel();
        ((ModStair)stair_gabion1).initModel();
        ((ModStair)stair_gabion2).initModel();
        ((ModStair)stair_mud).initModel();
        ((ModStair)stair_planks_vert0).initModel();
        ((ModStair)stair_planks_vert1).initModel();
        ((ModStair)stair_planks_vert2).initModel();
        ((ModStair)stair_planks_vert3).initModel();
        ((ModStair)stair_planks_vert4).initModel();
        ((ModStair)stair_planks_vert5).initModel();
        ((ModStair)stair_plaster).initModel();
        ((ModStair)stair_rammed_earth).initModel();
        ((ModStair)stair_slate).initModel();
        ((ModStair)stair_slate_green).initModel();
        ((ModStair)stair_slate_purple).initModel();
        ((ModStair)stair_slate_slab).initModel();
        ((ModStair)stair_slate_slab_green).initModel();
        ((ModStair)stair_slate_slab_purple).initModel();
        ((ModStair)stair_slate_shingle).initModel();
        ((ModStair)stair_slate_shingle_verte).initModel();
        ((ModStair)stair_slate_shingle_purple).initModel();
        ((ModStair)stair_slate_tile).initModel();
        ((ModStair)stair_slate_tile_verte).initModel();
        ((ModStair)stair_slate_tile_purple).initModel();
        ((ModStair)stair_timber_oak).initModel();
        ((ModStair)stair_timber_spruce).initModel();
        ((ModStair)stair_timber_birch).initModel();
        ((ModStair)stair_timber_jungle).initModel();
        ((ModStair)stair_timber_acacia).initModel();
        ((ModStair)stair_timber_dark_oak).initModel();
        ((ModStair)stair_wattle).initModel();
        ((ModStair)stair_wicker).initModel();
        ((ModStair)stair_wood_shingle_oak).initModel();
        ((ModStair)stair_wood_shingle_spruce).initModel();
        ((ModStair)stair_wood_shingle_birch).initModel();
        ((ModStair)stair_wood_shingle_jungle).initModel();
        ((ModStair)stair_wood_shingle_acacia).initModel();
        ((ModStair)stair_wood_shingle_dark_oak).initModel();

        ((ModWall)wall_adobe).initModel();
        ((ModWall)wall_chalk).initModel();
        ((ModWall)wall_cinder).initModel();
        ((ModWall)wall_cob).initModel();
        ((ModWall)wall_concrete).initModel();
        ((ModWall)wall_cordwood).initModel();
        ((ModWall)wall_dry_stone).initModel();
        ((ModWall)wall_gabion0).initModel();
        ((ModWall)wall_gabion1).initModel();
        ((ModWall)wall_gabion2).initModel();
        ((ModWall)wall_mud).initModel();
        ((ModWall)wall_plaster).initModel();
        ((ModWall)wall_rammed_earth).initModel();
        ((ModWall)wall_slate).initModel();
        ((ModWall)wall_slate_green).initModel();
        ((ModWall)wall_slate_purple).initModel();
        ((ModWall)wall_slate_shingle).initModel();
        ((ModWall)wall_slate_shingle_verte).initModel();
        ((ModWall)wall_slate_shingle_purple).initModel();
        ((ModWall)wall_slate_slab).initModel();
        ((ModWall)wall_slate_slab_green).initModel();
        ((ModWall)wall_slate_slab_purple).initModel();
        ((ModWall)wall_slate_tile).initModel();
        ((ModWall)wall_slate_tile_verte).initModel();
        ((ModWall)wall_slate_tile_purple).initModel();
        ((ModWall)wall_timber_oak).initModel();
        ((ModWall)wall_timber_spruce).initModel();
        ((ModWall)wall_timber_birch).initModel();
        ((ModWall)wall_timber_jungle).initModel();
        ((ModWall)wall_timber_acacia).initModel();
        ((ModWall)wall_timber_dark_oak).initModel();
        ((ModWall)wall_wattle).initModel();
        ((ModWall)wall_wicker).initModel();
        ((ModWall)wall_wood_shingle_oak).initModel();
        ((ModWall)wall_wood_shingle_spruce).initModel();
        ((ModWall)wall_wood_shingle_birch).initModel();
        ((ModWall)wall_wood_shingle_jungle).initModel();
        ((ModWall)wall_wood_shingle_acacia).initModel();
        ((ModWall)wall_wood_shingle_dark_oak).initModel();

        //  QUARK COMPAT    //

        if (Config.quark == true) {
            ((ModRotatedPillar)block_reed).initModel();
            ((ModRotatedPillar)block_thatch).initModel();

            ((ModSlab)slab_reed).initModel();
            ((ModSlab)slab_thatch).initModel();

            ((ModStair)stair_reed).initModel();
            ((ModStair)stair_thatch).initModel();

            ((ModWall)wall_reed).initModel();
            ((ModWall)wall_thatch).initModel();
        }
    }

    private static Item itemblock(Block block) {
        return new ItemBlock(block).setRegistryName(block.getRegistryName());
    }
}