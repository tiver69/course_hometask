package task2;

public abstract class Expression implements Math{

    private Math leftOperand;
    private Math rightOperand;

    public Expression(Math leftOperand, Math rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public Math getLeftOperand() {
        return leftOperand;
    }

    public Math getRightOperand() {
        return rightOperand;
    }
}
