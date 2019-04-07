package task10.memento;

public class Save {

    private int step, stepI, stepJ;

    public Save(int step) {
        this.step = step;
        stepI = (step-(step%10))/10-1;
        stepJ = step%10-1;
    }

    public int getStepI() {
        return stepI;
    }

    public int getStepJ() {
        return stepJ;
    }

    public int getStep() {
        return step;
    }
}
