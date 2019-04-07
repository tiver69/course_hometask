package task11.flyweight;

public class LongerTermRecipe {

    int moreDays;
    RecipeForm recipeForm;

    public LongerTermRecipe(int moreDays, RecipeForm recipeForm) {
        this.moreDays = moreDays;
        this.recipeForm = recipeForm;
    }

    public String getRecipe(){
        return recipeForm.getRecipe(moreDays);
    }
}
