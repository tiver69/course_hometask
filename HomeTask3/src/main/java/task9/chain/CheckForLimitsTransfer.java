package task9.chain;

public class CheckForLimitsTransfer extends Transfer {

    private int minimumSumma, maxSumma;

    public CheckForLimitsTransfer(int minimumSumma, int maxSumma) {
        this.minimumSumma = minimumSumma;
        this.maxSumma = maxSumma;
    }

    @Override
    public int operation(int summa) {
        if (summa < minimumSumma) {
            System.out.println("Transfer minimum limit exception");
            return 0;
        }
        if (summa > maxSumma){
            System.out.println("Transfer minimum limit exception");
            return 0;
        }
        return nextStep(summa);
    }
}
