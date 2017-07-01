package alsender.earthworks.item;

import alsender.earthworks.block.timber.Daub_Cob;
import alsender.earthworks.block.timber.Plaster;
import alsender.earthworks.main.Earthworks;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by alsender on 4/7/17.
 */
public class ModItemTool extends Item {

    private Block block;
    private BlockPos pos;
    private EntityPlayer player;

    public ModItemTool(IForgeRegistry<Item> registry, String name, int durability) {
        setCreativeTab(Earthworks.creativeTab);
        setRegistryName("tool_" + name);
        setUnlocalizedName(Earthworks.mod_id + ".tool_" + name);
        registry.register(this);
        this.setMaxDamage(durability);
        this.setMaxStackSize(1);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing face, float hitX, float hitY, float hitZ) {
        ItemStack itemstack = player.getHeldItem(hand);
        this.block = world.getBlockState(pos).getBlock();
        this.pos = pos;
        this.player = player;
        player.setActiveHand(hand);
        if (player.isSneaking()) {
            if (block instanceof Daub_Cob) {
                world.setBlockState(pos, ((Daub_Cob)block).getRotation(block));
                itemstack.damageItem(1, player);
                return EnumActionResult.SUCCESS;
            } else if (block instanceof Plaster) {
                world.setBlockState(pos, ((Plaster)block).getRotation(block));
                itemstack.damageItem(1, player);
                return EnumActionResult.SUCCESS;
            }
        } else return EnumActionResult.FAIL;
        return EnumActionResult.FAIL;
    }
}
