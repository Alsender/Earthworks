package alsender.earthworks.block;

import alsender.earthworks.main.Config;
import alsender.earthworks.main.registry.BlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

/**
 * Created by alsender on 2/22/17.
 */
public class Block_Gabion extends ModBlock {

    private boolean flag = Config.gabion;
    private Block block;
    private int IDNum;

    public Block_Gabion(String name, int ID,  Material material, SoundType soundType, Float hardness, Float resistance, Block block) {
        super(name, material, soundType, hardness, resistance);
        this.block = block;
        this.IDNum = ID;
    }

    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        Block block = world.getBlockState(pos).getBlock();
        if (player.isSneaking() && world.getBlockState(pos.down()).getMaterial().isReplaceable()) {
            if (world.getBlockState(pos).getBlock() == BlockRegistry.stair_gabion0 || world.getBlockState(pos).getBlock() == BlockRegistry.stair_gabion1 || world.getBlockState(pos).getBlock() == BlockRegistry.stair_gabion2) {
                return false;
            }
            world.setBlockState(pos, switchGabion(block).getDefaultState());
            return true;
        }
        return false;
    }

    public void neighborChanged(IBlockState state, World world, BlockPos pos1, Block block, BlockPos pos2) {
        if (world.isBlockPowered(pos1) || world.isBlockPowered(pos1.up())) {
            world.scheduleUpdate(pos1, this, 2);
        }
    }

    public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
        Block block = world.getBlockState(pos).getBlock();
        world.setBlockState(pos, switchGabion(block).getDefaultState());
    }

    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
        Block block = world.getBlockState(pos).getBlock();
        if (world.getBlockState(pos.down()).getBlock() == BlockRegistry.block_gabion0 || world.getBlockState(pos.down()).getBlock() == BlockRegistry.block_gabion1 || world.getBlockState(pos.down()).getBlock() == BlockRegistry.block_gabion2) {
            world.setBlockState(pos, switchGabion(block).getDefaultState());
        }
        if (world.getBlockState(pos.down()).getBlock() == BlockRegistry.block_gabion_falling0 || world.getBlockState(pos.down()).getBlock() == BlockRegistry.block_gabion_falling1 || world.getBlockState(pos.down()).getBlock() == BlockRegistry.block_gabion_falling2) {
            world.setBlockState(pos, switchGabion(block).getDefaultState());
        }
    }

/** public void onEntityWalk(World world, BlockPos pos, Entity entity) {
 *      this.activate(world, pos);
 *      super.onEntityWalk(world, pos, entity);
 *  }
 *
 *  @SideOnly(Side.CLIENT)
 *  public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random random) {
 *      if(!world.isRemote) {
 *          if (flag == true) {
 *              if (world.getBlockState(pos.down()).getMaterial().isReplaceable()) {
 *                  world.spawnParticle(EnumParticleTypes.FALLING_DUST,
 *                          pos.getX() + Math.random(),
 *                          pos.getY() + Math.random(),
 *                          pos.getZ() + Math.random(),
 *                          0.0D, 0.0D, 0.0D,
 *                          Block.getIdFromBlock(block));
 *              }
 *          }
 *      }
 *  }
 *
 *  @SideOnly(Side.CLIENT)
 *  private void activate(World world, BlockPos pos) {
 *      if (!world.isRemote) {
 *          if (flag == true) {
 *              world.spawnParticle(EnumParticleTypes.BLOCK_CRACK,
 *                      pos.getX() + Math.random(),
 *                      pos.getY() + Math.random(),
 *                      pos.getZ() + Math.random(),
 *                      0.0D, 0.0D, 0.0D,
 *                      Block.getIdFromBlock(block));
 *          }
 *      }
 *  }
 */
    public int getIDNum() {
        return this.IDNum;
    }

    private Block switchGabion(Block block) {
        Block blockReturn = null;
        switch (getIDNum()) {
            case 0 : blockReturn = BlockRegistry.block_gabion_falling0;
                    break;
            case 1 : blockReturn = BlockRegistry.block_gabion_falling1;
                    break;
            case 2 : blockReturn = BlockRegistry.block_gabion_falling2;
                    break;
        }
        return blockReturn;
    }
}
