package task5.factory.form;

import task5.factory.Figure;

public class IFigure implements Figure {

    boolean superFigure;

    public IFigure(boolean superFigure) {
        this.superFigure = superFigure;
    }

    public void down() {
        if (superFigure)
            System.out.print("I* ");
        else
            System.out.print("I ");
    }
}