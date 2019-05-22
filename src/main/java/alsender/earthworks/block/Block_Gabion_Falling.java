package alsender.earthworks.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.Random;

/**
 * Created by alsender on 2/28/17.
 */
public class Block_Gabion_Falling extends ModBlock {

    private Block block;

    public Block_Gabion_Falling(IForgeRegistry<Block> registry, String name, Block block) {
        super(registry, "block_gabion_falling_" + name, Material.ROCK, SoundType.SAND,2.0F,12.0F);
        setCreativeTab(null);
        this.block = block;
    }

    @Override
	public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
        this.fall(world, pos, state);
        if (!world.getBlockState(pos.down()).getBlock().isAir(world.getBlockState(pos.down()), world, pos.down())) {
            world.setBlockState(pos, block.getDefaultState());
        }
    }

    @Override
	public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
        world.scheduleUpdate(pos, this, 2);
    }

    @Override
	public void neighborChanged(IBlockState state, World world, BlockPos pos1, Block block, BlockPos pos2) {
        world.scheduleUpdate(pos1, this, 2);
    }

    private void fall(World  world, BlockPos pos, IBlockState state) {
        if (world.getBlockState(pos.down()).getBlock().isAir(world.getBlockState(pos.down()), world, pos.down()) && world.getTileEntity(pos) == null) {
            EntityFallingBlock falling = new EntityFallingBlock(world, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, state);
            world.spawnEntity(falling);
        }
    }
}
