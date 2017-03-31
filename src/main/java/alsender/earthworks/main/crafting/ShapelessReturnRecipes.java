package alsender.earthworks.main.crafting;

import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraftforge.common.ForgeHooks;

import java.util.List;

/**
 * Created by alsender on 3/22/17.
 */
public class ShapelessReturnRecipes extends ShapelessRecipes {

    public ShapelessReturnRecipes(ItemStack output, List<ItemStack> inputList) {
        super(output, inputList);
    }

    @Override
    public ItemStack[] getRemainingItems(InventoryCrafting inv) {
        ItemStack[] aitemstack = new ItemStack[inv.getSizeInventory()];
        for (int i = 0; i < aitemstack.length; ++i) {
            ItemStack itemstack = inv.getStackInSlot(i);
            if (itemstack != null && itemstack.getItem() == Items.FLINT) {
                aitemstack[i] = itemstack.copy();
            } else {
                aitemstack[i] = ForgeHooks.getContainerItem(itemstack);
            }
        }
        return aitemstack;
    }
}