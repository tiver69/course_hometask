package task9.chain;

public class PercentTransfer extends Transfer {

    private int percent;

    public PercentTransfer(int percent) {
        this.percent = percent;
    }

    @Override
    public int operation(int summa) {
        return nextStep(summa*(100-percent)/100);
    }
}
