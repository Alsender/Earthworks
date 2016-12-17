package alsender.earthworks.block;

import alsender.earthworks.main.Earthworks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by alsender on 12/14/16.
 */
public class Block_Mud_Bottom extends Block {

    public Block_Mud_Bottom() {
        super(Material.CLAY);
        setUnlocalizedName(Earthworks.mod_id + ".block_mud_bottom");
        setRegistryName("block_mud_bottom");
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }

    public void neighborChanged(IBlockState state, World world, BlockPos pos, Block block) {
        super.neighborChanged(state, world, pos, block);
        if (world.getBlockState(pos.up()).getMaterial().isSolid() == false) {
            world.setBlockState(pos, ModBlocks.block_mud.getDefaultState());
        }
    }
}
