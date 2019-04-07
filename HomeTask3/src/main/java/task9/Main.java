package task9;

import task9.chain.*;

public class Main {
    public static void main(String[] args) {

        Transfer internationalTransfer = new CheckForLimitsTransfer(100, 10000);
        internationalTransfer.setNextStep(new PercentTransfer(5))
                .setNextStep(new TaxTransfer(15))
                .setNextStep(new FinalCheckTransfer());

        Transfer inBankTransfer = new CheckForLimitsTransfer(1,100000);
        inBankTransfer.setNextStep(new FinalCheckTransfer());

        Transfer betweenBankTransfer = new CheckForLimitsTransfer(1, 1000);
        betweenBankTransfer.setNextStep(new PercentTransfer(2))
                .setNextStep(new FinalCheckTransfer());


        System.out.println("International transfer 500: " + internationalTransfer.operation(500));
        System.out.println("In-bank transfer 500: " + inBankTransfer.operation(500));
        System.out.println("Between-bank transfer 500: " + betweenBankTransfer.operation(500));

    }
}
