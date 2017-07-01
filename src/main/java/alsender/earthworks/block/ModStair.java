package alsender.earthworks.block;

import alsender.earthworks.main.Earthworks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by alsender on 12/22/16.
 */
public class ModStair extends BlockStairs {

    public ModStair(IForgeRegistry<Block> registry, String name, Block block) {
        super(block.getDefaultState());
        setHardness(blockHardness);
        setResistance(blockResistance);

        setUnlocalizedName(Earthworks.mod_id + "." + name);
        setRegistryName(name);
        setCreativeTab(Earthworks.creativeTab);

        registry.register(this);

        useNeighborBrightness = true;
    }

    @SideOnly(Side.CLIENT)
    public void initModel(){
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(),"inventory"));
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }
}
