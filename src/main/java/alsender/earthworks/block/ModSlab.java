package alsender.earthworks.block;

import alsender.earthworks.main.Earthworks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by alsender on 12/16/16.
 */
public class ModSlab extends BlockSlab {
    public final World world = null;
    public final BlockPos pos = null;

    public ModSlab(IForgeRegistry<Block> registry, String name, Block block) {
        super(block.getDefaultState().getMaterial());
        setHardness(block.getDefaultState().getBlockHardness(world, pos));

        setUnlocalizedName(Earthworks.mod_id + "." + name);
        setRegistryName(name);
        setCreativeTab(Earthworks.creativeTab);

        registry.register(this);

        useNeighborBrightness = true;
    }

    public ModSlab(IForgeRegistry<Block> registry, String name) {
        super(Material.WOOD);
        setHardness(2.0F);

        setUnlocalizedName(Earthworks.mod_id + "." + name);
        setRegistryName(name);
        setCreativeTab(Earthworks.creativeTab);

        registry.register(this);

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
        return new BlockStateContainer(this, HALF);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        IBlockState iblockstate = this.getDefaultState();
        if (!this.isDouble()) {
            iblockstate = iblockstate.withProperty(HALF, (meta) == 1 ? EnumBlockHalf.BOTTOM : EnumBlockHalf.TOP);
        }
        return iblockstate;
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(HALF) == EnumBlockHalf.BOTTOM ? 1 : 0;
    }
}
