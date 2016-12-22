package alsender.earthworks.block.slab;

import alsender.earthworks.main.Earthworks;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by alsender on 12/15/16.
 */
public class Slab_Adobe extends BlockSlab {
    public Slab_Adobe() {
        super(Material.ROCK);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        setHardness(2.0F);
        setResistance(10.0F);

        setUnlocalizedName(Earthworks.mod_id + ".slab_adobe");
        setRegistryName("slab_adobe");

        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, HALF);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        if(this.isDouble()) {
            return getDefaultState();
        } else {
            return getDefaultState().withProperty(HALF, meta == 1 ? EnumBlockHalf.BOTTOM : EnumBlockHalf.TOP);
        }
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(HALF) == EnumBlockHalf.BOTTOM ? 1 : 0;
    }

    @Override
    public IProperty getVariantProperty() {
        return HALF;
    }

    @Override
    public Comparable getTypeForItem(ItemStack stack) {
        return 0;
    }

    @Override
    public boolean isDouble() {
        return false;
    }

    @Override
    public String getUnlocalizedName(int meta) {
        return null;
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}