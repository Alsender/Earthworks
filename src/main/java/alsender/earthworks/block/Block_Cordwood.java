package alsender.earthworks.block;

import alsender.earthworks.main.Earthworks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by alsender on 1/5/17.
 */
public class Block_Cordwood extends Block {

    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

    public Block_Cordwood(String name, Material material, Float hardness, Float resistance) {
        super(material);
        setHardness(hardness);
        setResistance(resistance);

        setUnlocalizedName(Earthworks.mod_id + "." + name);
        setRegistryName(name);
        setCreativeTab(Earthworks.creativeTab);
        this.setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        EnumFacing facing = EnumFacing.getFront(meta);

        if(facing.getAxis()==EnumFacing.Axis.Y) {
            facing=EnumFacing.NORTH;
        }

        return getDefaultState().withProperty(FACING, facing);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumFacing) state.getValue(FACING)).getIndex();
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{FACING});
    }

    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        return getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }

}
