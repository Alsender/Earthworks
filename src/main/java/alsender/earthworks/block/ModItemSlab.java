package alsender.earthworks.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by alsender on 5/26/17.
 */
public class ModItemSlab extends ItemBlock {

    Block doubleSlab;

    public ModItemSlab(Block block, Block doubleSlab) {
        super(block);
        String name = "item" + block.getRegistryName().toString().substring(11);
        this.setRegistryName(name);
        this.doubleSlab = doubleSlab;

        GameRegistry.register(this);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(block.getRegistryName().toString()));
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }

    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing side, float hitx, float hity, float hitz) {
        if (stack.stackSize == 0) {
            return EnumActionResult.FAIL;
        } else if (!player.canPlayerEdit(pos.offset(side), side, stack)) {
            return EnumActionResult.FAIL;
        } else {
            IBlockState iblockstate = world.getBlockState(pos);
            if (iblockstate.getBlock() == getBlock()) {
                BlockSlab.EnumBlockHalf enumblockhalf = iblockstate.getValue(BlockSlab.HALF);
                if ((side == EnumFacing.UP && enumblockhalf == BlockSlab.EnumBlockHalf.BOTTOM || side == EnumFacing.DOWN && enumblockhalf == BlockSlab.EnumBlockHalf.TOP)) {
                    IBlockState iblockstate1 = this.doubleSlab.getDefaultState();
                    if (world.checkNoEntityCollision(this.doubleSlab.getBoundingBox(iblockstate1, world, pos)) && world.setBlockState(pos, iblockstate1, 3)) {
                        world.playSound(pos.getX() + 0.5F, pos.getY() + 0.5F, pos.getZ() + 0.5F, this.doubleSlab.getSoundType().getPlaceSound(), SoundCategory.BLOCKS, (this.doubleSlab.getSoundType().getVolume() + 1.0F) / 2.0F, this.doubleSlab.getSoundType().getPitch() * 0.8F, true);
                        --stack.stackSize;
                    }
                    return EnumActionResult.SUCCESS;
                }
            }
            return (this.check(stack, world, pos.offset(side)) || (super.onItemUse(stack, player, world, pos, hand, side, hitx, hity, hitz) == EnumActionResult.SUCCESS ? true : false)) ? EnumActionResult.SUCCESS : EnumActionResult.FAIL;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean canPlaceBlockOnSide(World world, BlockPos pos, EnumFacing facing, EntityPlayer player, ItemStack stack) {
        BlockPos blockpos1 = pos;
        IBlockState iblockstate = world.getBlockState(pos);
        if (iblockstate.getBlock() == getBlock()) {
            boolean flag = iblockstate.getValue(BlockSlab.HALF) == BlockSlab.EnumBlockHalf.TOP;
            if ((facing == EnumFacing.UP && !flag || facing == EnumFacing.DOWN && flag)) {
                return true;
            }
        }
        pos = pos.offset(facing);
        IBlockState iblockstate1 = world.getBlockState(pos);
        return iblockstate1.getBlock() == getBlock() || super.canPlaceBlockOnSide(world, blockpos1, facing, player, stack);
    }

    private boolean check(ItemStack stack, World world, BlockPos pos) {
        IBlockState iblockstate = world.getBlockState(pos);
        if (iblockstate.getBlock() == getBlock()) {
            IBlockState iblockstate1 = this.doubleSlab.getDefaultState();
            if (world.checkNoEntityCollision(this.doubleSlab.getBoundingBox(iblockstate1, world, pos)) && world.setBlockState(pos, iblockstate1, 3)) {
                world.playSound(pos.getX() + 0.5F, pos.getY() + 0.5F, pos.getZ() + 0.5F, this.doubleSlab.getSoundType().getPlaceSound(), SoundCategory.BLOCKS, (this.doubleSlab.getSoundType().getVolume() + 1.0F) / 2.0F, this.doubleSlab.getSoundType().getPitch() * 0.8F, true);
                --stack.stackSize;
            }
            return true;
        }
        return false;
    }
}