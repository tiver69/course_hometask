package task5.factory.form;

import task5.factory.Figure;

public class TFigure implements Figure {
    boolean superFigure;

    public TFigure(boolean superFigure) {
        this.superFigure = superFigure;
    }

    public void down() {
        if (superFigure)
            System.out.print("T* ");
        else
            System.out.print("T ");
    }
}