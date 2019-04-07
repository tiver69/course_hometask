package task2.composite;

public abstract class Expression implements MyMath {

    private MyMath leftOperand;
    private MyMath rightOperand;

    public Expression(MyMath leftOperand, MyMath rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public MyMath getLeftOperand() {
        return leftOperand;
    }

    public MyMath getRightOperand() {
        return rightOperand;
    }
}
