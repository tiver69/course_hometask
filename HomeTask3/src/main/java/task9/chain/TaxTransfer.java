package task9.chain;

public class TaxTransfer extends Transfer {

    private int tax;

    public TaxTransfer(int tax) {
        this.tax = tax;
    }

    @Override
    public int operation(int summa) {
        return nextStep(summa-tax);
    }
}