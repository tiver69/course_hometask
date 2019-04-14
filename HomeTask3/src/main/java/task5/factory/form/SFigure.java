package task5.factory.form;

import task5.factory.Figure;

public class SFigure implements Figure {
    boolean superFigure;

    public SFigure(boolean superFigure) {
        this.superFigure = superFigure;
    }

    public void down() {
        if (superFigure)
            System.out.print("S* ");
        else
            System.out.print("S ");
    }
}