package task5.factory;

import task5.factory.form.*;

public class Factory {

    public static Figure getFigure(FigureForm form){
        switch (form){
            case I: return new IFigure(false);
            case L: return new LFigure(false);
            case O: return new OFigure(false);
            case T: return new TFigure(false);
            case J: return new JFigure(false);
            case S: return new SFigure(false);
            case Z: return new ZFigure(false);
            default:
                int n = (int)(Math.random()*(FigureForm.values().length - 1));
                return getSuperFigure(FigureForm.values()[n]);
        }
    }

    private static Figure getSuperFigure(FigureForm form){
        switch (form){
            case I: return new IFigure(true);
            case L: return new LFigure(true);
            case O: return new OFigure(true);
            case T: return new TFigure(true);
            case J: return new JFigure(true);
            case S: return new SFigure(true);
            case Z: return new ZFigure(true);
            default:throw new IllegalArgumentException();
        }
    }
}
