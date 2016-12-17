package alsender.earthworks.block.slab;

import alsender.earthworks.main.Earthworks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import javax.annotation.Nonnull;

/**
 * Created by alsender on 12/15/16.
 */
/**public class Slab_Adobe extends Block {

    public Slab_Adobe() {
        super(Material.ROCK);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setUnlocalizedName(Earthworks.mod_id + ".slab_adobe");
        setRegistryName("slab_adobe");
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }

    @Nonnull
    @Override
    public BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, HALF, getVariantProperty());
    }

    @Nonnull
    @Override
    public IBlockState getStateFromMeta(int meta) {
        if (doubleSlab) {
            return getDefaultState();
        } else {
            return getDefaultState().withProperty(HALF, meta == 8 ? EnumBlockHalf.TOP : EnumBlockHalf.BOTTOM);
        }
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        if (doubleSlab) {
            return 0;
        } else {
            return state.getValue(HALF) == EnumBlockHalf.TOP ? 8 : 0;
        }
    }

    public abstract BlockSlab getFullBlock();
    public abstract BlockSlab getSingleBlock();

    @Nonnull
    @Override
    public ItemStack getPickBlock(@Nonnull IBlockState state, RayTraceResult target, @Nonnull World world, @Nonnull BlockPos pos, EntityPlayer player) {

    }

}*/
