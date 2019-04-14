package task2.composite;

public class Divide  extends Expression {

    public Divide(MyMath leftOperand, MyMath rightOperand) {
        super(leftOperand, rightOperand);
    }

    public int count() {
        if (getRightOperand().count() == 0) throw new IllegalArgumentException("Can't divide by 0!");
        return (int)(getLeftOperand().count() / getRightOperand().count());
    }

    @Override
    public String toString(){
        return (getLeftOperand().toString() + " / " + getRightOperand().toString());
    }
}
