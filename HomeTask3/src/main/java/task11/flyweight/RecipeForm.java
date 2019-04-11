package task11.flyweight;

public class RecipeForm implements IRecipe{
    private String docName;
    private String medicine;
    private int expirationDate;

    public RecipeForm(String docName, String medicine) {
        this.docName = docName;
        this.medicine = medicine;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getRecipe(){
        return String.format("\"%s\" (%d days), %s",
                medicine, expirationDate, docName);
    }
}
