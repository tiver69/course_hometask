package task11.flyweight;

public class RecipeForm {
    private String docName;
    private String medicine;
    private int expirationDate;

    public RecipeForm(String docName, String medicine, int expirationDate) {
        this.docName = docName;
        this.medicine = medicine;
        this.expirationDate = expirationDate;
    }

    public String getRecipe(int moreDays){
        return String.format("\"%s\" (%d days), %s",
                medicine, expirationDate + moreDays, docName);
    }
}
