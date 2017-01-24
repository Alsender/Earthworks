package alsender.earthworks.block.timber;

import alsender.earthworks.block.ModBlockFacing;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * Created by alsender on 1/13/17.
 */
public class Daub_Cob extends ModBlockFacing {

    private final String toolTip;

    public Daub_Cob(String name, String string) {
        super("daub_cob_" + name, Material.ROCK, 1.5F, 30.0F);
        this.toolTip = string;
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool) {
        list.add(toolTip);
    }
}
