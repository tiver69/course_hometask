package task11;

import task11.flyweight.LongerTermRecipe;
import task11.flyweight.RecipeForm;

public class MainFlyweight {

    public static void main(String[] args) {

        RecipeForm recipeForm = new RecipeForm("dc.House", "VitaminC", 100);

        LongerTermRecipe recipe1 = new LongerTermRecipe(100,recipeForm);
        System.out.println(recipe1.getRecipe());

        LongerTermRecipe recipe2 = new LongerTermRecipe(10,recipeForm);
        System.out.println(recipe2.getRecipe());
    }
}
