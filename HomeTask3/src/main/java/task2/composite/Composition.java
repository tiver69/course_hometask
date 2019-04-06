package task2.composite;

public class Composition extends Expression {

    public Composition(Math leftOperand, Math rightOperand) {
        super(leftOperand, rightOperand);
    }

    public int result() {
        return getLeftOperand().result() * getRightOperand().result();
    }

    @Override
    public String toString(){
        return (getLeftOperand().toString() + " * " + getRightOperand().toString());
    }

}
