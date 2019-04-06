package task5.factory.form;

import task5.factory.Figure;

public class ZFigure implements Figure {
    boolean superFigure;

    public ZFigure(boolean superFigure) {
        this.superFigure = superFigure;
    }

    public void down() {
        if (superFigure)
            System.out.print("Z* ");
        else
            System.out.print("Z ");
    }
}