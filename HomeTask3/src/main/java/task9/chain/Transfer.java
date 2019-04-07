package task9.chain;

public abstract class Transfer {
    private Transfer next;

    public Transfer setNextStep(Transfer next){
        this.next = next;
        return next;
    }

    public abstract int operation(int suma);

    public int nextStep(int summa){
        if (next == null)
            return summa;
        return next.operation(summa);
    }


}
