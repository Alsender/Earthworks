package alsender.earthworks.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Created by alsender on 3/2/17.
 */
public class BlockItemWoodShingle extends ItemBlock {

    public BlockItemWoodShingle(Block block) {
        super(block);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName() + "." + (BlockPlanks.EnumType.byMetadata(stack.getMetadata())).toString();
    }
}