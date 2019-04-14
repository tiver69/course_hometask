package task5;

import task5.factory.Factory;
import task5.factory.FigureForm;

import java.util.Random;

public class MainFactory {
    public static void main(String[] args) {
        for (int i=0;i<20;i++) {
            int n = (int) (Math.random() * FigureForm.values().length);
            Factory.getFigure(FigureForm.values()[n]).down();
        }
    }
}
