package task11;

import task11.flyweight.IRecipe;
import task11.flyweight.RecipeFactory;
import task11.flyweight.RecipeForm;

public class MainFlyweight {

    public static void main(String[] args) {

        IRecipe recipeForm = RecipeFactory.getRecipe("Dc. House", "Vitamin C");
        recipeForm.setExpirationDate(100);

        System.out.println(recipeForm+" - "+recipeForm.getRecipe());

        IRecipe recipeForm1 = RecipeFactory.getRecipe("Dc. House", "Vitamin C");
        recipeForm1.setExpirationDate(150);
        System.out.println(recipeForm1+" - "+recipeForm1.getRecipe());

        IRecipe recipeForm3 = RecipeFactory.getRecipe("Dc", "Vitamin");
        recipeForm3.setExpirationDate(450);
        System.out.println(recipeForm3+" - "+recipeForm3.getRecipe());
    }
}
