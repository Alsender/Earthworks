package alsender.earthworks.item;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by alsender on 6/15/17.
 */
public class Item_Chalk extends ModItem {

    public Item_Chalk(IForgeRegistry <Item> registry) {
        super(registry, "chalk");
    }

    /**
     * Coming Soon to own on video and DVD
     *
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        boolean flag = worldIn.getBlockState(pos).getBlock().isReplaceable(worldIn, pos);
        BlockPos blockpos = flag ? pos : pos.offset(facing);
        ItemStack itemstack = player.getHeldItem(hand);

        if (player.canPlayerEdit(blockpos, facing, itemstack) && worldIn.mayPlace(worldIn.getBlockState(blockpos).getBlock(), blockpos, false, facing, (Entity)null) && Blocks.REDSTONE_WIRE.canPlaceBlockAt(worldIn, blockpos)) {
            worldIn.setBlockState(blockpos, BlockRegistry.block_chalk_dust.getDefaultState());

            if (player instanceof EntityPlayerMP) {
                CriteriaTriggers.field_193137_x.func_193173_a((EntityPlayerMP)player, blockpos, itemstack);
            }

            itemstack.shrink(1);
            return EnumActionResult.SUCCESS;
        } else {
            return EnumActionResult.FAIL;
        }
    }
     */
}
