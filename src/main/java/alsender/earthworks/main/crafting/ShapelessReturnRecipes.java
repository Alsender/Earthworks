package alsender.earthworks.main.crafting;

import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.util.NonNullList;
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
    public NonNullList<ItemStack> getRemainingItems(InventoryCrafting inv) {
        NonNullList<ItemStack> nonnulllist = NonNullList.<ItemStack>withSize(inv.getSizeInventory(), ItemStack.EMPTY);
        for (int i = 0; i < nonnulllist.size(); ++i) {
            ItemStack itemstack = inv.getStackInSlot(i);
            if (itemstack != null && itemstack.getItem() == Items.FLINT) {
                int count = itemstack.getCount();
                nonnulllist.set(i, (itemstack.splitStack(count)));
            } else {
                nonnulllist.set(i, ForgeHooks.getContainerItem(itemstack));
            }
        }
        return nonnulllist;
    }
}