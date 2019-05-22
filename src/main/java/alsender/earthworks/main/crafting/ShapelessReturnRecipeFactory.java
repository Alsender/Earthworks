package alsender.earthworks.main.crafting;

import alsender.earthworks.main.Earthworks;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.JsonUtils;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.common.crafting.JsonContext;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by alsender on 3/22/17.
 */
public class ShapelessReturnRecipeFactory implements IRecipeFactory {

    @Override
    public IRecipe parse(JsonContext context, JsonObject json) {
        NonNullList<Ingredient> ings = NonNullList.create();
        for (JsonElement ele : JsonUtils.getJsonArray(json, "ingredients"))
            ings.add(CraftingHelper.getIngredient(ele, context));

        if (ings.isEmpty())
            throw new JsonParseException("No ingredients for shapeless recipe");

        ItemStack itemstack = CraftingHelper.getItemStack(JsonUtils.getJsonObject(json, "result"), context);
        return new ShapelessReturnRecipes(new ResourceLocation(Earthworks.mod_id, "shapeless_return_crafting"), itemstack, ings);
    }

    public class ShapelessReturnRecipes extends ShapelessOreRecipe {

        public ShapelessReturnRecipes(ResourceLocation group, ItemStack output, NonNullList<Ingredient> ingredients) {
            super(group, ingredients, output);
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
}