package task5.factory.form;

import task5.factory.Figure;

public class LFigure implements Figure {

    boolean superFigure;

    public LFigure(boolean superFigure) {
        this.superFigure = superFigure;
    }

    public void down() {
        if (superFigure)
            System.out.print("L* ");
        else
            System.out.print("L ");
    }
}