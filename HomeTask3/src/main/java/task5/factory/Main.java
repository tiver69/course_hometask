package task5.factory;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for (int i=0;i<20;i++) {
            int n = (int) (Math.random() * FigureForm.values().length);
            Factory.getFigure(FigureForm.values()[n]).down();
        }
    }
}
