package task5.factory.form;

import task5.factory.Figure;

public class OFigure implements Figure {
    boolean superFigure;

    public OFigure(boolean superFigure) {
        this.superFigure = superFigure;
    }

    public void down() {
        if (superFigure)
            System.out.print("O* ");
        else
            System.out.print("O ");
    }
}