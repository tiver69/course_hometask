package task9.chain;

public class FinalCheckTransfer extends Transfer {

    @Override
    public int operation(int summa) {
        if (summa <= 0) {
            System.out.println("Transfer apper to be lover than 0");
            return 0;
        }
        return nextStep(summa);
    }

}