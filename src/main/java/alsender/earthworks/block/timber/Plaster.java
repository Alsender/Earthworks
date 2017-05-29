package alsender.earthworks.block.timber;

import alsender.earthworks.block.ModBlockFacing;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

import static alsender.earthworks.main.registry.TimberRegistry.*;

/**
 * Created by alsender on 1/13/17.
 */
public class Plaster extends ModBlockFacing {

    private final String toolTip;
    public int ID;

    public Plaster(String name, String toolTip, int ID) {
        super("plaster_" + name, Material.ROCK, SoundType.STONE, 3.0F, 7.5F);
        this.toolTip = toolTip;
        this.ID = ID;
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean bool) {
        list.add(toolTip);
    }

    public int getID() {
        return this.ID;
    }

    public IBlockState getRotation(Block block) {
        IBlockState blockRotate = null;
        if (block instanceof Plaster) {
            switch (getID()) {
                case 0 : blockRotate = plaster_arrow2.getDefaultState();
                    break; //arrow0     bottom left
                case 1: blockRotate = plaster_arrow0.getDefaultState();
                    break; //arrow1     top left
                case 2: blockRotate = plaster_arrow3.getDefaultState();
                    break; //arrow2     bottom right
                case 3: blockRotate = plaster_arrow1.getDefaultState();
                    break; //arrow3     top right
                case 4: blockRotate = plaster_barndoor4.getDefaultState();
                    break; //barndoor0  lower left
                case 5: blockRotate = plaster_barndoor2.getDefaultState();
                    break; //barndoor1  left sideways
                case 6: blockRotate = plaster_barndoor1.getDefaultState();
                    break; //barndoor2  right sideways
                case 7: blockRotate = plaster_barndoor7.getDefaultState();
                    break; //barndoor3  upper left
                case 8: blockRotate = plaster_barndoor0.getDefaultState();
                    break; //barndoor4  lower right
                case 9: blockRotate = plaster_barndoor6.getDefaultState();
                    break; //barndoor5  left sideways
                case 10: blockRotate = plaster_barndoor5.getDefaultState();
                    break; //barndoor6  right sideways
                case 11: blockRotate = plaster_barndoor3.getDefaultState();
                    break; //barndoor7  upper right
                case 12: blockRotate = plaster_bottom_r.getDefaultState();
                    break; //bottom_l
                case 13: blockRotate = plaster_right.getDefaultState();
                    break; //bottom
                case 14: blockRotate = plaster_top_r.getDefaultState();
                    break; //bottom_r
                case 15: blockRotate = plaster_bottom.getDefaultState();
                    break; //left
                case 16: blockRotate = plaster_parallel_vert.getDefaultState();
                    break; //parallel_hor
                case 17: blockRotate = plaster_parallel_hor.getDefaultState();
                    break; //parallel_vert
                case 18: blockRotate = plaster_top.getDefaultState();
                    break; //right
                case 19: blockRotate = plaster_slash.getDefaultState();
                    break; //slash_back
                case 20: blockRotate = plaster_slash_back.getDefaultState();
                    break; //slash
                case 21: blockRotate = plaster_square_x.getDefaultState();
                    break; //square
                case 22: blockRotate = plaster_x.getDefaultState();
                    break; //square_x
                case 23: blockRotate = plaster_bottom_l.getDefaultState();
                    break; //top_l
                case 24: blockRotate = plaster_left.getDefaultState();
                    break; //top
                case 25: blockRotate = plaster_top_l.getDefaultState();
                    break; //top_r
                case 26: blockRotate = plaster_triangle2.getDefaultState();
                    break; //triangle0  bottom left triangle
                case 27: blockRotate = plaster_triangle0.getDefaultState();
                    break; //triangle1  top left triangle
                case 28: blockRotate = plaster_triangle3.getDefaultState();
                    break; //triangle2  bottom right triangle
                case 29: blockRotate = plaster_triangle1.getDefaultState();
                    break; //triangle3  top right triangle
                case 30: blockRotate = plaster_xright.getDefaultState();
                    break; //xbottom
                case 31: blockRotate = plaster_xdoor3.getDefaultState();
                    break; //xdoor0     lower x
                case 32: blockRotate = plaster_xdoor2.getDefaultState();
                    break; //xdoor1     right x
                case 33: blockRotate = plaster_xdoor1.getDefaultState();
                    break; //xdoor2     left x
                case 34: blockRotate = plaster_xdoor0.getDefaultState();
                    break; //xdoor3     upper x
                case 35: blockRotate = plaster_xbottom.getDefaultState();
                    break; //x_left
                case 36: blockRotate = plaster_square.getDefaultState();
                    break; //x
                case 37: blockRotate = plaster_xtop.getDefaultState();
                    break; //xright
                case 38: blockRotate = plaster_xleft.getDefaultState();
                    break; //xtop
            }
        }
        return blockRotate;
    }
}
