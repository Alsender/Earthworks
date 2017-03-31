package alsender.earthworks.main.crafting;

import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.event.ForgeEventFactory;

import java.util.List;
import java.util.Random;

/**
 * Created by alsender on 3/22/17.
 */
public class AxeShapelessRecipes extends ShapelessRecipes {

    public AxeShapelessRecipes(ItemStack output, List<ItemStack> inputList) {
        super(output, inputList);
    }

    private ItemStack damageAxe(ItemStack stack) {
        Random random = new Random();
        if (stack.attemptDamageItem(1, random)) {
            ForgeEventFactory.onPlayerDestroyItem(ForgeHooks.getCraftingPlayer(), stack, EnumHand.MAIN_HAND);
            return ItemStack.EMPTY;
        }
        return stack;
    }

    @Override
    public NonNullList<ItemStack> getRemainingItems(InventoryCrafting inv) {
        NonNullList<ItemStack> nonnulllist = NonNullList.<ItemStack>withSize(inv.getSizeInventory(), ItemStack.EMPTY);
        for (int i = 0; i < nonnulllist.size(); ++i) {
            ItemStack itemstack = inv.getStackInSlot(i);
            if (itemstack != null && itemstack.getItem() == Items.FLINT) {
                nonnulllist.set(i, damageAxe(itemstack.copy()));
            } else {
                nonnulllist.set(i, ForgeHooks.getContainerItem(itemstack));
            }
        }
        return nonnulllist;
    }
}
