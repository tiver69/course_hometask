package task2;

public class Difference extends Expression {

    public Difference(Math leftOperand, Math rightOperand) {
        super(leftOperand, rightOperand);
    }

    public int result() {
        return (getLeftOperand().result() - getRightOperand().result());
    }

    @Override
    public String toString(){
        return (getLeftOperand().toString() + " - " + getRightOperand().toString());
    }
}
