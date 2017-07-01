package alsender.earthworks.block;

import alsender.earthworks.main.Earthworks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by alsender on 3/2/17.
 */
public class Block_Wood_Shingle extends Block {

    public final String blockName;

    public Block_Wood_Shingle(IForgeRegistry<Block> registry, String name, Material mat, SoundType sound, float hardness, float resistance) {
        super(mat);
        this.setSoundType(sound);
        this.setHardness(hardness);
        this.setResistance(resistance);

        this.setUnlocalizedName(Earthworks.mod_id + "." + name);
        this.setRegistryName(name);
        this.setCreativeTab(Earthworks.creativeTab);
        this.setDefaultState(this.blockState.getBaseState().withProperty(BlockPlanks.VARIANT, BlockPlanks.EnumType.OAK));

        registry.register(this);

        this.blockName = name;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{BlockPlanks.VARIANT});
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(BlockPlanks.VARIANT, BlockPlanks.EnumType.byMetadata(meta));
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return (state.getValue(BlockPlanks.VARIANT)).getMetadata();
    }

    @Override
    public int damageDropped(IBlockState state) {
        return getMetaFromState(state);
    }

    @Override
    public void getSubBlocks(CreativeTabs tabs, NonNullList<ItemStack> list) {
        for (int i = 0; i < BlockPlanks.EnumType.values().length; i++) {
            list.add(new ItemStack(this, 1, i));
        }
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation("earthworks:shingle/shingle_oak", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 1, new ModelResourceLocation("earthworks:shingle/shingle_spruce", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 2, new ModelResourceLocation("earthworks:shingle/shingle_birch", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 3, new ModelResourceLocation("earthworks:shingle/shingle_jungle", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 4, new ModelResourceLocation("earthworks:shingle/shingle_acacia", "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 5, new ModelResourceLocation("earthworks:shingle/shingle_dark_oak", "inventory"));
    }
}
