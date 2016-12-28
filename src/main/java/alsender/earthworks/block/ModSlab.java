package alsender.earthworks.block;

import alsender.earthworks.main.Earthworks;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;



/**
 * Created by alsender on 12/16/16.
 */
public class ModSlab extends BlockSlab {

    public ModSlab(String name, Material material) {
        super(material);
        setUnlocalizedName(Earthworks.mod_id + "." + name);
        setRegistryName(name);
        setCreativeTab(Earthworks.creativeTab);
        useNeighborBrightness = true;
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @Override
    public IProperty getVariantProperty() {
        return HALF;
    }

    @Override
    public String getUnlocalizedName(int meta) {
        return null;
    }

    public Comparable getTypeForItem(ItemStack stack) {
        return 0;
    }

    public boolean isDouble() {
        return false;
    }

    @Override
    public BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, HALF, getVariantProperty());
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        if (this.isDouble()) { return getDefaultState(); }
        else { return getDefaultState().withProperty(HALF, meta == 1 ? EnumBlockHalf.BOTTOM : EnumBlockHalf.TOP); }
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        if (this.isDouble()) { return 0; }
        else { return state.getValue(HALF) == EnumBlockHalf.BOTTOM ? 1 : 0; }
    }
}
