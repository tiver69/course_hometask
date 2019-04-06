package task5.factory.form;

import task5.factory.Figure;

public class JFigure implements Figure {
    boolean superFigure;

    public JFigure(boolean superFigure) {
        this.superFigure = superFigure;
    }

    public void down() {
        if (superFigure)
            System.out.print("J* ");
        else
            System.out.print("J ");
    }
}