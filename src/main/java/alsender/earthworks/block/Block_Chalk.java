package alsender.earthworks.block;

import alsender.earthworks.main.registry.ItemRegistry;
import alsender.earthworks.main.Earthworks;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by alsender on 12/30/16.
 */
public class Block_Chalk extends ModBlock {
    public Block_Chalk(String name) {
        super(name, Material.ROCK, 1.0F, 5.0F);
        setCreativeTab(Earthworks.creativeTab);
    }

    public Item getItemDropped(IBlockState state, Random random, int fortune) {
        return ItemRegistry.item_chalk;
    }

    public int quantityDropped(Random random) {
        return (3 + random.nextInt(2));
    }

    public int quantityDroppedWithBonus(int fortune, Random random) {
        return quantityDropped(random) + random.nextInt(fortune + 1);
    }
}
