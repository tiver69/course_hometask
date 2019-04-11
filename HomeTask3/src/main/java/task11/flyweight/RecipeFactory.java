package task11.flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecipeFactory {

    private static Map<String, Map<String, IRecipe>> recipes = new HashMap<>();

    public static IRecipe getRecipe(String docName, String medicine){
        IRecipe existRecipe;

        try {
            existRecipe = recipes.get(docName).get(medicine);
        }
        catch (NullPointerException e){
            Map<String, IRecipe> dockRecipes = new HashMap<>();
            recipes.put(docName, dockRecipes);
            existRecipe = new RecipeForm(docName, medicine);
            recipes.get(docName).put(medicine, existRecipe);
            return existRecipe;
        }
        if (existRecipe == null){
            existRecipe = new RecipeForm(docName, medicine);
            recipes.get(docName).put(medicine, existRecipe);
        }
        return existRecipe;
    }
}
