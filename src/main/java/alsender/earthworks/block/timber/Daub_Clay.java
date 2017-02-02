package alsender.earthworks.block.timber;

import alsender.earthworks.block.ModBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by alsender on 1/13/17.
 */
public class Daub_Clay extends ModBlock {
    public Daub_Clay(String name) {
        super("daub_clay_" + name, Material.ROCK, SoundType.WOOD, 1.5F, 10.0F);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
