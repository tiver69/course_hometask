package task2;

public class Divide  extends Expression {

    public Divide(Math leftOperand, Math rightOperand) {
        super(leftOperand, rightOperand);
    }

    public int result() {
        if (getRightOperand().result() == 0) throw new IllegalArgumentException("Can't divide by 0!");
        return (int)(getLeftOperand().result() / getRightOperand().result());
    }

    @Override
    public String toString(){
        return (getLeftOperand().toString() + " / " + getRightOperand().toString());
    }
}
