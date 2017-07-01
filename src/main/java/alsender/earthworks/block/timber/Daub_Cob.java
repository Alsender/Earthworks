package alsender.earthworks.block.timber;

import alsender.earthworks.block.ModBlockFacing;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

import javax.annotation.Nullable;
import java.util.List;

import static alsender.earthworks.main.registry.TimberRegistry.*;

/**
 * Created by alsender on 1/13/17.
 */
public class Daub_Cob extends ModBlockFacing {

    private final String toolTip;
    public final int ID;

    public Daub_Cob(IForgeRegistry<Block> registry, String name, String string, int ID) {
        super(registry, "daub_cob_" + name, Material.ROCK, SoundType.WOOD, 1.5F, 10.0F);
        this.toolTip = string;
        this.ID = ID;
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World player, List list, ITooltipFlag bool) {
        list.add(toolTip);
    }

    public int getID() {
        return this.ID;
    }

    public IBlockState getRotation(Block block) {
        IBlockState blockRotate = null;
        if (block instanceof Daub_Cob) {
            switch (getID()) {
                case 0 : blockRotate = daub_cob_arrow2.getDefaultState();
                    break; //arrow0     bottom left
                case 1: blockRotate = daub_cob_arrow0.getDefaultState();
                    break; //arrow1     top left
                case 2: blockRotate = daub_cob_arrow3.getDefaultState();
                    break; //arrow2     bottom right
                case 3: blockRotate = daub_cob_arrow1.getDefaultState();
                    break; //arrow3     top right
                case 4: blockRotate = daub_cob_barndoor4.getDefaultState();
                    break; //barndoor0  lower left
                case 5: blockRotate = daub_cob_barndoor2.getDefaultState();
                    break; //barndoor1  left sideways
                case 6: blockRotate = daub_cob_barndoor1.getDefaultState();
                    break; //barndoor2  right sideways
                case 7: blockRotate = daub_cob_barndoor7.getDefaultState();
                    break; //barndoor3  upper left
                case 8: blockRotate = daub_cob_barndoor0.getDefaultState();
                    break; //barndoor4  lower right
                case 9: blockRotate = daub_cob_barndoor6.getDefaultState();
                    break; //barndoor5  left sideways
                case 10: blockRotate = daub_cob_barndoor5.getDefaultState();
                    break; //barndoor6  right sideways
                case 11: blockRotate = daub_cob_barndoor3.getDefaultState();
                    break; //barndoor7  upper right
                case 12: blockRotate = daub_cob_bottom_r.getDefaultState();
                    break; //bottom_l
                case 13: blockRotate = daub_cob_right.getDefaultState();
                    break; //bottom
                case 14: blockRotate = daub_cob_top_r.getDefaultState();
                    break; //bottom_r
                case 15: blockRotate = daub_cob_bottom.getDefaultState();
                    break; //left
                case 16: blockRotate = daub_cob_parallel_vert.getDefaultState();
                    break; //parallel_hor
                case 17: blockRotate = daub_cob_parallel_hor.getDefaultState();
                    break; //parallel_vert
                case 18: blockRotate = daub_cob_top.getDefaultState();
                    break; //right
                case 19: blockRotate = daub_cob_slash.getDefaultState();
                    break; //slash_back
                case 20: blockRotate = daub_cob_slash_back.getDefaultState();
                    break; //slash
                case 21: blockRotate = daub_cob_square_x.getDefaultState();
                    break; //square
                case 22: blockRotate = daub_cob_x.getDefaultState();
                    break; //square_x
                case 23: blockRotate = daub_cob_bottom_l.getDefaultState();
                    break; //top_l
                case 24: blockRotate = daub_cob_left.getDefaultState();
                    break; //top
                case 25: blockRotate = daub_cob_top_l.getDefaultState();
                    break; //top_r
                case 26: blockRotate = daub_cob_triangle2.getDefaultState();
                    break; //triangle0  bottom left triangle
                case 27: blockRotate = daub_cob_triangle0.getDefaultState();
                    break; //triangle1  top left triangle
                case 28: blockRotate = daub_cob_triangle3.getDefaultState();
                    break; //triangle2  bottom right triangle
                case 29: blockRotate = daub_cob_triangle1.getDefaultState();
                    break; //triangle3  top right triangle
                case 30: blockRotate = daub_cob_xright.getDefaultState();
                    break; //xbottom
                case 31: blockRotate = daub_cob_xdoor3.getDefaultState();
                    break; //xdoor0     lower x
                case 32: blockRotate = daub_cob_xdoor2.getDefaultState();
                    break; //xdoor1     right x
                case 33: blockRotate = daub_cob_xdoor1.getDefaultState();
                    break; //xdoor2     left x
                case 34: blockRotate = daub_cob_xdoor0.getDefaultState();
                    break; //xdoor3     upper x
                case 35: blockRotate = daub_cob_xbottom.getDefaultState();
                    break; //x_left
                case 36: blockRotate = daub_cob_square.getDefaultState();
                    break; //x
                case 37: blockRotate = daub_cob_xtop.getDefaultState();
                    break; //xright
                case 38: blockRotate = daub_cob_xleft.getDefaultState();
                    break; //xtop
            }
        }
        return blockRotate;
    }
}
