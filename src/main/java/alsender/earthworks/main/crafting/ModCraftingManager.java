package alsender.earthworks.main.crafting;

import alsender.earthworks.main.Earthworks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.*;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;

/**
 * Created by alsender on 6/11/17.
 */
public class ModCraftingManager {

    private static String loc = "recipe_";

    public static void addShapedRecipe(String name, ItemStack out, int w, int h, Object... in) {
        addRecipe(name, new ShapedRecipes(name, w, h, ingredientList(in), out));
    }

    public static void addShapelessRecipe (String name, ItemStack out, Object... in) {
        addRecipe(name, new ShapelessRecipes(name, out, ingredientList(in)));
    }

    public static void addShapedMirrorlessRecipe(String name, ItemStack out, int w, int h, Object... in) {
        addRecipe(name, new MirrorlessShapedRecipes(name, w, h, ingredientList(in), out));
    }

    public static void addShapelessReturnRecipe(String name, ItemStack out, Object... in) {
        addRecipe(name, new ShapelessReturnRecipes(name, out, ingredientList(in)));
    }

    private static void addRecipe(String name, IRecipe recipe) {
        CraftingManager.func_193372_a(new ResourceLocation(Earthworks.mod_id, loc + name), recipe);
    }

    private static NonNullList<Ingredient> ingredientList (Object[] objects) {
        NonNullList<Ingredient> list = NonNullList.create();
        for (int i = 0; i < objects.length; i++) {
            Object obj = objects[i];
            if (obj instanceof ItemStack) {
                list.add(i, Ingredient.func_193369_a((ItemStack)obj));
            } else if (obj instanceof Item) {
                list.add(i, Ingredient.func_193367_a((Item)obj));
            } else {
                if (!(obj instanceof Block)) {
                    throw new IllegalArgumentException("Invalid shapeless recipe: unknown type " + obj.getClass().getName() + "!");
                }
                list.add(i, Ingredient.func_193369_a(new ItemStack((Block)obj)));
            }
        }
        return list;
    }
}
