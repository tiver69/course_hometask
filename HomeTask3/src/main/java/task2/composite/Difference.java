package task2.composite;

public class Difference extends Expression {

    public Difference(MyMath leftOperand, MyMath rightOperand) {
        super(leftOperand, rightOperand);
    }

    public int count() {
        return (getLeftOperand().count() - getRightOperand().count());
    }

    @Override
    public String toString(){
        return (getLeftOperand().toString() + " - " + getRightOperand().toString());
    }
}
